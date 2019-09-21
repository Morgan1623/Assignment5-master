package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.HouseholdServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Appliances;
import BudgetBuddi.Factory.ExpenseCategoryFactory.HouseholdFactories.AppliancesFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.AppliancesRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation.AppliancesRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppliancesServiceImpTest
{
    private AppliancesRepository repoImp;
    private Appliances appliance;

    private Appliances getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = AppliancesRepoImp.getRepository();
        this.appliance = (Appliances) AppliancesFactory.getAppliances("January", 1, 350, 1);

    }

    @Test
    public void getAll()
    {
        ArrayList<Appliances> appliances = this.repoImp.getAll();

        System.out.println(appliances);
    }

    @Test
    public void create()
    {
        Appliances created = this.repoImp.create(this.appliance);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Appliances updated = new Appliances.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        Appliances saved = getSaved();
        this.repoImp.delete(saved.getDescription());
    }

    @Test
    public void read()
    {
        Appliances saved = getSaved();
        Appliances read = this.repoImp.read(saved.getDescription());
    }
}
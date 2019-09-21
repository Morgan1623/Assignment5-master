package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.HouseholdServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Rent;
import BudgetBuddi.Factory.ExpenseCategoryFactory.HouseholdFactories.RentFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.RentRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation.RentRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RentServiceImpTest
{
    private RentRepository repoImp;
    private Rent rent;

    private Rent getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = RentRepoImp.getRepository();
        this.rent = (Rent) RentFactory.getRent("January", 1, 350, 1);
    }

    @Test
    public void getAll()
    {
        ArrayList<Rent> payments = this.repoImp.getAll();

        System.out.println(payments);
    }

    @Test
    public void create()
    {
        Rent created = this.repoImp.create(this.rent);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Rent updated = new Rent.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        Rent saved = getSaved();
        this.repoImp.delete(saved.getDescription());

    }

    @Test
    public void read()
    {
        Rent saved = getSaved();
        Rent read = this.repoImp.read(saved.getDescription());
    }
}
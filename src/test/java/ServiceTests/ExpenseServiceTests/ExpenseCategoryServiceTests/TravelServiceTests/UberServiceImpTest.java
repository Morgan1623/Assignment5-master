package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.TravelServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Uber;
import BudgetBuddi.Factory.ExpenseCategoryFactory.TravelFactories.UberFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories.UberRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TravelRepoImplementation.UberRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UberServiceImpTest
{
    private UberRepository repoImp;
    private Uber uber;

    private Uber getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = UberRepoImp.getRepository();
        this.uber = UberFactory.getUber("January", 1, 350, 1);

    }

    @Test
    public void getAll()
    {
        ArrayList<Uber> payments = this.repoImp.getAll();

        System.out.println(payments);
    }

    @Test
    public void create()
    {
        Uber created = this.repoImp.create(this.uber);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Uber updated = new Uber.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        Uber saved = getSaved();
        this.repoImp.delete(saved.getDescription());
    }

    @Test
    public void read()
    {
        Uber saved = getSaved();
        Uber read = this.repoImp.read(saved.getDescription());
    }
}
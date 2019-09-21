package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.TravelServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Bus;
import BudgetBuddi.Factory.ExpenseCategoryFactory.TravelFactories.Busfactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories.BusRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TravelRepoImplementation.BusRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BusServiceImpTest
{
    private BusRepository repoImp;
    private Bus bus;

    private Bus getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = BusRepoImp.getRepository();
        this.bus = Busfactory.getBus("January", 1, 350, 1);
    }

    @Test
    public void getAll()
    {
        ArrayList<Bus> payments = this.repoImp.getAll();

        System.out.println(payments);
    }

    @Test
    public void create()
    {
        Bus created = this.repoImp.create(this.bus);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Bus updated = new Bus.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");

    }

    @Test
    public void delete()
    {
        Bus saved = getSaved();
        this.repoImp.delete(saved.getDescription());
    }

    @Test
    public void read()
    {
        Bus saved = getSaved();
        Bus read = this.repoImp.read(saved.getDescription());
    }
}
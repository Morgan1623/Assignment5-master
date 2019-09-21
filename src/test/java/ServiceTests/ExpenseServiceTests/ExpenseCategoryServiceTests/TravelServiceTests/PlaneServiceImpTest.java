package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.TravelServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Plane;
import BudgetBuddi.Factory.ExpenseCategoryFactory.TravelFactories.PlaneFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories.PlaneRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TravelRepoImplementation.PlaneRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PlaneServiceImpTest
{
    private PlaneRepository repoImp;
    private Plane plane;

    private Plane getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = PlaneRepoImp.getRepository();
        this.plane = PlaneFactory.getPlane("January", 1, 350, 1);
    }

    @Test
    public void getAll()
    {
        ArrayList<Plane> payments = this.repoImp.getAll();

        System.out.println(payments);
    }

    @Test
    public void create()
    {
        Plane created = this.repoImp.create(this.plane);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Plane updated = new Plane.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        Plane saved = getSaved();
        this.repoImp.delete(saved.getDescription());

    }

    @Test
    public void read()
    {
        Plane saved = getSaved();
        Plane read = this.repoImp.read(saved.getDescription());

    }
}
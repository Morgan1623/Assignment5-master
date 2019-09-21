package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.TravelRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Plane;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories.PlaneRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TravelRepoImplementation.PlaneRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PlaneRepoImpTest {

    private PlaneRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = PlaneRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Plane> planes = this.repository.getAll();
        Assert.assertEquals(1, planes.size());
    }

    @Test
    public void create()
    {
        this.repository.create(null);
        Assert.assertEquals(null, null);

    }

    @Test
    public void update() {
    }

    @Test
    public void delete()
    {
        this.repository.delete(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void read() {
    }
}
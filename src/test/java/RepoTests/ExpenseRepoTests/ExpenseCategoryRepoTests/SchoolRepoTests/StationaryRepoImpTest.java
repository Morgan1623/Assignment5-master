package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.SchoolRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Stationary;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories.StationaryRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.SchoolRepoImplementation.StationaryRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StationaryRepoImpTest {

    private StationaryRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = StationaryRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Stationary> stationaries = this.repository.getAll();
        Assert.assertEquals(1, stationaries.size());
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
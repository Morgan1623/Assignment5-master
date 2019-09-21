package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.SchoolRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Fees;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories.FeesRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.SchoolRepoImplementation.FeesRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FeesRepoImpTest {

    private FeesRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = FeesRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Fees> fees = this.repository.getAll();
        Assert.assertEquals(1, fees.size());
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
package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.TravelRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Uber;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories.UberRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TravelRepoImplementation.UberRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class UberRepoImpTest {

    private UberRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = UberRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Uber> ubers = this.repository.getAll();
        Assert.assertEquals(1, ubers.size());
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
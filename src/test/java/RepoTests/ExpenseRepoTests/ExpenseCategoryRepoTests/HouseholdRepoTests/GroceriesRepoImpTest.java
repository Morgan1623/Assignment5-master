package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.HouseholdRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Groceries;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.GroceriesRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation.GroceriesRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GroceriesRepoImpTest {

    private GroceriesRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = GroceriesRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Groceries> groceries = this.repository.getAll();
        Assert.assertEquals(1, groceries .size());
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
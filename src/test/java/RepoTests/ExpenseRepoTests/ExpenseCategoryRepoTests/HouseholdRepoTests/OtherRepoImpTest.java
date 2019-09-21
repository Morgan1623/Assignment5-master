package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.HouseholdRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Other;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.OtherRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation.OtherRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class OtherRepoImpTest {

    private OtherRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = OtherRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Other> others = this.repository.getAll();
        Assert.assertEquals(1, others.size());
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
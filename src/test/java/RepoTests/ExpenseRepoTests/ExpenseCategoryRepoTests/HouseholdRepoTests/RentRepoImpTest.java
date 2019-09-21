package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.HouseholdRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Rent;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.RentRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation.RentRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class RentRepoImpTest {

    private RentRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = RentRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Rent> rents = this.repository.getAll();
        Assert.assertEquals(1, rents.size());
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
package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.CarRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Petrol;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories.PetrolRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.CarRepoImplementation.PetrolRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PetrolRepoImpTest {

    private PetrolRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = PetrolRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Petrol> petrols = this.repository.getAll();
        Assert.assertEquals(1, petrols.size());
    }

    @Test
    public void create() {
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
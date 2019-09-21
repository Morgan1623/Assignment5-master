package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.EntertainmentRepoTests;

import BudgetBuddi.Factory.ExpenseCategoryFactory.EntertainmentFactories.FitnessFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.EntertainmentRepositories.FitnessRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.EntertainmentRepoImplementation.FitnessRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FitnessRepoImpTest {

    private FitnessRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = FitnessRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<FitnessFactory> fitnesses  = this.repository.getAll();
        Assert.assertEquals(1, fitnesses.size());
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
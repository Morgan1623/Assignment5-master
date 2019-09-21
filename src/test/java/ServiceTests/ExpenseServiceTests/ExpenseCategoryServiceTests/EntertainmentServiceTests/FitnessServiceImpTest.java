package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.EntertainmentServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment.Fitness;
import BudgetBuddi.Factory.ExpenseCategoryFactory.EntertainmentFactories.FitnessFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.EntertainmentRepositories.FitnessRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.EntertainmentRepoImplementation.FitnessRepoImp;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FitnessServiceImpTest
{
    private FitnessRepository repoImp;
    private Fitness fitness;

    private FitnessFactory getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = FitnessRepoImp.getRepository();
        this.fitness = (Fitness) FitnessFactory.getFitness("January", 1, 350, 1);
    }

    @Test
    public void getAll()
    {
        ArrayList<FitnessFactory> fitnesses = this.repoImp.getAll();

        System.out.println(fitnesses);
    }

    @Test
    public void create()
    {
        //Fitness created = this.repoImp.create(this.fitness);
        //System.out.println("Created =" + created);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}
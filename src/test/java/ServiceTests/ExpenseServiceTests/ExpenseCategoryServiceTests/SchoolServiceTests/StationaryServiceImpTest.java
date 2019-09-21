package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.SchoolServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Stationary;
import BudgetBuddi.Factory.ExpenseCategoryFactory.SchoolFactory.StationaryFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories.StationaryRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.SchoolRepoImplementation.StationaryRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StationaryServiceImpTest
{
    private StationaryRepository repoImp;
    private Stationary stationary;

    private Stationary getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = StationaryRepoImp.getRepository();
        this.stationary = StationaryFactory.getStationary("January", 1, 350, 1);

    }

    @Test
    public void getAll()
    {
        ArrayList<Stationary> stationaries = this.repoImp.getAll();

        System.out.println(stationaries);
    }

    @Test
    public void create()
    {
        Stationary created = this.repoImp.create(this.stationary);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Stationary updated = new Stationary.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        Stationary saved = getSaved();
        this.repoImp.delete(saved.getDescription());
    }

    @Test
    public void read()
    {

        Stationary saved = getSaved();
        Stationary read = this.repoImp.read(saved.getDescription());
    }
}
package RepoTests.ExpenseRepoTests.ExpensesRepoTests;

import BudgetBuddi.Domain.Expenses.Expense.Expense;
import BudgetBuddi.Repository.ExpenseRepositories.ExpensesRepositories.ExpenseRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseRepoImplenation.ExpensesRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ExpensesRepoImpTest {

    private ExpenseRepository respository;

    @Before
    public void setUp() throws Exception
    {
        this.respository = ExpensesRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Expense> expenses = this.respository.getAll();
        Assert.assertEquals(1, expenses.size());
    }

    @Test
    public void create()
    {
        this.respository.create(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void update()
    {
        this.respository.update(null);
        Assert.assertEquals(0, null);

    }

    @Test
    public void delete()
    {
        this.respository.delete(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void read()
    {
        this.respository.read(null);
        Assert.assertEquals(null, null);
    }
}
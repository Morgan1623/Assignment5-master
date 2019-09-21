package RepoTests.ExpenseRepoTests.ExpensesRepoTests;

import BudgetBuddi.Domain.Expenses.Expense.RegularExpsenses;
import BudgetBuddi.Repository.ExpenseRepositories.ExpensesRepositories.RegularExpenseRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseRepoImplenation.RegularExpensesRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class RegularExpensesRepoImpTest {
    private RegularExpenseRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = RegularExpensesRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<RegularExpsenses> regularExpsenses = this.repository.getAll();
        Assert.assertEquals(1, regularExpsenses.size());
    }

    @Test
    public void create()
    {
        //create an expense and add it to the repo
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
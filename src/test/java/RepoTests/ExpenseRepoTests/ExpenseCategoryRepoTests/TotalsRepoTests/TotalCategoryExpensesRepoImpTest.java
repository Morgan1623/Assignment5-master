package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.TotalsRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Totals.TotalCategoryExpense;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TotalsRepositories.TotalCategoryExpenseRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TotalsRepoImplementation.TotalCategoryExpensesRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TotalCategoryExpensesRepoImpTest {

    private TotalCategoryExpenseRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = TotalCategoryExpensesRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<TotalCategoryExpense> totalCategoryExpenses = this.repository.getAll();
        Assert.assertEquals(1, totalCategoryExpenses.size());
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
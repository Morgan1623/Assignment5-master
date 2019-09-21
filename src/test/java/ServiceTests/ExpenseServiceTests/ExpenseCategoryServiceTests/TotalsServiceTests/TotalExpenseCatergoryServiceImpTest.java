package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.TotalsServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Totals.TotalCategoryExpense;
import BudgetBuddi.Factory.ExpenseCategoryFactory.TotalsFactories.TotalFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TotalsRepositories.TotalCategoryExpenseRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TotalsRepoImplementation.TotalCategoryExpensesRepoImp;
import RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.TotalsRepoTests.TotalCategoryExpensesRepoImpTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TotalExpenseCatergoryServiceImpTest
{
    private TotalCategoryExpenseRepository repoImp;
    private TotalCategoryExpense totalCategoryExpense;

    private TotalCategoryExpense getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }


    @Before
    public void setUp() throws Exception
    {
        this.repoImp = TotalCategoryExpensesRepoImp.getRepository();
        this.totalCategoryExpense = TotalFactory.getTotalCategoryExpense(23,23,23,23,23,23,23,23,45 );
    }

    @Test
    public void getAll()
    {
        ArrayList<TotalCategoryExpense> payments = this.repoImp.getAll();

        System.out.println(payments);
    }

    @Test
    public void create()
    {
        TotalCategoryExpense created = this.repoImp.create(this.totalCategoryExpense);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        TotalCategoryExpense updated = new TotalCategoryExpense.Builder().build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        TotalCategoryExpense saved = getSaved();
        //this.repoImp.delete(saved.getDescription());
    }

    @Test
    public void read()
    {
        TotalCategoryExpense saved = getSaved();
        //TotalCategoryExpense read = this.repoImp.read(saved.getDescription());
    }
}
package ServiceTests.ExpenseServiceTests.ExpensesServiceTests;

import BudgetBuddi.Domain.Expenses.Expense.Expense;
import BudgetBuddi.Factory.ExpensesFactories.ExpenseFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpensesRepositories.ExpenseRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseRepoImplenation.ExpensesRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ExpensesServiceImpTest
{
    private ExpenseRepository repoImp;
    private Expense expense;

    private Expense getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = ExpensesRepoImp.getRepository();
        //this.expense = (Expense) ExpenseFactory.getExpense(ArrayList <TotalCategoryExpenses> totalexpenses, 23, 23, 34 );
    }

    @Test
    public void getAll()
    {

        ArrayList<Expense> expenses = this.repoImp.getAll();

        System.out.println(expenses);


    }

    @Test
    public void create()
    {
        Expense created = this.repoImp.create(this.expense);
        System.out.println("Created =" + created);
        Assert.assertNotNull(expense);
    }

    @Test
    public void update()
    {

        String newExpense = "";


    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}
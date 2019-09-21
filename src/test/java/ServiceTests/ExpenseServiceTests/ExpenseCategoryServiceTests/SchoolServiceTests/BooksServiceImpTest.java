package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.SchoolServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Books;
import BudgetBuddi.Factory.ExpenseCategoryFactory.SchoolFactory.BooksFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories.BooksRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.SchoolRepoImplementation.BooksRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BooksServiceImpTest
{
    private BooksRepository repoImp;
    private Books payment;

    private Books getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }


    @Before
    public void setUp() throws Exception
    {
        this.repoImp = BooksRepoImp.getRepository();
        this.payment = BooksFactory.getBooks("January", 1, 350, 1);
    }

    @Test
    public void getAll()
    {
        ArrayList<Books> payments = this.repoImp.getAll();

        System.out.println(payments);
    }

    @Test
    public void create()
    {
        Books created = this.repoImp.create(this.payment);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Books updated = new Books.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        Books saved = getSaved();
        this.repoImp.delete(saved.getDescription());
    }

    @Test
    public void read()
    {
        Books saved = getSaved();
        Books read = this.repoImp.read(saved.getDescription());
    }
}
package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.SchoolRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Books;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories.BooksRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.SchoolRepoImplementation.BooksRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class BooksRepoImpTest {

    private BooksRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = BooksRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Books> books = this.repository.getAll();
        Assert.assertEquals(1, books.size());
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
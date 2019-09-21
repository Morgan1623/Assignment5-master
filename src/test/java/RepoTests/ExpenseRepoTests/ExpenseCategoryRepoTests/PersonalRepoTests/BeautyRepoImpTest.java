package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.PersonalRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Beauty;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.PersonalRepositories.BeautyRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.PersonalRepoImplementation.BeautyRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class BeautyRepoImpTest {

    private BeautyRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = BeautyRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Beauty> beauties = this.repository.getAll();
        Assert.assertEquals(1, beauties.size());
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
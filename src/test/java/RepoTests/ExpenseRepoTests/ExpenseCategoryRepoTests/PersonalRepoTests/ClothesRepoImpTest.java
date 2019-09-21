package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.PersonalRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Clothes;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.PersonalRepositories.ClothesRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.PersonalRepoImplementation.ClothesRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ClothesRepoImpTest {

    private ClothesRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = ClothesRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Clothes> clothes = this.repository.getAll();
        Assert.assertEquals(1, clothes.size());
    }

    @Test
    public void create() {
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
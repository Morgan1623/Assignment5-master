package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.PersonalServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Clothes;
import BudgetBuddi.Factory.ExpenseCategoryFactory.Personal.ClothesFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.PersonalRepositories.ClothesRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.PersonalRepoImplementation.ClothesRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClothesServiceImpTest
{
    private ClothesRepository repoImp;
    private Clothes clothes;

    private Clothes getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = ClothesRepoImp.getRepository();
        this.clothes = (Clothes) ClothesFactory.getClothes("January", 1, 350, 1);
    }

    @Test
    public void getAll()
    {
        ArrayList<Clothes> payments = this.repoImp.getAll();

        System.out.println(payments);
    }

    @Test
    public void create()
    {
        Clothes created = this.repoImp.create(this.clothes);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Clothes updated = new Clothes.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        Clothes saved = getSaved();
        this.repoImp.delete(saved.getDescription());
    }

    @Test
    public void read()
    {
        Clothes saved = getSaved();
        Clothes read = this.repoImp.read(saved.getDescription());
    }
}
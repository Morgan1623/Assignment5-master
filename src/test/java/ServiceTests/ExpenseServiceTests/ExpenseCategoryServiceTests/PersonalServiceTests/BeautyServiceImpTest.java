package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.PersonalServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Beauty;
import BudgetBuddi.Factory.ExpenseCategoryFactory.Personal.BeautyFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.PersonalRepositories.BeautyRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.PersonalRepoImplementation.BeautyRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BeautyServiceImpTest
{
    private BeautyRepository repoImp;
    private Beauty beauty;

    private Beauty getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = BeautyRepoImp.getRepository();
        this.beauty = (Beauty) BeautyFactory.getBeauty("January", 1, 350, 1);
    }

    @Test
    public void getAll()
    {
        ArrayList<Beauty> payments = this.repoImp.getAll();

        System.out.println(payments);
    }

    @Test
    public void create()
    {
        Beauty created = this.repoImp.create(this.beauty);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Beauty updated = new Beauty.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        Beauty saved = getSaved();
        this.repoImp.delete(saved.getDescription());
    }

    @Test
    public void read()
    {
        Beauty saved = getSaved();
        Beauty read = this.repoImp.read(saved.getDescription());
    }
}
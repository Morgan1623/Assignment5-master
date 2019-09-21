package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.SchoolServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Fees;
import BudgetBuddi.Factory.ExpenseCategoryFactory.SchoolFactory.BooksFactory;
import BudgetBuddi.Factory.ExpenseCategoryFactory.SchoolFactory.FeesFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories.FeesRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.SchoolRepoImplementation.FeesRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FeesServiceImpTest
{
    private FeesRepository repoImp;
    private Fees fees;

    private Fees getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = FeesRepoImp.getRepository();
        this.fees = FeesFactory.getFees(23, 1, 350);
    }

    @Test
    public void getAll()
    {
        ArrayList<Fees> feesl = this.repoImp.getAll();

        System.out.println(feesl);

    }

    @Test
    public void create()
    {
        Fees created = this.repoImp.create(this.fees);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Fees updated = new Fees.Builder().build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");

    }

    @Test
    public void delete()
    {
        Fees saved = getSaved();
        //this.repoImp.delete();

    }

    @Test
    public void read()
    {
        Fees saved = getSaved();
        //Fees read = this.repoImp.read(saved.getDescription());
    }
}
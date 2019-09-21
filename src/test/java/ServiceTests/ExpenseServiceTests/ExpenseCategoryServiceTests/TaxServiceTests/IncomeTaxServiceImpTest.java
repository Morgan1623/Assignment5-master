package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.TaxServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Tax.IncomeTax;
import BudgetBuddi.Factory.ExpenseCategoryFactory.TaxFactory.IncomeTaxFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TaxRepositories.IncomeTaxRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TaxRepoImplementation.IncomeTaxRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class IncomeTaxServiceImpTest
{
    private IncomeTaxRepository repoImp;
    private IncomeTax incomeTax;

    private IncomeTax getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = IncomeTaxRepoImp.getRepository();
        this.incomeTax = IncomeTaxFactory.getIncometax(2009, 89);
    }

    @Test
    public void getAll()
    {
        ArrayList<IncomeTax> payments = this.repoImp.getAll();

        System.out.println(payments);

    }

    @Test
    public void create()
    {
        IncomeTax created = this.repoImp.create(this.incomeTax);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        IncomeTax updated = new IncomeTax.Builder().build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        IncomeTax saved = getSaved();
        //this.repoImp.delete(saved.getDescription());
    }

    @Test
    public void read()
    {
        IncomeTax saved = getSaved();
        //IncomeTax read = this.repoImp.read(saved.getDescription());

    }
}
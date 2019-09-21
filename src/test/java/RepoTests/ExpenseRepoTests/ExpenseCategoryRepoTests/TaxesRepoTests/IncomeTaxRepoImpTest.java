package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.TaxesRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Tax.IncomeTax;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TaxRepositories.IncomeTaxRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TaxRepoImplementation.IncomeTaxRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class IncomeTaxRepoImpTest {

    private IncomeTaxRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = IncomeTaxRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<IncomeTax> incomeTaxes = this.repository.getAll();
        Assert.assertEquals(1, incomeTaxes.size());
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
package ServiceTests.IncomeServiceTests;

import BudgetBuddi.Domain.Income.IncomeSource;
import BudgetBuddi.Factory.ExpenseCategoryFactory.IncomeFactories.IncomeSourceFactory;
import BudgetBuddi.Repository.Implentation.IncomeRepoImplementation.IncomeSourceRepoImp;
import BudgetBuddi.Repository.IncomeRepositories.IncomeSourceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class IncomeSourceServiceImpTest
{
    private IncomeSourceRepository repoImp;
    private IncomeSource incomeSource;

    private IncomeSource getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = IncomeSourceRepoImp.getRepository();
        this.incomeSource = IncomeSourceFactory.getIncomeSource("January", 1, 350, 1);
    }

    @Test
    public void getAll()
    {
        ArrayList<IncomeSource> payments = this.repoImp.getAll();

        System.out.println(payments);
    }

    @Test
    public void create()
    {
        IncomeSource created = this.repoImp.create(this.incomeSource);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        IncomeSource updated = new IncomeSource.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        IncomeSource saved = getSaved();
        this.repoImp.delete(saved.getDescription());
    }

    @Test
    public void read()
    {
        IncomeSource saved = getSaved();
        IncomeSource read = this.repoImp.read(saved.getDescription());

    }
}
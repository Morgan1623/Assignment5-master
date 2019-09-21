package ServiceTests.IncomeServiceTests;

import BudgetBuddi.Domain.Income.RegularIncome;
import BudgetBuddi.Factory.ExpenseCategoryFactory.IncomeFactories.RegularIncomeFactory;
import BudgetBuddi.Repository.Implentation.IncomeRepoImplementation.RegularIncomeRepoImp;
import BudgetBuddi.Repository.IncomeRepositories.RegularIncomeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RegularIncomeServiceImpTest
{
    private RegularIncomeRepository repoImp;
    private RegularIncome payment;

    private RegularIncome getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = RegularIncomeRepoImp.getRepository();
        this.payment = RegularIncomeFactory.getRegularIncome("January", 1, 350, 1);
    }

    @Test
    public void getAll()
    {
        ArrayList<RegularIncome> payments = this.repoImp.getAll();

        System.out.println(payments);
    }

    @Test
    public void create()
    {
        RegularIncome created = this.repoImp.create(this.payment);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        RegularIncome updated = new RegularIncome.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        RegularIncome saved = getSaved();
        this.repoImp.delete(saved.getDescription());
    }

    @Test
    public void read()
    {
        RegularIncome saved = getSaved();
        RegularIncome read = this.repoImp.read(saved.getDescription());
    }
}
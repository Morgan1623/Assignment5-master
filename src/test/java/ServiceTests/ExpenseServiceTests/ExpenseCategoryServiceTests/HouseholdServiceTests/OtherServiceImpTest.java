package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.HouseholdServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Other;
import BudgetBuddi.Factory.ExpenseCategoryFactory.HouseholdFactories.OtherFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.OtherRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation.OtherRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class OtherServiceImpTest
{
    private OtherRepository repoImp;
    private Other other;

    private Other getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = OtherRepoImp.getRepository();
        this.other = (Other) OtherFactory.getOther("January", 1, 350, 1);
    }

    @Test
    public void getAll()
    {
        ArrayList<Other> payments = this.repoImp.getAll();

        System.out.println(payments);
    }

    @Test
    public void create()
    {
        Other created = this.repoImp.create(this.other);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Other updated = new Other.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        Other saved = getSaved();
        this.repoImp.delete(saved.getDescription());
    }

    @Test
    public void read()
    {
        Other saved = getSaved();
        Other read = this.repoImp.read(saved.getDescription());
    }
}
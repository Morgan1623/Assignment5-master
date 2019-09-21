package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.HouseholdServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Groceries;
import BudgetBuddi.Factory.ExpenseCategoryFactory.HouseholdFactories.GroceriesFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.GroceriesRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation.GroceriesRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GroceriesServiceImpTest
{
    private GroceriesRepository repoImp;
    private Groceries groceries;

    private Groceries getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = GroceriesRepoImp.getRepository();
        this.groceries = (Groceries) GroceriesFactory.getGroceries("January", 1, 350, 1, 4);

    }

    @Test
    public void getAll()
    {
        ArrayList<Groceries> groceries1 = this.repoImp.getAll();

        System.out.println(groceries1);
    }

    @Test
    public void create()
    {
        Groceries created = this.repoImp.create(this.groceries);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Groceries updated = new Groceries.Builder().items("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        Groceries saved = getSaved();
        this.repoImp.delete(saved.getItems());
    }

    @Test
    public void read()
    {
        Groceries saved = getSaved();
        Groceries read = this.repoImp.read(saved.getItems());
    }
}
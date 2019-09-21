package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.EntertainmentRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment.Party;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.EntertainmentRepositories.PartyRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.EntertainmentRepoImplementation.PartyRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PartyRepoImpTest {

    private PartyRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = PartyRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Party> parties = this.repository.getAll();
        Assert.assertEquals(1, parties.size());
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
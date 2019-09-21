package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.EntertainmentServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment.Party;
import BudgetBuddi.Factory.ExpenseCategoryFactory.EntertainmentFactories.PartyFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.EntertainmentRepositories.PartyRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.EntertainmentRepoImplementation.PartyRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PartyServiceImpTest
{
    private PartyRepository repoImp;
    private Party party;

    private Party getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {

        this.repoImp = PartyRepoImp.getRepository();
        this.party = (Party) PartyFactory.getParty("January", 1, 350, 1);
    }

    @Test
    public void getAll()
    {
        ArrayList<Party> parties = this.repoImp.getAll();

        System.out.println(parties);
    }

    @Test
    public void create()
    {
        Party created = this.repoImp.create(this.party);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Party updated = new Party.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");

    }

    @Test
    public void delete()
    {
        Party saved = getSaved();
        this.repoImp.delete(saved.getDescription());
    }

    @Test
    public void read()
    {
        Party saved = getSaved();
        Party read = this.repoImp.read(saved.getDescription());
    }
}
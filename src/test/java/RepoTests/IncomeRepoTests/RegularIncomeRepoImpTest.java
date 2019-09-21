package RepoTests.IncomeRepoTests;

import BudgetBuddi.Domain.Income.RegularIncome;
import BudgetBuddi.Repository.Implentation.IncomeRepoImplementation.RegularIncomeRepoImp;
import BudgetBuddi.Repository.IncomeRepositories.RegularIncomeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class RegularIncomeRepoImpTest {

    private RegularIncomeRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = RegularIncomeRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<RegularIncome> regularIncomes = this.repository.getAll();
        Assert.assertEquals(1, regularIncomes.size());
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
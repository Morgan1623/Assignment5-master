package RepoTests.IncomeRepoTests;

import BudgetBuddi.Domain.Income.IncomeSource;
import BudgetBuddi.Repository.Implentation.IncomeRepoImplementation.IncomeSourceRepoImp;
import BudgetBuddi.Repository.IncomeRepositories.IncomeSourceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class IncomeSourceRepoImpTest {

    private IncomeSourceRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = IncomeSourceRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<IncomeSource> incomeSources = this.repository.getAll();
        Assert.assertEquals(1, incomeSources.size());
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
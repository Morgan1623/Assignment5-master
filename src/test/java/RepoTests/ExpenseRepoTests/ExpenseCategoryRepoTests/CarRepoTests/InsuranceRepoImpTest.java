package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.CarRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Insurance;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories.InsuranceRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.CarRepoImplementation.InsuranceRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class InsuranceRepoImpTest {

    private InsuranceRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = InsuranceRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<Insurance> insurances = this.repository.getAll();
        Assert.assertEquals(1, insurances.size());
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
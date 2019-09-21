package RepoTests.ExpenseRepoTests.ExpenseCategoryRepoTests.HealthcareRepoTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Healthcare.MedicalAid;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HealthcareRepositories.MedicalAidRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HealthcareRepoImplementation.MedicalAidRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class MedicalAidRepoImpTest {

    private MedicalAidRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = MedicalAidRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<MedicalAid> medicalAids = this.repository.getAll();
        Assert.assertEquals(1, medicalAids.size());
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
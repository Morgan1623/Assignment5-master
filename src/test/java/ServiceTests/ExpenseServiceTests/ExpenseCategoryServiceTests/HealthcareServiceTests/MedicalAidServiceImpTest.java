package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.HealthcareServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Healthcare.MedicalAid;
import BudgetBuddi.Factory.ExpenseCategoryFactory.HealthcareFactories.MedicalAidFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HealthcareRepositories.MedicalAidRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HealthcareRepoImplementation.MedicalAidRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MedicalAidServiceImpTest
{
    private MedicalAidRepository repoImp;
    private MedicalAid medicalAid;

    private MedicalAid getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = MedicalAidRepoImp.getRepository();
        this.medicalAid = (MedicalAid) MedicalAidFactory.getMedicalAid("", "", 65, 700, 2 );

    }

    @Test
    public void getAll()
    {
        ArrayList<MedicalAid> medicalAids = this.repoImp.getAll();

        System.out.println(medicalAids);

    }

    @Test
    public void create()
    {
        MedicalAid created = this.repoImp.create(this.medicalAid);
        System.out.println("Created =" + created);

    }

    @Test
    public void update()
    {
        String newMedicalAid = "";

        MedicalAid updated = new MedicalAid.Builder().medicalAidID("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");

    }

    @Test
    public void delete()
    {
        MedicalAid saved = getSaved();
        this.repoImp.delete(saved.getMedicalAidID());
    }

    @Test
    public void read()
    {
        MedicalAid saved = getSaved();
        MedicalAid read = this.repoImp.read(saved.getMedicalAidID());
    }
}
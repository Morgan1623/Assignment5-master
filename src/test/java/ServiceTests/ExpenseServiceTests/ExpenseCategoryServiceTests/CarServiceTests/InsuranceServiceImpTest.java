package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.CarServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Insurance;
import BudgetBuddi.Factory.ExpenseCategoryFactory.CarFactories.InsuranceFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories.InsuranceRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.CarRepoImplementation.InsuranceRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class InsuranceServiceImpTest
{
    private InsuranceRepository repoImp;
    private Insurance insurance;
    private Insurance getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = InsuranceRepoImp.getRepository();
        this.insurance = (Insurance) InsuranceFactory.getInsurance("January", 1, 350, 1);

    }

    @Test
    public void getAll()
    {
        ArrayList<Insurance> insurances = this.repoImp.getAll();

        System.out.println(insurances);

    }

    @Test
    public void create()
    {
        Insurance created = this.repoImp.create(this.insurance);
        System.out.println("Created =" + created);
        Assert.assertNotNull(insurance);
    }

    @Test
    public void update()
    {
        String newInsurance = "";

        Insurance updated = new Insurance.Builder().insuranceName("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        Insurance saved = getSaved();
        this.repoImp.delete(saved.getInsuranceName());
    }

    @Test
    public void read()
    {
        Insurance saved = getSaved();
        Insurance read = this.repoImp.read(saved.getInsuranceName());
    }
}
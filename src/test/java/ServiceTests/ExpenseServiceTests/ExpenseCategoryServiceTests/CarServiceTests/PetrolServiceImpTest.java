package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.CarServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Petrol;
import BudgetBuddi.Factory.ExpenseCategoryFactory.CarFactories.PetrolFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories.PetrolRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.CarRepoImplementation.PetrolRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PetrolServiceImpTest
{
    private PetrolRepository repoImp;
    private Petrol petrol;

    private Petrol getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }


    @Before
    public void setUp() throws Exception
    {
        this.repoImp = PetrolRepoImp.getRepository();
        this.petrol = (Petrol) PetrolFactory.getPetrol(1,235,3);

    }

    @Test
    public void getAll()
    {
        ArrayList<Petrol> petrols = this.repoImp.getAll();

        System.out.println(petrols);
    }

    @Test
    public void create()
    {
        Petrol created = this.repoImp.create(this.petrol);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        Petrol updated = new Petrol.Builder().total(45).build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame(45, 50);

    }

    @Test
    public void delete()
    {
        Petrol saved = getSaved();
        //this.repoImp.delete();
    }

    @Test
    public void read()
    {
        Petrol saved = getSaved();
        //Petrol read = this.repoImp.read(saved.getI());
    }
}
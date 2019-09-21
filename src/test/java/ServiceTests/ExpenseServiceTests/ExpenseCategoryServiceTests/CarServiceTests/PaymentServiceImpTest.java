package ServiceTests.ExpenseServiceTests.ExpenseCategoryServiceTests.CarServiceTests;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Payment;
import BudgetBuddi.Factory.ExpenseCategoryFactory.CarFactories.PaymentFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories.PayMentRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.CarRepoImplementation.PaymentsRepoImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PaymentServiceImpTest
{
    private PayMentRepository repoImp;
    private Payment payment;

    private Payment getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = PaymentsRepoImp.getRepository();
        this.payment = PaymentFactory.getPayment("January", 1, 350, 1);

    }

    @Test
    public void getAll()
    {
        ArrayList<Payment> payments = this.repoImp.getAll();

        System.out.println(payments);

    }

    @Test
    public void create()
    {
        Payment created = this.repoImp.create(this.payment);
        System.out.println("Created =" + created);

    }

    @Test
    public void update()
    {
        String newPayment = "";

        Payment updated = new Payment.Builder().description("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");

    }

    @Test
    public void delete()
    {
        Payment saved = getSaved();
        this.repoImp.delete(saved.getDescription());

    }

    @Test
    public void read()
    {
        Payment saved = getSaved();
        Payment read = this.repoImp.read(saved.getDescription());
    }
}
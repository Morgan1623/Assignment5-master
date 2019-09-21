package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.CarRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Payment;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories.PayMentRepository;

import java.util.ArrayList;

public class PaymentsRepoImp implements PayMentRepository
{
    private static PaymentsRepoImp repository =null;
    ArrayList<Payment> payments;

    private PaymentsRepoImp()
    {
        this.payments = new  ArrayList<>();
    }

    public static PayMentRepository getRepository()
    {
        if(repository == null) repository = new PaymentsRepoImp();
        return repository;
    }


    @Override
    public ArrayList<Payment> getAll()
    {
        return this.payments;
    }

    @Override
    public Payment create(Payment payment)
    {
        this.payments.add(payment);
        return null;
    }

    @Override
    public Payment update(Payment payment)
    {
        this.payments.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.payments.remove(payments);

    }

    @Override
    public Payment read(String s) {
        {
            for (int i = 0; i < payments.size(); i++)
                System.out.println(payments.get(i));

            return null;
        }
    }
}//classes

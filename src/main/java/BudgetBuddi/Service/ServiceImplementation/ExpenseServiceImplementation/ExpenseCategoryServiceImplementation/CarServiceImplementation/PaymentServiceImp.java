package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.CarServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Payment;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories.PayMentRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.CarRepoImplementation.PaymentsRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.CarServices.PaymentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PaymentServiceImp implements PaymentService
{
    private static PaymentServiceImp service =null;
    private PayMentRepository repository;

    private PaymentServiceImp()
    {
        this.repository= PaymentsRepoImp.getRepository();
    }

    public static PaymentServiceImp getService()
    {
        if (service == null) service = new PaymentServiceImp();
        return service;
    }

    @Override
    public ArrayList<Payment> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Payment create(Payment payment)
    {
        return this.repository.create(payment);
    }

    @Override
    public Payment update(Payment payment)
    {
        return this.repository.update(payment);
    }

    @Override
    public void delete(String s)
    {
      this.repository.delete(s);
    }

    @Override
    public Payment read(String s)
    {
        return this.repository.read(s);
    }
}

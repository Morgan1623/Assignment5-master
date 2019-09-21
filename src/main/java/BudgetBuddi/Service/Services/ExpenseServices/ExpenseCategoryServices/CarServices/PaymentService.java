package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.CarServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Payment;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface PaymentService extends IServices<Payment, String>
{
    ArrayList<Payment> getAll();
}

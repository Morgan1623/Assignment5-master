package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Payment;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface PayMentRepository extends ImplementationRepository<Payment,String>
{
    ArrayList<Payment> getAll();


}//class

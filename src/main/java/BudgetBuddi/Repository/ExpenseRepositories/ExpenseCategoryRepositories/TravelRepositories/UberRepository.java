package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Uber;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface UberRepository extends ImplementationRepository<Uber, String>
{
    ArrayList<Uber> getAll();
}//class

package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Bus;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface BusRepository extends ImplementationRepository<Bus, String>
{
    ArrayList<Bus> getAll();
}//class

package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Plane;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface PlaneRepository extends ImplementationRepository<Plane, String>
{
    ArrayList<Plane> getAll();
}//class

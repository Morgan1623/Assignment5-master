package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Stationary;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface StationaryRepository extends ImplementationRepository<Stationary, String>
{
    ArrayList<Stationary> getAll();
}//class

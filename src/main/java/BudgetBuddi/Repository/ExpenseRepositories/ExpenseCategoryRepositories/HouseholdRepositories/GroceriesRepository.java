package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Groceries;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface GroceriesRepository extends ImplementationRepository<Groceries, String>
{
    ArrayList<Groceries> getAll();
}//class

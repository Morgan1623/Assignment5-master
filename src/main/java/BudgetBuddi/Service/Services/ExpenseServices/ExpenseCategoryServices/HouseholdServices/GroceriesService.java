package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HouseholdServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Groceries;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface GroceriesService extends IServices<Groceries, String>
{
    ArrayList<Groceries> getAll();
}

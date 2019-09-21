package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TotalsServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Totals.TotalCategoryExpense;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface TotalCategoryService extends IServices<TotalCategoryExpense, String>
{
    ArrayList<TotalCategoryExpense> getAll();
}

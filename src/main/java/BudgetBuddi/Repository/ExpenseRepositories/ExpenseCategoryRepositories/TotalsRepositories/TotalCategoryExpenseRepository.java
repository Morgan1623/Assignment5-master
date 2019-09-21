package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TotalsRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Totals.TotalCategoryExpense;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface TotalCategoryExpenseRepository extends ImplementationRepository<TotalCategoryExpense, String>
{
    ArrayList<TotalCategoryExpense> getAll();
}//class

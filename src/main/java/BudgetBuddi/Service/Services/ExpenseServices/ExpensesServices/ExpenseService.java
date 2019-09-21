package BudgetBuddi.Service.Services.ExpenseServices.ExpensesServices;

import BudgetBuddi.Domain.Expenses.Expense.Expense;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface ExpenseService extends IServices<Expense, String>
{
    ArrayList<Expense> getAll();
}

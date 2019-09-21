package BudgetBuddi.Service.Services.ExpenseServices.ExpensesServices;

import BudgetBuddi.Domain.Expenses.Expense.RegularExpsenses;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface RegularExpenseServices extends IServices<RegularExpsenses, String>
{
    ArrayList<RegularExpsenses> getAll();
}

package BudgetBuddi.Repository.ExpenseRepositories.ExpensesRepositories;

import BudgetBuddi.Domain.Expenses.Expense.RegularExpsenses;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface RegularExpenseRepository extends ImplementationRepository<RegularExpsenses, String>
{
    ArrayList<RegularExpsenses> getAll();
}//class

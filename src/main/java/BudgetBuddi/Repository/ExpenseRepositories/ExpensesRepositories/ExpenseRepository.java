package BudgetBuddi.Repository.ExpenseRepositories.ExpensesRepositories;

import BudgetBuddi.Domain.Expenses.Expense.Expense;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface ExpenseRepository extends ImplementationRepository<Expense, String>
{
    ArrayList<Expense> getAll();
}//class

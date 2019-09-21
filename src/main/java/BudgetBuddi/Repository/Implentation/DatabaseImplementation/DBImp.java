package BudgetBuddi.Repository.Implentation.DatabaseImplementation;

import BudgetBuddi.Domain.Expenses.Expense.Expense;
import BudgetBuddi.Repository.ExpenseRepositories.ExpensesRepositories.ExpenseRepository;

import java.util.ArrayList;

public class DBImp implements ExpenseRepository
{
    @Override
    public ArrayList<Expense> getAll() {
        return null;
    }

    @Override
    public Expense create(Expense expense) {
        return null;
    }

    @Override
    public Expense update(Expense expense) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Expense read(String s) {
        return null;
    }
}//class

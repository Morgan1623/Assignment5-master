package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseRepoImplenation;

import BudgetBuddi.Domain.Expenses.Expense.Expense;
import BudgetBuddi.Repository.ExpenseRepositories.ExpensesRepositories.ExpenseRepository;


import java.util.ArrayList;

public class ExpensesRepoImp implements ExpenseRepository
{
    private static ExpensesRepoImp repository =null;
    ArrayList<Expense> expenses;

    private ExpensesRepoImp()
    {
        this.expenses = new  ArrayList<>();
    }

    public static ExpenseRepository getRepository()
    {
        if(repository == null) repository = new ExpensesRepoImp();
        return repository;
    }


    public ArrayList<Expense> getAll() {
        return this.expenses;
    }


    public Expense create(Expense expense)
    {
        this.expenses.add(expense);
        return null;
    }


    public Expense update(Expense expense)
    {
        this.expenses.set(1, null);
        return null;
    }


    public void delete(String s)
    {
        this.expenses.remove(expenses);
    }


    public Expense read(String s)
    {
        for (int i = 0; i < expenses.size(); i++)
            System.out.println(expenses.get(i));

        return null;
    }

}//class

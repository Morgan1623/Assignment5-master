package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TotalsRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Totals.TotalCategoryExpense;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TotalsRepositories.TotalCategoryExpenseRepository;

import java.util.ArrayList;

public class TotalCategoryExpensesRepoImp implements TotalCategoryExpenseRepository
{
    private static TotalCategoryExpensesRepoImp repository =null;
    ArrayList<TotalCategoryExpense> totalCategoryExpenses;

    private TotalCategoryExpensesRepoImp()
    {
        this.totalCategoryExpenses = new  ArrayList<>();
    }

    public static TotalCategoryExpenseRepository getRepository()
    {
        if(repository == null) repository = new TotalCategoryExpensesRepoImp();
        return repository;
    }

    @Override
    public ArrayList<TotalCategoryExpense> getAll()
    {
        return this.totalCategoryExpenses;
    }

    @Override
    public TotalCategoryExpense create(TotalCategoryExpense totalCategoryExpense)
    {
        this.totalCategoryExpenses.add(totalCategoryExpense);
        return null;
    }

    @Override
    public TotalCategoryExpense update(TotalCategoryExpense totalCategoryExpense)
    {
        this.totalCategoryExpenses.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.totalCategoryExpenses.remove(totalCategoryExpenses);

    }

    @Override
    public TotalCategoryExpense read(String s)
    {
        for (int i = 0; i < totalCategoryExpenses.size(); i++)
            System.out.println(totalCategoryExpenses.get(i));
        return null;
    }
}//classes

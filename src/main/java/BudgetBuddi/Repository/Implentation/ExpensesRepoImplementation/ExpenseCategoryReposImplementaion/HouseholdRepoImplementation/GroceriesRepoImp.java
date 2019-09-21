package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Groceries;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.GroceriesRepository;

import java.util.ArrayList;

public class GroceriesRepoImp implements GroceriesRepository
{
    private static GroceriesRepoImp repository =null;
    ArrayList<Groceries> groceriesList;

    private GroceriesRepoImp()
    {
        this.groceriesList = new  ArrayList<>();
    }

    public static GroceriesRepository getRepository()
    {
        if(repository == null) repository = new GroceriesRepoImp();
        return repository;
    }

    @Override
    public ArrayList<Groceries> getAll()
    {

        return this.groceriesList;
    }

    @Override
    public Groceries create(Groceries groceries)
    {
        this.groceriesList.add(groceries);
        return null;
    }

    @Override
    public Groceries update(Groceries groceries)
    {
        this.groceriesList.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.groceriesList.remove(groceriesList);

    }

    @Override
    public Groceries read(String s)
    {
        for (int i = 0; i < groceriesList.size(); i++)
            System.out.println(groceriesList.get(i));
        return null;
    }
}//classes

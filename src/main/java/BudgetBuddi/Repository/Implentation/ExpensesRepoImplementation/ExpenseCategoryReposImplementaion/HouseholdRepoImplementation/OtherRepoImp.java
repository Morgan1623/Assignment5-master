package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Other;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.OtherRepository;

import java.util.ArrayList;

public class OtherRepoImp implements OtherRepository
{
    private static OtherRepoImp repository =null;
    ArrayList<Other> others;

    private OtherRepoImp()
    {
        this.others = new  ArrayList<>();
    }

    public static OtherRepository getRepository()
    {
        if(repository == null) repository = new OtherRepoImp();
        return repository;
    }

    @Override
    public ArrayList<Other> getAll()
    {
        return this.others;
    }

    @Override
    public Other create(Other other)
    {
        this.others.add(other);
        return null;
    }

    @Override
    public Other update(Other other)
    {
        this.others.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.others.remove(others);

    }

    @Override
    public Other read(String s)
    {
        for (int i = 0; i < others.size(); i++)
            System.out.println(others.get(i));
        return null;
    }
}//class

package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.SchoolRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Stationary;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories.StationaryRepository;

import java.util.ArrayList;

public class StationaryRepoImp implements StationaryRepository
{
    private static StationaryRepoImp repository =null;
    ArrayList<Stationary> stationaries;

    private StationaryRepoImp()
    {
        this.stationaries = new  ArrayList<>();
    }

    public static StationaryRepository getRepository()
    {
        if(repository == null) repository = new StationaryRepoImp();
        return repository;
    }

    @Override
    public ArrayList<Stationary> getAll()
    {
        return this.stationaries;
    }

    @Override
    public Stationary create(Stationary stationary)
    {
        this.stationaries.add(stationary);
        return null;
    }

    @Override
    public Stationary update(Stationary stationary) {
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.stationaries.remove(stationaries);

    }

    @Override
    public Stationary read(String s)
    {
        for (int i = 0; i < stationaries.size(); i++)
            System.out.println(stationaries.get(i));
        return null;
    }
}//class

package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TravelRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Uber;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories.UberRepository;

import java.util.ArrayList;

public class UberRepoImp implements UberRepository
{
    private static UberRepoImp repository =null;
    ArrayList<Uber> ubers;

    private UberRepoImp()
    {
        this.ubers = new  ArrayList<>();
    }

    public static UberRepository getRepository()
    {
        if(repository == null) repository = new UberRepoImp();
        return repository;
    }

    @Override
    public ArrayList<Uber> getAll()
    {

        return this.ubers;
    }

    @Override
    public Uber create(Uber uber)
    {
        this.ubers.add(uber);
        return null;
    }

    @Override
    public Uber update(Uber uber)
    {
        this.ubers.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.ubers.remove(ubers);

    }

    @Override
    public Uber read(String s)
    {
        for (int i = 0; i < ubers.size(); i++)
            System.out.println(ubers.get(i));
        return null;
    }
}//class

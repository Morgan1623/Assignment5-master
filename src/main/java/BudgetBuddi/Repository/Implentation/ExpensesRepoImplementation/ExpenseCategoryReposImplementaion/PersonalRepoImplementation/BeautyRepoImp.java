package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.PersonalRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Beauty;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.PersonalRepositories.BeautyRepository;

import java.util.ArrayList;

public class BeautyRepoImp implements BeautyRepository
{
    private static BeautyRepoImp repository =null;
    ArrayList<Beauty> beauties;

    private BeautyRepoImp()
    {
        this.beauties = new  ArrayList<>();
    }

    public static BeautyRepository getRepository()
    {
        if(repository == null) repository = new BeautyRepoImp();
        return repository;
    }

    @Override
    public ArrayList<Beauty> getAll()
    {
        return this.beauties;
    }

    @Override
    public Beauty create(Beauty beauty)
    {
        this.beauties.add(beauty);
        return null;
    }

    @Override
    public Beauty update(Beauty beauty)
    {

        this.beauties.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.beauties.remove(beauties);

    }

    @Override
    public Beauty read(String s)
    {
        for (int i = 0; i < beauties.size(); i++)
            System.out.println(beauties.get(i));
        return null;
    }
}//class

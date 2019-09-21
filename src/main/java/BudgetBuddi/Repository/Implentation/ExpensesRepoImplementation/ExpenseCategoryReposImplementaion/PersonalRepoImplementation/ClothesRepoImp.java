package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.PersonalRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Clothes;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.PersonalRepositories.ClothesRepository;

import java.util.ArrayList;

public class ClothesRepoImp implements ClothesRepository
{
    private static ClothesRepoImp repository =null;
    ArrayList<Clothes> clothing;

    private ClothesRepoImp()
    {
        this.clothing = new  ArrayList<>();
    }

    public static ClothesRepository getRepository()
    {
        if(repository == null) repository = new ClothesRepoImp();
        return repository;
    }

    @Override
    public ArrayList<Clothes> getAll()
    {
        return this.clothing;
    }

    @Override
    public Clothes create(Clothes clothes)
    {
        this.clothing.add(clothes);
        return null;
    }

    @Override
    public Clothes update(Clothes clothes)
    {
        this.clothing.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.clothing.remove(clothing);

    }

    @Override
    public Clothes read(String s)
    {
        for (int i = 0; i < clothing.size(); i++)
            System.out.println(clothing.get(i));
        return null;
    }
}//class

package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.CarRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Petrol;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories.PetrolRepository;

import java.util.ArrayList;

public class PetrolRepoImp implements PetrolRepository
{
    private static PetrolRepoImp repository =null;
    ArrayList<Petrol> petrols;

    private PetrolRepoImp()
    {
        this.petrols = new  ArrayList<>();
    }

    public static PetrolRepository getRepository()
    {
        if(repository == null) repository = new PetrolRepoImp();
        return repository;
    }

    @Override
    public ArrayList<Petrol> getAll()
    {
        return this.petrols;
    }

    @Override
    public Petrol create(Petrol petrol)
    {
        this.petrols.add(petrol);
        return null;
    }

    @Override
    public Petrol update(Petrol petrol)
    {
        this.petrols.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.petrols.remove(petrols);

    }

    @Override
    public Petrol read(String s)
    {

        {
            for (int i = 0; i < petrols.size(); i++)
                System.out.println(petrols.get(i));

            return null;
        }
    }
}//class

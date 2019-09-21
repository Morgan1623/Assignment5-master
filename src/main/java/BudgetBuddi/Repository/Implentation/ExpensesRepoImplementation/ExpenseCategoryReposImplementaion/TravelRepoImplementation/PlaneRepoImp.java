package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TravelRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Plane;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories.PlaneRepository;

import java.util.ArrayList;

public class PlaneRepoImp implements PlaneRepository
{
    private static PlaneRepoImp repository =null;
    ArrayList<Plane> planes;

    private PlaneRepoImp()
    {
        this.planes = new  ArrayList<>();
    }

    public static PlaneRepository getRepository()
    {
        if(repository == null) repository = new PlaneRepoImp();
        return repository;
    }


    @Override
    public ArrayList<Plane> getAll()
    {
        return this.planes;
    }

    @Override
    public Plane create(Plane plane)
    {
        this.planes.add(plane);
        return null;
    }

    @Override
    public Plane update(Plane plane)
    {
        this.planes.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.planes.remove(planes);

    }

    @Override
    public Plane read(String s)
    {
        for (int i = 0; i < planes.size(); i++)
            System.out.println(planes.get(i));
        return null;
    }
}//class

package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TravelRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Bus;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories.BusRepository;

import java.util.ArrayList;

public class BusRepoImp implements BusRepository
{
    private static BusRepoImp repository =null;
    ArrayList<Bus> buses;

    private BusRepoImp()
    {
        this.buses = new  ArrayList<>();
    }

    public static BusRepository getRepository()
    {
        if(repository == null) repository = new BusRepoImp();
        return repository;
    }

    @Override
    public ArrayList<Bus> getAll()
    {
        return this.buses;
    }

    @Override
    public Bus create(Bus bus)
    {
        this.buses.add(bus);
        return null;
    }

    @Override
    public Bus update(Bus bus)
    {
        this.buses.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.buses.remove(buses);

    }

    @Override
    public Bus read(String s)
    {
        for (int i = 0; i < buses.size(); i++)
            System.out.println(buses.get(i));
        return null;
    }
}//class

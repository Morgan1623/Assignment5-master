package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Rent;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.RentRepository;

import java.util.ArrayList;

public class RentRepoImp implements RentRepository
{
    private static RentRepoImp repository =null;
    ArrayList<Rent> rents;

    private RentRepoImp()
    {
        this.rents = new  ArrayList<>();
    }

    public static RentRepository getRepository()
    {
        if(repository == null) repository = new RentRepoImp();
        return repository;
    }

    @Override
    public ArrayList<Rent> getAll()
    {

        return this.rents;
    }

    @Override
    public Rent create(Rent rent)
    {
        this.rents.add(rent);
        return null;
    }

    @Override
    public Rent update(Rent rent)
    {
        this.rents.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.rents.remove(rents);

    }

    @Override
    public Rent read(String s)
    {
        for (int i = 0; i < rents.size(); i++)
            System.out.println(rents.get(i));
        return null;
    }
}//classes

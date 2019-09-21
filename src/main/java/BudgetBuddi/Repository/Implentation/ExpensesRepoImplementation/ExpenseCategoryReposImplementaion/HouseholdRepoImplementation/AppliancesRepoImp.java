package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Appliances;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.AppliancesRepository;

import java.util.ArrayList;

public class AppliancesRepoImp implements AppliancesRepository
{
    private static AppliancesRepoImp repository =null;
    ArrayList<Appliances> appliances;

    private AppliancesRepoImp()
    {
        this.appliances = new  ArrayList<>();
    }

    public static AppliancesRepository getRepository()
    {
        if(repository == null) repository = new AppliancesRepoImp();
        return repository;
    }

    @Override
    public ArrayList<Appliances> getAll()
    {
        return this.appliances;
    }

    @Override
    public Appliances create(Appliances appliances)
    {
        this.appliances.add(appliances);
        return null;
    }

    @Override
    public Appliances update(Appliances appliances)
    {
        this.appliances.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.appliances.remove(appliances);

    }

    @Override
    public Appliances read(String s)
    {
        for (int i = 0; i < appliances.size(); i++)
            System.out.println(appliances.get(i));
        return null;
    }
}//classes

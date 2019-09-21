package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.HouseholdServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Groceries;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.GroceriesRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation.GroceriesRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HouseholdServices.GroceriesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class GroceriesServiceImp implements GroceriesService
{
    private static GroceriesServiceImp service =null;
    private GroceriesRepository repository;

    private GroceriesServiceImp()
    {
        this.repository= GroceriesRepoImp.getRepository();
    }

    public static GroceriesServiceImp getService()
    {
        if (service == null) service = new GroceriesServiceImp();
        return service;
    }


    @Override
    public ArrayList<Groceries> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Groceries create(Groceries groceries)
    {
        return this.repository.create(groceries);
    }

    @Override
    public Groceries update(Groceries groceries)
    {
        return this.repository.update(groceries);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }

    @Override
    public Groceries read(String s)
    {
        return this.repository.read(s);
    }
}

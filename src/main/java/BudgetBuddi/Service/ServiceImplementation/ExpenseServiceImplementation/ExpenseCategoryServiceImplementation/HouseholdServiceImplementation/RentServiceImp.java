package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.HouseholdServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Rent;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.RentRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation.RentRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HouseholdServices.RentServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class RentServiceImp implements RentServices
{
    private static RentServiceImp service =null;
    private RentRepository repository;

    private RentServiceImp()
    {
        this.repository= RentRepoImp.getRepository();
    }

    public static RentServiceImp getService()
    {
        if (service == null) service = new RentServiceImp();
        return service;
    }


    @Override
    public ArrayList<Rent> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Rent create(Rent rent)
    {
        return this.repository.create(rent);
    }

    @Override
    public Rent update(Rent rent)
    {
        return this.repository.update(rent);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public Rent read(String s)
    {
        return this.repository.read(s);
    }
}

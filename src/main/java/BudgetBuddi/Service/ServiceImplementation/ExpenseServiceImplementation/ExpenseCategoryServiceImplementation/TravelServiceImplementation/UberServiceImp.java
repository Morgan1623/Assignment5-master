package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.TravelServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Uber;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories.UberRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TravelRepoImplementation.UberRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TravelServices.UberService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UberServiceImp implements UberService
{
    private static UberServiceImp service =null;
    private UberRepository repository;

    private UberServiceImp()
    {
        this.repository= UberRepoImp.getRepository();
    }

    public static UberServiceImp getService()
    {
        if (service == null) service = new UberServiceImp();
        return service;
    }


    @Override
    public ArrayList<Uber> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Uber create(Uber uber)
    {
        return this.repository.create(uber);
    }

    @Override
    public Uber update(Uber uber)
    {
        return this.update(uber);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public Uber read(String s)
    {
        return this.repository.read(s);
    }
}

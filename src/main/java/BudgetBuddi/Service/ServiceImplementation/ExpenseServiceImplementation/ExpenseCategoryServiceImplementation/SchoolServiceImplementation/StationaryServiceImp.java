package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.SchoolServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Stationary;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories.StationaryRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.SchoolRepoImplementation.StationaryRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.SchoolServices.StationaryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class StationaryServiceImp implements StationaryService
{
    private static StationaryServiceImp service =null;
    private StationaryRepository repository;

    private StationaryServiceImp()
    {
        this.repository= StationaryRepoImp.getRepository();
    }

    public static StationaryServiceImp getService()
    {
        if (service == null) service = new StationaryServiceImp();
        return service;
    }


    @Override
    public ArrayList<Stationary> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Stationary create(Stationary stationary)
    {
        return this.repository.create(stationary);
    }

    @Override
    public Stationary update(Stationary stationary)
    {
        return this.repository.update(stationary);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public Stationary read(String s)
    {
        return this.repository.read(s);
    }
}

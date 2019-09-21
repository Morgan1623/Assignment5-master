package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.TravelServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Plane;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories.PlaneRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TravelRepoImplementation.PlaneRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TravelServices.PlaneService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PlaneServiceImp implements PlaneService
{
    private static PlaneServiceImp service =null;
    private PlaneRepository repository;

    private PlaneServiceImp()
    {
        this.repository= PlaneRepoImp.getRepository();
    }

    public static PlaneServiceImp getService()
    {
        if (service == null) service = new PlaneServiceImp();
        return service;
    }


    @Override
    public ArrayList<Plane> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Plane create(Plane plane)
    {
        return this.repository.create(plane);
    }

    @Override
    public Plane update(Plane plane)
    {

        return this.repository.update(plane);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public Plane read(String s)
    {
        return this.repository.read(s);
    }
}

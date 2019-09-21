package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.TravelServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Bus;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TravelRepositories.BusRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TravelRepoImplementation.BusRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TravelServices.BusService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class BusServiceImp implements BusService
{
    private static BusServiceImp service =null;
    private BusRepository repository;

    private BusServiceImp()
    {
        this.repository= BusRepoImp.getRepository();
    }

    public static BusServiceImp getService()
    {
        if (service == null) service = new BusServiceImp();
        return service;
    }


    @Override
    public ArrayList<Bus> getAll()
    {
        return this.getAll();
    }

    @Override
    public Bus create(Bus bus)
    {
        return this.repository.create(bus);
    }

    @Override
    public Bus update(Bus bus)
    {
        return this.repository.update(bus);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public Bus read(String s)
    {
        return this.repository.read(s);
    }
}

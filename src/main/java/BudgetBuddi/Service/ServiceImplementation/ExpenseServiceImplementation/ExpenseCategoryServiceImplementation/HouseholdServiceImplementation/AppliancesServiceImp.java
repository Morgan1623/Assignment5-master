package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.HouseholdServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Appliances;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.AppliancesRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation.AppliancesRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HouseholdServices.AppliancesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class AppliancesServiceImp implements AppliancesService
{
    private static AppliancesServiceImp service =null;
    private AppliancesRepository repository;

    private AppliancesServiceImp()
    {
        this.repository= AppliancesRepoImp.getRepository();
    }

    public static AppliancesServiceImp getService()
    {
        if (service == null) service = new AppliancesServiceImp();
        return service;
    }


    @Override
    public ArrayList<Appliances> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Appliances create(Appliances appliances)
    {
        return this.repository.create(appliances);
    }

    @Override
    public Appliances update(Appliances appliances)
    {
        return this.repository.update(appliances);
    }

    @Override
    public void delete(String s)
    {
      this.repository.delete(s);
    }

    @Override
    public Appliances read(String s)
    {
        return this.repository.read(s);
    }
}

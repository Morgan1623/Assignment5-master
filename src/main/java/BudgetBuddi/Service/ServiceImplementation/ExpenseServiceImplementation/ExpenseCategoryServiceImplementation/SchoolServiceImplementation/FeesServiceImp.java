package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.SchoolServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Fees;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories.FeesRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.SchoolRepoImplementation.FeesRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.SchoolServices.FeesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class FeesServiceImp implements FeesService
{
    private static FeesServiceImp service =null;
    private FeesRepository repository;

    private FeesServiceImp()
    {
        this.repository= FeesRepoImp.getRepository();
    }

    public static FeesServiceImp getService()
    {
        if (service == null) service = new FeesServiceImp();
        return service;
    }


    @Override
    public ArrayList<Fees> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Fees create(Fees fees)
    {
        return this.repository.create(fees);
    }

    @Override
    public Fees update(Fees fees)
    {
        return this.repository.update(fees);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public Fees read(String s)
    {
        return this.repository.read(s);
    }
}

package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.HouseholdServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Other;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories.OtherRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HouseholdRepoImplementation.OtherRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HouseholdServices.OtherServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class OtherServiceImp implements OtherServices
{
    private static OtherServiceImp service =null;
    private OtherRepository repository;

    private OtherServiceImp()
    {
        this.repository= OtherRepoImp.getRepository();
    }

    public static OtherServiceImp getService()
    {
        if (service == null) service = new OtherServiceImp();
        return service;
    }

    @Override
    public ArrayList<Other> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Other create(Other other)
    {
        return this.repository.create(other);
    }

    @Override
    public Other update(Other other)
    {
        return this.repository.update(other);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public Other read(String s)
    {
        return this.repository.read(s);
    }
}

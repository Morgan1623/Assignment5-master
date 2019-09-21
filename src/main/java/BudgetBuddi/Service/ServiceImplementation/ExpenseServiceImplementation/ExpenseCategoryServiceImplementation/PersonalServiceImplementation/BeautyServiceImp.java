package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.PersonalServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Beauty;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.PersonalRepositories.BeautyRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.PersonalRepoImplementation.BeautyRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.PersonalServices.BeautyServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class BeautyServiceImp implements BeautyServices
{
    private static BeautyServiceImp service =null;
    private BeautyRepository repository;

    private BeautyServiceImp()
    {
        this.repository= BeautyRepoImp.getRepository();
    }

    public static BeautyServiceImp getService()
    {
        if (service == null) service = new BeautyServiceImp();
        return service;
    }


    @Override
    public ArrayList<Beauty> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Beauty create(Beauty beauty)
    {
        return this.repository.create(beauty);
    }

    @Override
    public Beauty update(Beauty beauty)
    {
        return this.repository.update(beauty);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public Beauty read(String s)
    {
        return this.repository.read(s);
    }
}

package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.PersonalServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Clothes;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.PersonalRepositories.ClothesRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.PersonalRepoImplementation.ClothesRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.PersonalServices.ClothesServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ClothesServiceImp implements ClothesServices
{
    private static ClothesServiceImp service =null;
    private ClothesRepository repository;

    private ClothesServiceImp()
    {
        this.repository= ClothesRepoImp.getRepository();
    }

    public static ClothesServiceImp getService()
    {
        if (service == null) service = new ClothesServiceImp();
        return service;
    }


    @Override
    public ArrayList<Clothes> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Clothes create(Clothes clothes)
    {
        return this.repository.create(clothes);
    }

    @Override
    public Clothes update(Clothes clothes)
    {
        return this.repository.update(clothes);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public Clothes read(String s)
    {
        return this.repository.read(s);
    }
}

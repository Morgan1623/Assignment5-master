package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.CarServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Petrol;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories.PetrolRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.CarRepoImplementation.PetrolRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.CarServices.PetrolService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PetrolServiceImp implements PetrolService
{
    private static PetrolServiceImp service =null;
    private PetrolRepository repository;

    private PetrolServiceImp()
    {
        this.repository= PetrolRepoImp.getRepository();
    }

    public static PetrolServiceImp getService()
    {
        if (service == null) service = new PetrolServiceImp();
        return service;
    }

    @Override
    public ArrayList<Petrol> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Petrol create(Petrol petrol)
    {
        return this.repository.create(petrol);
    }

    @Override
    public Petrol update(Petrol petrol)
    {
        return this.repository.update(petrol);
    }

    @Override
    public void delete(String s)
    {
       this.repository.delete(s);
    }

    @Override
    public Petrol read(String s) {
        return this.repository.read(s);
    }
}

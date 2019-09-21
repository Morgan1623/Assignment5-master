package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.EntertainmentServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment.Fitness;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.EntertainmentRepositories.FitnessRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.EntertainmentRepoImplementation.FitnessRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.EntertainmentServices.FitnessService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class FitnessServiceImp implements FitnessService
{
    private static FitnessServiceImp service =null;
    private FitnessRepository repository;

    private FitnessServiceImp()
    {
        this.repository= FitnessRepoImp.getRepository();
    }

    public static FitnessServiceImp getService()
    {
        if (service == null) service = new FitnessServiceImp();
        return service;
    }


    @Override
    public ArrayList<Fitness> getAll() {
        return null;
    }

    @Override
    public Fitness create(Fitness fitness)
    {
        return null;
    }

    @Override
    public Fitness update(Fitness fitness) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Fitness read(String s) {
        return null;
    }
}

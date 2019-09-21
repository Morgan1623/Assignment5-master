package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.CarServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Insurance;
import BudgetBuddi.Factory.ExpenseCategoryFactory.CarFactories.InsuranceFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories.InsuranceRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.CarRepoImplementation.InsuranceRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.CarServices.InsuranceService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class InsuranceServiceImp implements InsuranceService
{
    private static InsuranceServiceImp service =null;
    private InsuranceRepository repository;

    private InsuranceServiceImp()
    {
        this.repository= InsuranceRepoImp.getRepository();
    }

    public static InsuranceServiceImp getService()
    {
        if (service == null) service = new InsuranceServiceImp();
        return service;
    }


    @Override
    public ArrayList<Insurance> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Insurance create(Insurance insurance)
    {
        return this.repository.create(insurance);
    }

    @Override
    public Insurance update(Insurance insurance)
    {
        return this.update(insurance);
    }

    @Override
    public void delete(String s)
    {
       this.repository.delete(s);
    }

    @Override
    public Insurance read(String s) {
        return this.repository.read(s);
    }
}

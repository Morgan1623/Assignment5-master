package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.CarRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Insurance;
import BudgetBuddi.Factory.ExpenseCategoryFactory.CarFactories.InsuranceFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories.InsuranceRepository;

import java.util.ArrayList;

public class InsuranceRepoImp extends InsuranceFactory implements InsuranceRepository
{

    private static InsuranceRepoImp repository =null;
    ArrayList<Insurance> insurances;

    private InsuranceRepoImp()
    {
        this.insurances = new  ArrayList<>();
    }

    public static InsuranceRepoImp getRepository()
    {
        if(repository == null) repository = new InsuranceRepoImp();
        return repository;
    }

    @Override
    public ArrayList<Insurance> getAll()
    {

        return this.insurances;
    }

    @Override
    public Insurance create(Insurance insurance)
    {
        this.insurances.add(insurance);
        return null;

    }

    @Override
    public Insurance update(Insurance insurance)
    {
        this.insurances.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.insurances.remove(insurances);

    }

    @Override
    public Insurance read(String s)
    {

        {
            for (int i = 0; i < insurances.size(); i++)
                System.out.println(insurances.get(i));

            return null;
        }
    }
}//class


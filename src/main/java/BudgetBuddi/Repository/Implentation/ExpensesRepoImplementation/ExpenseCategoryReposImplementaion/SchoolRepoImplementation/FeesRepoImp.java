package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.SchoolRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Fees;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories.FeesRepository;

import java.util.ArrayList;

public class FeesRepoImp implements FeesRepository
{
    private static FeesRepoImp repository =null;
    ArrayList<Fees> feesList;

    private FeesRepoImp()
    {
        this.feesList = new  ArrayList<>();
    }

    public static FeesRepository getRepository()
    {
        if(repository == null) repository = new FeesRepoImp();
        return repository;
    }

    @Override
    public ArrayList<Fees> getAll()
    {
        return this.feesList;
    }

    @Override
    public Fees create(Fees fees)
    {
        this.feesList.add(fees);
        return null;
    }

    @Override
    public Fees update(Fees fees)
    {
        this.feesList.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.feesList.remove(feesList);

    }

    @Override
    public Fees read(String s)
    {
        for (int i = 0; i < feesList.size(); i++)
            System.out.println(feesList.get(i));
        return null;
    }
}//class

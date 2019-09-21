package BudgetBuddi.Repository.Implentation.IncomeRepoImplementation;

import BudgetBuddi.Domain.Income.IncomeSource;
import BudgetBuddi.Repository.IncomeRepositories.IncomeSourceRepository;

import java.util.ArrayList;

public class IncomeSourceRepoImp implements IncomeSourceRepository
{
    private static IncomeSourceRepoImp repository =null;
    ArrayList<IncomeSource> incomeSources;

    private IncomeSourceRepoImp()
    {
        this.incomeSources = new  ArrayList<>();
    }

    public static IncomeSourceRepository getRepository()
    {
        if(repository == null) repository = new IncomeSourceRepoImp();
        return repository;
    }

    @Override
    public ArrayList<IncomeSource> getAll()
    {
        return this.incomeSources;
    }

    @Override
    public IncomeSource create(IncomeSource incomeSource)
    {
        this.incomeSources.add(incomeSource);
        return null;
    }

    @Override
    public IncomeSource update(IncomeSource incomeSource)
    {
        this.incomeSources.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.incomeSources.remove(incomeSources);

    }

    @Override
    public IncomeSource read(String s)
    {
        for (int i = 0; i < incomeSources.size(); i++)
            System.out.println(incomeSources.get(i));
        return null;
    }
}//class

package BudgetBuddi.Repository.Implentation.IncomeRepoImplementation;

import BudgetBuddi.Domain.Income.RegularIncome;
import BudgetBuddi.Repository.IncomeRepositories.RegularIncomeRepository;

import java.util.ArrayList;

public class RegularIncomeRepoImp implements RegularIncomeRepository
{
    private static RegularIncomeRepoImp repository =null;
    ArrayList<RegularIncome> regularIncomes;

    private RegularIncomeRepoImp()
    {
        this.regularIncomes = new  ArrayList<>();
    }

    public static RegularIncomeRepository getRepository()
    {
        if(repository == null) repository = new RegularIncomeRepoImp();
        return repository;
    }


    @Override
    public ArrayList<RegularIncome> getAll()
    {
        return this.regularIncomes;
    }

    @Override
    public RegularIncome create(RegularIncome regularIncome)
    {
        this.regularIncomes.add(regularIncome);
        return null;
    }

    @Override
    public RegularIncome update(RegularIncome regularIncome)
    {
        this.regularIncomes.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.regularIncomes.remove(regularIncomes);

    }

    @Override
    public RegularIncome read(String s)
    {
        for (int i = 0; i < regularIncomes.size(); i++)
            System.out.println(regularIncomes.get(i));
        return null;
    }
}//class

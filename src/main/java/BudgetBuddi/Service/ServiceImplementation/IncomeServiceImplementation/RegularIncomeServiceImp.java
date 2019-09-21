package BudgetBuddi.Service.ServiceImplementation.IncomeServiceImplementation;

import BudgetBuddi.Domain.Income.RegularIncome;
import BudgetBuddi.Repository.Implentation.IncomeRepoImplementation.RegularIncomeRepoImp;
import BudgetBuddi.Repository.IncomeRepositories.RegularIncomeRepository;
import BudgetBuddi.Service.Services.IncomeServices.RegularIncomeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class RegularIncomeServiceImp implements RegularIncomeService
{
    private static RegularIncomeServiceImp service =null;
    private RegularIncomeRepository repository;

    private RegularIncomeServiceImp()
    {
        this.repository= RegularIncomeRepoImp.getRepository();
    }

    public static RegularIncomeServiceImp getService()
    {
        if (service == null) service = new RegularIncomeServiceImp();
        return service;
    }


    @Override
    public ArrayList<RegularIncome> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public RegularIncome create(RegularIncome regularIncome)
    {
        return this.repository.create(regularIncome);
    }

    @Override
    public RegularIncome update(RegularIncome regularIncome)
    {
        return this.repository.update(regularIncome);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public RegularIncome read(String s)
    {
        return this.repository.read(s);
    }
}

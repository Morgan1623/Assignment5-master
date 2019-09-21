package BudgetBuddi.Service.ServiceImplementation.IncomeServiceImplementation;

import BudgetBuddi.Domain.Income.IncomeSource;
import BudgetBuddi.Repository.Implentation.IncomeRepoImplementation.IncomeSourceRepoImp;
import BudgetBuddi.Repository.IncomeRepositories.IncomeSourceRepository;
import BudgetBuddi.Service.Services.IncomeServices.IncomeSourceService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class IncomeSourceServiceImp implements IncomeSourceService
{
    private static IncomeSourceServiceImp service =null;
    private IncomeSourceRepository repository;

    private IncomeSourceServiceImp()
    {
        this.repository= IncomeSourceRepoImp.getRepository();
    }

    public static IncomeSourceServiceImp getService()
    {
        if (service == null) service = new IncomeSourceServiceImp();
        return service;
    }


    @Override
    public ArrayList<IncomeSource> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public IncomeSource create(IncomeSource incomeSource)
    {
        return this.repository.create(incomeSource);
    }

    @Override
    public IncomeSource update(IncomeSource incomeSource)
    {
        return this.repository.update(incomeSource);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public IncomeSource read(String s)
    {
        return this.repository.read(s);
    }
}

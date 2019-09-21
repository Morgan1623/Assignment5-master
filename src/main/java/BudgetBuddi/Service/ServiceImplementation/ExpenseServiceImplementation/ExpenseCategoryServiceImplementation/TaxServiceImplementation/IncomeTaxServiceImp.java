package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.TaxServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Tax.IncomeTax;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TaxRepositories.IncomeTaxRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TaxRepoImplementation.IncomeTaxRepoImp;
import BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpensesServiceImplementation.ExpensesServiceImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TaxServices.IncomeTaxService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class IncomeTaxServiceImp implements IncomeTaxService
{
    private static IncomeTaxServiceImp service =null;
    private IncomeTaxRepository repository;

    private IncomeTaxServiceImp()
    {
        this.repository= IncomeTaxRepoImp.getRepository();
    }

    public static IncomeTaxServiceImp getService()
    {
        if (service == null) service = new IncomeTaxServiceImp();
        return service;
    }


    @Override
    public ArrayList<IncomeTax> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public IncomeTax create(IncomeTax incomeTax)
    {
        return this.repository.create(incomeTax);
    }

    @Override
    public IncomeTax update(IncomeTax incomeTax)
    {
        return this.repository.update(incomeTax);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public IncomeTax read(String s)
    {
        return this.repository.read(s);
    }
}

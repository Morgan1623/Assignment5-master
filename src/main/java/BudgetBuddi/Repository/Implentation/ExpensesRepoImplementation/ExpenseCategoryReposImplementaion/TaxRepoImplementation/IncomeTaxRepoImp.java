package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TaxRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Tax.IncomeTax;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TaxRepositories.IncomeTaxRepository;

import java.util.ArrayList;

public class IncomeTaxRepoImp implements IncomeTaxRepository
{
    private static IncomeTaxRepoImp repository =null;
    ArrayList<IncomeTax> incomeTaxes;

    private IncomeTaxRepoImp()
    {
        this.incomeTaxes = new  ArrayList<>();
    }

    public static IncomeTaxRepository getRepository()
    {
        if(repository == null) repository = new IncomeTaxRepoImp();
        return repository;
    }


    @Override
    public ArrayList<IncomeTax> getAll()
    {
        return this.incomeTaxes;
    }

    @Override
    public IncomeTax create(IncomeTax incomeTax)
    {
        this.incomeTaxes.add(incomeTax);
        return null;
    }

    @Override
    public IncomeTax update(IncomeTax incomeTax)
    {
        this.incomeTaxes.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.incomeTaxes.remove(incomeTaxes);

    }

    @Override
    public IncomeTax read(String s)
    {
        for (int i = 0; i < incomeTaxes.size(); i++)
            System.out.println(incomeTaxes.get(i));
        return null;
    }
}//class

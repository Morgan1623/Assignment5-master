package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpensesServiceImplementation;

import BudgetBuddi.Domain.Expenses.Expense.RegularExpsenses;
import BudgetBuddi.Repository.ExpenseRepositories.ExpensesRepositories.RegularExpenseRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseRepoImplenation.RegularExpensesRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpensesServices.RegularExpenseServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RegularExpenseServiceImp implements RegularExpenseServices
{
    private static RegularExpenseServiceImp service =null;
    private RegularExpenseRepository repository;

    private RegularExpenseServiceImp()
    {
        this.repository= RegularExpensesRepoImp.getRepository();
    }

    public static RegularExpenseServiceImp getService()
    {
        if (service == null) service = new RegularExpenseServiceImp();
        return service;
    }
    @Override
    public ArrayList<RegularExpsenses> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public RegularExpsenses create(RegularExpsenses regularExpsenses)
    {
        return this.repository.create(regularExpsenses);
    }

    @Override
    public RegularExpsenses update(RegularExpsenses regularExpsenses)
    {
        return this.repository.update(regularExpsenses);
    }

    @Override
    public void delete(String s)
    {
       this.repository.delete(s);
    }

    @Override
    public RegularExpsenses read(String s) {
        return this.repository.read(s);
    }
}

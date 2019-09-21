package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpensesServiceImplementation;

import BudgetBuddi.Domain.Expenses.Expense.Expense;
import BudgetBuddi.Repository.ExpenseRepositories.ExpensesRepositories.ExpenseRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseRepoImplenation.ExpensesRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpensesServices.ExpenseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ExpensesServiceImp implements ExpenseService
{
    private static ExpensesServiceImp service =null;
    private ExpenseRepository repository;

    private ExpensesServiceImp()
    {
        this.repository= ExpensesRepoImp.getRepository();
    }

    public static ExpensesServiceImp getService()
    {
        if (service == null) service = new ExpensesServiceImp();
        return service;
    }

    @Override
    public ArrayList<Expense> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Expense create(Expense expense)
    {
        return this.repository.create(expense);
    }

    @Override
    public Expense update(Expense expense)
    {
        return this.repository.update(expense);
    }

    @Override
    public void delete(String s)
    {
       this.repository.delete(s);
    }

    @Override
    public Expense read(String s)
    {
        return this.repository.read(s);
    }
}//class

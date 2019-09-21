package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.TotalsServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Totals.TotalCategoryExpense;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TotalsRepositories.TotalCategoryExpenseRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.TotalsRepoImplementation.TotalCategoryExpensesRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TotalsServices.TotalCategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class TotalExpenseCatergoryServiceImp implements TotalCategoryService
{
    private static TotalExpenseCatergoryServiceImp service =null;
    private TotalCategoryExpenseRepository repository;

    private TotalExpenseCatergoryServiceImp()
    {
        this.repository= TotalCategoryExpensesRepoImp.getRepository();
    }

    public static TotalExpenseCatergoryServiceImp getService()
    {
        if (service == null) service = new TotalExpenseCatergoryServiceImp();
        return service;
    }


    @Override
    public ArrayList<TotalCategoryExpense> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public TotalCategoryExpense create(TotalCategoryExpense totalCategoryExpense)
    {
        return this.repository.create(totalCategoryExpense);
    }

    @Override
    public TotalCategoryExpense update(TotalCategoryExpense totalCategoryExpense)
    {
        return this.repository.update(totalCategoryExpense);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public TotalCategoryExpense read(String s)
    {
        return this.repository.read(s);
    }
}

package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.SchoolServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Books;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories.BooksRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.SchoolRepoImplementation.BooksRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.SchoolServices.BooksService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class BooksServiceImp implements BooksService
{
    private static BooksServiceImp service =null;
    private BooksRepository repository;

    private BooksServiceImp()
    {
        this.repository= BooksRepoImp.getRepository();
    }

    public static BooksServiceImp getService()
    {
        if (service == null) service = new BooksServiceImp();
        return service;
    }


    @Override
    public ArrayList<Books> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Books create(Books books)
    {
        return this.repository.create(books);
    }

    @Override
    public Books update(Books books)
    {
        return this.repository.update(books);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public Books read(String s)
    {
        return this.repository.read(s);
    }
}

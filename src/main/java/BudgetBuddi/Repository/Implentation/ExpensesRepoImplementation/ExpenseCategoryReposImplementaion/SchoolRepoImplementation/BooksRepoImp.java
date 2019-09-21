package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.SchoolRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Books;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories.BooksRepository;

import java.util.ArrayList;

public class BooksRepoImp implements BooksRepository
{
    private static BooksRepoImp repository =null;
    ArrayList<Books> booksList;

    private BooksRepoImp()
    {
        this.booksList = new  ArrayList<>();
    }

    public static BooksRepository getRepository()
    {
        if(repository == null) repository = new BooksRepoImp();
        return repository;
    }

    @Override
    public ArrayList<Books> getAll()
    {
        return this.booksList;
    }

    @Override
    public Books create(Books books)
    {
        this.booksList.add(books);
        return null;
    }

    @Override
    public Books update(Books books)
    {
        this.booksList.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.booksList.remove(booksList);

    }

    @Override
    public Books read(String s)
    {
        for (int i = 0; i < booksList.size(); i++)
            System.out.println(booksList.get(i));
        return null;
    }
}//class

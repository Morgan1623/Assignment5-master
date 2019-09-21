package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Books;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface BooksRepository extends ImplementationRepository<Books, String>
{
    ArrayList<Books> getAll();
}//class

package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.SchoolServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Books;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface BooksService extends IServices<Books, String>
{
    ArrayList<Books> getAll();
}

package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.SchoolServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Stationary;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface StationaryService extends IServices<Stationary, String>
{
    ArrayList<Stationary> getAll();
}

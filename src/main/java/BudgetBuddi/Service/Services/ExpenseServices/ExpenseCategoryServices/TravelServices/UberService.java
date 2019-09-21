package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TravelServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Uber;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface UberService extends IServices<Uber, String>
{
    ArrayList<Uber> getAll();
}

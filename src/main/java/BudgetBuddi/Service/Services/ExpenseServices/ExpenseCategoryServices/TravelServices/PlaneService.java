package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TravelServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Plane;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface PlaneService extends IServices<Plane, String>
{
    ArrayList<Plane> getAll();
}

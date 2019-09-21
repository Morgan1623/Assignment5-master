package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TravelServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Bus;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface BusService extends IServices<Bus, String>
{
    ArrayList<Bus> getAll();
}

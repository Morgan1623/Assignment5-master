package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HouseholdServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Appliances;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface AppliancesService extends IServices<Appliances, String>
{
    ArrayList<Appliances> getAll();
}

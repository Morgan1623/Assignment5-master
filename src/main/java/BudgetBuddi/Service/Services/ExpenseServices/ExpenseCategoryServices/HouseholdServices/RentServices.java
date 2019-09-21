package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HouseholdServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Rent;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface RentServices extends IServices <Rent, String>
{
    ArrayList<Rent> getAll();
}

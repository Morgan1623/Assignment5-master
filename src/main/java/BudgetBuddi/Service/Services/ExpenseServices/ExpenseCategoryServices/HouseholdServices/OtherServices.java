package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HouseholdServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Other;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface OtherServices extends IServices<Other,String>
{
    ArrayList<Other> getAll();
}


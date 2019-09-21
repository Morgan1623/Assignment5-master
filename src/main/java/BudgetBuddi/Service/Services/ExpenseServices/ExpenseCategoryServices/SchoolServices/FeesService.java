package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.SchoolServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Fees;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface FeesService extends IServices<Fees, String>
{
    ArrayList<Fees> getAll();
}

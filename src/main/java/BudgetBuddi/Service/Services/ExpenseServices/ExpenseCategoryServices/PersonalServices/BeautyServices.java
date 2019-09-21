package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.PersonalServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Beauty;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface BeautyServices extends IServices<Beauty, String>
{
    ArrayList<Beauty> getAll();
}

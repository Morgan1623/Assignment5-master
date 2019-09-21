package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.PersonalServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Clothes;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface ClothesServices extends IServices<Clothes, String>
{
    ArrayList<Clothes> getAll();
}

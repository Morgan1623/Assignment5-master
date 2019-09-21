package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.CarServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Petrol;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface PetrolService extends IServices<Petrol, String>
{
    ArrayList<Petrol> getAll();
}

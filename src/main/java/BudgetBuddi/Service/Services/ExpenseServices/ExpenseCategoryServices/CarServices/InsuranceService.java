package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.CarServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Insurance;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface InsuranceService extends IServices<Insurance, String>
{
    ArrayList<Insurance> getAll();
}

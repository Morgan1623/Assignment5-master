package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.EntertainmentServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment.Fitness;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface FitnessService extends IServices<Fitness, String>
{
    ArrayList<Fitness> getAll();
}

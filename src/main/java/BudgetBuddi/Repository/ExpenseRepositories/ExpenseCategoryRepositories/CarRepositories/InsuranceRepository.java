package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Insurance;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface InsuranceRepository extends ImplementationRepository <Insurance, String>
{
    ArrayList<Insurance> getAll();
}

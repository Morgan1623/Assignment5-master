package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.CarRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Petrol;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface PetrolRepository extends ImplementationRepository<Petrol, String>
{
    ArrayList<Petrol> getAll();

}//class

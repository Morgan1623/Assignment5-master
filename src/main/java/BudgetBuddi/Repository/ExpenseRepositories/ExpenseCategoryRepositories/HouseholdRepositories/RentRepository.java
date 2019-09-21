package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Rent;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface RentRepository extends ImplementationRepository<Rent,String>
{
    ArrayList<Rent> getAll();
}//class

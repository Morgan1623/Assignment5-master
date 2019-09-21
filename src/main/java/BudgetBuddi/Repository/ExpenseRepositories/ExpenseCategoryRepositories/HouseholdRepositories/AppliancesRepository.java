package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Appliances;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface AppliancesRepository extends ImplementationRepository<Appliances, String>
{
    ArrayList<Appliances> getAll();
}//class

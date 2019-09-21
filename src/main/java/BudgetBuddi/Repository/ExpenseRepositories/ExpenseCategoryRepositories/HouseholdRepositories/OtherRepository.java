package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HouseholdRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Other;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface OtherRepository extends ImplementationRepository<Other, String>
{
    ArrayList<Other> getAll();
}//class

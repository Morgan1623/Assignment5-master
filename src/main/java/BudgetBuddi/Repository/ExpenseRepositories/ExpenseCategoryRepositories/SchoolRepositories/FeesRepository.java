package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.SchoolRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Fees;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface FeesRepository extends ImplementationRepository<Fees, String>
{
    ArrayList<Fees> getAll();
}//class

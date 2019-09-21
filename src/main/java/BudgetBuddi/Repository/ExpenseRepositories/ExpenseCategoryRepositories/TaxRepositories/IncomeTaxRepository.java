package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.TaxRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Tax.IncomeTax;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface IncomeTaxRepository extends ImplementationRepository<IncomeTax, String>
{
    ArrayList<IncomeTax> getAll();
}//class

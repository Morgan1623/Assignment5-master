package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TaxServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Tax.IncomeTax;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface IncomeTaxService extends IServices<IncomeTax, String>
{
    ArrayList<IncomeTax> getAll();
}

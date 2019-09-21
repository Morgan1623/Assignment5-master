package BudgetBuddi.Factory.ExpenseCategoryFactory.TaxFactory;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Tax.IncomeTax;

public class IncomeTaxFactory
{
    public static IncomeTax getIncometax (int year, double total)
    {
        return new IncomeTax.Builder()
                .year(year)
                .total(total)
                .build();


    }
}

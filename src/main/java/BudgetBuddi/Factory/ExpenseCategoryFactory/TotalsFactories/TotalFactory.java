package BudgetBuddi.Factory.ExpenseCategoryFactory.TotalsFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Totals.TotalCategoryExpense;

import java.util.Date;

public class TotalFactory
{
    public static TotalCategoryExpense getTotalCategoryExpense (double carTotals, double entertainmentTotals, double healthcareTotals, double householdTotal, double personalTotals, double taxTotals, double schoolTotals, double travelTotals, int date )
    {
        return new TotalCategoryExpense.Builder()
                .date(date)
                .carTotals(carTotals)
                .entertainmentTotals(entertainmentTotals)
                .healthcareTotals(healthcareTotals)
                .householdTotals(householdTotal)
                .personalTotals(personalTotals)
                .schoolTotals(schoolTotals)
                .taxTotals(taxTotals)
                .travelTotals(travelTotals)
                .build();


    }
}

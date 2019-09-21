package BudgetBuddi.Factory.ExpenseCategoryFactory.HouseholdFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Appliances;

import java.util.Date;

public class AppliancesFactory
{
    public static Appliances getAppliances (String description, int date, double total, double amount)
    {
        return new Appliances.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }



}

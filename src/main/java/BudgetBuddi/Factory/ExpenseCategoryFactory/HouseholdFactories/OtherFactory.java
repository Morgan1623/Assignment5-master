package BudgetBuddi.Factory.ExpenseCategoryFactory.HouseholdFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Other;

import java.util.Date;

public class OtherFactory
{
    public static Other getOther (String description, int date, double total, double amount)
    {
        return new Other.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }

}

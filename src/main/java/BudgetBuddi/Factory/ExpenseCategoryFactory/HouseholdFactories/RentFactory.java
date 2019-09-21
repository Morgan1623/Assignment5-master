package BudgetBuddi.Factory.ExpenseCategoryFactory.HouseholdFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Rent;

import java.util.Date;

public class RentFactory
{
    public static Rent getRent (String description, int date, double total, double amount)
    {
        return new Rent.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}

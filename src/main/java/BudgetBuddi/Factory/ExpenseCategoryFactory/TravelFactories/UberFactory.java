package BudgetBuddi.Factory.ExpenseCategoryFactory.TravelFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Uber;

import java.util.Date;

public class UberFactory
{
    public static Uber getUber (String description, int date, double total, double amount)
    {
        return new Uber.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}

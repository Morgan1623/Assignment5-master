package BudgetBuddi.Factory.ExpenseCategoryFactory.TravelFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Bus;

import java.util.Date;

public class Busfactory
{
    public static Bus getBus (String description, int date, double total, double amount)
    {
        return new Bus.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}

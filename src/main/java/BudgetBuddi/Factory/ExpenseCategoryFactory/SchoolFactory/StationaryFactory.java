package BudgetBuddi.Factory.ExpenseCategoryFactory.SchoolFactory;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Stationary;

import java.util.Date;

public class StationaryFactory
{
    public static Stationary getStationary (String description, int date, double total, double amount)
    {
        return new Stationary.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }

}

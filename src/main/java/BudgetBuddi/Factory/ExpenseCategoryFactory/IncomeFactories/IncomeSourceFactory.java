package BudgetBuddi.Factory.ExpenseCategoryFactory.IncomeFactories;

import BudgetBuddi.Domain.Income.IncomeSource;

import java.util.Date;

public class IncomeSourceFactory
{
    public static IncomeSource getIncomeSource (String description, int date, double total, double amount)
    {
        return new IncomeSource.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}

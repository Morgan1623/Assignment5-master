package BudgetBuddi.Factory.ExpenseCategoryFactory.IncomeFactories;

import BudgetBuddi.Domain.Income.RegularIncome;

import java.util.Date;

public class RegularIncomeFactory
{
    public static RegularIncome getRegularIncome (String description, int date, double total, double amount)
    {
        return new RegularIncome.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}

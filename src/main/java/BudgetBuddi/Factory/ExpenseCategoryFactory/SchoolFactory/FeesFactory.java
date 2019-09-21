package BudgetBuddi.Factory.ExpenseCategoryFactory.SchoolFactory;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Fees;

import java.util.Date;

public class FeesFactory
{
    public static Fees getFees (int date, double total, double amount)
    {
        return new Fees.Builder()
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}

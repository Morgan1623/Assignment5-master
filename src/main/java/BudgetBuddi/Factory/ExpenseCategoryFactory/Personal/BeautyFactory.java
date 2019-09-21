package BudgetBuddi.Factory.ExpenseCategoryFactory.Personal;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Beauty;

import java.util.Date;

public class BeautyFactory
{
    public static Beauty getBeauty (String description, int date, double total, double amount)
    {
        return new Beauty.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}

package BudgetBuddi.Factory.ExpenseCategoryFactory.Personal;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Clothes;

import java.util.Date;

public class ClothesFactory
{
    public static Clothes getClothes (String description, int date, double total, double amount)
    {
        return new Clothes.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}

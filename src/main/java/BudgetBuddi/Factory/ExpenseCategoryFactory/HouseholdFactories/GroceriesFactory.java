package BudgetBuddi.Factory.ExpenseCategoryFactory.HouseholdFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Groceries;

import java.util.Date;

public class GroceriesFactory
{
    public static Groceries getGroceries (String items, double price, int date, double total, double amount)
    {
        return new Groceries.Builder()
                .items(items)
                .price(price)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}

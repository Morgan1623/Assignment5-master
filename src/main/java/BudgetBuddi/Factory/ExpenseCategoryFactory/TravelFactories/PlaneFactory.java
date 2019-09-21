package BudgetBuddi.Factory.ExpenseCategoryFactory.TravelFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Plane;

import java.util.Date;

public class PlaneFactory
{
    public static Plane getPlane (String description, int date, double total, double amount)
    {
        return new Plane.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}

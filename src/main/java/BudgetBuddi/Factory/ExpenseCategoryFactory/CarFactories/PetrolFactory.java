package BudgetBuddi.Factory.ExpenseCategoryFactory.CarFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Petrol;

import java.util.Date;

public class PetrolFactory
{
    public static Petrol getPetrol (int date, double total, double amount)
    {
        return new Petrol.Builder()
                .date(date)
                .total(total)
                .amount(amount)
                .build();

    }









}//class


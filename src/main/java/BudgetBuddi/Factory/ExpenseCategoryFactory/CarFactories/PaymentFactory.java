package BudgetBuddi.Factory.ExpenseCategoryFactory.CarFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Payment;

import java.util.Date;

public class PaymentFactory
{
    public static Payment getPayment (String description, int date, double total, double amount)
    {
        return new Payment.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }






}//class

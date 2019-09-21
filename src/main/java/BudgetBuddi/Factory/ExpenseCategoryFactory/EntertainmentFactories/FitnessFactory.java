package BudgetBuddi.Factory.ExpenseCategoryFactory.EntertainmentFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment.Fitness;

import java.util.Date;

public class FitnessFactory
{
    public static Fitness getFitness (String description, int date, double total, double amount)
    {
        return new Fitness.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}

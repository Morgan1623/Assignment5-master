package BudgetBuddi.Factory.ExpenseCategoryFactory.EntertainmentFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment.Party;

import java.util.Date;

public class PartyFactory

{
    public static Party getParty (String description, int date, double total, double amount)
    {
        return new Party.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }

}

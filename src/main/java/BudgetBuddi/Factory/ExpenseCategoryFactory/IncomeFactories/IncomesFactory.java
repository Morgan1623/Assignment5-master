package BudgetBuddi.Factory.ExpenseCategoryFactory.IncomeFactories;

import BudgetBuddi.Domain.Income.Incomes;

import java.util.Date;

public class IncomesFactory
{
    public static Incomes getIncomes (String description, Date date, double total, double amount)
    {
        return new Incomes.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}

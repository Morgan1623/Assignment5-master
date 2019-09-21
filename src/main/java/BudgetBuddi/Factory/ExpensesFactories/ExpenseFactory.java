package BudgetBuddi.Factory.ExpensesFactories;

import BudgetBuddi.Domain.Expenses.Expense.Expense;

import java.util.ArrayList;

public class ExpenseFactory
{
    public static Expense getExpense (ArrayList totalAllExpsenses, int date, double total, double amount)
    {
        return new Expense.Builder()
                .totalAllExpsenses(totalAllExpsenses)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}

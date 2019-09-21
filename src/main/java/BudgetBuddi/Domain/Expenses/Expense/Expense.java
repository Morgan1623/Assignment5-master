package BudgetBuddi.Domain.Expenses.Expense;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Totals.TotalCategoryExpense;

import java.util.ArrayList;

public class Expense
{
    ArrayList<TotalCategoryExpense> totalAllExpsenses = new ArrayList<TotalCategoryExpense>();

   private double amount;
   private int date;
   private double total;

    public Expense(Builder builder) {
        this.totalAllExpsenses = builder.totalAllExpsenses;
        this.amount = builder.amount;
        this.date = builder.date;
        this.total = builder.total;
    }//closes constructor

    public ArrayList getTotalAllExpsenses() {
        return totalAllExpsenses;
    }

    public void setTotalAllExpsenses(ArrayList<TotalCategoryExpense> totalAllExpsenses) {
        this.totalAllExpsenses = totalAllExpsenses;
    }

    public double getAmount() {
        return amount;
    }


    public int getDate() {
        return date;
    }


    public double getTotal() {
        return total;
    }

    public static class Builder
    {
        ArrayList totalAllExpsenses = new ArrayList();

        private double amount;
        private int date;
        private double total;

        public Builder totalAllExpsenses(ArrayList totalAllExpsenses)
        {
            this.totalAllExpsenses=totalAllExpsenses;
            return this;
        }

        public Builder date(int date)
        {
            this.date=date;
            return this;
        }


        public Builder total(double total)
        {
            this.total=total;
            return this;
        }

        public Builder amount(double amount)
        {
            this.amount=amount;
            return this;
        }

        public Expense build()
        {
            return new Expense(this);
        }

    }//builder

    @Override
    public String toString() {
        return "Expense{" +
                "totalAllExpsenses=" + totalAllExpsenses +
                ", amount=" + amount +
                ", date=" + date +
                ", total=" + total +
                '}';
    }
}//closes class

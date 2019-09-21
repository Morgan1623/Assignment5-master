package BudgetBuddi.Domain.Expenses.ExpsenseCategories.School;

import java.util.Date;

public class Fees
{

    private Date date;
    private double total;
    private double amount;

    public Fees(Builder builder) {
        this.date = date;
        this.total = total;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }


    public double getTotal() {
        return total;
    }


    public double getAmount() {
        return amount;
    }

    public static class Builder
    {


        private int date;
        private double total;
        private double amount;


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

        public Fees build()
        {
            return new Fees(this);
        }
    }//builder

    @Override
    public String toString() {
        return "Fees{" +
                "date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}

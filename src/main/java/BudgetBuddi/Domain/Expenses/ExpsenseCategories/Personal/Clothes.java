package BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal;

import java.util.Date;

public class Clothes
{
    private String description;
    private Date date;
    private double total;
    private double amount;

    public Clothes(Builder builder) {
        this.description = description;
        this.date = date;
        this.total = total;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
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

        private String description;
        private int date;
        private double total;
        private double amount;

        public Builder description(String description)
        {
            this.description=description;
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

        public Clothes build()
        {
            return new Clothes(this);
        }
    }//builder

    @Override
    public String toString() {
        return "ClothesRepository{" +
                "description='" + description + '\'' +
                ", date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}

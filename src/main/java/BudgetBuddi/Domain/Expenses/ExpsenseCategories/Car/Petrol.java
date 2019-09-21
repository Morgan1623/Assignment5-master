package BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car;

public class Petrol
{

    private int date;
    private double total;
    private double amount;

    public Petrol(Builder builder) {
        this.date = builder.date;
        this.total = builder.total;
        this.amount = builder.amount;
    }//constructor

    public int getDate() {
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

        public Petrol build()
        {
            return new Petrol(this);
        }
    }//builder



    @Override
    public String toString() {
        return "Petrol{" +
                "date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}//class

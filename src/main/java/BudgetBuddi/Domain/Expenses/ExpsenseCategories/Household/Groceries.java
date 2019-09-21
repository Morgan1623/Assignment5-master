package BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household;

public class Groceries
{
    private String items;
    private double price;
    private int date;
    private double total;
    private double amount;

    public Groceries(Builder builder) {
        this.items = builder.items;
        this.price = builder.price;
        this.date = builder.date;
        this.total = builder.total;
        this.amount = builder.amount;
    }

    public String getItems() {
        return items;
    }


    public double getPrice() {
        return price;
    }


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
        private String items;
        private double price;
        private int date;
        private double total;
        private double amount;

        public Builder items(String items)
        {
            this.items=items;
            return this;
        }

        public Builder price(double price)
        {
            this.price=price;
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

        public Groceries build()
        {
            return new Groceries(this);
        }

    }

    @Override
    public String toString() {
        return "GroceriesFactory{" +
                "items='" + items + '\'' +
                ", price=" + price +
                ", date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}

package BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment;

public class Party
{
    private String description;
    private int date;
    private double total;
    private double amount;

    public Party(Builder builder) {
        this.description = builder.description;
        this.date = builder.date;
        this.total = builder.total;
        this.amount = builder.amount;
    }

    public String getDescription() {
        return description;
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

        public Party build()
        {
            return new Party(this);
        }
    }//builder


    @Override
    public String toString() {
        return "FitnessFactory{" +
                "description='" + description + '\'' +
                ", date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}


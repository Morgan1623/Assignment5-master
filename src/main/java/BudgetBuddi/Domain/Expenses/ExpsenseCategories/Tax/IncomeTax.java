package BudgetBuddi.Domain.Expenses.ExpsenseCategories.Tax;


public class IncomeTax
{
    private int year;
    private double total;

    public IncomeTax(Builder builder) {
        this.year = builder.year;
        this.total = builder.total;
    }

    public int getYear() {
        return year;
    }


    public double getTotal() {
        return total;
    }

    public static class Builder
    {
        private int year;
        private double total;

        public Builder year(int year)
        {
            this.year=year;
            return this;
        }

        public Builder total(double total)
        {
            this.total=total;
            return this;
        }

        public IncomeTax build()
        {
            return new IncomeTax(this);
        }

    }

    @Override
    public String toString() {
        return "IncomeTax{" +
                "year=" + year +
                ", total=" + total +
                '}';
    }
}

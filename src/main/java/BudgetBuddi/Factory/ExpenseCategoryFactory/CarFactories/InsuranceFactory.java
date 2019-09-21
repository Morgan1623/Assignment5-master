package BudgetBuddi.Factory.ExpenseCategoryFactory.CarFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Insurance;



import java.util.Date;

public class InsuranceFactory
{
  public static Insurance getInsurance (String insuranceName, int date, double total, double amount)
  {
      return new Insurance.Builder().insuranceName(insuranceName)
              .date(date)
              .total(total)
              .amount(amount)
              .build();


  }

}

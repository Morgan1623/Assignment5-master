package BudgetBuddi.Service.Services.IncomeServices;

import BudgetBuddi.Domain.Income.RegularIncome;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface RegularIncomeService extends IServices<RegularIncome, String>
{
    ArrayList<RegularIncome> getAll();
}

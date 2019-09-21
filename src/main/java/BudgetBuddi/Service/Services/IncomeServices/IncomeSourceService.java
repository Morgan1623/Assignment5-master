package BudgetBuddi.Service.Services.IncomeServices;

import BudgetBuddi.Domain.Income.IncomeSource;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface IncomeSourceService extends IServices<IncomeSource, String>
{
    ArrayList<IncomeSource> getAll();
}

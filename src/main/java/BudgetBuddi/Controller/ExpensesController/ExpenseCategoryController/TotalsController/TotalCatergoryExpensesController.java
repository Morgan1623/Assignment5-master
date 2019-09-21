package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.TotalsController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Totals.TotalCategoryExpense;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TotalsServices.TotalCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/TotalCategoryExpenses")
public class TotalCatergoryExpensesController
{
    @Autowired
    private TotalCategoryService totalCategoryService;

    @PostMapping("/create")
    @ResponseBody
    public TotalCategoryExpense create(TotalCategoryExpense totalCategoryExpense)
    {
        return totalCategoryService.update(totalCategoryExpense);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public TotalCategoryExpense update(TotalCategoryExpense totalCategoryExpense)
    {
        return totalCategoryService.update(totalCategoryExpense);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        totalCategoryService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public TotalCategoryExpense read(@PathVariable String id)
    {
        return totalCategoryService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<TotalCategoryExpense> getAll()

    {
        return totalCategoryService.getAll();
    }


}//class

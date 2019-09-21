package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.HouseholdController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Groceries;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HouseholdServices.GroceriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Groceries")
public class GroceriesController
{

    @Autowired
    private GroceriesService groceriesService;

    @PostMapping("/create")
    @ResponseBody
    public Groceries create(Groceries groceries)
    {
        return groceriesService.update(groceries);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Groceries update(Groceries expense)
    {
        return groceriesService.update(expense);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        groceriesService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Groceries read(@PathVariable String id)
    {
        return groceriesService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Groceries> getAll()

    {
        return groceriesService.getAll();
    }

}//class

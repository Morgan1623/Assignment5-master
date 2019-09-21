package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.HouseholdController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Other;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HouseholdServices.OtherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Other")
public class OtherController
{
    @Autowired
    private OtherServices otherServices;

    @PostMapping("/create")
    @ResponseBody
    public Other create(Other other)
    {
        return otherServices.update(other);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Other update(Other other)
    {
        return otherServices.update(other);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        otherServices.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Other read(@PathVariable String id)
    {
        return otherServices.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Other> getAll()

    {
        return otherServices.getAll();
    }

}//class

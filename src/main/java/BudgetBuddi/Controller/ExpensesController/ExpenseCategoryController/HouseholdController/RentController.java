package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.HouseholdController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Rent;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HouseholdServices.RentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Rent")
public class RentController
{
    @Autowired
    private RentServices rentServices;

    @PostMapping("/create")
    @ResponseBody
    public Rent create(Rent rent)
    {
        return rentServices.update(rent);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Rent update(Rent rent)
    {
        return rentServices.update(rent);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        rentServices.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Rent read(@PathVariable String id)
    {
        return rentServices.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Rent> getAll()

    {
        return rentServices.getAll();
    }


}//class

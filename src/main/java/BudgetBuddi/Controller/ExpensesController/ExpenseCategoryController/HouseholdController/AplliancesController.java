package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.HouseholdController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Household.Appliances;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HouseholdServices.AppliancesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Appiances")
public class AplliancesController
{
    @Autowired
    private AppliancesService appliancesService;

    @PostMapping("/create")
    @ResponseBody
    public Appliances create(Appliances appliances)
    {
        return appliancesService.update(appliances);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Appliances update(Appliances appliances)
    {
        return appliancesService.update(appliances);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        appliancesService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Appliances read(@PathVariable String id)
    {
        return appliancesService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Appliances> getAll()

    {
        return appliancesService.getAll();
    }


}//class

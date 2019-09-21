package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.TravelController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Bus;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TravelServices.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Bus")
public class BusController
{
    @Autowired
    private BusService busService;

    @PostMapping("/create")
    @ResponseBody
    public Bus create(Bus bus)
    {
        return busService.update(bus);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Bus update(Bus bus)
    {
        return busService.update(bus);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        busService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Bus read(@PathVariable String id)
    {
        return busService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Bus> getAll()

    {
        return busService.getAll();
    }


}//class

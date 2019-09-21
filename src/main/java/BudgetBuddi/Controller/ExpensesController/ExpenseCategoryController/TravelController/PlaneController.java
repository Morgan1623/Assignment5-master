package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.TravelController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Plane;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TravelServices.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Plane")
public class PlaneController
{
    @Autowired
    private PlaneService planeService;

    @PostMapping("/create")
    @ResponseBody
    public Plane create(Plane plane)
    {
        return planeService.update(plane);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Plane update(Plane plane)
    {
        return planeService.update(plane);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        planeService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Plane read(@PathVariable String id)
    {
        return planeService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Plane> getAll()

    {
        return planeService.getAll();
    }


}

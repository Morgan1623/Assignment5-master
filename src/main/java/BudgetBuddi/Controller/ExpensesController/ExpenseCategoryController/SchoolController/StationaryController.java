package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.SchoolController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Stationary;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.SchoolServices.StationaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Stationary")
public class StationaryController
{
    @Autowired
    private StationaryService stationaryService;

    @PostMapping("/create")
    @ResponseBody
    public Stationary create(Stationary stationary)
    {
        return stationaryService.update(stationary);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Stationary update(Stationary stationary)
    {
        return stationaryService.update(stationary);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        stationaryService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Stationary read(@PathVariable String id)
    {
        return stationaryService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Stationary> getAll()

    {
        return stationaryService.getAll();
    }


}

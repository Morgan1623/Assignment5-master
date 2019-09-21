package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.CarController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Insurance;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.CarServices.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Insurance")
public class InsuranceController
{
    @Autowired
    private InsuranceService insuranceService;

    @PostMapping("/create")
    @ResponseBody
    public Insurance create(Insurance expense)
    {
        return insuranceService.update(expense);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Insurance update(Insurance insurance)
    {
        return insuranceService.update(insurance);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        insuranceService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Insurance read(@PathVariable String id)
    {
        return insuranceService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Insurance> getAll()

    {
        return insuranceService.getAll();
    }

}

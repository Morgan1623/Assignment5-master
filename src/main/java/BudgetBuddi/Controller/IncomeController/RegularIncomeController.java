package BudgetBuddi.Controller.IncomeController;

import BudgetBuddi.Domain.Income.RegularIncome;
import BudgetBuddi.Service.Services.IncomeServices.RegularIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/RegularIncome")
public class RegularIncomeController
{
    @Autowired
    private RegularIncomeService regularIncomeService;

    @PostMapping("/create")
    @ResponseBody
    public RegularIncome create(RegularIncome regularIncome)
    {
        return regularIncomeService.update(regularIncome);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public RegularIncome update(RegularIncome expense)
    {
        return regularIncomeService.update(expense);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        regularIncomeService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public RegularIncome read(@PathVariable String id)
    {
        return regularIncomeService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<RegularIncome> getAll()

    {
        return regularIncomeService.getAll();
    }


}

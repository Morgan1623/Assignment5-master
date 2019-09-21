package BudgetBuddi.Controller.IncomeController;


import BudgetBuddi.Domain.Income.IncomeSource;
import BudgetBuddi.Service.Services.IncomeServices.IncomeSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Income")
public class IncomeController
{
    @Autowired
    private IncomeSourceService incomeService;

    @PostMapping("/create")
    @ResponseBody
    public IncomeSource create(IncomeSource income)
    {
        return incomeService.update(income);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public IncomeSource update(IncomeSource income)
    {
        return incomeService.update(income);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        incomeService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public IncomeSource read(@PathVariable String id)
    {
        return incomeService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<IncomeSource> getAll()

    {
        return incomeService.getAll();
    }


}//class

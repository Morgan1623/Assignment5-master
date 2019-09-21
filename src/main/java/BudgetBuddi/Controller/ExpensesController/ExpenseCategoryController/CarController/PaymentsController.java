package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.CarController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Payment;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.CarServices.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Payments")
public class PaymentsController
{
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    @ResponseBody
    public Payment create(Payment payment)
    {
        return paymentService.update(payment);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Payment update(Payment payment)
    {
        return paymentService.update(payment);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        paymentService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Payment read(@PathVariable String id)
    {
        return paymentService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Payment> getAll()

    {
        return paymentService.getAll();
    }

}

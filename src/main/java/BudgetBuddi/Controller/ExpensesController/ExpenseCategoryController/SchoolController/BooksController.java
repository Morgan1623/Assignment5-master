package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.SchoolController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Books;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.SchoolServices.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.ArrayList;

@RestController
@RequestMapping("/Books")
public class BooksController
{
    @Autowired
    private BooksService booksService;

    @PostMapping("/create")
    @ResponseBody
    public Books create(Books books)
    {
        return booksService.update(books);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Books update(Books expense)
    {
        return booksService.update(expense);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        booksService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Books read(@PathVariable String id)
    {
        return booksService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Books> getAll()

    {
        return booksService.getAll();
    }


}//class

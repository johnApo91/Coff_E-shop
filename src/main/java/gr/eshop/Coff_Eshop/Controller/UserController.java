package gr.eshop.Coff_Eshop.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/")
    public String sayHello(){
        return "hello!";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id){

        return "The id of the user is the: " + id;
    }

}

package at.geise.test.webapp.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello, "  +name + "!";
    }
}

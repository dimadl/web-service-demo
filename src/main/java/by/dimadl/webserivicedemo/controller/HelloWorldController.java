package by.dimadl.webserivicedemo.controller;

import by.dimadl.webserivicedemo.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/test")
    public String helloWorld() {
        return "Test";
    }


}

package co.develhope.FirstAPI04.controllers;

import co.develhope.FirstAPI04.services.HeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {

    @Autowired
    HeaderService headerService;

    @GetMapping
    public String test(@RequestHeader (name = "host") String port){
        return headerService.test(port);
    }
}

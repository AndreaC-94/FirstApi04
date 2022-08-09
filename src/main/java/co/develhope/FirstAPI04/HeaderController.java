package co.develhope.FirstAPI04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {

    @GetMapping
    public String test(@RequestHeader (name = "host") String port){
        port = port.substring(port.length()-4, port.length());
        System.out.println("You are using the port: " + port);
        return "You are using the port: " + port;
    }
}

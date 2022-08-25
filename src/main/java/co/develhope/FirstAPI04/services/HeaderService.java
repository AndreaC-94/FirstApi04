package co.develhope.FirstAPI04.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

import java.net.InetAddress;

@Service
public class HeaderService {

    public String test(@RequestHeader(name = "host") String port){

        try {
            port = port.substring(port.length() - 4);
            InetAddress inetadd = InetAddress.getLocalHost();
            String name = inetadd.getHostName();
            String address = inetadd.getHostAddress();
            //System.out.println("You are using the port: " + port);
            return "Your host name is: "+name+"\nYour host address is: "+address+"\nYou are using the port: " + port;
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Error";
    }
}

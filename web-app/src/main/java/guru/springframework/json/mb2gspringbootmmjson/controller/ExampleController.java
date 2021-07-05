package guru.springframework.json.mb2gspringbootmmjson.controller;

import guru.springframework.model.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @RequestMapping("/")
    public ShippingAddress getShippingAddress(){
        return new ShippingAddress();
    }
}

package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import web.services.CarService;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Optional;


@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String showCar(@RequestParam(defaultValue = "5") int count, ModelMap model) {

        model.addAttribute("cars", carService.returnListCar(count));

        return "cars";
    }
}

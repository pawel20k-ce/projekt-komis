package pl.ottenburger.projekt.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.ottenburger.projekt.model.Car;
import pl.ottenburger.projekt.services.CarService;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/list")
    public String showList(Model model) {
        List<Car> cars = carService.findAll();
        model.addAttribute("cars", cars);
        return "car/list";

    }

    @GetMapping("/add")
    public String showAddCar(Model model) {
        model.addAttribute("car", new Car());
        return "car/edit";
    }

    @GetMapping("/{id}/detail")
    public String showDetailCar(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("car", carService.getCar(id));

        return "car/detail";
    }

    @GetMapping("/{id}/edit")
    public String showEditCar(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("car", carService.getCar(id));

        return "car/edit";
    }

    @PostMapping("/save")
    public String addCar(@ModelAttribute("car") Car car) {
        carService.save(car);
        return "redirect:/car/list";
    }



}

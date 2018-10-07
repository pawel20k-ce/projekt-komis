package pl.ottenburger.projekt.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pl.ottenburger.projekt.model.Car;
import pl.ottenburger.projekt.services.CarService;

import java.io.IOException;
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

    @GetMapping("/listKlient")
    public String showListKlient(String status,Model model) {
        status = "kupiony";
        List<Car> cars = carService.findCarKomis(status);
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

   @GetMapping("/{id}/dodajdokomisu")
    public String addstatuscar(@PathVariable("id") Integer id) {
        Car car = carService.findById(id);
        car.setStatus("kupiony");
        carService.save(car);

        return "redirect:/car/list";
    }
    /*@PostMapping("/save")
    public String addCar(@ModelAttribute("car") Car car) {
        carService.save(car);
        return "redirect:/car/list";
    }*/
    @PostMapping("/save")
    public String addCar(@ModelAttribute("car") Car car, @RequestParam(value = "myFile", required = false) MultipartFile multipartFile) {
        try {
            carService.save(car);
            carService.saveCarImage(multipartFile.getBytes(), car);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/car/list";


    }
}
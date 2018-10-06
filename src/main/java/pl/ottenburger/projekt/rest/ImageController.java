package pl.ottenburger.projekt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("/image")
public class ImageController {

    @GetMapping("/get")
    public byte[] getImage(@RequestParam("id") String name) throws IOException {
            name = name+".jpg";
            return Files.readAllBytes(Paths.get("images",name));

    }
}

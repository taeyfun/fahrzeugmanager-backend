package htw.webtech.fahrzeugmanager.rest.controller;

import htw.webtech.fahrzeugmanager.rest.model.FahrzeugDTO;
import htw.webtech.fahrzeugmanager.business.service.FahrzeugService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class FahrzeugController {
    private final FahrzeugService fahrzeugService;

    public FahrzeugController(FahrzeugService fahrzeugService) {
        this.fahrzeugService = fahrzeugService;
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    @GetMapping("/fahrzeuge")
    public ResponseEntity<List<FahrzeugDTO>> getFahrzeuge() {
        return ResponseEntity.ok(fahrzeugService.getAllFahrzeuge());
    }
}
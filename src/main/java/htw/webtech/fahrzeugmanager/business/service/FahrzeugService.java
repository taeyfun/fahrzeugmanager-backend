package htw.webtech.fahrzeugmanager.business.service;

import htw.webtech.fahrzeugmanager.rest.model.FahrzeugDTO;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;

@Service
public class FahrzeugService {
    public List<FahrzeugDTO> getAllFahrzeuge() {
        return List.of(
                new FahrzeugDTO(1, "VW", "Golf", 2018, 85000,
                        new BigDecimal("11500"), new BigDecimal("13900"), false, false),
                new FahrzeugDTO(2, "Audi", "A4", 2020, 52000,
                        new BigDecimal("21000"), new BigDecimal("24500"), true, false),
                new FahrzeugDTO(3, "BMW", "320d", 2019, 67000,
                        new BigDecimal("19000"), new BigDecimal("22900"), false, true));
    }
}
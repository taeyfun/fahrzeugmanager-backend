package htw.webtech.fahrzeugmanager.rest.model;

import java.math.BigDecimal;

public record FahrzeugDTO(int id, String marke, String modell, int baujahr,
                          int kilometerstand, BigDecimal einkaufspreis,
                          BigDecimal verkaufspreis, boolean favorit, boolean reserviert) { }
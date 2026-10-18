package htw.webtech.fahrzeugmanager.persistance.entity;

import java.math.BigDecimal;

public class FahrzeugEntity {
    private int id;
    private String marke;
    private String modell;
    private int baujahr;
    private int kilometerstand;
    private BigDecimal einkaufspreis;
    private BigDecimal verkaufspreis;
    private boolean favorit;
    private boolean reserviert;
}
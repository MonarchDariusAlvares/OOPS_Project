/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conservation;
import MainPackage.*;
import Interfaces.*;
import GUI.*;
import Reporting.*;
import Rescue.*;
import java.util.ArrayList;
/**
 *
 * @author Omar Bawazir
 */
public class WildlifeRecord {
    private int recordId;
    private String species, habitat, populationStatus;

    public WildlifeRecord(int recordId, String species, String habitat, String populationStatus) {
        this.recordId = recordId;
        this.species = species;
        this.habitat = habitat;
        this.populationStatus = populationStatus;
    }
    
    public void displayRecord()
    {
    
    }
    
    public void updatePopulationStatus(String status)
    {
    
    }

    public int getRecordId() {
        return recordId;
    }

    public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getPopulationStatus() {
        return populationStatus;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setPopulationStatus(String populationStatus) {
        this.populationStatus = populationStatus;
    }
    
    
}

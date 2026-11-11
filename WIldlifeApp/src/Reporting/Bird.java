/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reporting;
import MainPackage.*;
import Interfaces.*;
import Rescue.*;
import Conservation.*;
import GUI.*;
import java.util.ArrayList;
/**
 *
 * @author Darius Joaquim Alvares
 */
public class Bird extends Animal{
    private double wingspan;

    public Bird(double wingspan, int animalId, String species, String location, String condition, ArrayList animals) {
        super(animalId, species, location, condition, animals);
        this.wingspan = wingspan;
    }

    
    @Override
    public void displayAnimal()
    {
    
    }
    
    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
    
    
}

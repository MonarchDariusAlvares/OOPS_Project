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
public class Mammal extends Animal{
    private String furColor;

    public Mammal(String furColor, int animalId, String species, String location, String condition) {
        super(animalId, species, location, condition);
        this.furColor = furColor;
    }

    @Override
    public void displayAnimal()
    {
    
    }
    
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    
    
}

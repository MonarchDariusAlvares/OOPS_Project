/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rescue;
import MainPackage.*;
import Interfaces.*;
import GUI.*;
import Reporting.*;
import Conservation.*;
import java.util.ArrayList;
/**
 *
 * @author Dhruv Menon
 */
public class RescueCentre {
    private int centreId;
    private String name, location, phone;
    

    public RescueCentre(int centreId, String name, String location, String phone) {
        this.centreId = centreId;
        this.name = name;
        this.location = location;
        this.phone = phone;
    }
   
    public void displayCentre()
    {
    
    }

    public int getCentreId() {
        return centreId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}

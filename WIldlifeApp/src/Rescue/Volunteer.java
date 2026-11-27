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
public class Volunteer {
    private int volunteerId;
    private String name, phone, specialisation;
    private boolean available;
    

    public Volunteer(int volunteerId, String name, String phone, String specialisation, boolean available) {
        this.volunteerId = volunteerId;
        this.name = name;
        this.phone = phone;
        this.specialisation = specialisation;
        this.available = available;
    }
    
    public void displayVolunteer()
    {
    
    }
    
    public void setAvailabilty(boolean available)
    {
    
    }

    public int getVolunteerId() {
        return volunteerId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
    
    
}

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
public class Reporter {
    private int reporterId;
    private String name, phone, email;
    

    public Reporter(int reporterId, String name, String phone, String email) {
        this.reporterId = reporterId;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getReporterId() {
        return reporterId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

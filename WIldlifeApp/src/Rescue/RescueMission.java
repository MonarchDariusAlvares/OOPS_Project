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
public class RescueMission implements Trackable{
   private int missionId;
   private String status;
   private WildlifeReport report;
   private Volunteer volunteer;
   private RescueCentre rescueCentre;
   

    public RescueMission(int missionId, String status, WildlifeReport report, Volunteer volunteer, RescueCentre rescueCentre) {
        this.missionId = missionId;
        this.status = status;
        this.report = report;
        this.volunteer = volunteer;
        this.rescueCentre = rescueCentre;
    }
   
   public void displayMission()
   {
   
   }
   
   public void assignVolunteer(Volunteer volunteer)
   {
   
   }
   
   public void assignCentre(RescueCentre centre)
   {
   
   }
   
   public void updateStatus(String status)
   {
       
   }

    public int getMissionId() {
        return missionId;
    }

    public String getStatus() {
        return status;
    }

    public WildlifeReport getReport() {
        return report;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public RescueCentre getRescueCentre() {
        return rescueCentre;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
   
}

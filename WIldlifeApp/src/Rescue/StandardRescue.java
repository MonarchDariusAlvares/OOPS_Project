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
public class StandardRescue extends RescueMission{
    private String scheduledTime;

    public StandardRescue(String scheduledTime, int missionId, String status, WildlifeReport report, Volunteer volunteer, RescueCentre rescueCentre, ArrayList missions) {
        super(missionId, status, report, volunteer, rescueCentre, missions);
        this.scheduledTime = scheduledTime;
    }

    
    @Override
    public void displayMission()
    {
    
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
    
    
}

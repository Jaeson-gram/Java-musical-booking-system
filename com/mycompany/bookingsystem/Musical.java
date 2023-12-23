/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookingsystem;

import java.util.List;

/**
 *
 * @author hp
 */
public class Musical {
    private String musicalName;
    private String heirarchy;
    private String categories;
    private String runTime;
    private String venue;
    private String ages;
    
    private List<ShowTime> showTime;

    public Musical(String musicalName, String heirarchy, String categories, String runTime, String venue, String ages, List<ShowTime> showTime) {
        this.musicalName = musicalName;
        this.heirarchy = heirarchy;
        this.categories = categories;
        this.runTime = runTime;
        this.venue = venue;
        this.ages = ages;
        this.showTime = showTime;
    }

    //empty ctor
    public Musical(){
        
    }

    public String getMusicalName() {
        return musicalName;
    }

    public List<ShowTime> getShowTime() {
        return showTime;
    }

    public String getHeirarchy() {
        return heirarchy;
    }

    public String getCategories() {
        return categories;
    }

    public String getRunTime() {
        return runTime;
    }

    public String getVenue() {
        return venue;
    }

    public String getAges() {
        return ages;
    }
    
    

    //SETTERS
    
    public void setMusicalName(String musicalName) {
        this.musicalName = musicalName;
    }

    public void setShowTime(List<ShowTime> showTime) {
        this.showTime = showTime;
    }

    public void setHeirarchy(String heirarchy) {
        this.heirarchy = heirarchy;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setAges(String ages) {
        this.ages = ages;
    }
    
    
    
}

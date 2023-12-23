/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookingsystem;

/**
 *
 * @author hp
 */
public class Ticket {
    
    private String ticketType;
    private double price;
    private String musicalName;
    private int noOfTickets = 1;
    private String day;
    private int seatNumber;
    private String timeSlot;

    // Constructor, getters, and setters

    public Ticket(String ticketType, double price, String musical) {
        this.ticketType = ticketType;
        this.price = price;
        this.musicalName = musical;
    }
    
        public Ticket() {

    }

    //Getters
    public String getTicketType() {
        return ticketType;
    }

    public double getPrice() {
        return price;
    }

    public String getMusicalName() {
        return musicalName;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }

    public String getDay() {
        return day;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    
    
    //SETTERS
    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
        
        
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
    
    

    //Setters
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMusicalName(String musicalName) {
        this.musicalName = musicalName;
    }
    
    
}

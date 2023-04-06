package com.devops.practice;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;


public class Person {
    String name;
    String country;

    public Person(String name, String country){
        this.name  = name;
        this.country = country;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setCountry(String country){
        this.country = country;
    }
    
    public String getName(){
        return this.name;
    }
    public String getCountry(){
        return this.country;
    }
    
    public  boolean todayIsAWeekend(){	
    	
    	LocalDateTime today = LocalDateTime.now();
    	if(today.get(ChronoField.DAY_OF_WEEK) == 6) {
    		return true;
    	}
    	if(today.get(ChronoField.DAY_OF_WEEK) == 7) {
    		return true;
    	}
    	return false;
    	
    }
}

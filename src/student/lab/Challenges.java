/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author nparbs
 */
public class Challenges {
    
    public static void main(String[] args) {
        
    
        // Find the difference between two dates in hours

        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime endDate = startDate.plusDays(4);

        Duration difference = Duration.between(startDate, endDate);

        System.out.println("Hour difference: " + difference.toHours());



        
        
        // Find the last business day numerical value (e.g., 30) of the month given a known
        // value for the last business day String value of the week (e.g., "Friday")
        
        LocalDate date0 = LocalDate.now();
        
        LocalDate lastDay = date0.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));
        
        int lastDayNum = lastDay.getDayOfMonth();
        
        System.out.println("Last Day in Month: " + lastDayNum);
                

        // Find the difference between two dates, resulting in hours plus 
        // leftover minutes. So, e.g., 90 minutes is 1 hours and 30 minutes
        
        
        LocalDateTime date1 = LocalDateTime.now();
        
        LocalDateTime date2 = date1.plus(Duration.ofMinutes(90));
        
        Duration diff = Duration.between(date1, date2);
        
        long mins = diff.toMinutes() % 60;
        long hours = diff.toHours();
        
        System.out.println(hours+":"+mins);
        
        // Based on the current, local date and time, calculate the current
        // date and time right now in Berlin, Germany
        
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZoneId zoneId = ZoneId.of("UTC+1");
        zonedDateTime = zonedDateTime.withZoneSameInstant(zoneId);
        
        System.out.println(zonedDateTime);
        
        // Calculate a due date that is 15 days from now
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime due = now.plusDays(15);
        
        System.out.println(due);
        
        //next leap year
        
        LocalDate leap = LocalDate.now();
        int year = leap.getYear();
        
        while(!leap.isLeapYear()){
            year++;       
        }
        
        System.out.println(year);
       
         
        
    
    }
    
}

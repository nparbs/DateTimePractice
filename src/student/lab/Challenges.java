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

        System.out.println(difference.toHours());

        // Find the last business day numerical value (e.g., 30) of the month given a known

        LocalDate today = LocalDate.now();
        LocalDate lastBusDay = today.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
        
        System.out.println(lastBusDay.getDayOfMonth());
    
    }
    
}

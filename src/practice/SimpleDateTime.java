/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nparbs
 */
public class SimpleDateTime {
    public static void main(String[] args) {
        //Old (pre jdk8)
        
        Date date1 = new Date();
        System.out.println(date1);
        
        long dateTimeValue = date1.getTime();
        System.out.println(dateTimeValue);
        //international
        Calendar date3 = Calendar.getInstance();
        System.out.println(date3);

        //New (jdk8+)
        //international
        LocalDateTime date2 = LocalDateTime.now();
        System.out.println(date2);
        
        //Date only
        LocalDate date4 = LocalDate.now();
        System.out.println(date4);
        
    }
    
}

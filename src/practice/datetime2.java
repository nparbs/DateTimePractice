/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nparbs
 */
public class datetime2 {
    public static void main(String[] args) {
        
        //Create a simple date formatter
        //String format = "MM/dd/yyyy hh:mm:ss a";
        String format = "M/d/yy h:mm:ss a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        
        Calendar date1 = Calendar.getInstance();
        System.out.println(sdf.format(date1.getTime()));        
        date1.add(Calendar.DATE, -30);
        System.out.println(sdf.format(date1.getTime()));
        
        //String to date
        
        String sDate = "12/1/10 11:30:00 PM";
        // Note: parse throws a checked exception so we must try-catch
        Date date2 = new Date();
        try {
            date2 = sdf.parse(sDate);
        } catch(ParseException pe) {
            System.out.println("Could not parse date string -- illegal format");
        }
        System.out.println("9 - parse String to Date: " + date2);
    }
    
    
}

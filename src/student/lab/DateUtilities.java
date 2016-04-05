package student.lab;

import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utility class for simplifying, managing, and using dates and times, using the 
 * new Java 8 Date/Time API(JDK 8+). Fields are provided for choice of units to 
 * be returned from date/time difference calculations.
 * <P>
 * Change History:
 * <UL>
 * <LI>2016-03-28 - Version 1.0 - Initial version</LI>
 * </UL>
 *
 * (C) 2016 - Nick Parbs - NickParbs.xyz
 *
 * This code is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <P>
 * This code is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * @author nparbs
 * (<a href="mailto:nparbs@gmail.com">nparbs@gmail.com</a>)
 * @version 1.0
 */
public class DateUtilities {

    // singleton instance
    //private static DateUtilities instance;

    // Prohibit instantiation -- support Singleton design pattern
    private DateUtilities() {
    }

    /**
     * Singleton support.
     *
     * @return one and only one global instance
     
    public static DateUtilities getInstance() {
        if (instance == null) {
            instance = new DateUtilities();
        }

        return instance;
    }
    */
    
    /**
     * Returns the current date and time.
     * @return current local datetime.
     */
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
    
    //First string to date method.
    /**
     * Format a <code>String</code> according to the ISO_LOCAL_DATE format.
     * Example: 1999-01-01
     * 
     * @param date - a <code>String</code> object
     * @return a date formatted according to the built in ISO_LOCAL_DATE format
     * @throws IllegalArgumentException if date is null/empty or if the dates 
     * length is incorrect
     */
    public LocalDate toIsoLocalDate(String date) throws IllegalArgumentException {
        if (date == null || date.isEmpty()) {
            throw new DateTimeException();
        } else if(date.length() != 10){//fix (1999-01-01) = 10 chars
            throw new DateTimeException("date length must be 10 chars ex:(1999-01-01)");
        }
        
        LocalDate parsedDate = 
                LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        
        return parsedDate;
    }
    //Second string to date method.
    /**
     * Format a <code>String</code> according to a custom date pattern set by 
     * the user.
     *
     * @param date - a <code>String</code> object, must be formatted according 
     * to the passed in format pattern
     * @param pattern - a <code>String</code> object, format pattern used to 
     * parse the date to a LocalDate object
     * @return A LocalDate formatted according to a custom date format pattern
     * @throws IllegalArgumentException if date or pattern is null or empty
     */
    public LocalDate toFormattedTextDate(String date, String pattern) throws IllegalArgumentException {
        if (date == null || date.isEmpty() || pattern == null || pattern.isEmpty()) {
            throw new DateTimeException();
        } else if( date.length() != 8) {//based off pattern
            //throw new DateTimeException("date length must be 8 chars ex:(19990101)");
        }
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);//"MM dd yyyy"
        LocalDate parsedDate = LocalDate.parse(date, fmt);
        
        return parsedDate;
    }
    
    //First date to string method.
    /**
     * Format a <code>LocalDateTime</code> according to the default pattern for 
     * the current local date/time.
     *
     * @param date - a <code>LocalDateTime</code> object
     * @return a date formated according to the default pattern for the current 
     * local date/time
     * @throws IllegalArgumentException if date is null
     */
    public String toString(LocalDateTime date) throws IllegalArgumentException {
        if (date == null) {
            throw new DateTimeException();
        }
        DateFormat fmt = DateFormat.getDateInstance();
        return fmt.format(date);
    }
    //Second date to string method
    /**
     * Format a <code>LocalDateTime</code> according to a custom pattern for 
     * the current local date/time.
     *
     * @param date - a <code>LocalDateTime</code> object, to be formatted
     * @param pattern - a <code>String</code> object, the format pattern
     * @return a date formated according to a custom pattern 
     * @throws IllegalArgumentException if date or pattern is null or empty
     */
    public String toFormattedString(LocalDateTime date, String pattern) throws IllegalArgumentException {
        if (date == null || pattern == null || pattern.isEmpty()) {
            throw new DateTimeException();
        }
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
        return fmt.format(date);
    }
    
    //Time between
    /**
     * Calculates the time in days between two dates.
     * @param date1 LocalDate object, start date
     * @param date2 LocalDate object, end date
     * @return A String for the amount of days between the two  dates.
     * @throws IllegalArgumentException if either date parameter is null.
     */
    public String daysBetween(LocalDate date1, LocalDate date2) throws IllegalArgumentException {
        if (date1 == null || date2 == null) {
            throw new DateTimeException();
        }
        Duration daysBetween = Duration.between(date2, date2);

        return "Days between: " + daysBetween.toDays();
        //return daysBetween.toDays();
    }
    
    
}

package student.lab;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
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
    //First sting to date method.
    /**
     * Format a <code>String</code> according to the ISO_LOCAL_DATE format.
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
    
    
}

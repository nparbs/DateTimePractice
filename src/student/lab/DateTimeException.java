/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

/**
 * Custom Date or Time Exception for invalid data.
 * 
 * @author nparbs
 */
public class DateTimeException extends IllegalArgumentException {
    
    public static final String ERR_MSG = "Invalid date or time.";

    public DateTimeException() {
        super(ERR_MSG);
    }

    public DateTimeException(String message) {
        super(message);//super(ERR_MSG);
    }

    public DateTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public DateTimeException(Throwable cause) {
        super(cause);
    }
    
}

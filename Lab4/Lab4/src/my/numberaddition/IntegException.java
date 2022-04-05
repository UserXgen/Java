/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.numberaddition;

/**
 *
 * @author User
 */
public class IntegException extends Exception {

    public IntegException() {
    }

    public IntegException(String message) {
        super(message);
    }

    public IntegException(String message, Throwable cause) {
        super(message, cause);
    }

    public IntegException(Throwable cause) {
        super(cause);
    }

    public IntegException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}

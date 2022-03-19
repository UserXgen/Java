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
public class RecIntegral {
    private double lowLim; 
    private double upLim;
    private double stepInteg;
    private double result;
        
        public RecIntegral(){
    
        lowLim = 0;
        upLim = 0; 
        stepInteg = 0;
        result = 0;
        
    }
    
        public RecIntegral(double vLowLim, double vUpLim, double vStInteg, double vRes){
    
        lowLim = vLowLim;
        upLim = vUpLim; 
        stepInteg =  vStInteg;
        result = vRes;
        
    }
        
    public void SetLowLim(double vLowLim){
        lowLim = vLowLim;
    }
    public void SetUpLim(double vUpLim){
        upLim = vUpLim;
    }
    public void SetStepInteg(double vStInteg){
        stepInteg = vStInteg;
    }
    public void SetResult(double vRes){
        result = vRes;
    }
    
    
    public double GetLowLim(){
        return lowLim;
    }
    public double GetUpLim(){
        return upLim; 
    }
    public double GetStepInteg(){
        return stepInteg;
    }
    public double GetResult(){
        return result;      
        
    }
    
    
}

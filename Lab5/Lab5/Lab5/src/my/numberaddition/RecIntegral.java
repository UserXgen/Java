/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.numberaddition;
import java.io.Serializable;


/**
 *
 * @author User
 */
public class RecIntegral implements Serializable {
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
        
        public RecIntegral(RecIntegral recCopy){
    
        lowLim = recCopy.GetLowLim();
        upLim = recCopy.GetUpLim(); 
        stepInteg = recCopy.GetStepInteg();
        result = recCopy.GetResult();
        
    }
    
        public RecIntegral(double vLowLim, double vUpLim, double vStInteg, double vRes) throws IntegException{
    
        if((vLowLim <= 0.000001) || (vLowLim >= 1000000) ||
                (vUpLim <= 0.000001) || (vUpLim >= 1000000) || 
                (vStInteg <= 0.000001) || (vStInteg >= 1000000))
            throw new IntegException("Вводимые числа должны быть в диапазоне от 0,000001 до 1000000");
            
        lowLim = vLowLim;
        upLim = vUpLim; 
        stepInteg =  vStInteg;
        result = vRes;
        
    }
        
    public void SetLowLim(double vLowLim) throws IntegException{
        if((vLowLim <= 0.000001) || (vLowLim >= 1000000)) 
            throw new IntegException("Вводимые числа должны быть в диапазоне от 0,000001 до 1000000");

        lowLim = vLowLim;
    }
    public void SetUpLim(double vUpLim) throws IntegException{
        if((vUpLim <= 0.000001) || (vUpLim >= 1000000)) 
            throw new IntegException("Вводимые числа должны быть в диапазоне от 0,000001 до 1000000");
        upLim = vUpLim;
    }
    public void SetStepInteg(double vStInteg) throws IntegException{
        if(vStInteg == 0) 
            throw new IntegException("Шаг интегрирования не может быть равным нулю");
        
        if((vStInteg <= 0.000001) || (vStInteg >= 1000000)) 
            throw new IntegException("Вводимые числа должны быть в диапазоне от 0,000001 до 1000000");
        
        if((upLim - lowLim) < vStInteg)
            throw new IntegException("Шаг интегрирования не должен превышать диапазон вычисления");
        
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

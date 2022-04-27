
package lab6.client;

public class MyThread extends Thread {
    
    private double area;
    private double lowLim;
    private double upLim;
    private double stepInteg;
    private int iteration; 
    private int endIteration;
    private Client.Function function;
    
    public boolean ret = false;
    
    MyThread(int vIteration, int vEndIteration, double vLowLim, double vUpLim, double vStepInteg, Client.Function func){
       
        iteration = vIteration;
        endIteration = vEndIteration;      
        lowLim = vLowLim;
        upLim = vUpLim;
        stepInteg = vStepInteg;
        function = func;
       
    }
    
    
    @Override
    public void run(){
    
        integralPartTrap();
        
        
    }
    
    public double GetArea(){
    
        return area;
        
    }
    

    public void integralPartTrap() {
        area = 0;
 
        for (int i = iteration; i < endIteration; i++) {
            
           System.out.println(iteration + " " + endIteration);
            
            area += stepInteg * (0.5 * (function.func(lowLim + i * stepInteg)+function.func(lowLim+(i+1)* stepInteg)));
        }
    
    }
    
}


package lab6.client;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client {
    
    
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            
            System.out.println(" Соединение с сервером установлено ");
            System.out.println();
            
            String msg;
            
            System.out.println(" Ждём данные для вычислений ");
            while((msg = in.readLine()) != null )
            {
                if(".".equals(msg))
                    break;
                
                String delimeter = " "; // Разделитель
                String[] subStr;
                subStr = msg.split(delimeter);
                
                double lowLim = Double.parseDouble(subStr[0]);
                double upLim = Double.parseDouble(subStr[1]);
                double stepInteg = Double.parseDouble(subStr[2]);
                
                System.out.println(" Полученные данные " + lowLim + " " + upLim + " " + stepInteg);
                Calculate(lowLim, upLim, stepInteg);
                
                System.out.println(" Ждём данные для вычислений ");
                

            
            }
            
 
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        finally{
        
            stopConnection();
            
        }
    }

    public void stopConnection() {
        try {
            in.close();
            out.close();
            clientSocket.close();
            
            System.out.println();
            System.out.println(" Клиент завершил работу ");
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void Calculate(double lowLim, double upLim, double stepInteg)
    {
            
                
                
        int iteration = (int)( ((upLim - lowLim) / stepInteg) / 4.0);

        MyThread thr1 = new MyThread(0, iteration, lowLim, upLim,
                stepInteg, x -> {return Math.tan(x);});
        MyThread thr2 = new MyThread(iteration, iteration * 2, lowLim, upLim,
                stepInteg, x -> {return Math.tan(x);} );
        MyThread thr3 = new MyThread( iteration * 2, iteration * 3, lowLim, upLim,
                stepInteg, x -> {return Math.tan(x);} );
        MyThread thr4 = new MyThread( iteration * 3, iteration * 4, lowLim, upLim,
                stepInteg, x -> {return Math.tan(x);} );


        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();

        try {
            thr1.join();
            thr2.join();
            thr3.join();
            thr4.join();

        } catch (InterruptedException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

        double area = thr1.GetArea() + thr2.GetArea() + thr3.GetArea() + thr4.GetArea();

        System.out.println(" Полученный результат " + area);
        System.out.println();

        out.println(area);


                
    } 
    

    
    public static void main(String[] args)
    {
        Client cl = new Client();
        cl.startConnection("127.0.0.1", 6666);
     
    }
    
    
    interface Function {
    public double func(double x);
    
    
    }
    
    
}


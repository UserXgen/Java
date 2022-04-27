
package my.numberaddition;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server implements Runnable {
    
        
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private int port;
        
    
    public Server(int vPort){
        port = vPort;
        startServer(port);
    
    }
    
    @Override
    public void finalize() throws Throwable{
        try {
            stopServer();
        } finally {
            super.finalize();
        }
    }

        

    public void run()
    {
        startServer(port);
        System.out.println("сервер прям всё");
    }
    
    
    public double CalculationRequest(double vLowLim, double vUpLim, double vStepInteg)
    {
        
        double area = 0;
        
        try {
            
            out.println(vLowLim + " " + vUpLim + " " + vStepInteg);
            System.out.println(" Делаем запрос на вычисление ");
            area = Double.parseDouble(in.readLine());
            System.out.println(" Полученный результат " + area);
            System.out.println();

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return area;
        
        
    
    }
    
    
    public void startServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Сервер ждёт");
            clientSocket = serverSocket.accept();
            
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            
            System.out.println("Сервер запущен");
            System.out.println();
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void stopServer() {
        try {
            out.println(".");
            
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
            
            System.out.println(" Сервер завершил работу ");
            
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        
        private static class EchoClientHandler extends Thread {
            private Socket clientSocket;
            private PrintWriter out;
            private BufferedReader in;

            public EchoClientHandler(Socket socket) {
                this.clientSocket = socket;
            }

            public void run() {
                try {
                    out = new PrintWriter(clientSocket.getOutputStream(), true);
                    in = new BufferedReader(
                            new InputStreamReader(clientSocket.getInputStream()));

                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        if (".".equals(inputLine)) {
                            out.println("bye");
                            break;
                        }
                        out.println(inputLine);
                    }

                    in.close();
                    out.close();
                    clientSocket.close();
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

    }
}



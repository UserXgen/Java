/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.numberaddition;
import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;


import java.util.logging.Level;
import java.util.logging.Logger;

//import java.util.List;

/**
 *
 * @author User
 */
public class IntegrSearch extends javax.swing.JFrame {
    
    /**
     * Creates new form ContactEditorUI
     */
        
    public IntegrSearch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonСalculate = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButtonSerialize = new javax.swing.JButton();
        jButtonDeserialize = new javax.swing.JButton();
        jButtonWriteFile = new javax.swing.JButton();
        jButtonReadFile = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonFillTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("        Интеграл tg(x)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Нижняя граница интегрирования", "Верхняя граница интегрирования", "Шаг интегрирования", "Результат вычисления"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jButtonAdd.setText("Добавить");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Удалить");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonСalculate.setText("Вычислить");
        jButtonСalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonСalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButtonAdd)
                .addGap(32, 32, 32)
                .addComponent(jButtonDelete)
                .addGap(30, 30, 30)
                .addComponent(jButtonСalculate)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonСalculate))
                .addGap(28, 28, 28))
        );

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Нижняя граница");

        jLabel3.setText("Верхняя граница");

        jLabel4.setText("Шаг интегрирования");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jButtonSerialize.setText("Cериализовать");
        jButtonSerialize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSerializeActionPerformed(evt);
            }
        });

        jButtonDeserialize.setText("Восстановить");
        jButtonDeserialize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeserializeActionPerformed(evt);
            }
        });

        jButtonWriteFile.setText("Записать в txt");
        jButtonWriteFile.setPreferredSize(new java.awt.Dimension(87, 25));
        jButtonWriteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWriteFileActionPerformed(evt);
            }
        });

        jButtonReadFile.setText("Прочитать из txt");
        jButtonReadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadFileActionPerformed(evt);
            }
        });

        jButtonClear.setText("Очистить");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonFillTable.setText("Заполнить");
        jButtonFillTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFillTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonFillTable, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonReadFile, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addComponent(jButtonWriteFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSerialize, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButtonDeserialize, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButtonClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFillTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonWriteFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSerialize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeserialize)
                    .addComponent(jButtonReadFile))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        model.addRow(new Object[]{});   
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonСalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonСalculateActionPerformed
  
        String str1 = jTextField1.getText();
        String str2 = jTextField2.getText();
        String str3 = jTextField3.getText();     
            
        if(!jTable.getSelectionModel().isSelectionEmpty() && Compare(str1) && Compare(str2) && Compare(str3)){
            
            int selectedRow = jTable.getSelectedRow();
            
                                   
            if(!jTextField1.getText().isEmpty() && !jTextField2.getText().isEmpty() && !jTextField3.getText().isEmpty()){
                                   

                tabEnts.add(new RecIntegral());
                int j = tabEnts.size() - 1;             
                
                
                try{
                    
                    tabEnts.get(j).SetLowLim(Double.parseDouble(str1));
                    tabEnts.get(j).SetUpLim(Double.parseDouble(str2));
                    tabEnts.get(j).SetStepInteg(Double.parseDouble(str3));                                                             
                    
                    double area; 
                    area = integralTrap(tabEnts.get(j).GetLowLim(),tabEnts.get(j).GetUpLim(), 
                            tabEnts.get(j).GetStepInteg(),
                            x -> {return Math.tan(x);});
                    
                    tabEnts.get(j).SetResult(area);  
                       
                    jTable.setValueAt(tabEnts.get(j).GetLowLim(), selectedRow, 0); // Double.parseDouble(jTextField1.getText()), selectedRow, 0
                    jTable.setValueAt(tabEnts.get(j).GetUpLim(), selectedRow, 1);
                    jTable.setValueAt(tabEnts.get(j).GetStepInteg(), selectedRow, 2);
                    jTable.setValueAt(tabEnts.get(j).GetResult(), selectedRow, 3);
                    
                }
                catch(IntegException err){
                           
                        tabEnts.remove(j);
                        JFrame errFrame = new JFrame();
                        JOptionPane.showMessageDialog(errFrame, err.getMessage());
                    
                }                     
            }
        }
                
    }//GEN-LAST:event_jButtonСalculateActionPerformed

    
    public boolean Compare(String comp){
    
        try{
            int points = 0;
            
            if((comp == null) || (comp.length() == 0))
                return false;
            
            for(int i = 0; i < comp.length(); i++){
                char c = comp.charAt(i);
                if(c == '.')
                    points++;

                if((!Character.isDigit(c) &&  c != '.') || points > 1)
                    throw new IntegException("Вводимые поля должны содержать только числа");
            }
        
            return true;
        }
        
        catch(IntegException err){
                
                JFrame errFrame = new JFrame();
                JOptionPane.showMessageDialog(errFrame, err.getMessage());
               
                return false;
            }
    }
    
    
    
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        
        if(!jTable.getSelectionModel().isSelectionEmpty()){
            
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        model.removeRow(jTable.getSelectedRow());
        
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        model.setRowCount(0);
        
        
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonFillTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFillTableActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        
        model.setRowCount(0);
             
        if(tabEnts != null){
            for(int i = 0; i < tabEnts.size(); i++){

             if( tabEnts.get(i).GetStepInteg() != 0 ){
                model.addRow(new Object[]{tabEnts.get(i).GetLowLim(), tabEnts.get(i).GetUpLim(),
                tabEnts.get(i).GetStepInteg(), tabEnts.get(i).GetResult()});
             } 

            }
        }

    }//GEN-LAST:event_jButtonFillTableActionPerformed

    private void jButtonReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadFileActionPerformed
        // TODO add your handling code here:

        BufferedReader br = null;
        try{
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

            fc.setCurrentDirectory(new java.io.File( System.getProperty("user.dir") ));
            int ret = fc.showDialog(null, "Выберите файл для чтения");

            if(ret == JFileChooser.APPROVE_OPTION){

                File file = fc.getSelectedFile();
                br = new BufferedReader(new FileReader(file));
                String line;

                int countStr = 0;
                int countStrNew = 0;

                while((line = br.readLine()) != null){

                    tabEnts.add(new RecIntegral());
                    int j = tabEnts.size() - 1;

                    try{

                        String[] subStr;
                        String delimeter = " "; // Разделитель
                        subStr = line.split(delimeter);
                        
                        for(int i = 0; i < subStr.length; i++){
                            if(!Compare(subStr[i]))
                                continue;
                        

                            if(Compare(subStr[i]) && Compare(subStr[i + 1]) && Compare(subStr[i + 2])){

                                tabEnts.get(j).SetLowLim(Double.parseDouble(subStr[i]));
                                tabEnts.get(j).SetUpLim(Double.parseDouble(subStr[i + 1]));
                                tabEnts.get(j).SetStepInteg(Double.parseDouble(subStr[i + 2]));
                                tabEnts.get(j).SetResult(Double.parseDouble(subStr[i + 3]));
                                
                                //System.out.println(i + " " + (i+1) + " "+ (i+2) + " " + (i+3) + "\n");

                                countStr++;
                                break;
                            }
                        }

                        if(countStr == countStrNew)
                            tabEnts.remove(j);
                        else 
                            countStrNew = countStr;

                    }
                    catch(IntegException err){

                        tabEnts.remove(j);
                        //JFrame errFrame = new JFrame();
                        //JOptionPane.showMessageDialog(errFrame, err.getMessage());

                    }

                }

                JFrame sFrame = new JFrame();
                String sStr = "Успешно прочитано строк " + countStr;

                JOptionPane.showMessageDialog(sFrame, sStr);

            }

        } catch(IOException err){
            JFrame errFrame = new JFrame();
            JOptionPane.showMessageDialog(errFrame, err.getMessage());

        } finally{

            try {
                if(br != null)
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(IntegrSearch.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButtonReadFileActionPerformed

    private void jButtonWriteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWriteFileActionPerformed
        // TODO add your handling code here:

        try{
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

            fc.setCurrentDirectory(new java.io.File( System.getProperty("user.dir") ));
            int ret = fc.showDialog(null, "Выберите файл для сохранения");

            if(ret == JFileChooser.APPROVE_OPTION){

                File file = fc.getSelectedFile();
                try (PrintWriter pw = new PrintWriter(file)) {
                    if(tabEnts != null){
                        for(int i = 0; i < tabEnts.size(); i++){
                            
                            pw.print(" " + tabEnts.get(i).GetLowLim() + " " + tabEnts.get(i).GetUpLim()
                                    + " " + tabEnts.get(i).GetStepInteg() + " " + tabEnts.get(i).GetResult() + "\n");
                        }
                    }
                    pw.close();
                }
            }

        } catch(IOException err){
            JFrame errFrame = new JFrame();
            JOptionPane.showMessageDialog(errFrame, err.getMessage());

        }
    }//GEN-LAST:event_jButtonWriteFileActionPerformed

    private void jButtonSerializeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSerializeActionPerformed
        // TODO add your handling code here:
        
         try{
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

            fc.setCurrentDirectory(new java.io.File( System.getProperty("user.dir") ));
            int ret = fc.showDialog(null, "Выберите файл для сериализации");

            if(ret == JFileChooser.APPROVE_OPTION){

                try (FileOutputStream fos = new FileOutputStream(fc.getSelectedFile())) {
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    
                    if(tabEnts != null){
                        oos.writeObject(tabEnts);
                    }
                    
                    fos.close();
                    
                }
                
            }

        } catch(IOException err){
            JFrame errFrame = new JFrame();
            JOptionPane.showMessageDialog(errFrame, err.getMessage());

        }
        
        
        
        
    }//GEN-LAST:event_jButtonSerializeActionPerformed

    private void jButtonDeserializeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeserializeActionPerformed
        // TODO add your handling code here:
        
         try{
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

            fc.setCurrentDirectory(new java.io.File( System.getProperty("user.dir") ));
            int ret = fc.showDialog(null, "Выберите файл для десериализации");

            if(ret == JFileChooser.APPROVE_OPTION){

                try (FileInputStream fis = new FileInputStream(fc.getSelectedFile())) {
                    
                    tabEnts = new LinkedList();
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    try {
                        tabEnts = (LinkedList<RecIntegral>)ois.readObject();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(IntegrSearch.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    fis.close();
                    
                }
                
            }

        } catch(IOException err){
            JFrame errFrame = new JFrame();
            JOptionPane.showMessageDialog(errFrame, err.getMessage());

        }
        
    }//GEN-LAST:event_jButtonDeserializeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntegrSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntegrSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntegrSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntegrSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntegrSearch().setVisible(true);
                
                
            }
        });
    }
    
    public double integralTrap(double vLowLim, double vUpLim, double vStepInteg, Function function) {
    double area = 0;
   
    for (int i = 0; i < (vUpLim - vLowLim) / vStepInteg; i++) {
        area += vStepInteg * (0.5 * (function.func(vLowLim + i * vStepInteg)+function.func(vLowLim+(i+1)* vStepInteg)));
    }
    return area;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDeserialize;
    private javax.swing.JButton jButtonFillTable;
    private javax.swing.JButton jButtonReadFile;
    private javax.swing.JButton jButtonSerialize;
    private javax.swing.JButton jButtonWriteFile;
    private javax.swing.JButton jButtonСalculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    public double lowLim;
    public double upLim;
    public double stepInteg;
    public LinkedList<RecIntegral> tabEnts = new LinkedList();
    
    interface Function {
    public double func(double x);
    
    
}
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrukturData_;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author HP
 */
public class hospital {
    
    private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private Poli a;
   private Umum b;
   public hospital(){
       prepareGUI();
       this.a = new Poli();
       this.b = new Umum();
   }
   public static void main(String[] args){
       hospital test = new hospital();
       test.showButton();
   }
   private void prepareGUI(){
       mainFrame = new JFrame("d Hospital");
       mainFrame.setSize(300,150);
       mainFrame.setLayout(new GridLayout(3, 1));
      
       mainFrame.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent windowEvent){
               System.exit(0);
           }        
       });
       
       headerLabel = new JLabel("", JLabel.CENTER);        
       statusLabel = new JLabel("", JLabel.CENTER);    
       statusLabel.setSize(350,100);

       controlPanel = new JPanel();
       controlPanel.setLayout(new FlowLayout());

       mainFrame.add(headerLabel);
       mainFrame.add(controlPanel);
       mainFrame.add(statusLabel);
       mainFrame.setVisible(true);  
   }
   private void showButton(){
       headerLabel.setText("Selamat datang..");
       
       JButton nButton = new JButton("Pasien"); 
       JButton pButton = new JButton("Pegawai"); 
       nButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){       
               String pilihan = JOptionPane.showInputDialog("Silahkan pilih:\n 1. Poli\n 2. Umum");
               char c = pilihan.charAt(0);
               if(c=='1'){
                   String pilih = JOptionPane.showInputDialog("Silahkan pilih:\n 1. Poli Anak\n 2. Poli Mata\n 3. Poli Penyakit Dalam\n 4. Poli Gigi\n 5. Poli Kulit");
                   char x = pilih.charAt(0);
                   if(x=='1')
                       a.ticketT('a');
                   else if(x=='2')
                       a.ticketT('b');
                   else if(x=='3')
                       a.ticketT('c');
                   else if(x=='4')
                       a.ticketT('d');
                   else if(x=='5')
                       a.ticketT('e');
                   else{
                       String message1 = String.format("Pilihan yang Anda masukkan salah. Silahkan coba lagi...");
                       JOptionPane.showMessageDialog(null, message1);
                   }
               }
               else if(c=='2'){
                   b.ticketU();
               }
               else{
                   String message2 = String.format("Pilihan yang Anda masukkan salah. Silahkan coba lagi...");
                   JOptionPane.showMessageDialog(null, message2);
               }
           }          
       });
       pButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               String pil = JOptionPane.showInputDialog("Silahkan pilih:\n 1. Poli\n 2. Umum");
               char c = pil.charAt(0);
               if(c=='1'){
                   String p = JOptionPane.showInputDialog("Silahkan pilih:\n 1. Poli Anak\n 2. Poli Mata\n 3. Poli Penyakit Dalam\n 4. Poli Gigi\n 5. Poli Kulit");
                   char y = p.charAt(0);
                   if(y=='1')
                       a.screenT('a');
                   else if(y=='2')
                       a.screenT('b');
                   else if(y=='3')
                       a.screenT('c');
                   else if(y=='4')
                       a.screenT('d');
                   else if(y=='5')
                       a.screenT('e');
                   else{
                       String message3 = String.format("Pilihan yang Anda masukkan salah. Silahkan coba lagi...");
                       JOptionPane.showMessageDialog(null, message3);
                   }
               }
               else if(c=='2'){
                   String z = JOptionPane.showInputDialog("Silahkan pilih:\n 1. Umum1\n 2. Umum2");
                   char w = z.charAt(0);
                   if(w=='1')
                       b.screenU('a');
                   if(w=='2')
                       b.screenU('b');
                   else{
                       String message4 = String.format("Pilihan yang Anda masukkan salah. Silahkan coba lagi...");
                       JOptionPane.showMessageDialog(null, message4);
                   }
               }
               else{
                   String message4 = String.format("Pilihan yang Anda masukkan salah. Silahkan coba lagi...");
                   JOptionPane.showMessageDialog(null, message4);
               }
           }          
       });
       controlPanel.add(nButton);
       controlPanel.add(pButton);
       mainFrame.setVisible(true);  
   }
}
    


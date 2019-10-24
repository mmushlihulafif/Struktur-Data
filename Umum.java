/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrukturData_;
import java.util.*;
import java.text.*;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class Umum {
    
   private int nomorU=0;
   private int antriU=0;
   private date q;

   Date dNow = new Date();
   SimpleDateFormat ft = new SimpleDateFormat("E, dd.MM.yyyy   hh:mm:ss a");
   
   public void ticketU(){
       this.q = new date();
       String message1 = String.format("#######################################\nd Hospital\n\n"+q.getTanggal()+"\n\nNomor Antrian Anda :\nUMUM\nU%d\n\nTerima kasih telah tertib\nJumlah antrian: %d\n#######################################", nomorU+1, nomorU-antriU);
       JOptionPane.showMessageDialog(null, message1);
       nomorU++;
   }
   public void screenU(char x){
       antriU++;
       if(x=='a'){
           String message2 = String.format("Pelayanan:\nUMUM1\nU%d\n\nBelum mendapatkan pelayanan %d", nomorU-(nomorU-antriU),nomorU-antriU);
           JOptionPane.showMessageDialog(null, message2);
       }
       else if(x=='b'){
           String message2 = String.format("Pelayanan:\nUMUM2\nU%d\n\nBelum mendapatkan pelayanan %d", nomorU-(nomorU-antriU),nomorU-antriU);
           JOptionPane.showMessageDialog(null, message2);
       }
   }
}

    
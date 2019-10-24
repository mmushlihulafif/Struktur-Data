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
public class Poli {
   
    private int nomorTA=0;
   private int nomorTM=0;
   private int nomorTD=0;
   private int nomorTG=0;
   private int nomorTK=0;
   private int antriTA=0;
   private int antriTM=0;
   private int antriTD=0;
   private int antriTG=0;
   private int antriTK=0;
   private date q;
   
   public void ticketT(char x){
       this.q = new date();
       if(x=='a'){
           String message1 = String.format("#######################################\nd Hospital\n\n"+q.getTanggal()+"\n\nNomor Antrian Anda :\nPOLI ANAK\nA%d\n\nTerima kasih telah tertib\nJumlah antrian: %d\n#######################################", nomorTA+1, nomorTA-antriTA);
           JOptionPane.showMessageDialog(null, message1);
           nomorTA++;
       }
       else if(x=='b'){
           String message2 = String.format("#######################################\nd Hospital\n\n"+q.getTanggal()+"\n\nNomor Antrian Anda :\nPOLI MATA\nB%d\n\nTerima kasih telah tertib\nJumlah antrian: %d\n#######################################", nomorTM+1, nomorTM-antriTM);
           JOptionPane.showMessageDialog(null, message2);
           nomorTM++;
       }
       else if(x=='c'){
           String message3 = String.format("#######################################\nd Hospital\n\n"+q.getTanggal()+"\n\nNomor Antrian Anda :\nPOLI PENYAKIT DALAM\nC%d\n\nTerima kasih telah tertib\nJumlah antrian: %d\n#######################################", nomorTD+1, nomorTD-antriTD);
           JOptionPane.showMessageDialog(null, message3);
           nomorTD++;
       }
       else if(x=='d'){
           String message4 = String.format("#######################################\nd Hospital\n\n"+q.getTanggal()+"\n\nNomor Antrian Anda :\nPOLI GIGI\nD%d\n\nTerima kasih telah tertib\nJumlah antrian: %d\n#######################################", nomorTG+1, nomorTG-antriTG);
           JOptionPane.showMessageDialog(null, message4);
           nomorTG++;
       }
       else if(x=='e'){
           String message5 = String.format("#######################################\nd Hospital\n\n"+q.getTanggal()+"\n\nNomor Antrian Anda :\nPOLI KULIT\nE%d\n\nTerima kasih telah tertib\nJumlah antrian: %d\n#######################################", nomorTK+1, nomorTK-antriTK);
           JOptionPane.showMessageDialog(null, message5);
           nomorTK++;
       }
   }
   public void screenT(char y){
       if(y=='a'){
           antriTA++;
           String message6 = String.format("Pelayanan:\nPOLI ANAK\nA%d\n\nBelum mendapatkan pelayanan %d", nomorTA-(nomorTA-antriTA),nomorTA-antriTA);
           JOptionPane.showMessageDialog(null, message6);
       }
       else if(y=='b'){
           antriTM++;
           String message7 = String.format("Pelayanan:\nPOLI MATA\nB%d\n\nBelum mendapatkan pelayanan %d", nomorTM-(nomorTM-antriTM),nomorTM-antriTM);
           JOptionPane.showMessageDialog(null, message7);
       }
       else if(y=='c'){
           antriTD++;
           String message8 = String.format("Pelayanan:\nPOLI PENYAKIT DALAM\nC%d\n\nBelum mendapatkan pelayanan %d", nomorTD-(nomorTD-antriTD),nomorTD-antriTD);
           JOptionPane.showMessageDialog(null, message8);
       }
       else if(y=='d'){
           antriTG++;
           String message9 = String.format("Pelayanan:\nPOLI GIGI\nD%d\n\nBelum mendapatkan pelayanan %d", nomorTG-(nomorTG-antriTG),nomorTG-antriTG);
           JOptionPane.showMessageDialog(null, message9);
       }
       else if(y=='e'){
           antriTK++;
           String message0 = String.format("Pelayanan:\nPOLI KULIT\nE%d\n\nBelum mendapatkan pelayanan %d", nomorTK-(nomorTK-antriTK),nomorTK-antriTK);
           JOptionPane.showMessageDialog(null, message0);
       }
   }
}
    


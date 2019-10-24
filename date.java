/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrukturData_;
import java.util.*;
import java.text.*;
/**
 *
 * @author HP
 */
class date {
     public String getTanggal(){
       Date dNow = new Date();
       SimpleDateFormat ft = new SimpleDateFormat("E, dd.MM.yyyy   hh:mm:ss a");
       return ft.format(dNow);
   }
 
}
   
   



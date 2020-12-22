/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmproject;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class FarmProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
               ArrayList<String> list = new ArrayList();
        list.add("fener");
        list.add("gs");
        list.add("bj");
        list.add("ab");
        Random rand =new Random();
        int randomOfIndex=rand.nextInt(list.size());
        String selected=list.get(randomOfIndex);
        while(selected.equals("fener")){
            randomOfIndex=rand.nextInt(list.size());
            selected=list.get(randomOfIndex);
           
        }
         System.out.println(selected);
        
        
    
    
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name.picker.java;
import java.util.Scanner;
/**
 *
 * @author semasuka
 */
public class NamePickerJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        name nameObj=new name();
        System.out.println("enter your name:");
        String temp=input.nextLine();
        nameObj.setName(temp);
        nameObj.calling();
        
    }
    
}

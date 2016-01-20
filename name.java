/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name.picker.java;

/**
 *
 * @author semasuka
 */
public class name {
    private String myName;
    public void setName(String name){
        myName=name;
    }
    public String getName(){
        return myName;
    }
    public void calling(){
        System.out.printf("your name is:\n%s ", getName());
        
    }
    
}

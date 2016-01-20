/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author semasuka
 */
public class picker {
    private String myName;
    public picker(String name){
        myName=name;
        
    }
    public String getName(){
        return myName;
    }
    public void calling(){
        System.out.printf("your name is:%s",getName());
    }
}
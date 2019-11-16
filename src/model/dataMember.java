/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lenovo
 */
public class dataMember {
    int id;
    String username, pass;
    public dataMember(String username, String pass){
        this.username = username;
        this.pass = pass;
    }
   
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.pass;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class member {
//    ArrayList<String> username = new ArrayList<String>();
//    ArrayList<String> password = new ArrayList<String>();
    ArrayList<dataMember> dM;
    public member(){
        dM = new ArrayList<dataMember>();
    }
    
    public void setData(String username, String pass){
        dM.add(new dataMember(username, pass));
    }
    
    public void getData(){
        for(dataMember data:dM){
            System.out.println(data.username);
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author cleme
 */
public class Members {

    protected String name;
    protected String login;
    protected String password;
    protected int idmember;

    public Members(String n, String l, String p, int id) {
        
        name = n;
        login = l;
        password = p;
        idmember = id;
        

    }
 public String getName(){
    return name;
}
 public String getUser(){
    return login ;
}
 public String getPassword(){
     return password ;
 }
 public int getID()
 {
     return idmember;
 
 }
 public void setName(String Name){
     this.name = Name;
 }
     
 public void setUser(String login){
     this.login = login;
 }
 public void setPassword(String password){
     this.password = password;
     
     
 }

}

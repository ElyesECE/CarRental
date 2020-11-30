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

    public Members(String n, String l, String p) {
        
        name = n;
        login = l;
        password = p;

    }

 public String getUser(){
    return login ;
}
 public String getPassword(){
     return password ;
 }
 /*public void setUser(String log){
     this.log->login
 }
 public void setPassword(String pass){
     this.pass->password;
     
     
 }
*/
}

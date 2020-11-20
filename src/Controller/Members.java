/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Login;

/**
 *
 * @author cleme
 */
public class Members {
    
    
    protected String name;
    protected String login;
    protected String Password;
    
    
    public Members()
    {
        Login a = new Login();
        a.setVisible(true);
        
        this.login= a.getlogin();
        this.Password=a.getPass();
        
        
        
    
    }
    
    public void connect()
    {
        String tempname;
        
        
        
        
    
    }
    
    public void Disconnet()
    {
    
    }


    
    
    
    
    
}

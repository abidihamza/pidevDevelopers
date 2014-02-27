/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartravel.entities;

/**
 *
 * @author Belgacem
 */
public class Administrateur extends Compte{
 
     public String login ;
     public Administrateur(){
    
      }
     
     public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
}

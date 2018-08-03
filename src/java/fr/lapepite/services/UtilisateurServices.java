/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.lapepite.services;

import fr.lapepite.controller.RegisteringServlet;
import fr.lapepite.db.utils.DBUtilisateurUtils;
import fr.lapepite.javabean.Panier;
import fr.lapepite.javabean.Utilisateur;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.mindrot.jbcrypt.BCrypt;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UtilisateurServices {
    
    public static void addUtilisateur(Utilisateur utilisateur) throws Exception{
        DBUtilisateurUtils.insertUtilisateur(utilisateur);
    }
    
    public static boolean registerUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        try {
            //Recup des infos
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String adresse = request.getParameter("adresse");
            
            if (!email.isEmpty() && !password.isEmpty() && !nom.isEmpty() && !prenom.isEmpty() && !adresse.isEmpty()) {
                
                //création user
                Utilisateur utilisateur = new Utilisateur();
                
                //Hachage password
                password = BCrypt.hashpw(password, BCrypt.gensalt());
                
                //set de l'utilisateur
                utilisateur
                        .setNom(nom)
                        .setPrenom(prenom)
                        .setEmail(email)
                        .setAdresse(adresse)
                        .setPassword(password)
                        .setPanier();
                
                //enregistrement en base
               addUtilisateur(utilisateur);
               
                setSessionUtilisateur(request, utilisateur);
               
               return true;
                
            } else {
 
                throw new Exception("Tout les champs doivent être remplis.");
                 
            }
            
           
            
        } catch (Exception ex) {
            Logger.getLogger(RegisteringServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    
    public static boolean getUtilisateur(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try { 
        String email = request.getParameter("email");
        
        String password = request.getParameter("password");
        
        Utilisateur utilisateur = new Utilisateur();
        
        utilisateur.setEmail(email);
        utilisateur.setPassword(password);
        
        Utilisateur utilisateurDB = DBUtilisateurUtils.selectUtilisateurByEmail(utilisateur);
        
            if (BCrypt.checkpw(password, utilisateurDB.getPassword())) {
                
                setSessionUtilisateur(request, utilisateurDB);
                
                return true;
            }
        
        } catch (Exception ex) {
            Logger.getLogger(UtilisateurServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static void setSessionUtilisateur(HttpServletRequest request, Utilisateur utilisateur){
        
        HttpSession session = request.getSession();
        session.setAttribute("utilisateur", utilisateur);
        
    }
}

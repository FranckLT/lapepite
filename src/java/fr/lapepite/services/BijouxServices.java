/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.lapepite.services;

import fr.lapepite.db.utils.DBBijouxUtils;
import fr.lapepite.javabean.Bijoux;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class BijouxServices{


    public List<Bijoux> getAll() {
        
        
        List<Bijoux> listBijoux = new ArrayList<>();
        
        listBijoux = DBBijouxUtils.requestSelect();
        
       return listBijoux;
    }
    
    public static Bijoux getOneBijoux(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            
            int idBijoux = Integer.parseInt(request.getParameter("id"));
            
            Bijoux bijoux = new Bijoux();
            
            bijoux = DBBijouxUtils.selectOneBijouxById(idBijoux);
            
            return bijoux;
            
        } catch (Exception ex) {
            
            Logger.getLogger(BijouxServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }


    public void addOne(Bijoux bijoux) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void updateOne(Bijoux bioux) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

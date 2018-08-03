/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.lapepite.db.utils;

import fr.lapepite.javabean.Bijoux;
import fr.lapepite.javabean.Categorie;
import fr.lapepite.javabean.Designer;
import fr.lapepite.javabean.Utilisateur;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DBBijouxUtils {
   
	
	private final static String QUERY_FIND_BIJOUX = "SELECT * FROM bijoux INNER JOIN designer ON bijoux.id_designer = designer.id_designer INNER JOIN categorie on bijoux.id_categorie = categorie.id_categorie";
	private final static String QUERY_FIND_ONE_BIJOUX = "SELECT * FROM bijoux INNER JOIN designer ON bijoux.id_designer = designer.id_designer INNER JOIN categorie on bijoux.id_categorie = categorie.id_categorie WHERE id_bijoux=(?)";

	
	public static ArrayList<Bijoux> requestSelect() {
		
		ArrayList<Bijoux> listBijou=new ArrayList<>();
		
		Connection con = null;
		Statement stmt = null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection(ConnexionJDBC.URL, ConnexionJDBC.LOGIN, ConnexionJDBC.PASSWORD); //La connexion
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery(QUERY_FIND_BIJOUX);
			
			while (rset.next()) {
				Bijoux bijou = rsetToBijou(rset);
				listBijou.add(bijou);
			}
			
			return listBijou;
		}
		catch (final SQLException e) {
			e.printStackTrace();
			return listBijou;
		}
		finally {
			
			if (con != null) {
				try {
					con.close();
				} catch (final SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public static Bijoux selectOneBijouxById(int id) throws Exception, SQLException {
		Connection con = null;
		PreparedStatement stmt = null;
                
                Bijoux bijoux = new Bijoux();

		try {
	
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection(ConnexionJDBC.URL, ConnexionJDBC.LOGIN, ConnexionJDBC.PASSWORD);

			// takes the name and returns an id
			stmt = con.prepareStatement(QUERY_FIND_ONE_BIJOUX);
			stmt.setInt(1, id);
			ResultSet rSet = stmt.executeQuery();
			if (rSet.next()) {
				bijoux = rsetToBijou(rSet);
				return bijoux;
			} else {
				throw new Exception("L'utilisateur : " + id + " n'existe pas");
			}
		} finally {
			// Close the connection
			if (con != null) {
				try {
					con.close();
				} catch (final SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	
	private static Bijoux rsetToBijou(final ResultSet rset) throws SQLException
	{
            Designer designer = rsetToDesigner(rset);
            
            Categorie categorie = rsetToCategorie(rset);
            
            Bijoux bijou = new Bijoux();
            
            bijou.setId(rset.getInt("id_bijoux"));
            
            bijou.setRef(rset.getString("ref_bijoux"));
            
            bijou.setNom(rset.getString("nom_bijoux"));
            
            bijou.setPrix(rset.getInt("prix_bijoux"));
            
            bijou.setDesigner(designer);
            
            bijou.setCategorie(categorie);
            
		return bijou;
	}
	
	
	
	private static Designer rsetToDesigner(final ResultSet rSet) throws SQLException{
		
		final Designer designer = new Designer();
                
                designer.setId(rSet.getInt("id_designer"));
                designer.setNom(rSet.getString("nom_designer"));
		
		return designer;
	}
	
	private static Categorie rsetToCategorie(final ResultSet rSet) throws SQLException{
		
		final Categorie categorie = new Categorie();
                
                categorie.setId_categorie(rSet.getInt("id_categorie"));
                categorie.setNom_categorie(rSet.getString("nom_categorie"));
		
		return categorie;
	}
	
	


}


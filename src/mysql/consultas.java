package mysql;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import mysql.MySQLConexion;

public class consultas {
	
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	consultas consultas = null;
	
	public void iniciar(){
		try {
			con = MySQLConexion.getConection();
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Error al iniciar conexion");
		}
	}
	 
	
	public void reset(){
		try {
			if(con!=null)con.close();
			if(st!=null)st.close();
			if(rs!=null)rs.close();
			if(pst!=null)pst.close();
		} catch (SQLException e2) {
			JOptionPane.showMessageDialog(null, "Error al resetear conexion");
		}
	}
	
	public ResultSet cargarComponentes() {
		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM tb_componente");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error en consulta, al cargar Componentes: " + e);
		}
		return rs;
	}
	
	public ResultSet cargarKDC() {
		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM tb_kitdecambio");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error en consulta, al cargar Componentes: " + e);
		}
		return rs;
	}

}

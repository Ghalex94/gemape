import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import mysql.consultas;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eqp7495 extends JInternalFrame implements ActionListener {
	private JTable tbKDC;
	private JTable tbRecursos;
	private JTable tbHH;
	private JTextField txtImagen;
	private JTextField txtImagen_1;
	private JComboBox cbComponentes;
	private JButton btnBuscar;
	
	ResultSet rs = null;
	consultas consulta = new consultas();
	DefaultTableModel dtm = new DefaultTableModel();
	JTable tb;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eqp7495 frame = new Eqp7495();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Eqp7495() {
		setClosable(true);
		setResizable(true);
		setBounds(100, 100, 1170, 690);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EQUIPO 7495");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(25, 21, 724, 43);
		getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 175, 350, 243);
		getContentPane().add(scrollPane);
		
		tbKDC = new JTable();
		scrollPane.setViewportView(tbKDC);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(399, 175, 350, 243);
		getContentPane().add(scrollPane_1);
		
		tbRecursos = new JTable();
		scrollPane_1.setViewportView(tbRecursos);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(774, 175, 350, 243);
		getContentPane().add(scrollPane_2);
		
		tbHH = new JTable();
		scrollPane_2.setViewportView(tbHH);
		
		txtImagen = new JTextField();
		txtImagen.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		txtImagen.setHorizontalAlignment(SwingConstants.CENTER);
		txtImagen.setText("imagen 1");
		txtImagen.setBounds(81, 429, 450, 220);
		getContentPane().add(txtImagen);
		txtImagen.setColumns(10);
		
		txtImagen_1 = new JTextField();
		txtImagen_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		txtImagen_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtImagen_1.setText("imagen 2");
		txtImagen_1.setColumns(10);
		txtImagen_1.setBounds(614, 429, 450, 220);
		getContentPane().add(txtImagen_1);
		
		cbComponentes = new JComboBox();
		cbComponentes.setBorder(new LineBorder(new Color(30, 144, 255)));
		cbComponentes.setBounds(194, 104, 431, 31);
		getContentPane().add(cbComponentes);
		
		JLabel lblNewLabel_1 = new JLabel("Componente:");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel_1.setBounds(25, 104, 159, 31);
		getContentPane().add(lblNewLabel_1);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(this);
		btnBuscar.setBackground(new Color(30, 144, 255));
		btnBuscar.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnBuscar.setBounds(635, 104, 114, 31);
		getContentPane().add(btnBuscar);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(774, 0, 380, 135);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Nuevo componente");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnNewButton_1.setBounds(10, 11, 162, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kit de cambio");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(25, 147, 350, 31);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Recursos");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(399, 146, 350, 31);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Horas hombre");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel_1_1_2.setBounds(774, 147, 350, 31);
		getContentPane().add(lblNewLabel_1_1_2);

		cargar();
	}
	
	private void cargar() {
		tb = this.tbKDC;
		tb.setRowHeight(30);
		tb.setModel(dtm);
		
		// CARGAR COMBOBOX
		consulta.iniciar();
		rs = consulta.cargarComponentes();
		try {
			while (rs.next())
				cbComponentes.addItem(rs.getString("nombreComp"));
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR al cargar combo: " + e);
		}
		finally {
			try {
				if (rs != null)
					rs.close();
				if (consulta != null)
					consulta.reset();
            } catch (Exception ex) {
            	JOptionPane.showMessageDialog(null, "Error al cerrar consulta");
            }
		}
		//
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(e);
		}
	}
	
	protected void actionPerformedBtnBuscar(ActionEvent e) {
		List<String> listKDCTitulo = new ArrayList<String>();
        listKDCTitulo.add("REF");
        listKDCTitulo.add("CANT");
        listKDCTitulo.add("UNI");
        listKDCTitulo.add("N/P");
        listKDCTitulo.add("N/P SAP");
        listKDCTitulo.add("SD");
        listKDCTitulo.add("DESC");
        String[] columnasKDC = listKDCTitulo.toArray(new String[listKDCTitulo.size()]); // CONVERTIR ARRAYLIST EN ARRAY
		dtm.setColumnIdentifiers(columnasKDC);
				
		try {
			consulta.iniciar();
			rs = consulta.cargarKDC();
			
			while (rs.next()){
				List<String> listKDCDetalle = new ArrayList<String>();
		        listKDCDetalle.add(rs.getString("referencia"));
		        listKDCDetalle.add(rs.getString("cantidad"));
		        listKDCDetalle.add(rs.getString("unidad"));
		        listKDCDetalle.add(rs.getString("nparte"));
		        listKDCDetalle.add(rs.getString("npartesap"));
		        listKDCDetalle.add(rs.getString("sc"));
		        listKDCDetalle.add(rs.getString("descripcion"));
		        
		        String[] columnasProds = listKDCDetalle.toArray(new String[listKDCDetalle.size()]); // CONVERTIR ARRAYLIST EN ARRAY
				dtm.addRow(columnasProds); // AGREGAMOS A LA LISTA
			}	
	        
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR DATOS2: " + e2);
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (consulta != null)
					consulta.reset();
            } catch (Exception ex) {
            	JOptionPane.showMessageDialog(null, "Error al cerrar consulta");
            }
		}
		
		
	}
}














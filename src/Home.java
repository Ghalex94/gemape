import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Home extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panelEquipos;
	private JPanel panelInformativo;
	private JLabel lblNewLabel;
	private JButton btnEqp7495;
	private JButton btnEqpMD6540;
	private JButton btnEqpMD6640;
	private JButton btnEqp39RH;
	private JButton btnEqp320XPC;
	private JButton btnEqp4100XPC;
	private JButton btnEqpPH2800;
	private FondoPanel fondo = new FondoPanel();
	private JLabel lblTitulo;

	private Eqp7495 eqp7495;
	private Eqp7495 eqpPH2800;
	private Eqp7495 eqp4100XPC;
	private Eqp7495 eqp320XPC;
	private Eqp7495 eqp39RH;
	private Eqp7495 eqpMD6640;
	private Eqp7495 eqpMD6540;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1390, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelEquipos = new JPanel();
		panelEquipos.setBackground(new Color(30, 144, 255));
		panelEquipos.setBounds(0, 0, 200, 701);
		contentPane.add(panelEquipos);
		panelEquipos.setLayout(null);

		panelInformativo = new FondoPanel();
		panelInformativo.setBackground(Color.DARK_GRAY);
		panelInformativo.setBounds(200, 0, 1171, 701);
		contentPane.add(panelInformativo);

		lblTitulo = new JLabel("<html><center>SISTEMA DE GESTI\u00D3N DE<br>MAQUINARIA PESADA</center></html>");
		lblTitulo.setFont(new Font("Tw Cen MT", Font.BOLD, 50));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(320, 20, 550, 200);
		lblTitulo.setForeground(Color.WHITE);
		panelInformativo.add(lblTitulo);
		panelInformativo.setLayout(null);

		lblNewLabel = new JLabel("EQUIPOS:");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 11, 180, 41);
		panelEquipos.add(lblNewLabel);

		btnEqp7495 = new JButton("7495");
		btnEqp7495.addActionListener(this);
		btnEqp7495.setForeground(Color.WHITE);
		btnEqp7495.setBackground(new Color(51, 51, 51));
		btnEqp7495.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnEqp7495.setBounds(0, 58, 200, 50);
		panelEquipos.add(btnEqp7495);

		btnEqpMD6540 = new JButton("MD6540");
		btnEqpMD6540.addActionListener(this);
		btnEqpMD6540.setForeground(Color.WHITE);
		btnEqpMD6540.setBackground(Color.DARK_GRAY);
		btnEqpMD6540.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnEqpMD6540.setBounds(0, 119, 200, 50);
		panelEquipos.add(btnEqpMD6540);

		btnEqpMD6640 = new JButton("MD6640");
		btnEqpMD6640.addActionListener(this);
		btnEqpMD6640.setForeground(Color.WHITE);
		btnEqpMD6640.setBackground(Color.DARK_GRAY);
		btnEqpMD6640.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnEqpMD6640.setBounds(0, 180, 200, 50);
		panelEquipos.add(btnEqpMD6640);

		btnEqp39RH = new JButton("39RH");
		btnEqp39RH.addActionListener(this);
		btnEqp39RH.setForeground(Color.WHITE);
		btnEqp39RH.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnEqp39RH.setBackground(Color.DARK_GRAY);
		btnEqp39RH.setBounds(0, 241, 200, 50);
		panelEquipos.add(btnEqp39RH);

		btnEqp320XPC = new JButton("320XPC");
		btnEqp320XPC.addActionListener(this);
		btnEqp320XPC.setForeground(Color.WHITE);
		btnEqp320XPC.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnEqp320XPC.setBackground(Color.DARK_GRAY);
		btnEqp320XPC.setBounds(0, 302, 200, 50);
		panelEquipos.add(btnEqp320XPC);

		btnEqp4100XPC = new JButton("4100XPC");
		btnEqp4100XPC.addActionListener(this);
		btnEqp4100XPC.setForeground(Color.WHITE);
		btnEqp4100XPC.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnEqp4100XPC.setBackground(Color.DARK_GRAY);
		btnEqp4100XPC.setBounds(0, 363, 200, 50);
		panelEquipos.add(btnEqp4100XPC);

		btnEqpPH2800 = new JButton("P&H 2800");
		btnEqpPH2800.addActionListener(this);
		btnEqpPH2800.setForeground(Color.WHITE);
		btnEqpPH2800.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnEqpPH2800.setBackground(Color.DARK_GRAY);
		btnEqpPH2800.setBounds(0, 424, 200, 50);
		panelEquipos.add(btnEqpPH2800);

		cargar();
	}

	private void cargar() {
		// this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
	}

	class FondoPanel extends JPanel {
		private ImageIcon imgFondo;

		@Override
		public void paint(Graphics g) {
			imgFondo = new ImageIcon(getClass().getResource("/Electric_shovel2.jpg"));
			g.drawImage(imgFondo.getImage(), 0, 0, getWidth(), getHeight(), this);

			setOpaque(false);
			super.paint(g);
		}
	}

	public void cerrarVentanas() {
		panelInformativo.removeAll();
	}

	Color colorSelec = new Color(240, 67, 85);  //BXB
    //Color colorDeselec = new Color(30, 144, 255);
    Color colorDeselec = new Color(51, 51, 51);
    
	private void despintarBotones() {
		btnEqp7495.setBackground(colorDeselec);
		btnEqpPH2800.setBackground(colorDeselec);
		btnEqp4100XPC.setBackground(colorDeselec);
		btnEqp320XPC.setBackground(colorDeselec);
		btnEqp39RH.setBackground(colorDeselec);
		btnEqpMD6640.setBackground(colorDeselec);
		btnEqpMD6540.setBackground(colorDeselec);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEqp7495) {
			actionPerformedBtnEqp7495(e);
		}
		if (e.getSource() == btnEqpPH2800) {
			actionPerformedBtnEqpPH2800(e);
		}
		if (e.getSource() == btnEqp4100XPC) {
			actionPerformedBtnEqp4100XPC(e);
		}
		if (e.getSource() == btnEqp320XPC) {
			actionPerformedBtnEqp320XPC(e);
		}
		if (e.getSource() == btnEqp39RH) {
			actionPerformedBtnEqp39RH(e);
		}
		if (e.getSource() == btnEqpMD6640) {
			actionPerformedBtnEqpMD6640(e);
		}
		if (e.getSource() == btnEqpMD6540) {
			actionPerformedBtnEqpMD6540(e);
		}
	}

	protected void actionPerformedBtnEqp7495(ActionEvent e) {
		try {
			cerrarVentanas();
			eqp7495 = new Eqp7495();
			panelInformativo.add(eqp7495);
			eqp7495.show();
			eqp7495.setMaximum(true);
			despintarBotones();
			btnEqp7495.setBackground(colorSelec);
		} catch (PropertyVetoException ex) {
			JOptionPane.showMessageDialog(null, "Error al crear ventana eqp7495: " + ex);
		}
	}

	protected void actionPerformedBtnEqpMD6540(ActionEvent e) {
		try {
			cerrarVentanas();
			eqp7495 = new Eqp7495();
			panelInformativo.add(eqp7495);
			eqp7495.show();
			eqp7495.setMaximum(true);
			despintarBotones();
			btnEqpMD6540.setBackground(colorSelec);
		} catch (PropertyVetoException ex) {
			JOptionPane.showMessageDialog(null, "Error al crear ventana eqp7495: " + ex);
		}
	}

	protected void actionPerformedBtnEqpMD6640(ActionEvent e) {
		try {
			cerrarVentanas();
			eqp7495 = new Eqp7495();
			panelInformativo.add(eqp7495);
			eqp7495.show();
			eqp7495.setMaximum(true);
			despintarBotones();
			btnEqpMD6640.setBackground(colorSelec);
		} catch (PropertyVetoException ex) {
			JOptionPane.showMessageDialog(null, "Error al crear ventana eqp7495: " + ex);
		}
	}

	protected void actionPerformedBtnEqp39RH(ActionEvent e) {
		try {
			cerrarVentanas();
			eqp7495 = new Eqp7495();
			panelInformativo.add(eqp7495);
			eqp7495.show();
			eqp7495.setMaximum(true);
			despintarBotones();
			btnEqp39RH.setBackground(colorSelec);
		} catch (PropertyVetoException ex) {
			JOptionPane.showMessageDialog(null, "Error al crear ventana eqp7495: " + ex);
		}
	}

	protected void actionPerformedBtnEqp320XPC(ActionEvent e) {
		try {
			cerrarVentanas();
			eqp7495 = new Eqp7495();
			panelInformativo.add(eqp7495);
			eqp7495.show();
			eqp7495.setMaximum(true);
			despintarBotones();
			btnEqp320XPC.setBackground(colorSelec);
		} catch (PropertyVetoException ex) {
			JOptionPane.showMessageDialog(null, "Error al crear ventana eqp7495: " + ex);
		}
	}

	protected void actionPerformedBtnEqp4100XPC(ActionEvent e) {
		try {
			cerrarVentanas();
			eqp7495 = new Eqp7495();
			panelInformativo.add(eqp7495);
			eqp7495.show();
			eqp7495.setMaximum(true);
			despintarBotones();
			btnEqp4100XPC.setBackground(colorSelec);
		} catch (PropertyVetoException ex) {
			JOptionPane.showMessageDialog(null, "Error al crear ventana eqp7495: " + ex);
		}
	}

	protected void actionPerformedBtnEqpPH2800(ActionEvent e) {
		try {
			cerrarVentanas();
			eqp7495 = new Eqp7495();
			panelInformativo.add(eqp7495);
			eqp7495.show();
			eqp7495.setMaximum(true);
			despintarBotones();
			btnEqpPH2800.setBackground(colorSelec);
		} catch (PropertyVetoException ex) {
			JOptionPane.showMessageDialog(null, "Error al crear ventana eqp7495: " + ex);
		}
	}
}

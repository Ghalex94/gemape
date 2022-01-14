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


public class Home extends JFrame {

	private JPanel contentPane;
	private JPanel panelEquipos;
	private JPanel panelInformativo;
	private JLabel lblNewLabel;
	private JButton btnEqp7495;
	private JButton btnMd;
	private JButton btnMd_1;
	private JButton btnMd_2;
	private JButton btnMd_3;
	private JButton btnMd_4;
	private JButton btnMd_5;
	private FondoPanel fondo = new FondoPanel();
	private JLabel lblTitulo;
	

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
		panelEquipos.setBackground(new Color(65, 105, 225));
		panelEquipos.setBounds(0, 0, 200, 701);
		contentPane.add(panelEquipos);
		panelEquipos.setLayout(null);

		lblNewLabel = new JLabel("EQUIPOS:");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 11, 180, 41);
		panelEquipos.add(lblNewLabel);

		btnEqp7495 = new JButton("7495");
		btnEqp7495.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnEqp7495(e);
			}
		});
		btnEqp7495.setForeground(Color.WHITE);
		btnEqp7495.setBackground(new Color(220, 20, 60));
		btnEqp7495.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnEqp7495.setBounds(0, 58, 200, 50);
		panelEquipos.add(btnEqp7495);

		btnMd = new JButton("MD6540");
		btnMd.setForeground(Color.WHITE);
		btnMd.setBackground(Color.DARK_GRAY);
		btnMd.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnMd.setBounds(0, 119, 200, 50);
		panelEquipos.add(btnMd);

		btnMd_1 = new JButton("MD6640");
		btnMd_1.setForeground(Color.WHITE);
		btnMd_1.setBackground(Color.DARK_GRAY);
		btnMd_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnMd_1.setBounds(0, 180, 200, 50);
		panelEquipos.add(btnMd_1);

		btnMd_2 = new JButton("39RH");
		btnMd_2.setForeground(Color.WHITE);
		btnMd_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnMd_2.setBackground(Color.DARK_GRAY);
		btnMd_2.setBounds(0, 241, 200, 50);
		panelEquipos.add(btnMd_2);

		btnMd_3 = new JButton("320XPC");
		btnMd_3.setForeground(Color.WHITE);
		btnMd_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnMd_3.setBackground(Color.DARK_GRAY);
		btnMd_3.setBounds(0, 302, 200, 50);
		panelEquipos.add(btnMd_3);

		btnMd_4 = new JButton("4100XPC");
		btnMd_4.setForeground(Color.WHITE);
		btnMd_4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnMd_4.setBackground(Color.DARK_GRAY);
		btnMd_4.setBounds(0, 363, 200, 50);
		panelEquipos.add(btnMd_4);

		btnMd_5 = new JButton("P&H 2800");
		btnMd_5.setForeground(Color.WHITE);
		btnMd_5.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnMd_5.setBackground(Color.DARK_GRAY);
		btnMd_5.setBounds(0, 424, 200, 50);
		panelEquipos.add(btnMd_5);

		panelInformativo = new FondoPanel();
		panelInformativo.setBackground(Color.DARK_GRAY);
		panelInformativo.setBounds(200, 0, 1171, 701);
		contentPane.add(panelInformativo);
		
		lblTitulo = new JLabel("<html><center>SISTEMA DE GESTI\u00D3N<br>DE<br>MAQUINARIA PESADA</center></html>");
		lblTitulo.setFont(new Font("Tw Cen MT", Font.BOLD, 50));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(350, 20, 500, 200);
		lblTitulo.setForeground(Color.WHITE);
		panelInformativo.add(lblTitulo);
		panelInformativo.setLayout(null);

		cargar();
	}
	Eqp7495 eqp7495;
	private void cargar() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);	
		eqp7495 = new Eqp7495();
		panelInformativo.add(eqp7495);	
	}
	
	class FondoPanel extends JPanel{
		private ImageIcon imgFondo;
		
		@Override
		public void paint (Graphics g) {
			imgFondo = new ImageIcon(getClass().getResource("/Electric_shovel2.jpg"));
			g.drawImage(imgFondo.getImage(), 0, 0, getWidth(), getHeight(), this);
			
			setOpaque(false);
			super.paint(g);
		}
	}
	
	
	protected void actionPerformedBtnEqp7495(ActionEvent e) {
		
		try {
			//cerrarVentanas();
			
			
			eqp7495.show();
			eqp7495.setMaximum(true);
			//pintarBotones();
			//btnVentas.setBackground(colorSelec);
		} catch (PropertyVetoException ex) {
			JOptionPane.showMessageDialog(null, "Error al crear ventana Ventas: " + ex);
		}
	}
}

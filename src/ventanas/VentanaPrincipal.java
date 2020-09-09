package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class VentanaPrincipal {

	private JFrame frmSistemaDeGestin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frmSistemaDeGestin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaDeGestin = new JFrame();
		frmSistemaDeGestin.setTitle("Sistema de Gestión Académica - ICOP");
		frmSistemaDeGestin.setBounds(100, 100, 450, 300);
		frmSistemaDeGestin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

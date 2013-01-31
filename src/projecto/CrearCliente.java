package projecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Color;

public class CrearCliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearCliente frame = new CrearCliente();
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
	public CrearCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrearCliente = new JLabel("Crear Cliente");
		lblCrearCliente.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblCrearCliente.setBounds(172, 30, 141, 14);
		contentPane.add(lblCrearCliente);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNombre.setBounds(48, 74, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblIdentificacion = new JLabel("Identificacion");
		lblIdentificacion.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblIdentificacion.setBounds(48, 109, 83, 14);
		contentPane.add(lblIdentificacion);
		
		JLabel lblNewLabel = new JLabel("Empresa");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel.setBounds(48, 141, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblDireccion.setBounds(48, 178, 83, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblNit = new JLabel("Nit");
		lblNit.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNit.setBounds(48, 211, 46, 14);
		contentPane.add(lblNit);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(142, 72, 77, 20);
		contentPane.add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(142, 103, 77, 20);
		contentPane.add(formattedTextField_1);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setBounds(142, 139, 77, 20);
		contentPane.add(formattedTextField_2);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setBounds(142, 209, 77, 20);
		contentPane.add(formattedTextField_3);
		
		JFormattedTextField formattedTextField_4 = new JFormattedTextField();
		formattedTextField_4.setBounds(141, 176, 77, 20);
		contentPane.add(formattedTextField_4);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(212, 208, 200));
		btnAceptar.setBounds(263, 194, 91, 23);
		contentPane.add(btnAceptar);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionText);
		panel.setBounds(280, 74, 65, 67);
		contentPane.add(panel);
		
		JLabel lblLogotipo = new JLabel("Logotipo");
		lblLogotipo.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblLogotipo.setBounds(280, 145, 46, 14);
		contentPane.add(lblLogotipo);
	}
}

package projecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JEditorPane;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.io.File;

public class projectoPublipan {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					projectoPublipan window = new projectoPublipan();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public projectoPublipan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.desktop);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel.setBounds(144, 82, 63, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBackground(SystemColor.scrollbar);
		scrollBar.setBounds(426, 0, 16, 273);
		frame.getContentPane().add(scrollBar);
		
		JLabel lblClave = new JLabel("Clave:");
		lblClave.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblClave.setBounds(144, 114, 68, 14);
		frame.getContentPane().add(lblClave);
		
		JButton btnEnviar = new JButton("Aceptar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Bolsa miBolsa = new Bolsa();
				miBolsa.setVisible(true);
				miBolsa.setDefaultCloseOperation(1);
			}
		});
		btnEnviar.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnEnviar.setBounds(215, 143, 85, 23);
		frame.getContentPane().add(btnEnviar);
		
		JLabel lblPublipan = new JLabel("Publipan Quind\u00EDo");
		lblPublipan.setForeground(SystemColor.menuText);
		lblPublipan.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lblPublipan.setBounds(171, 31, 166, 14);
		frame.getContentPane().add(lblPublipan);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.activeCaption);
		separator.setBackground(SystemColor.textText);
		separator.setBounds(65, 56, 324, 2);
		frame.getContentPane().add(separator);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(217, 112, 72, 20);
		frame.getContentPane().add(passwordField);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(217, 80, 72, 20);
		frame.getContentPane().add(formattedTextField);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("imagenes"+(File.separator)+"publipan.jpg"));
		lblNewLabel_1.setBounds(65, 139, 341, 99);
		frame.getContentPane().add(lblNewLabel_1);
	}
}

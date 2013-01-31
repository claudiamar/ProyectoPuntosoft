package projecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Cursor;

public class Segunda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Segunda frame = new Segunda();
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
	public Segunda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnListadoDeClientes = new JMenu(" Clientes");
		menuBar.add(mnListadoDeClientes);
		
		JMenuItem mntmListadoDeClientes = new JMenuItem("Listado de Clientes");
		mnListadoDeClientes.add(mntmListadoDeClientes);
		
		JMenuItem mntmKkk = new JMenuItem("Crear Cliente");
		mntmKkk.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		mntmKkk.setMaximumSize(new Dimension(100, 32767));
		menuBar.add(mntmKkk);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}

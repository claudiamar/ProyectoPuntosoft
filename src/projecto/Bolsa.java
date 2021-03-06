package projecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.awt.Label;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.Canvas;
import javax.swing.JCheckBoxMenuItem;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;

public class Bolsa extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblMatrizDeEspacios;

	

	/**
	 * Create the frame.
	 */
	public Bolsa() {
		setBackground(SystemColor.desktop);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Publipan");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(268, 11, 48, 22);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBorder(UIManager.getBorder("ScrollPane.border"));
		table.setBackground(new Color(212, 208, 200));
		table.setForeground(Color.BLUE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 16, 188, 240);
		contentPane.add(table);
		
		lblMatrizDeEspacios = new JLabel("Matriz de Espacios");
		lblMatrizDeEspacios.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblMatrizDeEspacios.setBounds(216, 29, 117, 14);
		contentPane.add(lblMatrizDeEspacios);
		
		JButton btnEnviar = new JButton("Agregar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				JOptionPane.showMessageDialog(null, "Seleccione los Espacios a Reservar");
			}
		});
		btnEnviar.setBounds(299, 62, 91, 23);
		contentPane.add(btnEnviar);
		
		JButton btnEliminar = new JButton("Borrar");
		btnEliminar.setBounds(299, 96, 91, 23);
		contentPane.add(btnEliminar);
		
		JButton btnEspaciosDisponibles = new JButton("Espacios Disponibles");
		btnEspaciosDisponibles.setBounds(268, 130, 141, 23);
		contentPane.add(btnEspaciosDisponibles);
		
		JButton btnEspaciosReservados = new JButton("Espacios Reservados");
		btnEspaciosReservados.setBounds(268, 164, 141, 23);
		contentPane.add(btnEspaciosReservados);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel}));
	}
}

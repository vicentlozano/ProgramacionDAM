import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class actividad_bailando extends JFrame {

	private JPanel contentPane;
	private JTextField campoTextoIzquierda;
	private JTextField campoTextoDerecha;

	/**
	 * Lanzamos la aplicación
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					actividad_bailando frame = new actividad_bailando();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creamos el Frame.
	 */
	public actividad_bailando() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		//Aqui tenemos el ContentPane
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Caja para poner el texto de la izquierda
		
		campoTextoIzquierda = new JTextField();
		campoTextoIzquierda.setBounds(30, 109, 146, 26);
		contentPane.add(campoTextoIzquierda);
		campoTextoIzquierda.setColumns(10);
		
		// Caja para poner el texto de la derecha
		
		campoTextoDerecha = new JTextField();
		campoTextoDerecha.setBounds(251, 109, 146, 26);
		contentPane.add(campoTextoDerecha);
		campoTextoDerecha.setColumns(10);
		
		//Boton dirección derecha
		
		JButton btnNewButton = new JButton("PASAR");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Si se aprieta el boton , coje el texto de la caja izquierda y lo pasa a la caja de la derecha
				campoTextoDerecha.setText(campoTextoIzquierda.getText());
				//Deja en blanco la caja de la Izquierda
				campoTextoIzquierda.setText("");
			}
		});
			
		
		btnNewButton.setBounds(152, 32, 115, 29);
		contentPane.add(btnNewButton);
		
		//Boton dirección izquierda
		
		JButton btnNewButton_1 = new JButton("VOLVER");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Si se aprieta el boton , coje el texto de la caja derecha y lo pasa a la caja de la izquierda
				campoTextoIzquierda.setText(campoTextoDerecha.getText());
				//Deja en blanco la caja de la Derecha
				campoTextoDerecha.setText("");
			}
		});
		btnNewButton_1.setBounds(152, 181, 115, 29);
		contentPane.add(btnNewButton_1);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;
import javax.swing.JTextField;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtJuego;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//Generamos nuevo jugador//
		
		Jugador jugador1=new Jugador();
		jugador1.setNombre("Vicent");
		jugador1.setApellido1("Lozano");
		jugador1.setApellido2("Hervas");
		jugador1.setEdad(23);
		jugador1.setId(12);
		System.out.println(jugador1.toString());
	
	
	 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		txtJuego = new JTextField();
		txtJuego.setText(	"JUEGO");
		panel.add(txtJuego);
		txtJuego.setColumns(10);
	}

}

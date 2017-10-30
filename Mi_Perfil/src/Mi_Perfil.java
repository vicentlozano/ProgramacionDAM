import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public   class Mi_Perfil extends JFrame {

	private JPanel contenedor;
	private JTextField etiquetaNombre;
	private JTextField etiquetaApellidos;
	private JTextField etiquetaEdad;
	private JTextField etiquetaCorreo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mi_Perfil frame = new Mi_Perfil();
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
	public Mi_Perfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contenedor = new JPanel();
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedor);
		contenedor.setLayout(null);
		
		etiquetaNombre = new JTextField("Vicent");
		etiquetaNombre.setBounds(15, 31, 185, 26);
		contenedor.add(etiquetaNombre);
		etiquetaNombre.setColumns(10);
		
		JLabel cajaNombre = new JLabel("Nombre");
		cajaNombre.setBounds(15, 10, 69, 20);
		contenedor.add(cajaNombre);
		
		JLabel cajaApellidos = new JLabel("Apellidos");
		cajaApellidos.setBounds(15, 65, 69, 20);
		contenedor.add(cajaApellidos);
		
		etiquetaApellidos = new JTextField("Lozano Hervàs");
		etiquetaApellidos.setBounds(15, 86, 185, 26);
		contenedor.add(etiquetaApellidos);
		etiquetaApellidos.setColumns(10);
		
		JLabel cajaEdad = new JLabel("Edad");
		cajaEdad.setBounds(15, 120, 69, 20);
		contenedor.add(cajaEdad);
		
		etiquetaEdad = new JTextField("23");
		etiquetaEdad.setBounds(15, 141, 185, 26);
		contenedor.add(etiquetaEdad);
		etiquetaEdad.setColumns(10);
		
		JLabel cajaCorreo = new JLabel("Correo");
		cajaCorreo.setBounds(15, 175, 69, 20);
		contenedor.add(cajaCorreo);
		
		etiquetaCorreo = new JTextField("lozanodroid@gmail.com");
		etiquetaCorreo.setBounds(15, 196, 185, 26);
		contenedor.add(etiquetaCorreo);
		etiquetaCorreo.setColumns(10);
	}
}

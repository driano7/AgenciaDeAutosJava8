//package AgenciaDeAutos;
//Interfaz_Final
import java.util.Scanner;
import java.util.UUID;
import javax.swing.ImageIcon;
import java.io.*;
import java.awt.Desktop;
//MIOS
import java.awt.HeadlessException;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

/**
 * Clase de tipo pública para administrador que invoca a la interfaz JFrame
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class Administrador extends JFrame{

	private JPanel contentPane;
	Scanner sc = new Scanner(System.in);		
	boolean adminValid = false;
	boolean pwdAdminValid = false;
	boolean adminValidExtra = false;
	boolean pwdAdminValidExtra = false;
	int opcion,opcion2;
	String salto = "\n";
	String separador = ";";
	String textoUsuario,textoContra,guardar,guardarContra;

    /**
     *
     * 
     * @throws HeadlessException
     */
    public Administrador()throws HeadlessException{
		final InicioSesion inicio = new InicioSesion();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAdm = new JLabel("Bienvenido Administrador");
		lblAdm.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblAdm.setBounds(80,100,280,30);//((-)<-->(+)/(baja-sube)/(exp)/¿?)
		contentPane.add(lblAdm);


		JLabel lblOp = new JLabel("Desea realizar");
		lblOp.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblOp.setBounds(140,160,280,30);//((-)<-->(+)/(baja-sube)/(exp)/¿?)
		contentPane.add(lblOp);

		JButton btnUsuario = new JButton("Agregar Usuario");
		btnUsuario.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				try{

					File fileUsuario = new File("Accesos/Usuarios.txt");
					textoUsuario = JOptionPane.showInputDialog("Escriba el nombre del usuario:");

					guardar = salto+textoUsuario+separador;
					FileWriter fw = new FileWriter(fileUsuario.getAbsoluteFile(),true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter salida = new PrintWriter(bw);
					salida.println(guardar);
					salida.close();

					File fileContraUsuario = new File("Accesos/ContrasUsuarios.txt");
					textoContra = JOptionPane.showInputDialog("Escriba la Contraseña del usuario:");

					guardarContra = salto+textoContra+separador;
					FileWriter fwContra = new FileWriter(fileContraUsuario.getAbsoluteFile(),true);
					BufferedWriter bwContra = new BufferedWriter(fwContra);
					PrintWriter salidaContra = new PrintWriter(bwContra);
					salidaContra.println(guardarContra);
					salidaContra.close();	

					JOptionPane.showMessageDialog(null,"Validando Datos Ingresados");
					Thread.sleep(2000);
					JOptionPane.showMessageDialog(null,"Datos guardados correctamente");													
					System.exit(0);
			
				}catch(RuntimeException a){
					System.out.println("Ingrese un Dato válido por favor");
					System.exit(0);
				}catch(FileNotFoundException b){
					System.out.println("\n\nError al abrir o guardar el archivo:");
				}
				catch (IOException ioe){
					System.out.println("\n\nError al abrir o guardar el archivo:");
				}catch(InterruptedException exc){
					System.out.println("No se podido abrir el pdf");
				}

			}
		});
		dispose();
		btnUsuario.setBounds(40, 290, 117, 35); //(el segundo)
		contentPane.add(btnUsuario);

		
		JButton btnAdm = new JButton("Agregar Administrador");
		btnAdm.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				try{
					File fileAdmin = new File("Accesos/Administradores.txt");
					textoUsuario = JOptionPane.showInputDialog(null,"Escriba el nombre del administrador:");

					guardar = salto+textoUsuario+separador;
					FileWriter fwAdmin = new FileWriter(fileAdmin.getAbsoluteFile(),true);
					BufferedWriter bwAdmin = new BufferedWriter(fwAdmin);
					PrintWriter salidaAdmin = new PrintWriter(bwAdmin);
					salidaAdmin.println(guardar);
					salidaAdmin.close();

					File fileAdminContra = new File ("Accesos/ContrasAdmins.txt");
					textoUsuario = JOptionPane.showInputDialog(null,"Escriba la contraseña del administrador:");

					guardarContra = salto+textoContra+separador;
					FileWriter fwContraAdmin = new FileWriter(fileAdminContra.getAbsoluteFile(),true);
					BufferedWriter bwContraAdmin = new BufferedWriter(fwContraAdmin);
					PrintWriter salidaContraAdmin = new PrintWriter(bwContraAdmin);
					salidaContraAdmin.println(guardarContra);
					salidaContraAdmin.close();

					JOptionPane.showMessageDialog(null,"Validando Datos Ingresados");
					Thread.sleep(2000);								
					JOptionPane.showMessageDialog(null,"Datos guardados correctamente");
					System.exit(0);
					
				}catch(RuntimeException a){
					System.out.println("Ingrese un Dato válido por favor");
					System.exit(0);
				}catch(FileNotFoundException b){
					System.out.println("\n\nError al abrir o guardar el archivo:");
				}
				catch (IOException ioe){
					System.out.println("\n\nError al abrir o guardar el archivo:");
				}catch(InterruptedException exc){
					System.out.println("No se podido abrir el pdf");
				}

			}
		});
		dispose();
		btnAdm.setBounds(180, 290, 170, 35); //(el segundo)
		contentPane.add(btnAdm);


		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener(){
                        @Override
			public void actionPerformed(ActionEvent e){
				inicio.setVisible(true);
				dispose();
			}
		});
		btnMenu.setBounds(290, 0, 90, 29);
		contentPane.add(btnMenu);

	}

}

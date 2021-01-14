//Interfaz_Final
//package AgenciaDeAutos;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.ImageIcon;
import java.io.*;
import java.awt.Desktop;
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
 * Clase para iniciar sesión en el programa y observar el catalogo en donde estan todos los tipos de autos
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class InicioSesion extends JFrame{
	//ANEXO 1
	private JFrame getFrame(){
		return this;
	}
	private int numIntentos = 5;
	private JPanel contentPane;
	private JPasswordField password;
	private JTextField textUsuario;
	boolean adminValid = false;
	boolean pwdAdminValid = false;
	boolean userValid = false;
	boolean pwdUserValid = false;		
	int opciones,extra,login,sup;
	Scanner sc = new Scanner(System.in);
	Catalogo catalogo = new Catalogo();
		
    /**
     *Constructor por defecto de la clase InicioSesion. En este método puede surgir una excepcion por ese motivo utilizamos la palabra reservada throws 
     * @throws HeadlessException
     */
    public InicioSesion() throws HeadlessException{

		setTitle("Agencia de Autos - Inicio de Sesión ");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAnuncio = new JLabel("Agencia de Autos 'The Racer’s Edge'");
		lblAnuncio.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblAnuncio.setBounds(30,100,335,30);//((-)<-->(+)/(baja-sube)/(exp)/¿?)
		contentPane.add(lblAnuncio);

		String user;
		String passwordUser;

		//BOTON SALIR LISTO 
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(290, 0, 90, 29);
		contentPane.add(btnSalir);

		//BOTON QUE ENTRA AL CATALOGO DONDE ESTAN TODOS LOS TIPOS DE AUTOS (LUJPO,VAN,HASH)
		JButton btnIngresar = new JButton("Iniciar Sesion como Usuario");
		btnIngresar.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				try{
					String user;
					user = JOptionPane.showInputDialog("ID Usuario");
					String passwordUser;
					passwordUser = JOptionPane.showInputDialog("Password: ");

					final BufferedReader usuario = new BufferedReader (new FileReader("Accesos/Usuarios.txt"));
					final BufferedReader passUsuario = new BufferedReader (new FileReader ("Accesos/ContrasUsuarios.txt"));

					String lineaUsuario= "";
						while ((lineaUsuario = usuario.readLine())!=null){
							if (lineaUsuario.indexOf(";")!=-1){
								if (lineaUsuario.split(";")[0].equalsIgnoreCase(user)){
									userValid = true;
								}
							}
						}

						String lineaUserPass = "";
						while ((lineaUserPass = passUsuario.readLine())!=null){
							if (lineaUserPass.indexOf(";")!=-1){
								if (lineaUserPass.split(";")[0].equalsIgnoreCase(passwordUser)){
									pwdUserValid = true;
								}
							}
						}
						JOptionPane.showMessageDialog(null,"Validando Datos Ingresados\nDa click en Aceptar");			
						Thread.sleep(2000);								
					
						if (userValid == true && pwdUserValid == true) {
							JOptionPane.showMessageDialog(null,"Usuario Correcto.\nBienvenido al sistema.");
							catalogo.setVisible(true);
							dispose();
						}
						else {
							numIntentos--;
							JOptionPane.showMessageDialog(null,"Usuario Incorrecto.\nTienes "+numIntentos+" intentos");
							if(numIntentos <= 0) {
								JOptionPane.showMessageDialog(null,"Cuenta Bloquedad.");
								System.exit(0);
						}
			
						usuario.close();
						passUsuario.close();				
					}
				
				}catch(FileNotFoundException vlv){
					System.out.println("\n\nError al abrir o guardar el archivo:");
					vlv.printStackTrace();
				}catch (IOException ioe){
					System.out.println("\n\nError al abrir o guardar el archivo:");
					ioe.printStackTrace();
				}catch(InterruptedException exc){
					System.out.println("No se podido abrir el pdf");
				}
			}

		});

		btnIngresar.setBounds(75, 255, 250, 35);
		contentPane.add(btnIngresar);


		//Administrador admi = new Administrador();
		JButton btnAdmi = new JButton("Administrador");
		btnAdmi.addActionListener(new ActionListener(){
                        @Override
			public void actionPerformed(ActionEvent e){
				try{

					String admin;
					admin = JOptionPane.showInputDialog("ID Administrador");
					String passwordAdmin;
					passwordAdmin = JOptionPane.showInputDialog("Password: ");

					final BufferedReader administrador = new BufferedReader (new FileReader("Accesos/Administradores.txt"));
					final BufferedReader passAdministrador = new BufferedReader (new FileReader ("Accesos/ContrasAdmins.txt"));

					String lineaAdmin= "";
					while ((lineaAdmin = administrador.readLine())!=null){
						if (lineaAdmin.indexOf(";")!=-1){
							if (lineaAdmin.split(";")[0].equalsIgnoreCase(admin)){
								JOptionPane.showMessageDialog(null,"Se encontró el administrador");
								adminValid = true;
							}
						}
					}

					String lineaPassAdmin = "";
					while ((lineaPassAdmin = passAdministrador.readLine())!=null){
						if (lineaPassAdmin.indexOf(";")!=-1){
							if (lineaPassAdmin.split(";")[0].equalsIgnoreCase(passwordAdmin)){
								pwdAdminValid = true;
							}
						}
					}
					JOptionPane.showMessageDialog(null,"Validando Datos Ingresados");
					Thread.sleep(2000);								
			
					if (adminValid == true && pwdAdminValid == true) {
						Administrador admi = new Administrador(){
                                                @Override
						public void dispose(){
						getFrame().setVisible(true);
						super.dispose();
						}
					};
					admi.setVisible(true);
					dispose();
					}else {
						JOptionPane.showMessageDialog(null,"Acceso Denegado\nNo se encontró el usuario o la contraseña");
						System.exit(0);
					}			
					administrador.close();
					passAdministrador.close();

				}catch(RuntimeException a){
					System.out.println("Ingrese un Dato válido por favor");
					System.exit(0);
				}catch(FileNotFoundException f){
					System.out.println("\n\nError al abrir o guardar el archivo:");
				}
				catch (IOException ioe){
					System.out.println("\n\nError al abrir o guardar el archivo:");
				}catch(InterruptedException exc){
					System.out.println("No se podido abrir el pdf");
				}	
		
			}
		});
		btnAdmi.setBounds(40, 350, 135, 35);
		contentPane.add(btnAdmi);

		
		//SuperAdm superAdm = new SuperAdm();
		JButton btnSuperA = new JButton("Super Administrador");
		btnSuperA.addActionListener(new ActionListener(){
                        @Override
			public void actionPerformed(ActionEvent e){
				
				String superID;
				String superContra;
		
				try{
					superID = JOptionPane.showInputDialog("ID Super Usuario: ");
					superContra = JOptionPane.showInputDialog("Password: ");

					String compaSuper = "EdgarTistaGarcia";
					String compaSuperAdmin = "ProgramacionOrientadaAObjetos";

					JOptionPane.showMessageDialog(null,"Validando Datos Ingresados\nDa click en Aceptar");			
					Thread.sleep(2000);								
					
					if (superID.equals(compaSuper) == true && superContra.equals(compaSuperAdmin) == true) {
							SuperAdm superAdm = new SuperAdm(){
                                                                @Override
								public void dispose(){
								getFrame().setVisible(true);
								super.dispose();
								}
							};
							superAdm.setVisible(true);
							dispose();

					}else {
						numIntentos--;
							JOptionPane.showMessageDialog(null,"Usuario Incorrecto.\nTienes "+numIntentos+" intentos");
							if(numIntentos <= 0) {
								JOptionPane.showMessageDialog(null,"Cuenta Bloquedad.");
								System.exit(0);
							}
						}

					}catch(InterruptedException exc){
					}	

			}
		});
		btnSuperA.setBounds(190, 350, 180, 35);
		contentPane.add(btnSuperA);

		
		JButton btnManual = new JButton("Manual de usuario ");
		btnManual.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				try{
					JOptionPane.showMessageDialog(null,"Cargando el manual\nDa click en Aceptar");			
					Thread.sleep(3000);						
					File path = new File ("Manual/ManualUsuario.pdf");
					Desktop.getDesktop().open(path);
					//dispose();
					//System.exit(0);
				}catch (IOException ioe){
					System.out.println("\n\nError al abrir o guardar el archivo:");
				}catch(InterruptedException exc){
				}	
			}	
		}); 
		btnManual.setBounds(50, 480, 270, 35);
		contentPane.add(btnManual);

		}

}

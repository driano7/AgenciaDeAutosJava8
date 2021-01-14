//Interfaz_Final
//package AgenciaDeAutos;
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
 * Clase para el super administrador. Esta clase esta creada para el inicio se sesión exclusivamente del profesor en donde podrá ver las minutas del equipo y el trabajo escrito
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class SuperAdm extends JFrame{

	private JPanel contentPane;

    /**
     *Constructor por defecto de la clase SuperAdm. En este método puede surgir una excepcion por ese motivo utilizamos la palabra reservada throws para tratar la excepción
     * @throws HeadlessException
     */
    public SuperAdm()throws HeadlessException{
		final InicioSesion inicio = new InicioSesion();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAdm = new JLabel("BIENVENIDO ING.EDGAR GARCIA TISTA");
		lblAdm.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblAdm.setBounds(20,100,420,30);//((-)<-->(+)/(baja-sube)/(exp)/¿?)
		contentPane.add(lblAdm);

		JLabel lblEscrito = new JLabel("Trabajo Escrito");
		lblEscrito.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblEscrito.setBounds(127,180,280,30);//((-)<-->(+)/(baja-sube)/(exp)/¿?)
		contentPane.add(lblEscrito);

		JButton btnEscrito = new JButton("Mostrar");
		btnEscrito.addActionListener(new ActionListener() {
                                @Override
				public void actionPerformed(ActionEvent e) {
					try{
						JOptionPane.showMessageDialog(null,"Cargando el Trabajo Escrito\nDe click en Aceptar");			
						Thread.sleep(3000);						
						File path = new File ("Manual/TrabajoEscrito.pdf");
						Desktop.getDesktop().open(path);
						dispose();
						//System.exit(0);
					}catch (IOException ioe){
						System.out.println("\n\nError al abrir o guardar el archivo:");
					}catch(InterruptedException exc){
						System.out.println("No se pudo abrir el archivo");
					}					

				}
			});
		btnEscrito.setBounds(120, 220, 117, 35); //(el segundo)
		contentPane.add(btnEscrito);

		
		JLabel lblMinutas = new JLabel("Minutas De Equipo");
		lblMinutas.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblMinutas.setBounds(115,280,280,30);//((-)<-->(+)/(baja-sube)/(exp)/¿?)
		contentPane.add(lblMinutas);

		JButton btnMinutas = new JButton("Mostar");
		btnEscrito.addActionListener(new ActionListener() {
                                @Override
				public void actionPerformed(ActionEvent e) {
					try{
						JOptionPane.showMessageDialog(null,"Cargando las minutas\nDe click en Aceptar");			
						Thread.sleep(3000);						
						File pathMinutas = new File ("Manual/minutas2.pdf");
						Desktop.getDesktop().open(pathMinutas);
						dispose();
						//System.exit(0);
					}catch (IOException io){
						System.out.println("\n\nError al abrir o guardar el archivo:");
					}catch(InterruptedException ex){
						System.out.println("No se pudo abrir el archivo");
					}					

				}
			});
		btnMinutas.setBounds(120, 320, 117, 35); //(el segundo)
		contentPane.add(btnMinutas);


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


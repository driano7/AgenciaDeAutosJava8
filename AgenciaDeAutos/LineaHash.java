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
 * Clase que muestra en pantalla todos los datos de los autos Hashback (Mazda, Nissan, Toyota)
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class LineaHash extends JFrame{

	private JPanel contentPane;

    /**
     *Constructor por defecto de la clase LineaHash. En este método puede surgir una excepcion por ese motivo utilizamos la palabra reservada throws para tratar la excepción
     * @throws HeadlessException
     */
    public LineaHash()throws HeadlessException{
		final Catalogo catalogo = new Catalogo();
		AutoHash hash = new AutoHash();
		ImagenHash mostrarHash = new ImagenHash();				
		String claveManual4,claveManual5, claveManual6;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(130, 130, 410, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(8, 8, 8, 8));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMenu = new JLabel("Linea Hash 'The Racer's Edge");
		lblMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblMenu.setBounds(110,30,280,30);//((-)<-->(+)/(baja-sube)/(exp)/¿?)
		contentPane.add(lblMenu);

		JButton btnInfoM = new JButton("Mazda ");
		btnInfoM.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null,"La información del Mazda se desplegará en terminal");													
				System.out.println("\n\n");	
				hash.marca("Mazda");
				hash.modelo("6");
				hash.ano("2019");
				//System.out.println("El serial del Mazda es: ");
				//claveManual4 = UUID.randomUUID().toString().toUpperCase();
				//hash.serial(claveManual4);
				hash.velocidadMazda();
				hash.rendimientoMazda();
				hash.precioMazda();
				hash.sistemaMazda();
				hash.controlMazda();
				hash.equipadoMazda();

				System.out.println("\n\n");	

			}	
		}); 


		btnInfoM.setBounds(100,120,100,35); 
		contentPane.add(btnInfoM);

		JButton btnImgM = new JButton("Mostrar");
		btnImgM.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {

				try{
				Thread.sleep(1500);						
				mostrarHash.mostrarVentanaMazda();
				}catch(InterruptedException exc){
				}

			}	
		}); 

		btnImgM.setBounds(250, 120, 90, 35); 
		contentPane.add(btnImgM);


		JButton btnInfoN = new JButton("Nissan 370Z");
		btnInfoN.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null,"La información del 370Z se desplegará en terminal");													
				System.out.println("\n\n");				
				hash.marca("Nissan");
				hash.modelo("370Z");
				hash.ano("2019");
				//System.out.println("El serial del Nisan es: ");
				//claveManual5 = UUID.randomUUID().toString().toUpperCase();
				//hash.serial(claveManual5);
				hash.velocidadNissan();
				hash.rendimientoNissan();
				hash.precioNissan();
				hash.sistemaNissan();
				hash.controlNissan();
				hash.equipadoNissan();
				
				System.out.println("\n\n");										

			}	
		}); 

		btnInfoN.setBounds(100,220,90,35); 
		contentPane.add(btnInfoN);


		JButton btnImgN = new JButton("Mostrar");
		btnImgN.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				try{
				Thread.sleep(1500);						
				mostrarHash.mostrarVentanaNissan();
				}catch(InterruptedException exc){
				}

			}	
		}); 
		btnImgN.setBounds(250, 220, 90, 35); //(el segundo)
		contentPane.add(btnImgN);


		JButton btnInfoT = new JButton("Toyota");
		btnInfoT.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"La información del Toyota se desplegará en terminal");													
				System.out.println("\n\n");	
				
				hash.marca("Toyota");
				hash.modelo("RAV4");
				hash.ano("2019");
				//System.out.println("El serial del Toyota es: ");
				//claveManual6 = UUID.randomUUID().toString().toUpperCase();
				//hash.serial(claveManual6);
				hash.velocidadToyota();
				hash.rendimientoToyota();
				hash.precioToyota();
				hash.sistemaToyota();
				hash.controlToyota();
				hash.equipadoToyota();
														
				System.out.println("\n\n");	
				
			}	
		}); 

		btnInfoT.setBounds(100, 360, 90, 35);
		contentPane.add(btnInfoT);

		

		JButton btnImgT = new JButton("Mostrar ");
		btnImgT.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {

				try{
				Thread.sleep(1500);						
				mostrarHash.mostrarVentanaToyota();
				}catch(InterruptedException exc){
				}


			}	
		}); 

		btnImgT.setBounds(250, 360, 90, 35);
		contentPane.add(btnImgT);

		JButton btnMenu = new JButton("Catalogo");
		btnMenu.addActionListener(new ActionListener(){
                        @Override
			public void actionPerformed(ActionEvent e){
				catalogo.setVisible(true);
				dispose();
			}
		});
		btnMenu.setBounds(290, 0, 100, 29);
		contentPane.add(btnMenu);
	}

}

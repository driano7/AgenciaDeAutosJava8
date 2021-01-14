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
 * Clase que muestra en pantalla todos los datos de los autos Van (Volkswagen, Dodge, GMC)
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class LineaVan extends JFrame{

	private JPanel contentPane;

    /**
     *Constructor por defecto de la clase LineaVan. En este método puede surgir una excepcion por ese motivo utilizamos la palabra reservada throws para tratar la excepción
     * @throws HeadlessException
     */
    public LineaVan()throws HeadlessException{
		final Catalogo catalogo = new Catalogo();
		AutoVan van = new AutoVan();
		ImagenVan mostrarVan = new ImagenVan();	
		String claveManual7,claveManual8, claveManual9;		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(130, 130, 410, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(8, 8, 8, 8));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMenu = new JLabel("Linea Van 'The Racer's Edge");
		lblMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblMenu.setBounds(110,30,280,30);//((-)<-->(+)/(baja-sube)/(exp)/¿?)
		contentPane.add(lblMenu);

		JButton btnInfoW = new JButton("Volkswagen ");
		btnInfoW.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null,"La información del Volkswagen se desplegará en terminal");													
				System.out.println("\n\n");	
				van.marca("VolksWagen");
				van.modelo("SUV Teramot");
				van.ano("2019");
				//System.out.println("El serial del VolksWagen es: ");
				//claveManual7 = UUID.randomUUID().toString().toUpperCase();
				//van.serial(claveManual7);
				van.velocidadVolksWagen();
				van.rendimientoVolksWagen();
				van.precioVolksWagen();
				van.sistemaVolksWagen();
				van.controlVolksWagen();
				van.equipadoVolksWagen();
									
				System.out.println("\n\n");	

			}	
		}); 


		btnInfoW.setBounds(100,120,100,35); 
		contentPane.add(btnInfoW);

		JButton btnImgV = new JButton("Mostrar");
		btnImgV.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {

				try{
				Thread.sleep(1500);						
				mostrarVan.mostrarVentanaVolks();
				}catch(InterruptedException exc){
				}

			}	
		}); 

		btnImgV.setBounds(250, 120, 90, 35); 
		contentPane.add(btnImgV);


		JButton btnInfoD = new JButton("Dodge");
		btnInfoD.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null,"La información de la Durango se desplegará en terminal");													
				System.out.println("\n\n");				
				van.marca("Dodge");
				van.modelo("Durango");
				van.ano("2019");
				//System.out.println("El serial del Dodge es: ");
				//claveManual8 = UUID.randomUUID().toString().toUpperCase();
				//van.serial(claveManual8);
				van.velocidadDodge();
				van.rendimientoDodge();
				van.precioDodge();
				van.sistemaDodge();
				van.controlDodge();
				van.equipadoDodge();
									
				System.out.println("\n\n");										

			}	
		}); 

		btnInfoD.setBounds(100,220,90,35); 
		contentPane.add(btnInfoD);


		JButton btnImgN = new JButton("Mostrar");
		btnImgN.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				try{
				Thread.sleep(1500);						
				mostrarVan.mostrarVentanaDodge();
				}catch(InterruptedException exc){
				}

			}	
		}); 
		btnImgN.setBounds(250, 220, 90, 35); //(el segundo)
		contentPane.add(btnImgN);


		JButton btnInfoGMC = new JButton("GMC");
		btnInfoGMC.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"La información del Toyota se desplegará en terminal");													
				System.out.println("\n\n");	
				
				van.marca("GMC");
				van.modelo("Terrain");
				van.ano("2019");
				//System.out.println("El serial del GMC es: ");
				//claveManual9 = UUID.randomUUID().toString().toUpperCase();
				//van.serial(claveManual9);
				van.velocidadGMC();
				van.rendimientoGMC();
				van.precioGMC();
				van.sistemaGMC();
				van.controlGMC();
				van.equipadoGMC();
																			
				System.out.println("\n\n");	
				
			}	
		}); 

		btnInfoGMC.setBounds(100, 360, 90, 35);
		contentPane.add(btnInfoGMC);

		

		JButton btnImgGMC = new JButton("Mostrar ");
		btnImgGMC.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {

				try{
				Thread.sleep(1500);						
				mostrarVan.mostrarVentanaGMC();
				}catch(InterruptedException exc){
				}


			}	
		}); 

		btnImgGMC.setBounds(250, 360, 90, 35);
		contentPane.add(btnImgGMC);

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


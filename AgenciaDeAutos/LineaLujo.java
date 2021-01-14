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
 * Clase que muestra en pantalla todos los datos de los autos de Lujo (Porsche, Lamborghini, Ferrari)
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class LineaLujo extends JFrame{

	 JPanel contentPane;

    /**
     *Constructor por defecto de la clase LineaLujo. En este método puede surgir una excepcion por ese motivo utilizamos la palabra reservada throws para tratar la excepción
     * @throws HeadlessException
     */
    public LineaLujo()throws HeadlessException{
		final Catalogo catalogo = new Catalogo();
		AutoLujo lujo = new AutoLujo();
		ImagenLujo mostrarLujo = new ImagenLujo();
		String claveManual1,claveManual2, claveManual3;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(130, 130, 410, 580);//ACOMODA
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(8, 8, 8, 8));//HACE MAS GRANDE
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMenu = new JLabel("Linea de Lujo 'The Racer's Edge");
		lblMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblMenu.setBounds(110,30,280,30);//((-)<-->(+)/(baja-sube)/(exp)/¿?)
		contentPane.add(lblMenu);

		JButton btnInfoP = new JButton("Porsche");
		btnInfoP.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null,"La información del Porsche se desplegará en terminal");													
				System.out.println("\n\n");	
				lujo.marca("Porshe");
				lujo.modelo("Carrera 911");
				lujo.ano("2016");
				//claveManual1 = UUID.randomUUID().toString().toUpperCase();
				//lujo.serial(claveManual1);
				lujo.velocidadPorsche();
				lujo.rendimientoPorsche();
				lujo.precioPorsche();
				lujo.sistemaPorsche();
				lujo.controlPorsche();
				lujo.equipadoPorsche();
				System.out.println("\n\n");	

			}	
		}); 


		btnInfoP.setBounds(100,120,100,35); 
		contentPane.add(btnInfoP);

		JButton btnImgP = new JButton("Mostrar");
		btnImgP.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {

				try{
				Thread.sleep(1500);						
				mostrarLujo.mostrarVentanaPorsche();							
				}catch(InterruptedException exc){
				}

			}	
		}); 

		btnImgP.setBounds(250, 120, 90, 35); 
		contentPane.add(btnImgP);


		JButton btnInfoL = new JButton("Lamborghini");
		btnInfoL.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null,"La información del Lamborghini se desplegará en terminal");													
				System.out.println("\n\n");				
				lujo.marca("Lamborghini");
				lujo.modelo("Aventador Roadster");
				lujo.ano("2017");
				//System.out.println("El serial del Lamborghini es: ");
				//claveManual2 = UUID.randomUUID().toString().toUpperCase();
				//lujo.serial(claveManual2);
				lujo.velocidadLambo();
				lujo.rendimientoLambo();
				lujo.precioLambo();
				lujo.sistemaLambo();
				lujo.controlLambo();
				lujo.equipadoLambo();
				System.out.println("\n\n");										

			}	
		}); 

		btnInfoL.setBounds(50,220,180,35); 
		contentPane.add(btnInfoL);


		JButton btnImgL = new JButton("Mostrar");
		btnImgL.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				try{
				Thread.sleep(1500);						
				mostrarLujo.mostrarVentanaLambo();							
				}catch(InterruptedException exc){
				}

			}	
		}); 
		btnImgL.setBounds(250, 220, 90, 35); //(el segundo)
		contentPane.add(btnImgL);

		
		JButton btnInfoF = new JButton("Ferrari");
		btnInfoF.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"La información del Ferrari se desplegará en terminal");													
				System.out.println("\n\n");	
				
				lujo.marca("Ferrari");
				lujo.modelo("F430 Spyder");
				lujo.ano("2014");
				//System.out.println("El serial del Ferrari es: ");
				//claveManual3 = UUID.randomUUID().toString().toUpperCase();
				//lujo.serial(claveManual3);
				lujo.velocidadFerrari();
				lujo.rendimientoFerrari();
				lujo.precioFerrari();
				lujo.sistemaFerrari();
				lujo.controlFerrari();
				lujo.equipadoFerrari();
									
				System.out.println("\n\n");	
				
			}	
		}); 

		btnInfoF.setBounds(60, 360, 160, 35);
		contentPane.add(btnInfoF);

		

		JButton btnImgF = new JButton("Mostrar ");
		btnImgF.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {

				try{
				Thread.sleep(1500);						
				mostrarLujo.mostrarVentanaFerrari();							
				}catch(InterruptedException exc){
				}


			}	
		}); 

		btnImgF.setBounds(250, 360, 90, 35);
		contentPane.add(btnImgF);



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


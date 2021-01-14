//Interfaz
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
 * Clase de tipo pública para el catalogo que invoca a la interfaz JFrame
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class Catalogo extends JFrame{

	//Anexo 1
	private JFrame getFrame(){
		return this;
	}

	private JPanel contentPane;

    /**
     *Constructor por defecto de la clase Catalogo. En este método puede surgir una excepción por ese motivo utilizamos la palabra reservada throws
     * @throws HeadlessException
     */
    public Catalogo()throws HeadlessException{

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMenu = new JLabel("Menu de Automoviles 'The Racer's Edge");
		lblMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblMenu.setBounds(55,70,280,30);//((-)<-->(+)/(baja-sube)/(exp)/¿?)
		contentPane.add(lblMenu);

		JLabel lblLujo = new JLabel("Automovil Lujo");
		lblLujo.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblLujo.setBounds(120,160,280,30);//((-)<-->(+)/(baja-sube)/(exp)/¿?)
		contentPane.add(lblLujo);

		//final LineaLujo llujo = new LineaLujo();
		JButton btnLujo = new JButton("Ingresar");
		btnLujo.addActionListener(new ActionListener(){
                        @Override
			public void actionPerformed(ActionEvent e){
				LineaLujo llujo = new LineaLujo(){
                                        @Override
					public void dispose(){
						getFrame().setVisible(true);
						super.dispose();
					}
				};
				llujo.setVisible(true);
				dispose();
			}
		});
		btnLujo.setBounds(125, 190, 117, 35); //(el segundo)
		contentPane.add(btnLujo);


		JLabel lblHash = new JLabel("Automovil Hatchback");
		lblHash.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblHash.setBounds(100,260,280,30);//((-)<-->(+)/(baja-sube)/(exp)/¿?)
		contentPane.add(lblHash);

		//final LineaHash lhash = new LineaHash();
		JButton btnHash = new JButton("Ingresar");
		btnHash.addActionListener(new ActionListener(){
                        @Override
			public void actionPerformed(ActionEvent e){
				LineaHash lhash = new LineaHash(){
                                        @Override
					public void dispose(){
						getFrame().setVisible(true);
						super.dispose();
					}
				};
				lhash.setVisible(true);
				dispose();
			}
		});
		btnHash.setBounds(125, 290, 117, 35); //(el segundo)
		contentPane.add(btnHash);

		JLabel lblVan = new JLabel("Automovil Van");
		lblVan.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblVan.setBounds(120,360,280,30);//((-)<-->(+)/(baja-sube)/(exp)/¿?)
		contentPane.add(lblVan);

		//final LineaVan lvan = new LineaVan();
		JButton btnVan = new JButton("Ingresar");
		btnVan.addActionListener(new ActionListener(){
                        @Override
			public void actionPerformed(ActionEvent e){
				LineaVan lvan = new LineaVan(){
                                        @Override
					public void dispose(){
						getFrame().setVisible(true);
						super.dispose();
					}
				};
				lvan.setVisible(true);
				dispose();
			}
		});
		btnVan.setBounds(125, 390, 117, 35); //(el segundo)
		contentPane.add(btnVan);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(290, 0, 90, 29);
		contentPane.add(btnSalir);


	}

}

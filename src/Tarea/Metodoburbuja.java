/*************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez*
 * Fecha de creacion:19/03/2023                  *
 * Fecha de modificacion:19/03/2023              *
 * Descrpcion:Este programa tiene el metodo      *
 * de seleccion burbuja pero tambien tiene interfaz *
 *************************************************/

package Tarea;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;


public class Metodoburbuja extends JFrame implements  ActionListener {
	// se declaran los metodos
	private JLabel etiqueta;
	private JButton btnEnviar;
	private JPanel panel;
	private JTextField valx;
	
	// Constructor vacio 
	 public Metodoburbuja() {
		   panel = new JPanel();
		    panel.setBounds(10, 10, 580, 580);
		    panel.setBackground(Color.pink);
		    panel.setLayout(null);
		    add(panel);

		    etiqueta = new JLabel("Ordenamiento Burbuja");
		    etiqueta.setBounds(50, 20, 200, 30);
		    panel.add(etiqueta);

		    etiqueta = new JLabel("Números (separados por coma): ");
		    etiqueta.setBounds(20, 50, 300, 20);
		    panel.add(etiqueta);

		    valx = new JTextField();
		    valx.setBounds(300, 50, 200, 20);
		    panel.add(valx);

		    btnEnviar = new JButton("Enviar");
		    btnEnviar.setBounds(100, 100, 400, 40);
		    btnEnviar.addActionListener(this);
		    panel.add(btnEnviar);

		    setResizable(false);
		    setLayout(null);
		    setSize(600, 300);
		    setVisible(true);
		    centerFrame(this);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		 
	 }
		public static void centerFrame(JFrame frame) {
		    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		    int w = frame.getSize().width;
		    int h = frame.getSize().height;
		    int x = (dim.width - w) / 2;
		    int y = (dim.height - h) / 2;
		    frame.setLocation(x, y);
		}
	 
	 //metodos
	 public static void main(String[] args) {
		    new Metodoburbuja();
		}
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
	     //Aqui se resiben los eventos del mouse o del teclado
	     if(e.getSource()== btnEnviar) {
	         System.out.println("Clic del boton");

	         etiqueta.setText("Resultado: ");
	         etiqueta.setBounds(20,150, 120,20);

	         String[] numeros = valx.getText().split(",");
	         int[] arr = new int[numeros.length];
	         for (int i = 0; i < numeros.length; i++) {
	             arr[i] = Integer.parseInt(numeros[i].trim());
	         }

	         burbuja(arr);

	         String resultado = "";
	         for (int i = 0; i < arr.length; i++) {
	             resultado += arr[i] + " ";
	         }

	         System.out.println("Resultado:  " + resultado);
	         JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Ordenamiento Burbuja", JOptionPane.INFORMATION_MESSAGE);

	     }

	 }

	 private void burbuja(int[] arr) {
	     int n = arr.length;
	     for (int i = 0; i < n-1; i++) {
	         for (int j = 0; j < n-i-1; j++) {
	             if (arr[j] > arr[j+1]) {
	                 // intercambiamos arr[j] y arr[j+1]
	                 int temp = arr[j];
	                 arr[j] = arr[j+1];
	                 arr[j+1] = temp;
	             }
	         }
	     }
	 }
	 
	 
	}
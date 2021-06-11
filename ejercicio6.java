package awtAdrianAdemar;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ejercicio6 extends Frame{
	boolean llamada = false; //Una variable de tipo bool para utilizar más tarde
	/**
	 * Se crea el frame
	 * @param titulo
	 * @param b
	 * @param q
	 */
	public ejercicio6(String titulo, int b, int q) { 
		 this.setSize(b, q);
		 this.setTitle(titulo);
		 this.setVisible(true);
		 this.setLocation(400, 400);
		 this.addWindowListener(new WindowAdapter() { //Listener para cerrar la ventana 
	            public void windowClosing(WindowEvent we) {
	                dispose();
	            }
	        });
		Panel panel = new Panel(new GridLayout(5,1)); //Panel general
		Panel panel1 = new Panel(new GridLayout(1,1));//Panel para el texto
		 this.add(panel);
		 TextField texto = new TextField();
		 panel.add(panel1);
		 panel1.add(texto);
		 /**
		  * Paneles para los botones
		  */
		Panel panel2 = new Panel(new GridLayout(1,3)); 
		Panel panel3 = new Panel(new GridLayout(1,3));
		Panel panel4 = new Panel(new GridLayout(1,3));
		Panel panel5 = new Panel(new GridLayout(1,3));
		panel.add(panel2);
		panel.add(panel3);
		panel.add(panel4);
		panel.add(panel5);
		/**
		 * Botones
		 */
		 Button boton1 = new Button("1");
		 Button boton2 = new Button("2");
		 Button boton3 = new Button("3");
		 Button boton4 = new Button("4");
		 Button boton5 = new Button("5");
		 Button boton6 = new Button("6");
		 Button boton7 = new Button("7");
		 Button boton8 = new Button("8");
		 Button boton9 = new Button("9");
		 Button botonClear = new Button("Clear");
		 Button boton0 = new Button("0");
		 Button botonCall = new Button("Call");
		 panel2.add(boton1);
		 panel2.add(boton2);
		 panel2.add(boton3);
		 panel3.add(boton4);
		 panel3.add(boton5);
		 panel3.add(boton6);
		 panel4.add(boton7);
		 panel4.add(boton8);
		 panel4.add(boton9);
		 panel5.add(botonClear);
		 panel5.add(boton0);
		 panel5.add(botonCall);
		 /**
		  * Acciones de los botones
		  * Los botones cogen el texto de la pantalla y le añaden el caracter que sale en su botón
		  */
		 
		 boton1.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
           String textoPrevio = texto.getText();
           
           texto.setText(textoPrevio + "1");
              }
           });
		 boton2.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
           String textoPrevio = texto.getText();
           
           texto.setText(textoPrevio + "2");
              }
           });
		 boton3.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
           String textoPrevio = texto.getText();
           
           texto.setText(textoPrevio + "3");
              }
           });
		 boton4.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
           String textoPrevio = texto.getText();
           
           texto.setText(textoPrevio + "4");
              }
           });
		 boton5.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
           String textoPrevio = texto.getText();
           
           texto.setText(textoPrevio + "5");
              }
           });
		 boton6.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
           String textoPrevio = texto.getText();
           
           texto.setText(textoPrevio + "6");
              }
           });
		 boton7.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
           String textoPrevio = texto.getText();
           
           texto.setText(textoPrevio + "7");
              }
           });
		 boton8.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
           String textoPrevio = texto.getText();
           
           texto.setText(textoPrevio + "8");
              }
           });
		 boton9.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
           String textoPrevio = texto.getText();
           
           texto.setText(textoPrevio + "9");
              }
           });
		 boton0.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
           String textoPrevio = texto.getText();
           
           texto.setText(textoPrevio + "0");
              }
           });
		 /**
		  * Boton de borrar pantalla
		  */
		 botonClear.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
          
           
           texto.setText("");
              }
           });
		 /**
		  * Boton que utiliza la variable booleana para saber el estado
		  * Cambia entre Call y Hang up
		  */
		
		 botonCall.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
            if(llamada) {
            	botonCall.setLabel("Hang up");
            	llamada=false;
            } else {
            	botonCall.setLabel("Call");
            	llamada= true;
            }
              }
           });
		
	}
	}
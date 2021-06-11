package awtAdrianAdemar;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class ejercicio7 extends Frame{
	/**
	 * Variable a la que suma el contador
	 */
	int cuenta= 0;
	 /**
	  * Crea el frame
	  * @param titulo
	  * @param b
	  * @param q
	  */
	public ejercicio7(String titulo, int b, int q) {
		 this.setSize(b, q);
		 this.setTitle(titulo);
		 this.setVisible(true);
		 this.setLocation(400, 400);
		/**
		 * Listener para cerrar la ventana
		 */
		 this.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent we) {
	                dispose();
	            }
	        });
		 Panel panel = new Panel(new FlowLayout());
		 this.add(panel);
		 Button boton1 = new Button("Cuenta");
		 Button boton2 = new Button("Cuenta");
		 Label contador = new Label("Contador");
		 TextField texto = new TextField();
		 panel.add(contador);
		 panel.add(texto);
		 panel.add(boton1);
		 panel.add(boton2);
		 texto.setText((""+ cuenta));
		 /**
		  * Dos botones que suman 1 a la variable de cuenta y luego la sacan por el panel de texto
		  */
		 boton1.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
           cuenta++;
           texto.setText((""+ cuenta));
              }
           });
		 boton2.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
           cuenta++;
           texto.setText((""+ cuenta));
              }
           });
	}
}

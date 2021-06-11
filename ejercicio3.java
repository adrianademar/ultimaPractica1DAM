package awtAdrianAdemar;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ejercicio3 extends Frame{
	/**
	 * Crea el frame
	 * @param titulo
	 * @param b
	 * @param q
	 */
	public ejercicio3(String titulo, int b, int q) {
		 this.setSize(b, q);
		 this.setTitle(titulo);
		 this.setVisible(true);
		 this.setLocation(400, 400);
		 this.addWindowListener(new WindowAdapter() {
			 /**
			  * Listener para cerrar la ventana 
			  */
		 
	            public void windowClosing(WindowEvent we) {
	                dispose();
	            }
	        });
		  Panel panel = new Panel(new GridLayout(1,3));
		  /**
		   * Crea el layout general
		   */
		  this.add(panel);
		  Button boton1 = new Button("El botón");
		  Button boton2 = new Button("El otro botón");
		  Label etiqueta = new Label("No se ha pulsado botón todavia");

			panel.add(boton1);
			panel.add(etiqueta);
			panel.add(boton2);
			/**
			 *  Dos botones que cambian el texto de la label
			 */
			boton2.addMouseListener(new MouseAdapter() {
	             public void mouseClicked(MouseEvent e) {
	             etiqueta.setText("Se ha pulsado el otro botón");
	              }
	           });
			boton1.addMouseListener(new MouseAdapter() {
	             public void mouseClicked(MouseEvent e) {
	             etiqueta.setText("Se ha pulsado el botón");
	              }
	           });
	}
}

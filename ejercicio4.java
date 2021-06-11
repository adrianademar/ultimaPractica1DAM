package awtAdrianAdemar;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ejercicio4 extends Frame{
	/**
	 * Crea el frame
	 * @param titulo
	 * @param b
	 * @param q
	 */
	public ejercicio4(String titulo, int b, int q) {
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
		 Panel panel = new Panel(new GridLayout(4,2)); //Crea el loyout general
		  this.add(panel);
		  Button boton1 = new Button("El botón");
		  Label solucion = new Label("No se ha pulsado botón todavia");
		  TextField panelTexto = new TextField(2);
		  TextField panelTexto2 = new TextField(2);
			panel.add(new Label("Primer numero:"));
			panel.add(panelTexto);
			panel.add(new Label("Segundo numero:"));
			panel.add(panelTexto2);
			panel.add(new Label("Pulse el boton para calcular"));
			panel.add(boton1);
			panel.add(new Label("La solucion es:"));
			panel.add(solucion);
			/**
			 * El boton coge el texto de los paneles de texto 
			 * y los pasa a int para sumarlos posteriormente lo pasa al panel de texto de solucion
			 */
			boton1.addMouseListener(new MouseAdapter() {
	             public void mouseClicked(MouseEvent e) {
	            	 int primero = Integer.parseInt(panelTexto.getText());
	            	 int segundo = Integer.parseInt(panelTexto2.getText());
	            	 int solucio = primero + segundo;
	            solucion.setText(("" + solucio));
	              }
	           });
	}
}

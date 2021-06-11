
package awtAdrianAdemar;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class ejercicio5 extends Frame{
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
	public ejercicio5(String titulo, int b, int q) {
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
		 Panel panel = new Panel(new FlowLayout());  //Layout general
		 this.add(panel);
		 Button boton1 = new Button("Cuenta");
		 Label contador = new Label("Contador");
		 TextField texto = new TextField();
		 panel.add(contador);
		 panel.add(texto);
		 panel.add(boton1);
		 texto.setText((""+ cuenta));
		 /**
		  * Un boton que suma 1 a la variable de cuenta y luego la saca por el panel de texto
		  */
		 boton1.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
           cuenta++;
           texto.setText((""+ cuenta));
              }
           });
	}
}

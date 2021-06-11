package awtAdrianAdemar;
import java.awt.*;
import java.awt.event.*;
public class ejercicio1 extends Frame {
/**
 *  Crea el frame
 * @param titulo
 * @param b
 * @param q
 */
	public ejercicio1(String titulo, int b, int q) {
		 this.setSize(b, q);
		 this.setTitle(titulo);
		 this.setVisible(true);
		 this.setLocation(200, 200);
		 /**
		  * Listener para cerrar la ventana 
		  */
		 this.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent we) {
	                dispose();
	            }
	        });
	      Panel panel = new Panel(new GridLayout(4,5)); //Layout general
	      this.add(panel);
	      int contador = 0;
	      for(int i = 1; i <= 4; i++)  // bucles con el tamaño del grid
			for(int j = 1; j <= 5; j++) {
			contador++; // contador para saber que numero poner en el boton
			
				if(i == j) { // if para saber si esta en la diagonal
					if(i == 1) { //El primer hueco de la diagonal 
						int letra = 'A';
						Panel panel2 = new Panel(new GridLayout(2,2));
						panel.add(panel2);
						for(int k = 1; k <= 4; k++ ) {
							panel2.add(new Button(("" + (char)letra)));
							letra++;
					}
					}
					/**
					 * Segundo y terccer hueco de la diagonal
					 */
					else if( i == 2 || i==3) {	
						int letra = 'A';
						Panel panel2 = new Panel(new GridLayout(3,1));
						panel.add(panel2);
						for(int k = 1; k <= 3; k++ ) {
							panel2.add(new Button(("" + (char)letra)));
							letra++;
							}		
				
				} else { //Ultimo hueco de la diagonal
					int letra = 'A';
					Panel panel2 = new Panel(new BorderLayout());
					panel.add(panel2);
					panel2.add(new Button(("" + (char)letra)), BorderLayout.NORTH);
					letra++;
					panel2.add(new Button(("" + (char)letra)), BorderLayout.WEST);
					letra++;
					panel2.add(new Button(("" + (char)letra)), BorderLayout.CENTER);
					letra++;
					panel2.add(new Button(("" + (char)letra)), BorderLayout.EAST);
					letra++;
					panel2.add(new Button(("" + (char)letra)), BorderLayout.SOUTH);
				}
				} else if (j==5) { // Ultima columna
					Panel panel3 = new Panel(new GridLayout(1,2));
					int letra = 'A';
					panel.add(panel3);
					for(int k = 1; k <= 2; k++ ) {
						panel3.add(new Button(("" + (char)letra)));
						letra++;
						}
				}else {
				/**
				 * Sin ninguna condicion especial coloca un simple boton
				 */
	 			panel.add(new Button(Integer.toString(contador)));
			}
			
			
	}
	
	
}
	
}

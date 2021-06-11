package awtAdrianAdemar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ejercicio8 extends Frame {
	/** Clase ejercicio8
	 * 
	 * @param titulo
	 * @param b
	 * @param q
	 */
	public ejercicio8(String titulo, int b, int q) {
		/**
		 * Crea el frame
		 */
			final Frame elFrame = new Frame(titulo);
			elFrame.setSize(b, q);
			elFrame.setLocation(400, 400);


			final TextArea texto = new TextArea();
			elFrame.add(texto);
			elFrame.setVisible(true);
			elFrame.addWindowListener(new WindowAdapter() { //Listener para cerrar la ventana

				@Override
				public void windowClosing(WindowEvent e) {
					super.windowClosing(e);
					System.exit(0);
				}

			});

			MenuBar barra = new MenuBar();
			Menu archivo = new Menu("Archivo");
			MenuItem abrir = new MenuItem("Abrir");
			/**
			 * Guarda un blog de notas
			 */
			abrir.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					FileDialog fd = new FileDialog(elFrame, "guardar", FileDialog.LOAD);
					String strFile = fd.getDirectory() + fd.getFile();
					FileInputStream fis = null;
					if (strFile != null) {
						try {
							fis = new FileInputStream(strFile);
							byte[] buf = new byte[10 * 1024];
							int len = fis.read(buf);
							texto.append(new String(buf, 0, len));

						} catch (Exception e1) {
							e1.printStackTrace();
						} finally {
							try {
								fis.close();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}
					}

				}
			});
			MenuItem guardar2 = new MenuItem("Guardar");
			/**
			 * Abre un blog de notas
			 */
			guardar2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					FileDialog fd = new FileDialog(elFrame, "blogdenotas", FileDialog.SAVE);
					String path = fd.getDirectory() + fd.getFile() + ".txt";
					FileOutputStream fos = null;
					DataOutputStream dos = null;
					try {
						fos = new FileOutputStream(path);
						String sa = texto.getText();
						dos = new DataOutputStream(fos);
						dos.writeUTF(sa);

					} catch (Exception e1) {

						e1.printStackTrace();
					} finally {
						try {
							dos.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}

				}
			});
			/**
			 * Cierra la ventana
			 */
			MenuItem mi4 = new MenuItem("Exit");
			mi4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);

				}
			});

		    archivo.add(abrir);
			archivo.add(guardar2);
			archivo.add(mi4);
	
			barra.add(archivo);
			elFrame.setMenuBar(barra);

		}
	}
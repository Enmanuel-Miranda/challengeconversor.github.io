package Conversor.Principal;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Menu_Inicial {

	protected static double cantidad_valor;
	boolean confirmacion = true;

	static void menu() {
		Object[] opcion = { "Conversor de moneda", "Conversor de temperatura" };

		boolean finalizarprograma = true;

		do {
			Object opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
					JOptionPane.PLAIN_MESSAGE, null, opcion, opcion[0]);

			
			
			//double valorate = ingresar_valor(opciones, opcion);
			
			//System.out.println(valorate);
			
	
			

			// Esto pide la cantidad que se ha ingresao
			
			verificar_numero(opciones, opcion);
			
			
			if(opciones.equals(opcion[0])) {
				
				
				//AQUI SE HARA EL LLAMADO PARA PODER HACER LA CONVERSION
				MonedaTipo convertir = new MonedaTipo();
				convertir.convertirmoneda();
				Object opcionesmoneda =  JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
			            JOptionPane.PLAIN_MESSAGE, null, convertir.mensajemoneda, convertir.mensajemoneda[0]);
				
				 int selection = Arrays.asList(convertir.mensajemoneda).indexOf(opcionesmoneda); 

			        double jos = convertir.retornarvalormoneda(selection, cantidad_valor);
				
				
			}
			else if(opciones.equals(opcion[1])) {
				
				//MonedaTipo convertir = new MonedaTipo();
				TemperaturaTipo conversor=new TemperaturaTipo();
				
				conversor.convertirtemperatura();
				
				
				Object opcionestemperatura =  JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
			            JOptionPane.PLAIN_MESSAGE, null, conversor.mensajetemperatura, conversor.mensajetemperatura[0]);
				
				 int selection = Arrays.asList(conversor.mensajetemperatura).indexOf(opcionestemperatura); 

			        double jos = conversor.retornarvalortemperatura(selection, cantidad_valor);
				
				
			}
			else {}
			
			
			

			
			

		} while (finalizarprograma == banderacontinuar());
	}

	// ESTO ES UNA BANDERA PARA PODER CONTINUAR O FINALIZAR EL PROGRAMA
	private static boolean banderacontinuar() {
		boolean finalizar = true;

		int continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

		if (continuar == JOptionPane.YES_OPTION) {
			finalizar = true;
		} else if (continuar == JOptionPane.NO_OPTION) {
			finalizar = false;
			JOptionPane.showMessageDialog(null, "Programa terminado", "Message", JOptionPane.INFORMATION_MESSAGE);
		} else {
			finalizar = false;
			JOptionPane.showMessageDialog(null, "Programa terminado", "Message", JOptionPane.INFORMATION_MESSAGE);
		}
		return finalizar;
	}

	// DEVULVE UNA VENTANA DE JOPTIONPANE QUE PIDE INGRESAR LA CANTIDAD
	private static double ingresar_valor(Object tipo, Object opcion[]) {
		Object valor = JOptionPane.showInputDialog(null,
				"Ingrese la " + tipo_conversor(tipo, opcion) + " que desea convertir", "",
				JOptionPane.QUESTION_MESSAGE);

		// aqui debe haber un controlador par que no se ingree letras
		// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		Double numero = Double.parseDouble(valor.toString());

		// System.out.println("ca "+ cantidad_valor);
		cantidad_valor = numero;
		return cantidad_valor;

	}
	
	
	
	private static Object ingresar_valor_2(Object tipo, Object opcion[]) {
		Object valor = JOptionPane.showInputDialog(null,
				"Ingrese la " + tipo_conversor(tipo, opcion) + " que desea convertir", "",
				JOptionPane.QUESTION_MESSAGE);

		// aqui debe haber un controlador par que no se ingree letras
		// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		

		// System.out.println("ca "+ cantidad_valor);
		
		return valor;

	}
	
	private static void verificar_numero(Object tipo, Object opcion[]) {
		
		
boolean confirmacion=true;
		
		do {
			
			Object numer=ingresar_valor_2(tipo,opcion);
			 
			 
			try{
				
				Double numero = Double.parseDouble(numer.toString());

				

				//Double numer = Double.parseDouble(cantidad_valor.toString());
				
				if(numero instanceof Number ) {
					confirmacion=false;
					System.out.println("conversion hecha");
					cantidad_valor=numero;
					
					
					
				}
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"Valor no valido","Aviso",JOptionPane.INFORMATION_MESSAGE);
			}
			
			}
			while(confirmacion);
		
	}
	
	
	
	
	
	
	
	

	// ESTO ES PARA PODER OBTENER EL NOMBRE DEL TIPO DE CONVERSOR QUE SE SELECCIONO
	private static String tipo_conversor(Object tipo, Object opcion[]) {
		String tipos = "";
		if (tipo.equals(opcion[0])) {
			tipos = "cantidad de dinero";
		} else {
			tipos = "temperatura";
		}
		return tipos;
	}

	private static void aviso_mensaje(String mensaje) {
		System.out.println(mensaje);
	}

	// ESTO VA A EJECUTAR NUESTRA VENTANAN
	public static void main(String[] args) {

		menu();

	}

}

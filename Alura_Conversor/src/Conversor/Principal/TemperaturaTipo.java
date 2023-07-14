package Conversor.Principal;

import java.util.Arrays;

import javax.swing.JOptionPane;


public class TemperaturaTipo {
	
	
	
	
	
	
	//para poder convertir la moneda a un TIPO
	
		
		
		
		
		protected  Object[] mensajetemperatura;
		protected String resultados;
		
		
		
		public void convertirtemperatura() {
			String Pe = "Celsius (°C)";
			Object[] temperatura = {"Fahrenheit (°F)", "Kelvin (K)" };
			//Object[] mensajemoneda = new Object[moneda.length];
			 
			mensajetemperatura = new Object[temperatura.length*2];
			
			for (int mo =0;mo<mensajetemperatura.length;mo++) {
				if(mo>=temperatura.length) {
					
					mensajetemperatura[mo] = "De "+ temperatura[mo -temperatura.length] + " a "+ Pe; 
					
				}
				if(mo<temperatura.length){
					mensajetemperatura[mo] = "De "+Pe + " a "+  temperatura[mo]; 
					
				}
			}
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		//Para PODER CONVERTIR LA MONEDA A OTRA CANTIDAD
		
		
		
		
		
		public  double retornarvalortemperatura(int selection, double valormoneda) {
			
			double Celsius=valormoneda;
			
			double Fahrenheit = 0;
			double Kelvin = 0;
			

			
			String fah= "Fahrenheit", kel = "Kelvin", cel="Celsius";
			double conver = 0;
			
			
			
			//Integer selection =  Integer.parseInt(tipo.toString());
			
			
			
			

			switch (selection) {
			    case 0:
			    	//para Fahrenheit
			    	conver=(Celsius * 9/5) + 32;
			    	
			    	mensaje(conver,fah);
		
			        break;
			    case 1:
			    	//prar kelvin
			    	conver=Celsius + 273.15;
			    	mensaje(conver,kel);
			        break;
			   
			        
			    case 2:
			    	
			    	conver=(valormoneda - 32) * 5/9;
			    	mensaje(conver,cel);
			        break;
			    case 3:
			    	conver=valormoneda - 273.15;
			    	mensaje(conver,cel);
			        break;
			    
			    default:
		            System.out.println("Programa cancelado");
		            break;
			}
			
			return conver;
		}
		
		
		
		
		
		
		
		
		
		private void mensaje(double cantidad_tem,String tem) {
			JOptionPane.showMessageDialog(null, "tienes " + cantidad_tem + " "+ tem, "Message", JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		
		
		public static void main(String[] args) {
			
			
			/*
			
			convertirtemperatura();
		    Object opciones =  JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
		            JOptionPane.PLAIN_MESSAGE, null, mensajetemperatura, mensajetemperatura[0]);
		    
		    //Esto me permite convertir el Index del objeto a un numero
		   
		    
		    int selection = Arrays.asList(mensajetemperatura).indexOf(opciones); 

	        double jos = retornarvalortemperatura(selection, 34);

	        */
	        
	        
	        
	        

		    //if (opciones == null) { 
		    	//System.out.println("Programa cancelado");
		    //} 
		    
			
		}
	
	
	
	
	
	

}

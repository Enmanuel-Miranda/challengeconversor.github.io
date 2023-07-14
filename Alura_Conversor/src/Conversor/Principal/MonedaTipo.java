package Conversor.Principal;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MonedaTipo {
	
	
	
	//para poder convertir la moneda a un TIPO
	protected Object[] mensajemoneda;
	protected String resultado;
	
	
	public void convertirmoneda() {
		String Pe = "Pesos Argentinos";
		Object[] moneda = {"Dolar Estadounidense", "Euro", "Libra Egipsea", "Yen" ,"Won Coreano" };
		//Object[] mensajemoneda = new Object[moneda.length];
		 
		mensajemoneda = new Object[moneda.length*2];
		
		for (int mo =0;mo<mensajemoneda.length;mo++) {
			if(mo>=moneda.length) {
				
				mensajemoneda[mo] = "De "+ moneda[mo -moneda.length] + " a "+ Pe; 
				
			}
			if(mo<moneda.length){
				mensajemoneda[mo] = "De "+Pe + " a "+  moneda[mo]; 
				
			}
		}
	}
	
	
	
	
	
	//Para PODER CONVERTIR LA MONEDA A OTRA CANTIDAD
	
	
	public double retornarvalormoneda(int selection, double valormoneda) {
		double pesos = 1;		//VALOR DEL PESO ARGENTINO
		double dolar  = 0.0038;			//DOLAR ESTADOUNIDENSE
		double euro	 = 0.0035;				//EURO DE EUROPA
		double libras = 0.12;				//Valor de la libra egipsea
		double yen = 0.54;					//valor del Yen japones
		double Won = 4.95; 					// won coreano
		
		String Pes= "Pesos", dol = "Dolares", eur="Euros", lib="Libras", ye="Yenes", wo="Wones";
		double conver = 0;
		
		
		//int opcion = 2;
	
		
		//Integer selection =  Integer.parseInt(tipo.toString());
		
		
		
		

		switch (selection) {
		    case 0:
		    	conver=(valormoneda*dolar);
		    	
		    	mensaje(conver,dol);
	
		        break;
		    case 1:
		    	conver=valormoneda*euro;
		    	mensaje(conver,eur);
		        break;
		    case 2:
		    	conver=valormoneda*libras;
		    	mensaje(conver,lib);
		        break;
		    case 3:
		    	conver=valormoneda*yen;
		    	mensaje(conver,ye);
		        break;
		    case 4:
		    	conver=valormoneda* Won;
		    	mensaje(conver,wo);
		        break;
		        
		        
		    case 5:
		    	conver=Math.round( (valormoneda/dolar)* 100) / 100.0;
		    	mensaje(conver,Pes);
		        break;
		    case 6:
		    	conver=Math.round( (valormoneda/euro)* 100) / 100.0;
		    	mensaje(conver,Pes);
		        break;
		    case 7:
		    	conver= Math.round( (valormoneda/libras)* 100) / 100.0;
		    	mensaje(conver,Pes);
		        break;
		    case 8:
		    	conver=Math.round( (valormoneda/yen)* 100) / 100.0;
		    	mensaje(conver,Pes);
		        break;
		    case 9:
		    	conver=Math.round( (valormoneda/Won)* 100) / 100.0;
		    	mensaje(conver,Pes);
		        break;
		    default:
	            System.out.println("Programa cancelado");
	            break;
		}
		
		return conver;
	}
	
	
	private static void mensaje(double cantidad_valor,String moneda) {
		JOptionPane.showMessageDialog(null, "tienes " + cantidad_valor + " "+ moneda, "Message", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	
	
	
	

	
	public static void main(String[] args) {
		
		
		
		/*
		
		convertirmoneda();
	    Object opciones =  JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
	            JOptionPane.PLAIN_MESSAGE, null, mensajemoneda, mensajemoneda[0]);
	    
	    //Esto me permite convertir el Index del objeto a un numero
	    int selection = Arrays.asList(mensajemoneda).indexOf(opciones); 

        double jos = retornarvalormoneda(selection, 12);

        

	    //if (opciones == null) { 
	    	//System.out.println("Programa cancelado");
	    //} 
	    */
	    

	}
	

}

package Eliminar;

import javax.swing.JOptionPane;

public class Probar {

	
	//UN CONTROLADOR QUE VERIFICA QUE SE ESCRIBA UN NUMERO Y NO UNA LETRA
	
	
	
	
	/*
	
	
protected static void verificar_valor(Object cantidad_valor) {
		
		boolean confirmacion=true;
		
		do {
			 cantidad_valor = JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea convertir", "",
	                JOptionPane.QUESTION_MESSAGE);
			
			try{

				Double numer = Double.parseDouble(cantidad_valor.toString());
				
				if(numer instanceof Number ) {
					
					System.out.println("conversion hecha");
					confirmacion=false;
					
				}
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"Valor no valido","Aviso",JOptionPane.INFORMATION_MESSAGE);
			}
			
			}
			while(confirmacion);
	}


/*








private static void verificar(Object valor) {
	
	boolean confirmacion = true;
	
	
	do{
		Object cantidad_valor = JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea convertir", "",
                JOptionPane.QUESTION_MESSAGE);
		
		try{
			Double numero = Double.parseDouble(cantidad_valor.toString());
			
			if(numero instanceof Number) {
				confirmacion=false;
			}
			



		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"Valor no valido","Aviso",JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}
	while(confirmacion);
	
	
}
	


	
	public static void main(String[] args) {
		
		
		verificar_valor();
		System.out.println( "listo, finalizado");
		// TODO Auto-generated method stub

	}
	
}

	

/*

private static void verificar(Object valor) {
    boolean confirmacion = true;

    do {
        Object cantidad_valor = JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea convertir", "",
                JOptionPane.QUESTION_MESSAGE);

        try {
            Double numero = Double.parseDouble(cantidad_valor.toString());
            if (numero instanceof Number) {
                confirmacion = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor no válido", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    } while (confirmacion);

}



public static void main(String[] args) {
    Object valor = null; // Definir el valor deseado para la variable valor
    verificar(valor);
}

*/
}



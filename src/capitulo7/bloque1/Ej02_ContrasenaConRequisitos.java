package capitulo7.bloque1;

import javax.swing.JOptionPane;

public class Ej02_ContrasenaConRequisitos {
	public static void main(String[] args) {
		String contrasena;
		do {
			
			contrasena = JOptionPane.showInputDialog("Introduzca contraseña con un dígito, una mayúscula, minúscula y un carácter no alfanumérico");
			
		}while(esContraseñaInvalida(contrasena));
		
		JOptionPane.showMessageDialog(null, "Contraseña válida");
	}

	private static boolean esContraseñaInvalida(String contrasena) {
		char[] caracteres = contrasena.toCharArray();
		int min = 0, may = 0, num = 0, notAlfa = 0;
		for (int i = 0; i < caracteres.length; i++) {
			if(Character.isDigit(caracteres[i])) num++;
			else if(!Character.isAlphabetic(caracteres[i])) notAlfa++;
			else if(Character.isUpperCase(caracteres[i])) may++;
			else if(Character.isLowerCase(caracteres[i])) min++;
		}
		if(min == 0 || may == 0 || num == 0 || notAlfa == 0) return true;
		
		
		return false;
	}

}


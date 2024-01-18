package capitulo7.bloque3.fraseComBombilla;

import java.util.Scanner;

public class PedirFraseConBombilla {
	public static void main(String[] args) {
		try {
			String str = pedirString();
			System.out.println("Tu frase: ' "+ str +" ' es adecuada");
		} catch (FraseEnBlancoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FraseMuyCortaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FraseOfensivaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FraseSinBombillaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String pedirString() throws FraseEnBlancoException, FraseMuyCortaException, FraseOfensivaException, FraseSinBombillaException{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Introduce una frase con bombilla: ");
		String str = sc.next();
		String palabras[] = str.split("[ ]{1,}");
		if(str.isBlank()) throw new FraseEnBlancoException("ERROR: La frase está en blanco");
		else if(palabras.length < 3) throw new FraseMuyCortaException("ERROR: La frase debe de tener 3 palabras al menos");
		else if(!str.contains("bombilla")) throw new FraseSinBombillaException("ERROR: La frase no contiene la palabra 'bombilla'");
		else if(str.contains("tonto") || str.contains("tonta") || str.contains("idiota")) throw new FraseOfensivaException("ERROR: Contenido ofensivo");
		
		return str;
	}		

}

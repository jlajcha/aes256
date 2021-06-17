package aes256;
import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public  class Ejecutador{
public static void main (String [ ] args) {

        EncriptadorAES  aes = new EncriptadorAES();
        System.out.println ("Ingresar frase a cifrar ");

        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

        String entradaTeclado = "";
        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner

        System.out.println ("Entrada recibida para encriptar : \"" + entradaTeclado +"\"");

        String clave = "";
        clave = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        System.out.println ("clave \"" + clave +"\"");

        //	String cifrado = "";
	/*	cifrado = aes.encriptar(entradaTeclado,clave);

		System.out.println ("Lo cifrado \"" + cifrado +"\"");

		String loCifrado = "";
        loCifrado = entradaEscaner.nextLine (); //llamar a decifrar

        System.out.println ("porner a decifrar : \"" + loCifrado +"\"");
		//decifrar
		String laNuevaClave = "";
        laNuevaClave = entradaEscaner.nextLine (); //llamar a decifrar
		System.out.println ("porner la clave : \"" + laNuevaClave +"\"");

		String decifrado = "";
		decifrado= aes.desencriptar(loCifrado, laNuevaClave);
        System.out.println ("la mierda decifrada: \"" + decifrado +"\"");
		*/



    } //Cierre del main
}
 //Cierre de la clase

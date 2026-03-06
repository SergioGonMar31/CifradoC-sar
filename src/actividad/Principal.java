package actividad;
import java.util.Scanner;
import utiles.Depurar;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mensaje=Depurar.texto("Introduce el mensaje: ", sc).toLowerCase();
		int clave=Depurar.entero("Introduce la clave: ", sc);

		String mensajeCifrado= cifradoCesar(mensaje, clave);
		System.out.println("El mensaje cifrado es: "+mensajeCifrado);
	}

	public static String cifradoCesar(String mensaje, int clave) {
		StringBuilder sb = new StringBuilder();
		String mensajeCifrado="";

		String abecedario="abcdefghijklmnñopqrstuvwxyz";
		for(int i=0;i<mensaje.length();i++) {
			for(int j=0; j<abecedario.length();j++) {
				if(mensaje.charAt(i)==abecedario.charAt(j)) {
					int nuevaletra=j+clave;
					if(nuevaletra>=abecedario.length()) {
						nuevaletra=nuevaletra-abecedario.length();
					}
					sb.append(abecedario.charAt(nuevaletra));
				}
			}
			mensajeCifrado=sb.toString();
		}
		return mensajeCifrado;
	}
}

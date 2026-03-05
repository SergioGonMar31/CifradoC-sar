package actividad;
import java.util.Scanner;
import utiles.Depurar;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mensaje=Depurar.texto("Introduce el mensaje: ", sc);
		int clave=Depurar.entero("Introduce la clave: ", sc);

		String mensajeCifrado= cifradoCesar(mensaje, clave);
	}

	public static String cifradoCesar(String mensaje, int clave) {
		String mensajeCifrado="";
		
		String abecedario="abcdefghijklmnñopqrstuvwxyz";
		for(int i=0;i<abecedario.length();i++) {
			
		}
		return mensajeCifrado;
	}
}

package ppal;

import modelo.Hora;

/** 
 * Clase que comprueba que la clase Hora funciona correctamente 
 * @author David
 *
 */
public class PruebaHora {

	public static void main(String[] args) {
		
		System.out.println("============================================================");
		System.out.println("=                 Probando la clase Hora                   =");
		System.out.println("============================================================");
		
		System.out.println("Creando un hora con el contructor sin parámetros");
		Hora hora = new Hora();
		
		System.out.println("La hora creada es "+hora);
		
		
		
		System.out.println("============================================================");
		System.out.println("=  Probando Constructor con parámetros - Hora incorrecta   =");
		System.out.println("============================================================");
		System.out.println("Creando hora 27:68:38...");
		hora = new Hora(27,68,38);
		System.out.println("La hora creada es "+ hora+ " (debe salir 00:00:00)");
		
		
		
		System.out.println("============================================================");
		System.out.println("=   Probando Constructor con parámetros - Hora correcta    =");
		System.out.println("============================================================");
		System.out.println("Creando hora 12:25:38...");
		hora = new Hora(12,25,38);
		System.out.println("La hora creada es "+ hora);
		
		
		
		System.out.println("============================================================");
		System.out.println("=    Probando Constructor de copia - Copiando 12:25:38     =");
		System.out.println("============================================================");
		Hora hora2 = new Hora(hora);
		System.out.println("La hora creada es "+hora2);
		
		
		
		System.out.println("============================================================");
		System.out.println("=                      Probando getters...                 =");
		System.out.println("============================================================");
		System.out.println("El objeto mostrado con getters es hora="+hora.getHoras()+", minutos="+hora.getMinutos()+", segundos="+hora.getSegundos());
		
		
		
		System.out.println("============================================================");
		System.out.println("=        Comprobando setHora - hora2 a 20:08:75            =");
		System.out.println("============================================================");
		hora2.setHora(20,8,75);
		System.out.println("La fecha cambiada debe ser la medianoche: " + hora2);
		hora2.setHora(20, 18, 59);
		System.out.println("La fecha ahora debe ser 20:18:59: "+hora2);
		
		
		
		System.out.println("============================================================");
		System.out.println("=            Comprobando método aSegundos                  =");
		System.out.println("============================================================");
		System.out.println("Las 20:18:59 deben devolver 73.139 segundos para ser correcto: "+hora2.aSegundos());
		
		
		
		System.out.println("============================================================");
		System.out.println("=             Comprobando método deSegundos                =");
		System.out.println("============================================================");
		hora2.deSegundos(62548);
		System.out.println("62.548 segundos deben ser las 17:22:28:  "+hora2);
		
		hora2.deSegundos(140482);
		System.out.println("140482 segundos deben ser las 15:01:22:  "+hora2);
		
		
		
		System.out.println("============================================================");
		System.out.println("=          Comprobando método segundosEntre                =");
		System.out.println("============================================================");
		int sgs = hora2.segundosEntre(hora);
		Hora diferencia = new Hora();
		diferencia.deSegundos(sgs);
		System.out.println("Entre las 15:01:22 y las 12:25:38 debe haber 9344 segundos: " +hora2.segundosEntre(hora) + " es decir "+diferencia);
		
		System.out.println("fin de pruebas...");
	}

}

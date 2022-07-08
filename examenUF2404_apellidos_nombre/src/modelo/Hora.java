package modelo;

public class Hora {
	
	//declaracion de atributos de la clase
	private int horas;
	private int minutos;
	private int segundos;

	
	//Creamos metodo mediaNOche para inicializar hora a 00:00:00
	public void mediaNoche() {
		this.horas = 00;
		this.minutos = 00;
		this.segundos = 00;
	}
	
	//constructor sin parametros que inicializa hora a 00:00:00
	public Hora() {
		mediaNoche();
	}

	//constructor con todos los parametros. COmprueba si la hora es correcta. En caso contrario, le da el valor de 00:00:00
	public Hora(int horas, int minutos, int segundos) {
		if (Hora.valida(horas, minutos, segundos)){
			this.horas = horas;
			this.minutos = minutos;
			this.segundos = segundos;
		}else mediaNoche();
	}

	//Constructor de copia
	public Hora(Hora h) {
		if (Hora.valida(h.horas, h.minutos, h.segundos)){
			this.horas = h.horas;
			this.minutos = h.minutos;
			this.segundos = h.segundos;
		}else mediaNoche();
	}
	
	//Metodo que comprueba si la hora es valida
	private static boolean valida(int h ,int m,int s) {
		if ((h>=0 && h<=23)&&(m>=0 && h<=59)&&(s>=0 && s<=59))
			return true ;
		return false;
	}

	//Metodos getters
	public int getHoras() {
		return horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}
	
	//Metodo setHora
	public void setHora(int h, int min, int seg) {
		if (Hora.valida(h, min, seg)){
			this.horas =h;
			this.minutos = min;
			this.segundos = seg;
		}else mediaNoche();
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d",horas,minutos,segundos);
	}

	public int aSegundos() {
		return (horas*60*60)+(minutos*60)+(segundos);
	}
	
	public void deSegundos(int seg) {
	
        int h=seg/3600;
        if (h==24)
        		this.horas=0;
        else if(h>24) {
        	this.horas=h-24;
        }else this.horas=h;
       
        
        this.minutos=(seg-(3600*h))/60;
        this.segundos=seg-((h*3600)+(minutos*60));
        //System.out.println(h+"h "+min+"m "+s+"s");
	}
	
	public int segundosEntre(Hora h) {
		return Math.abs((this.aSegundos()-h.aSegundos()));
	}
}

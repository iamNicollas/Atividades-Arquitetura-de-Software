
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		StateSemaforo estado = new EstadoVerde();
		Semaforo semaforo = new Semaforo(estado);

		semaforo.mudar();
		semaforo.mudar();
		semaforo.mudar();
		semaforo.mudar();
	}
}

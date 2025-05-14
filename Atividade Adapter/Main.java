
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		ControleWifiNovo wifi = new ControleWifiNovo();
		ControleInfraredAntigo infra = new ControleInfraredAntigo();
		
		AdapterControleLuz adapter = new AdapterControleLuz(infra);
		
		System.out.println("Wifi");
		wifi.ligarLuz();
		wifi.desligarLuz();
		
		System.out.println("Infravermelho");
		adapter.ligarLuz();
		adapter.desligarLuz();
	}
}

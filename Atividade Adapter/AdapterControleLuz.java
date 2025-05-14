public class AdapterControleLuz implements ControleLuz {
    
    private ControleInfraredAntigo infravermelho;
    
    public AdapterControleLuz(ControleInfraredAntigo infravermelho){
        this.infravermelho = infravermelho;
    }
    
    public void ligarLuz(){
        System.out.println("Ligar gambiarra infravermelho");
    }
    
    public void desligarLuz(){
        System.out.println("Desligar gambiarra infravermelho");
    }
}
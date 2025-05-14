public class EstadoVermelho implements StateSemaforo{
    
    public void proximoEstado(Semaforo semaforo){
        System.out.println("Mudando Vermelho para -> Verde");
        
        semaforo.setEstadoAtual(new EstadoVerde());
    }
}
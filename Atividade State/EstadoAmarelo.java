public class EstadoAmarelo implements StateSemaforo{
    
    public void proximoEstado(Semaforo semaforo){
        System.out.println("Mudando Amarelo para -> Vermelho");
        
        semaforo.setEstadoAtual(new EstadoVermelho());
    }
}
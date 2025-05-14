public class EstadoVerde implements StateSemaforo{
    
    public void proximoEstado(Semaforo semaforo){
        System.out.println("Mudando verde para -> Amarelo");
        
        semaforo.setEstadoAtual(new EstadoAmarelo());
    }
}
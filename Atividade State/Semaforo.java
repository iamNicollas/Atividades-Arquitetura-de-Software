public class Semaforo {
    
    private StateSemaforo estadoAtual;
    
    public Semaforo(StateSemaforo estadoAtual){
        this.estadoAtual = estadoAtual;
    }
    
    public void setEstadoAtual(StateSemaforo estadoAtual){
        this.estadoAtual = estadoAtual;
    }
    
    public void mudar(){
        estadoAtual.proximoEstado(this);
    }
    
    
}
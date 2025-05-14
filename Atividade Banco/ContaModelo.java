public class ContaModelo{
    
    private double saldo;
    private int numeroConta;
    private UsuarioContaBancaria donoDaConta;
    
    public ContaModelo(int numeroConta,double saldo,
                        UsuarioContaBancaria donoDaConta){
        
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.donoDaConta = donoDaConta;
        
    }
    
    //get e set
    public double getSaldo(){
        return this.saldo;
    }
    
    /*public void setSaldo(double saldo){
        this.saldo = saldo
    }*/

    //outros métodos    
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        
        if(valor <= this.saldo){
            this.saldo -= valor;
            
        }else{
            System.out.println("te falta grana!");
        }
        
    }
      
      public void transferir(double valor, ContaModelo cm){
            
            this.sacar(valor);
            
            cm.depositar(valor);
            
            
      }
      
      
}
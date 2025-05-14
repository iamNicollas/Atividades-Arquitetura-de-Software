public class ContaControle{
    
    private ContaModelo modelo;
    private ContaVisao visao;
    private ContaModelo contaDestino;
    
    public ContaControle(ContaModelo modelo,ContaVisao visao, ContaModelo contaDestino){
        this.modelo = modelo;
        this.visao = visao;
        this.contaDestino = contaDestino;
    }
    
    public void processarCodigo(){
        double valor = visao.digiteValor();
        modelo.depositar(valor);
        System.out.println("Seu saldo é de R$ "+modelo.getSaldo());
    }
    
    public void processarCodigo2(){
        
        
        int operacao = visao.escolherOperacao();
        double valor = visao.digiteValor();
        
        switch(operacao){
            case 1:
                modelo.depositar(valor);
                System.out.println("Deposito feito");
                System.out.println("Novo Saldo R$ " + modelo.getSaldo());
                break;
            case 2:
                modelo.sacar(valor);
                System.out.println("Saque feito");
                System.out.println("Novo Saldo R$ " + modelo.getSaldo());
                break;
            case 3:
                modelo.transferir(valor,contaDestino);
                System.out.println("Transfer feito");
                System.out.println("Novo Saldo R$ " + modelo.getSaldo());
                System.out.println("Saldo Destino R$ " + contaDestino.getSaldo());
                break;
            case 4:
                System.out.println("Seu Saldo R$ " + modelo.getSaldo());
                break;
            case 5:
                System.out.println("Saiu da conta");
                break;
        }
    }
    
}
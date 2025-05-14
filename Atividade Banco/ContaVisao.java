import java.util.Scanner;

public class ContaVisao{
    
    private Scanner sc;
    
    public ContaVisao(){
        this.sc = new Scanner(System.in);
    }
    
    public double digiteValor(){
        System.out.println("Digite o valor: ");
        return sc.nextDouble();
    }
    
    public int escolherOperacao(){
        
        System.out.println("Digite um número");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Transferir ");
        System.out.println("4 - Ver Saldo ");
        System.out.println("5 - Sair");
        
        int op = sc.nextInt();
        
        switch(op){
            case 1:
                op = 1;
            break;
             case 2:
                op = 2;
            break;
             case 3:
                op = 3;
            break;
             case 4:
                op = 4;
            break;
             default:
               op = 5;
            
        }
        
        return op;
    }
    
    /*public void exibirSaldo(double s){
        System.out.println(s);
    }*/
    //
    //
    
}
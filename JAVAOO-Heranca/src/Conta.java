
public class Conta {
   
    private double saldo; 
    private int agencia;
    private static int conta;
    private String TipoConta;
    private Cliente titular;

    public Conta () {
        setAgencia(1);
        ++conta;
        setTipoConta("Corrente");
        System.out.println("Sua agência é " + getAgencia() + "| sua Conta é " + getConta() + "| do tipo " + getTipoConta());
        
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public String getTipoConta() {
         return TipoConta;
    }
    public void setTipoConta(String tipoConta) {
         this.TipoConta = tipoConta;
    }
    public static int getConta() {
         return Conta.conta;
    }
    // public void setConta(int conta) {
    //      Conta.conta = conta;
    // }
    public int getAgencia() {
         return agencia;
    }
    public void setAgencia(int agencia) {
         this.agencia = agencia;
    }
 
     // métodos de banco, sacar, depositar e transferir. treinar lógica.
 
    public boolean sacar(double valor){
        if(this.saldo < valor){
             System.out.println("Você não tem saldo suficiente");
             return false;
        }else{
             this.saldo -= valor;  
             System.out.println("Pronto você sacou/transferiu " + valor + " | Seu novo saldo é de " + this.saldo);
             return true;
        }
    }

    public double depositar(double valor){
        this.saldo += valor;
        return this.saldo;
    }

    public boolean transferir(double valor, int Conta){
        if(sacar(valor)){
            return true;
        }else{
            return false; 
        }
    }
        
 }
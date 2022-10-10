public abstract class Conta {
    
    protected double saldo; //isso não é o correto, devo utilizar alguma forma de setar o valor 
    private int numeroDaConta;
    private int numeroDaAgencia;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero_conta() {
        return numeroDaConta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numeroDaConta = numero_conta;
    }

    public int getNumero_agencia() {
        return numeroDaAgencia;
    }

    public void setNumero_agencia(int numero_agencia) {
        this.numeroDaAgencia = numero_agencia;
    }


    //posso implementar esses métodos de forma abstrata pra não precisar ser implementado dentro da classe mãe e sim nas classes filhas.
    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Procedimento realizado com sucesso");
            return true;
        } else {
            System.out.println("Você não tem saldo suficiente");
            return false; 
        }
    }

    //posso implementar esses métodos de forma abstrata pra não precisar ser implementado dentro da classe mãe e sim nas classes filhas.
    public boolean transferir(double valor, Conta numeroDaConta){
        if(sacar(valor)){
            numeroDaConta.depositar(valor);
            return true;
        }
        return false;
    }
        
    //posso implementar esses métodos de forma abstrata pra não precisar ser implementado dentro da classe mãe e sim nas classes filhas.
    public double depositar(double valor){
        return this.saldo += valor;
    }
}

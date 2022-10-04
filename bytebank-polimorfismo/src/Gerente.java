public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    @Override
    public boolean autenticar(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void setSenha(int senha){
        this.senha = senha;
    }

    public double getBonificacao(){
        System.out.println("O método que foi chamado foi a bonificacao do gerente");
        return super.getSalario();
    }

    public double getTotalSalario(){
        System.out.println("esse é o salário total desses caras");
        return super.getSalario() + getBonificacao(); //verificar se isso aqui faz sentido
    }
}

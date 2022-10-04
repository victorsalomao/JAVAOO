public class Gerente extends Funcionario {

    private int senha;
    
    public boolean autenticar(int senha){
        if(this.senha == senha){
            System.out.println(" Senha autorizada ");
            return true;
        } else {
            System.out.println(" Senha incorreta");
            return false;
        }
    }

    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();    
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
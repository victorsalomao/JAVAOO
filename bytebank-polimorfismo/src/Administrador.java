public class Administrador implements Autenticavel {
    private int senha;

    @Override
    public boolean autenticar(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setSenha(int senha){
        this.senha = senha;
    }
}
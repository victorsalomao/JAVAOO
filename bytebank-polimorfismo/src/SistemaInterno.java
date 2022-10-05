public class SistemaInterno {
    private int senha = 222;

    public void autenticar(Autenticavel aut){
        boolean autenticando = aut.autenticar(this.senha);

        if(autenticando){
            System.out.println("Pode entrar no Sistema");
        } else {
            System.out.println("Não pode entrar no Sistema");
        }
    }
}
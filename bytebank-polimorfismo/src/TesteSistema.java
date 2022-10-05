public class TesteSistema {
    public static void main(String[] args) {
        Autenticavel gerente = new Gerente();
        gerente.setSenha(222);
        //System.out.println(gerente.getSenha());

        SistemaInterno si = new SistemaInterno();
        si.autenticar(gerente);
    }
}

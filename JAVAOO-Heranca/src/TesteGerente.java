
public class TesteGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Diego");
        gerente.setSenha(123);
        System.out.println(gerente.getNome());
        gerente.setSalario(5000);
        
        boolean autenticando = gerente.autenticar(123);
        System.out.println(autenticando);
        System.out.println("ESTE É A BONIFICACAO DO GERENTE DO GERENTE " + gerente.getSalarioTotal()); //10500

        Funcionario funcionario = new Funcionario(); // Funcionario funcionario = new Gerente()
        funcionario.setNome("Melo");
        funcionario.setCpf("45454545454545");
        System.out.println(funcionario.getNome());
        funcionario.setSalario(3000);
        System.out.println("ESTE É O SALÁRIO DO FUNCIONARIO " + funcionario.getSalarioTotal()); //3300
    }
}

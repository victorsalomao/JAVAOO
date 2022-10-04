public class App {
    public static void main(String[] args) throws Exception {
        Funcionario gerente = new Gerente();
        gerente.setNome("Victor");
        gerente.setCpf("05168617352");
        gerente.setSalario(5000);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getBonificacao());
        System.out.println(gerente.getTotalSalario());
    }
}

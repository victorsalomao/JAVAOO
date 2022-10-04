public class TesteReferencias {
 
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Jamil");
        g1.setSalario(5000);

        Funcionario f = new Funcionario();
        f.setNome("Melo");
        f.setSalario(10000);


        ControleBonificacao controle = new ControleBonificacao();
        controle.registrar(g1);   
        controle.registrar(f);
        
        System.out.println(controle.getSoma());
    }
    
}

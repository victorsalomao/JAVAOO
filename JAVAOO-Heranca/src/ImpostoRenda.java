public class ImpostoRenda {
    public static void main(String[] args) {
        double salario = 2800.0;
 
        if (salario <= 2800.0) {
            System.out.println("o IR é de 7.5% e pode deduzir na declaração o valor de R$142");
        } if (salario >= 2800.01 && salario <= 3751.0){ 
            System.out.println("o IR é de 15% e pode deduzir na declaração o valor de R$350");
            } if (salario >= 3751.01 && salario <= 4664.0 ) {
                System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
            }
        }
    }

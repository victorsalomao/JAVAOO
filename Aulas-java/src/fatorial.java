public class fatorial {
  public static void main(String[] args) {
    int fator = 1;
    for (int numero = 1; numero < 11; numero++) {
      fator = fator * numero;
      System.out.println("o fatorial de " + numero + " é o numero " + fator);
    }
  }
}

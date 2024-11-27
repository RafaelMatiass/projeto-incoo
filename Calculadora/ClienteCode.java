package Calculadora;

public class ClienteCode {
  public static void main(String[] args) {
    
    Calculadora calculadora = new Calculadora(59, 20, "soma");
    System.out.println("Resultado: " + calculadora.calcular());

    calculadora.setOperacao("subtracao");
    System.out.println("Resultado: " + calculadora.calcular());

    calculadora.setOperacao("multiplicacao");
    System.out.println("Resultado: " + calculadora.calcular());
  }
}

package Calculadora;

public class ClienteCode {
  public static void main(String[] args) {
    
    Calculadora calculadora = new Calculadora(59, 20, "soma");
    System.out.println("Resultado: " + calculadora.calcular());

    calculadora.setOperacao("subtracao");
    System.out.println("Resultado: " + calculadora.calcular());

    calculadora.setOperacao("multiplicar");
    System.out.println("Resultado: " + calculadora.calcular());

    CalculadoraCientifica cientifica = new CalculadoraCientifica(10, 10, "somar");
    System.out.println("Científica: " + cientifica.calcular());

    cientifica.setOperacao("multiplicar");
    System.out.println("Científica: " + calculadora.calcular());

    cientifica.setNumero_b(0);
    cientifica.setOperacao("dividir");
    System.out.println("Científica: " + cientifica.calcular());
  }
}

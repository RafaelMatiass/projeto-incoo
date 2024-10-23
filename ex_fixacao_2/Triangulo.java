package ex_fixacao_2;

import java.util.Scanner;

public class Triangulo {
  private int lado1;
  private int lado2;
  private int lado3;

  public Triangulo(int lado1, int lado2, int lado3) {
    //this referencia o atributo do abjeto
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
  }

  public boolean ehTriangulo() {
    // boolean retorno = false;
    // if(this.lado1 + this.lado2 > this.lado3){
    //   if(this.lado1 + this.lado3 > this.lado2){
    //     if(this.lado2 + this.lado3 > this.lado1){
    //       retorno = true;
    //     }
    //   }
    // }
    // return retorno;

    return this.lado1 + this.lado2 > this.lado3 &&
           this.lado1 + this.lado3 > this.lado2 &&
           this.lado2 + this.lado3 > this.lado1 &&
           this.lado1 > 0 && this.lado2 > 0 && this.lado3 > 0;
  }

  public boolean ehEscaleno() {
    return ehTriangulo() &&
            lado1 != lado2 &&
            lado2 != lado3 &&
            lado1 != lado3;
  }

  public boolean ehEquilatero() {
    return ehTriangulo() &&
            lado1 == lado2 &&
            lado1 == lado3;
  }

  public boolean ehIsosceles() {
    return ehTriangulo() && ( lado1 == lado2 || lado1 == lado3 || lado2 == lado3);
  }

  // criou-se uma nova classe para não ser operada no main
  public String getTipo() {
    String str;
    if (!ehTriangulo()) {
      str = "Dados não formam um triângulo.";
    } else if (ehEquilatero()) {
      str = "Triangulo equilatero.";
    } else if (ehIsosceles()) {
      str = "Triangulo isosceles.";
    } else {
      str = "Triangulo escaleno.";
    }
    return str;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Triangulo mTriangulo;
    int a, b, c;

    for(int i = 0; i < 5; i++){
      System.out.println("Digite os três lados: ");
      a = scanner.nextInt();
      b = scanner.nextInt();
      c = scanner.nextInt();

      mTriangulo = new Triangulo(a, b, c);
      System.out.println(mTriangulo.getTipo());

      // processamento agora executado na classa getTipo
      // triangulo = new Triangulo(a, b, c);

      // if (triangulo.ehTriangulo()) {
      //   if (triangulo.ehEquilatero()) {
      //     System.out.println("Triangulo equilátero.");
      //   } else if (triangulo.ehIsosceles()) {
      //     System.out.println("Triangulo isósceles.");
      //   } else {
      //     System.out.println("Triangulo escaleno.");
      //   }
      // } else {
      //   System.out.println("Dados não formam um triangulo.");
      // }
    }
    scanner.close();
  }
}

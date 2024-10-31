package aula_4.exercicio_horas;

public class Horas {
  private final int dayInSeconds = 86399; // 86399s == 1 dia
  private final int hourrsInSeconds = 3600; // 3600 == 1 dia
  private final int minutesInSeconds; // 60s == 1 minuto
  private int seconds;

  public Horas() {
    this.seconds = 0;
    minutesInSeconds = 60;
  }

  private Horas(int hours) {
    this(); // chamar o método, no caso 'horas': delegando o construtor
    if (hours >= 0 && hours <= 23){
      this.seconds += hours * hourrsInSeconds;
    }
  }

  private Horas(int hours, int minutes) {
    this(hours);
    if (minutes >=0 && minutes <= 59) {
      this.seconds += minutes * minutesInSeconds;
    }
    else {
      this.seconds = 0;
    }
  }

  // Método sobrecarga (Não é específico de construtor)
  // Metódo que tem um objeto com comportamentos distintos usa-se sobrecarga
  // diferença nesse caso nos argumentos
  public Horas(int hours, int minutes, int seconds) {
    this(hours, minutes);
    if (seconds >= 0 && seconds <= 59) {
      this.seconds += seconds * minutesInSeconds;
    } else {
      this.seconds = 0;
    }
  }

  public int getHoras() {
    return this.seconds / hourrsInSeconds;
  }

  public int getMinutos() {
    return (this.seconds - getHorasEmSegundos()) / minutesInSeconds;
  }

  public int getSegundos() {
    return this.seconds - getHorasEmSegundos() - getMinutosEmSegundos();
  }

  public Horas addHoras(Horas horas) {
    Horas resultado = new Horas();
    resultado.seconds = this.seconds + horas.seconds;
    if ( resultado.seconds > dayInSeconds) {
      resultado.seconds -= dayInSeconds * (resultado.seconds / dayInSeconds);
    }

    return resultado;
  }

  public String toString() {
    return String.format("%02d : %02d : %02d\n",
                  getHoras(),
                  getMinutos(),
                  getSegundos());
  }

  private int getHorasEmSegundos() {
    return getHoras() * 3600;
  }

  private int getMinutosEmSegundos() {
    return getMinutos() * 60;
  }
}
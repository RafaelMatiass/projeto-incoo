package ex_fixacao_2;

import java.util.Random;

public class Dice {
  private int face;
  private Random random;

  public Dice() {
    this.random = new Random();
    play();
  }

  public int getFace() {
    return face;
  }

  public void play() {
    this.face = random.nextInt() + 1;
  }
}

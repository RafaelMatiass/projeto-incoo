package CartaoWeb;

public class Natal extends CartaoWeb {
  private String mensagem;

  public Natal(String destinatario, String remetente) {
    super(destinatario, remetente);
    mensagem = "Feliz dia dos Namorados! \n";
    mensagem += "Espero que esse tenha sido o único cartão do dia dos ";
    mensagem += "namorados que tenha ganhado nessa data! ;-) \n";
    mensagem += "De todo meu coração.";
  }

  @Override
  public String getMessage() {
    return mensagem;
  }
}

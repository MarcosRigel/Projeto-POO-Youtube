package Entities;

public class Gafanhoto extends Pessoa{

  private String login;
  private int totAssistido;
  
  public Gafanhoto(String nome, int idade, String sexo, String login) {
    super(nome, idade, sexo);
    this.login = login;
    this.totAssistido = 0;
  }

  @Override
  public String toString() {
    return "Gafanhoto[ "+ super.toString() + "login=" + login + ", totAssistido=" + totAssistido + "]";
  }
  
  

}

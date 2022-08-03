public class main {
  public static void main(String[] args){

    Tabuleiro tabuleiro_jogador_1 = new Tabuleiro();
    Tabuleiro tabuleiro_jogador_2 = new Tabuleiro();

    Jogador jogador_1 = new Jogador("Jardiel", tabuleiro_jogador_1, tabuleiro_jogador_2);
    Jogador jogador_2 = new Jogador("Rodrigo", tabuleiro_jogador_2, tabuleiro_jogador_1);
    
    System.out.println(jogador_1.getNome());
    tabuleiro_jogador_1.inserirArmas();
    System.out.println(jogador_2.getNome());
    tabuleiro_jogador_2.inserirArmas();
    
  

    while(true){
      if (jogador_1.posicoesNaviosRestantes == 0){
        break;

      }else if (jogador_2.posicoesNaviosRestantes == 0){
        break;
      }

      for(int i = 0; i < 2; i++){
        if (jogador_1.posicoesNaviosRestantes == 0){
          break;

        } else if(jogador_2.posicoesNaviosRestantes == 0){
          break;

        }
        jogador_1.atirar();

      }
      for(int i =0 ; i < 2; i++){
        if (jogador_2.posicoesNaviosRestantes == 0){
          break;

        }else if(jogador_1.posicoesNaviosRestantes == 0){
          break;

        }

        jogador_2.atirar();

      }
    }
  }
}

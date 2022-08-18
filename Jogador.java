import java.util.Scanner;

public class Jogador{
  private String nome;
  private Tabuleiro meuJogo;
  private Tabuleiro jogoDoAdversario;
  private char[][] tabuleiro;
  public int posicoesNaviosRestantes;

  public Jogador(String nome, Tabuleiro meuJogo, Tabuleiro jogoDoAdversario){
    this.nome = nome;
    this.meuJogo = meuJogo;
    this.jogoDoAdversario = jogoDoAdversario;
    this.tabuleiro = new char [8][8];
    this.posicoesNaviosRestantes = 12;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void getMeuJogo() {
    meuJogo.mostrarTabuleiro();
  }

  public void setMeuJogo(Tabuleiro meuJogo) {
    this.meuJogo = meuJogo;
  }

  public void mostrarTabuleiro() {
    System.out.println("    1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 " ); 

    for (int i = 0; i < tabuleiro.length; i++) {
        for (int j = 0; j < tabuleiro[i].length; j++) {
            if (tabuleiro[i][j] != 's' && tabuleiro[i][j] != 'c' && tabuleiro[i][j] != 'p') {
                if (j == 0) {
                    System.out.print(" " + (i + 1) + " ");
                }
                if(j < 7){
                    System.out.print("(" + tabuleiro[i][j] + ")" + "-");
                }
                if (j == 7) {
                    System.out.print("(" + tabuleiro[i][j] + ")");
                    System.out.println("");
                }
            }else {
                if (j == 0) {
                    System.out.print(" " + (i + 1) + " ");
                }
                if(j < 7){
                    System.out.print("(" + tabuleiro[i][j] + ")" + "-");
                }
                if (j == 7) {
                    System.out.print("(" + tabuleiro[i][j] + ")");
                    System.out.println("");
                } 
            }
        }
    } 
}

  public void atirar(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("-----------------------------");
    System.out.println(" =- Vez de "+ nome +" Atirar -=");
    System.out.println("-----------------------------");
    System.out.print("Digite a linha que deseja atirar: ");
    int linha = teclado.nextInt() - 1;
    System.out.print("Digite a coluna que deseja atirar: ");
    int coluna = teclado.nextInt() - 1;
    verificarAcerto(linha, coluna);
  }

  public void verificarAcerto(int linha, int coluna){
    if (linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8) {
      if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
        System.out.println("Você ja atirou nessa posição");
      }else {
        if(jogoDoAdversario.tabuleiro[linha][coluna] == 's'){
          registrarTiro(linha, coluna);
          
        }else if (jogoDoAdversario.tabuleiro[linha][coluna] == 'c'){
          registrarTiro(linha, coluna);
    
        }else if(jogoDoAdversario.tabuleiro[linha][coluna] == 'p'){
          registrarTiro(linha, coluna);
    
        }else{
          registrarTiro(linha, coluna);
        }
      }
    }else {
      System.out.println("Digite uma posição valida:");
      atirar();
    }
  }
  
  public void registrarTiro(int linha, int coluna){ 
    if(jogoDoAdversario.tabuleiro[linha][coluna] == 's'){
      System.out.println("Você acertou um Navio!");
      tabuleiro[linha][coluna] = 'O';
      this.posicoesNaviosRestantes = posicoesNaviosRestantes -1;
    }else if(jogoDoAdversario.tabuleiro[linha][coluna] == 'c'){
      System.out.println("Você acertou um Navio!");
      tabuleiro[linha][coluna] = 'O';
      this.posicoesNaviosRestantes = posicoesNaviosRestantes -1;
    }else if(jogoDoAdversario.tabuleiro[linha][coluna] == 'p'){
      System.out.println("Você acertou um Navio!");
      tabuleiro[linha][coluna] = 'O';
      this.posicoesNaviosRestantes = posicoesNaviosRestantes -1;
    }else{
      System.out.println("Você acertou na água!");
      tabuleiro[linha][coluna] = 'X';
    }
    mostrarTabuleiro();
    if(posicoesNaviosRestantes == 0){
      System.out.println(nome + " Venceu!");
      return;
    }
  }

}

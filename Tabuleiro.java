import java.util.Scanner;

public class Tabuleiro {
    protected char[][] tabuleiro;

    public Tabuleiro() {
         this.tabuleiro = new char [8][8];
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

    public void inserirArmas() {
        
        System.out.println("------------------\nPosicionando armas\n------------------\n =- Submarino -=\n------------------");
        int cont = 0;
        Scanner escolha = new Scanner(System.in);
        while (true) {
            mostrarTabuleiro();
            if (cont == 3){
                break;
            }
            System.out.print("Informe a linha:");
            int linha = escolha.nextInt() - 1;

            System.out.print("Informe a coluna:");
            int coluna = escolha.nextInt() - 1;
            if (linha == 0) {
                if (coluna == 0) {
                    if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' &&tabuleiro[linha + 1][coluna] != 's') {
                        tabuleiro[linha][coluna] = 's';
                        cont++;
                        System.out.println("adicionado");
                    }else{
                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                    }
                }else if (coluna == 7) {
                    if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' &&tabuleiro[linha + 1][coluna] != 's') {
                        tabuleiro[linha][coluna] = 's';
                        cont++;
                        System.out.println("adicionado");
                    }else{
                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                    }
                }else if (coluna > 0 && coluna < 7) {
                    if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' &&tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's') {
                        tabuleiro[linha][coluna] = 's';
                        cont++;
                        System.out.println("adicionado");
                    }else{
                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                    }
                }
            }else if (linha == 7) {
                if (coluna == 0) {
                    if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' &&tabuleiro[linha - 1][coluna] != 's') {
                        tabuleiro[linha][coluna] = 's';
                        cont++;
                        System.out.println("adicionado");
                    }else {
                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                    }
                }else if (coluna == 7) {
                    if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' &&tabuleiro[linha - 1][coluna] != 's') {
                        tabuleiro[linha][coluna] = 's';
                        cont++;
                        System.out.println("adicionado");
                    }else {
                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                    }
                }else if (coluna > 0 && coluna < 7) {
                    if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' &&tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's') {
                        tabuleiro[linha][coluna] = 's';
                        cont++;
                        System.out.println("adicionado");
                    }else {
                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                    }
                }else {
                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                }
            }else if (linha > 0 && linha < 7) {
                if (coluna == 0) {
                    if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's') {
                        tabuleiro[linha][coluna] = 's';
                        cont++;
                        System.out.println("adicionado");
                    }else {
                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                    }
                }else if (coluna == 7) {
                    if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's') {
                        tabuleiro[linha][coluna] = 's';
                        cont++;
                        System.out.println("adicionado");
                    }else {
                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                    }
                }else if (coluna > 0 && coluna < 7) {
                    if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 's') {
                        tabuleiro[linha][coluna] = 's';
                        cont++;
                        System.out.println("adicionado");
                    }else {
                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                    }
                }
            } 
        }

        System.out.println("------------------\n  =- Cruzador -=\n------------------");

        cont = 0;
        while (true) {
            mostrarTabuleiro();
            if (cont == 2){
                break;
            }
            System.out.print("Informe a linha:");
            int linha = escolha.nextInt() - 1;

            System.out.print("Informe a coluna:");
            int coluna = escolha.nextInt() - 1;

            System.out.print("Deseja posicionar em horizontal ou vertical:\nHorizontal -> 0 // Vertical -> 1");
            int posicao = escolha.nextInt();

            if (posicao == 0) {
                if (linha == 0) {
                    if (coluna == 0) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha][coluna + 2] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha][coluna + 2] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna + 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (coluna == 1) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha][coluna + 2] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha][coluna + 2] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna + 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        } else if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna - 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if(coluna == 6) {
                        if (tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna + 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        } else if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna - 2] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna - 2] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna - 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (coluna == 7) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna - 2] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna - 2] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna - 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (coluna > 0 && coluna < 7) {
                        if (tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha][coluna + 2] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha][coluna + 2] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna + 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }
                }else if (linha == 7) {
                    if (coluna == 0) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha][coluna + 2] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha][coluna + 2] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna + 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (coluna == 1) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha][coluna + 2] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha][coluna + 2] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna + 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        } else if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna - 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if(coluna == 6) {
                        if (tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna + 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        } else if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna - 2] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna - 2] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna - 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (coluna == 7) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna - 2] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna - 2] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna - 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (coluna > 1 && coluna < 6) {
                        if (tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha][coluna + 2] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha][coluna + 2] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna + 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }
                }else if (linha > 0 && linha < 7) {
                    if (coluna == 0) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha][coluna + 2] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' &&  tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c' && tabuleiro[linha][coluna + 2] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna + 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else {
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (coluna == 1) {
                        if (tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha][coluna + 2] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha][coluna + 2] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna + 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else if (tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna - 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else {
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (coluna == 6) {
                        if (tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna + 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else if (tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna - 2] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna - 2] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna - 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else {
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (coluna == 7) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna - 2] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna - 2] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna - 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else {
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (coluna > 0 && coluna < 7) {
                        if (tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha][coluna + 2] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha][coluna + 2] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna + 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else if (tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha][coluna - 2] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha][coluna - 2] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha][coluna - 1] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else {
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }
                }
            }else if (posicao == 1) {
                if (coluna == 0) {
                    if (linha == 0) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 2][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 2][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha + 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (linha == 1) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 2][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 2][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha + 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        } else if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha - 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if(linha == 6) {
                        if (tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha + 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        } else if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 2][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 2][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha - 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (linha == 7) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 2][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 2][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha - 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (linha > 0 && linha < 7) {
                        if (tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 2][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 2][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha + 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }
                }else if (coluna == 7) {
                    if (linha == 0) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 2][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 2][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha + 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (linha == 1) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 2][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 2][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha + 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        } else if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha - 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if(linha == 6) {
                        if (tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha + 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        } else if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 2][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 2][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha - 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (linha == 7) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 2][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 2][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha - 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (coluna > 1 && coluna < 6) {
                        if (tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 2][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 2][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha + 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else{
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }
                }else if (coluna > 0 && coluna < 7) {
                    if (linha == 0) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 2][coluna] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' &&  tabuleiro[linha][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c' && tabuleiro[linha + 2][coluna] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha + 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else {
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (linha == 1) {
                        if (tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 2][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 2][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha + 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else if (tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha - 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else {
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (linha == 6) {
                        if (tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha + 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else if (tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 2][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 2][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha - 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else {
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (linha == 7) {
                        if (tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 2][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 2][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha - 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else {
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }else if (linha > 0 && linha < 7) {
                        if (tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha + 2][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha + 1][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha + 1][coluna + 1] != 's' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha + 2][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha + 1][coluna - 1] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha + 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha + 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else if (tabuleiro[linha + 1][coluna] != 's' && tabuleiro[linha][coluna] != 's' && tabuleiro[linha - 1][coluna] != 's' && tabuleiro[linha - 2][coluna] != 's' && tabuleiro[linha][coluna - 1] != 's' && tabuleiro[linha - 1][coluna - 1] != 's' && tabuleiro[linha][coluna + 1] != 's' && tabuleiro[linha - 1][coluna + 1] != 's' && tabuleiro[linha + 1][coluna] != 'c' && tabuleiro[linha][coluna] != 'c' && tabuleiro[linha - 1][coluna] != 'c' && tabuleiro[linha - 2][coluna] != 'c' && tabuleiro[linha][coluna - 1] != 'c' && tabuleiro[linha - 1][coluna - 1] != 'c' && tabuleiro[linha][coluna + 1] != 'c' && tabuleiro[linha - 1][coluna + 1] != 'c') {
                            tabuleiro[linha][coluna] = 'c';
                            tabuleiro[linha - 1][coluna] = 'c';
                            cont++;
                            System.out.println("adicionado");
                        }else {
                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                        }
                    }
                }
            }
            
        }
        
        System.out.println("------------------\n =-Porta-aviões-= \n------------------");

        cont = 0;
        while (true) {
            mostrarTabuleiro();
            if (cont == 1) {
                break;
            }

            System.out.print("Informe a linha:");
            int linha = escolha.nextInt() - 1;

            System.out.print("Informe a coluna:");
            int coluna = escolha.nextInt() - 1;

            System.out.print("Deseja posicionar em horizontal ou vertical:\nHorizontal -> 0 // Vertical -> 1");
            int posicao = escolha.nextInt();

            int cont_2 = 0;

            if (posicao == 0) {
                if (linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8) {
                    if (tabuleiro[linha][coluna] == 's' || tabuleiro[linha][coluna] == 'c') {
                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                    }else if (linha == 0) {
                        if (coluna == 0) {
                            for (int i = 0; i < 6; i++) {
                                if (tabuleiro[linha][i] == 's' || tabuleiro[linha][i] == 'c') {
                                    cont_2++;
                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                    break;
                                }else {
                                    for (int j = 0; j < 5; j++) {
                                        if (tabuleiro[linha + 1][j] == 's' || tabuleiro[linha + 1][j] == 'c') {
                                            cont_2++;
                                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                            break;
                                        }
                                    }
                                }
                            }
                            if (cont_2 == 0) {
                                for (int i = 0; i < 5; i++) {
                                    tabuleiro[linha][i] = 'p';
                                }
                                cont++;
                            }
                            cont_2 = 0;
                        }if (coluna == 7 || coluna >= 3) {
                            for (int i = 7; i > 1; i--) {
                                if (tabuleiro[linha][i] == 's' || tabuleiro[linha][i] == 'c') {
                                    cont_2++;
                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                    break;
                                }else {
                                    for (int j = 7; j > 2; j--) {
                                        if (tabuleiro[linha + 1][j] == 's' || tabuleiro[linha + 1][j] == 'c') {
                                            cont_2++;
                                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                            break;
                                        }
                                    }
                                }
                            }
                            if (cont_2 == 0) {
                                for (int i = 7; i > 2; i--) {
                                    tabuleiro[linha][i] = 'p';
                                }
                                cont++;
                            }
                            cont_2 = 0;
                        }else if (coluna > 0 && coluna < 3) {
                            if (tabuleiro[linha][coluna - 1] == 's' || tabuleiro[linha][coluna - 1] == 'c') {
                                System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                            }else {
                                for (int i = coluna; i < coluna + 6; i++) {
                                    if (tabuleiro[linha][i] == 's' || tabuleiro[linha][i] == 'c') {
                                        cont_2++;
                                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                        break;
                                    }else {
                                        for (int j = coluna; j < coluna + 5; j++) {
                                            if (tabuleiro[linha + 1][j] == 's' || tabuleiro[linha + 1][j] == 'c') {
                                                cont_2++;
                                                System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (cont_2 == 0) {
                                    for (int i = coluna; i < coluna + 5; i++) {
                                        tabuleiro[linha][i] = 'p';
                                    }
                                    cont++;
                                }
                                cont_2 = 0;
                            }
                        }
                    }else if (linha == 7) {
                        if (coluna == 0) {
                            for (int i = 0; i < 6; i++) {
                                if (tabuleiro[linha][i] == 's' || tabuleiro[linha][i] == 'c') {
                                    cont_2++;
                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                    break;
                                }else {
                                    for (int j = 0; j < 5; j++) {
                                        if (tabuleiro[linha - 1][j] == 's' || tabuleiro[linha - 1][j] == 'c') {
                                            cont_2++;
                                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                            break;
                                        }
                                    }
                                }
                            }
                            if (cont_2 == 0) {
                                for (int i = 0; i < 5; i++) {
                                    tabuleiro[linha][i] = 'p';
                                }
                                cont++;
                            }
                            cont_2 = 0;
                        }if (coluna == 7 || coluna >= 3) {
                            for (int i = 7; i > 1; i--) {
                                if (tabuleiro[linha][i] == 's' || tabuleiro[linha][i] == 'c') {
                                    cont_2++;
                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                    break;
                                }else {
                                    for (int j = 7; j > 2; j--) {
                                        if (tabuleiro[linha - 1][j] == 's' || tabuleiro[linha - 1][j] == 'c') {
                                            cont_2++;
                                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                            break;
                                        }
                                    }
                                }
                            }
                            if (cont_2 == 0) {
                                for (int i = 7; i > 2; i--) {
                                    tabuleiro[linha][i] = 'p';
                                }
                                cont++;
                            }
                            cont_2 = 0;
                        }else if (coluna > 0 && coluna < 3) {
                            if (tabuleiro[linha][coluna - 1] == 's' || tabuleiro[linha][coluna - 1] == 'c') {
                                System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                            }else {
                                for (int i = coluna; i < coluna + 6; i++) {
                                    if (tabuleiro[linha][i] == 's' || tabuleiro[linha][i] == 'c') {
                                        cont_2++;
                                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                        break;
                                    }else {
                                        for (int j = coluna; j < coluna + 5; j++) {
                                            if (tabuleiro[linha - 1][j] == 's' || tabuleiro[linha - 1][j] == 'c') {
                                                cont_2++;
                                                System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (cont_2 == 0) {
                                    for (int i = coluna; i < coluna + 5; i++) {
                                        tabuleiro[linha][i] = 'p';
                                    }
                                    cont++;
                                }
                                cont_2 = 0;
                            }
                        }
                    }else if (linha > 0 && linha < 7) {
                        if (coluna == 0) {
                            for (int i = 0; i < 6; i++) {
                                if (tabuleiro[linha][i] == 's' || tabuleiro[linha][i] == 'c') {
                                    cont_2++;
                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                    break;
                                }else {
                                    for (int j = 0; j < 5; j++) {
                                        if (tabuleiro[linha + 1][j] == 's' || tabuleiro[linha + 1][j] == 'c') {
                                            cont_2++;
                                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                            break;
                                        }else {
                                            for (int j2 = 0; j2 < 5; j2++) {
                                                if (tabuleiro[linha - 1][j2] == 's' || tabuleiro[linha - 1][j2] == 'c') {
                                                    cont_2++;
                                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (cont_2 == 0) {
                                for (int i = 0; i < 5; i++) {
                                    tabuleiro[linha][i] = 'p';
                                }
                                cont++;
                            }
                            cont_2 = 0;
                        }else if (coluna == 7 || coluna > 3) {
                            for (int i = 7; i > 1; i--) {
                                if (tabuleiro[linha][i] == 's' || tabuleiro[linha][i] == 'c') {
                                    cont_2++;
                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                    break;
                                }else {
                                    for (int j = 7; j > 2; j--) {
                                        if (tabuleiro[linha + 1][j] == 's' || tabuleiro[linha + 1][j] == 'c') {
                                            cont_2++;
                                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                            break;
                                        }else {
                                            for (int j2 = 7; j2 > 2; j2--) {
                                                if (tabuleiro[linha - 1][j2] == 's' || tabuleiro[linha - 1][j2] == 'c') {
                                                    cont_2++;
                                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (cont_2 == 0) {
                                for (int i = 7; i > 2; i--) {
                                    tabuleiro[linha][i] = 'p';
                                }
                                cont++;
                            }
                            cont_2 = 0;
                        }else if (coluna > 0 && coluna < 3) {
                            if (tabuleiro[linha][coluna - 1] == 's' || tabuleiro[linha][coluna - 1] == 'c') {
                                System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                            }else {
                                for (int i = coluna; i < coluna + 6; i++) {
                                    if (tabuleiro[linha][i] == 's' || tabuleiro[linha][i] == 'c') {
                                        cont_2++;
                                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                        break;
                                    }else {
                                        for (int j = coluna; j < coluna + 5; j++) {
                                            if (tabuleiro[linha - 1][j] == 's' || tabuleiro[linha - 1][j] == 'c') {
                                                cont_2++;
                                                System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                                break;
                                            }else {
                                                for (int j2 = coluna; j2 < coluna + 5; j2++) {
                                                    if (tabuleiro[linha + 1][j2] == 's' || tabuleiro[linha + 1][j2] == 'c') {
                                                        cont_2++;
                                                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (cont_2 == 0) {
                                    for (int i = coluna; i < coluna + 5; i++) {
                                        tabuleiro[linha][i] = 'p';
                                    }
                                    cont++;
                                }
                                cont_2 = 0;
                            }
                        }
                    }else {
                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                    }
                }
            }else if (posicao == 1) {
                if (linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8) {
                    if (tabuleiro[linha][coluna] == 's' || tabuleiro[linha][coluna] == 'c') {
                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                    }else if (coluna == 0) {
                        if (linha == 0) {
                            for (int i = 0; i < 6; i++) {
                                if (tabuleiro[i][coluna] == 's' || tabuleiro[i][coluna] == 'c') {
                                    cont_2++;
                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                    break;
                                }else {
                                    for (int j = 0; j < 5; j++) {
                                        if (tabuleiro[i][coluna + 1] == 's' || tabuleiro[i][coluna + 1] == 'c') {
                                            cont_2++;
                                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                            break;
                                        }
                                    }
                                }
                            }
                            if (cont_2 == 0) {
                                for (int i = 0; i < 5; i++) {
                                    tabuleiro[i][coluna] = 'p';
                                }
                                cont++;
                            }
                            cont_2 = 0;
                        }if (linha == 7 || linha >= 3) {
                            for (int i = 7; i > 1; i--) {
                                if (tabuleiro[i][coluna] == 's' || tabuleiro[i][coluna] == 'c') {
                                    cont_2++;
                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                    break;
                                }else {
                                    for (int j = 7; j > 2; j--) {
                                        if (tabuleiro[j][coluna + 1] == 's' || tabuleiro[j][coluna + 1] == 'c') {
                                            cont_2++;
                                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                            break;
                                        }
                                    }
                                }
                            }
                            if (cont_2 == 0) {
                                for (int i = 7; i > 2; i--) {
                                    tabuleiro[i][coluna] = 'p';
                                }
                                cont++;
                            }
                            cont_2 = 0;
                        }else if (linha > 0 && linha < 3) {
                            if (tabuleiro[linha - 1][coluna] == 's' || tabuleiro[linha - 1][coluna] == 'c') {
                                System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                            }else {
                                for (int i = linha; i < linha + 6; i++) {
                                    if (tabuleiro[i][coluna] == 's' || tabuleiro[i][coluna] == 'c') {
                                        cont_2++;
                                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                        break;
                                    }else {
                                        for (int j = linha; j < linha + 5; j++) {
                                            if (tabuleiro[j][coluna + 1] == 's' || tabuleiro[j][coluna + 1] == 'c') {
                                                cont_2++;
                                                System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (cont_2 == 0) {
                                    for (int i = linha; i < linha + 5; i++) {
                                        tabuleiro[i][coluna] = 'p';
                                    }
                                    cont++;
                                }
                                cont_2 = 0;
                            }
                        }
                    }else if (coluna == 7) {
                        if (linha == 0) {
                            for (int i = 0; i < 6; i++) {
                                if (tabuleiro[i][coluna] == 's' || tabuleiro[i][coluna] == 'c') {
                                    cont_2++;
                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                    break;
                                }else {
                                    for (int j = 0; j < 5; j++) {
                                        if (tabuleiro[j][coluna] == 's' || tabuleiro[j][coluna] == 'c') {
                                            cont_2++;
                                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                            break;
                                        }
                                    }
                                }
                            }
                            if (cont_2 == 0) {
                                for (int i = 0; i < 5; i++) {
                                    tabuleiro[i][coluna] = 'p';
                                }
                                cont++;
                            }
                            cont_2 = 0;
                        }if (linha == 7 || linha >= 3) {
                            for (int i = 7; i > 1; i--) {
                                if (tabuleiro[i][coluna] == 's' || tabuleiro[i][coluna] == 'c') {
                                    cont_2++;
                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                    break;
                                }else {
                                    for (int j = 7; j > 2; j--) {
                                        if (tabuleiro[j][coluna - 1] == 's' || tabuleiro[j][coluna - 1] == 'c') {
                                            cont_2++;
                                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                            break;
                                        }
                                    }
                                }
                            }
                            if (cont_2 == 0) {
                                for (int i = 7; i > 2; i--) {
                                    tabuleiro[i][coluna] = 'p';
                                }
                                cont++;
                            }
                            cont_2 = 0;
                        }else if (linha > 0 && linha < 3) {
                            if (tabuleiro[linha - 1][coluna] == 's' || tabuleiro[linha - 1][coluna] == 'c') {
                                System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                            }else {
                                for (int i = linha; i < linha + 6; i++) {
                                    if (tabuleiro[i][coluna] == 's' || tabuleiro[i][coluna] == 'c') {
                                        cont_2++;
                                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                        break;
                                    }else {
                                        for (int j = linha; j < linha + 5; j++) {
                                            if (tabuleiro[j][coluna - 1] == 's' || tabuleiro[j][coluna - 1] == 'c') {
                                                cont_2++;
                                                System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (cont_2 == 0) {
                                    for (int i = linha; i < linha + 5; i++) {
                                        tabuleiro[i][coluna] = 'p';
                                    }
                                    cont++;
                                }
                                cont_2 = 0;
                            }
                        }
                    }else if (coluna > 0 && coluna < 7) {
                        if (linha == 0) {
                            for (int i = 0; i < 6; i++) {
                                if (tabuleiro[i][coluna] == 's' || tabuleiro[i][coluna] == 'c') {
                                    cont_2++;
                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                    break;
                                }else {
                                    for (int j = 0; j < 5; j++) {
                                        if (tabuleiro[j][coluna + 1] == 's' || tabuleiro[j][coluna + 1] == 'c') {
                                            cont_2++;
                                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                            break;
                                        }else {
                                            for (int j2 = 0; j2 < 5; j2++) {
                                                if (tabuleiro[j2][coluna - 1] == 's' || tabuleiro[j2][coluna - 1] == 'c') {
                                                    cont_2++;
                                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (cont_2 == 0) {
                                for (int i = 0; i < 5; i++) {
                                    tabuleiro[i][coluna] = 'p';
                                }
                                cont++;
                            }
                            cont_2 = 0;
                        }else if (linha == 7 || linha >= 3) {
                            for (int i = 7; i > 1; i--) {
                                if (tabuleiro[i][coluna] == 's' || tabuleiro[i][coluna] == 'c') {
                                    cont_2++;
                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                    break;
                                }else {
                                    for (int j = 7; j > 2; j--) {
                                        if (tabuleiro[j][coluna + 1] == 's' || tabuleiro[j][coluna + 1] == 'c') {
                                            cont_2++;
                                            System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                            break;
                                        }else {
                                            for (int j2 = 7; j2 > 2; j2--) {
                                                if (tabuleiro[j2][coluna - 1] == 's' || tabuleiro[j2][coluna - 1] == 'c') {
                                                    cont_2++;
                                                    System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (cont_2 == 0) {
                                for (int i = 7; i > 2; i--) {
                                    tabuleiro[i][coluna] = 'p';
                                }
                                cont++;
                            }
                            cont_2 = 0;
                        }else if (linha > 0 && linha < 3) {
                            if (tabuleiro[linha - 1][coluna] == 's' || tabuleiro[linha - 1][coluna] == 'c') {
                                System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                            }else {
                                for (int i = linha; i < linha + 6; i++) {
                                    if (tabuleiro[i][coluna] == 's' || tabuleiro[i][coluna] == 'c') {
                                        cont_2++;
                                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                        break;
                                    }else {
                                        for (int j = linha; j < linha + 5; j++) {
                                            if (tabuleiro[j][coluna - 1] == 's' || tabuleiro[j][coluna - 1] == 'c') {
                                                cont_2++;
                                                System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                                break;
                                            }else {
                                                for (int j2 = linha; j2 < linha + 5; j2++) {
                                                    if (tabuleiro[j2][coluna + 1] == 's' || tabuleiro[j2][coluna + 1] == 'c') {
                                                        cont_2++;
                                                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (cont_2 == 0) {
                                    for (int i = linha; i < linha + 5; i++) {
                                        tabuleiro[i][coluna] = 'p';
                                    }
                                    cont++;
                                }
                                cont_2 = 0;
                            }
                        }
                    }else {
                        System.out.println("Posição invalida - Falta de espaço\nEscolha outra posição!");
                    }
                }
            }
        }
    }
}
public class JogoDaVelha {

    private int jogo[][] = new int[3][3];

    public JogoDaVelha() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogo[i][j] = 0;
            }
        }
    }

    public void tabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(jogo[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int verificarVencedor() {
        for (int i = 0; i < 3; i++) {
            if ((jogo[i][0] == jogo[i][1]) && (jogo[i][0] == jogo[i][2])) {
                return jogo[i][0];
            }
        }
        for (int j = 0; j < 3; j++) {
            if ((jogo[0][j] == jogo[1][j]) && (jogo[0][j] == jogo[2][j])) {
                return jogo[0][j];
            }
        }
        if ((jogo[0][0] == jogo[1][1]) && (jogo[0][0] == jogo[2][2])) {
            return jogo[0][0];
        }
        if ((jogo[0][2] == jogo[1][1]) && (jogo[0][2] == jogo[2][0])) {
            return jogo[0][2];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (jogo[i][j] == 0) {
                    return 0;
                }
            }
        }
        return 3;
    }

    public boolean jogar(int jogador, int linha, int coluna) {
        if ((linha < 0) || (linha > 2)) {
            return false;
        }
        if ((coluna < 0) || (coluna > 2)) {
            return false;
        }
        if (jogo[linha][coluna] != 0) {
            return false;
        }
        jogo[linha][coluna] = jogador;
        return true;
    }
}
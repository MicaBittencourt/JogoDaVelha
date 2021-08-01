import java.util.Scanner;

public class Jogar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        int jogador = 1;
        int vencedor = jogo.verificarVencedor();
        jogo.tabuleiro();

        while (vencedor == 0) {
            System.out.println("Jogador " + jogador);
            System.out.print("Linha: ");
            int linha = teclado.nextInt();
            System.out.print("Coluna: ");
            int coluna = teclado.nextInt();

            if (!jogo.jogar(jogador, linha - 1, coluna - 1)) {
                System.out.println("Jogada inválida...");
            } else {
                jogador = (jogador == 1) ?  2 : 1;
            }
            jogo.tabuleiro();
            vencedor = jogo.verificarVencedor();
        }
        switch (vencedor) {
            case 1:
                System.out.println("Vencedor jogador 1");
                break;
            case 2:
                System.out.println("Vencedor jogador 2");
                break;
            case 3:
                System.out.println("Empate");
                break;
        }
    }
}
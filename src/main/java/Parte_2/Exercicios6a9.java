package Parte_2;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Exercicios6a9 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 6 a 9");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 6 || escolha > 9) {
                System.out.println("É possível escolher apenas entre 6 a 9");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 6:
                System.out.println("Implementar uma função que informe o dia da semana por extenso a partir do número do dia\nsabendo que a semana começa no Domingo como dia zero.\nSe o número do dia não estiver entre 0 e 6, um erro deve ser lançado com a mensagem: \"Dia da semana inválido\"\n");
                Exercicio6();
                break;
            case 7:
                System.out.println("Implementar uma função que informe o nome de um mês por extenso a partir do número do mês.\n");
                Exercicio7();
                break;
            case 8:
                System.out.println("Implementar uma função que informe qual semestre é, a partir do número do mês.\n");
                Exercicio8();
                break;
            case 9:
                System.out.println("Implementar uma função que represente a lógica do jogo \"Par ou Ímpar\".\nA partir do número colocado pelo jogador1 e jogador2, a função deve informar quem ganhou o jogo, ou se deu empate.\n");
                Exercicio9();
                break;
        }
    }
    
    public static void Exercicio6() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("");
    }
    
    public static void Exercicio7() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("");
    }
    
    public static void Exercicio8() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("");
    }
    
    public static void Exercicio9() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("");
    }
}

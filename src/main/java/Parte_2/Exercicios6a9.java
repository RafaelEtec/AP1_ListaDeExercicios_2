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
        
        try {
            System.out.println("Insira o número equivalente ao dia da Semana: ");
            int dia = ent.nextInt();
            String diaSemana = diaSemana(dia);
            System.out.println(diaSemana);
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static String diaSemana(int dia) {
        String diaSemana;
                
        switch (dia) {
            case 0:
                diaSemana = "Domingo";
                break;
            case 1:
                diaSemana = "Segunda-Feira";
                break;
            case 2:
                diaSemana = "Terça-Feira";
                break;
            case 3:
                diaSemana = "Quarta-Feira";
                break;
            case 4:
                diaSemana = "Quinta-Feira";
                break;
            case 5:
                diaSemana = "Sexta-Feira";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Dia da Semana Inválido!";
                break;
        }
        return diaSemana;
    }
    
    public static void Exercicio7() {
        Scanner ent = new Scanner(System.in);
        
        try {
            System.out.println("Insira o número equivalente ao mês do ano: ");
            int numMes = ent.nextInt();
            String mes = mes(numMes);
            System.out.println(mes);
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static String mes(int numMes) {
        String mes;
                
        switch (numMes) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                mes = "Mês do ano inválido!";
                break;
        }
        return mes;
    }
    public static void Exercicio8() {
        Scanner ent = new Scanner(System.in);   
        
        try {
            System.out.println("Insira o número equivalente ao mês do ano\nPara descobrir o semestre que habita: ");
            int numMes = ent.nextInt();
            String semestre = mesSemestre(numMes);
            System.out.println(semestre);
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static String mesSemestre(int numMes) {
        String semestre;
        
        if (numMes >= 1 && numMes <= 12) {
            if (numMes <= 6) {
                semestre = "Primeiro semestre";
            } else {
                semestre = "Segundo semestre";
            }
        } else {
            semestre = "Mês do ano inválido";
        }
        return semestre;
    }
    
    public static void Exercicio9() {
        Scanner ent = new Scanner(System.in);
        
        try {
            int escolhaJogador1;
            System.out.println("--- Par ou Ímpar ---\n\nJogador 1 - Decida se quer Par <0> ou Ímpar <1>: ");
            escolhaJogador1 = ent.nextInt();
            while (escolhaJogador1 != 0 && escolhaJogador1 != 1) {
                System.out.println("Escolha Par <0> ou Ímpar <1> novamente: ");
                escolhaJogador1 = ent.nextInt();
            }

            System.out.println("Jogador 1 - Insira um número: ");
            int num1 = ent.nextInt();
            System.out.println("Jogador 2 - Insira um número: ");
            int num2 = ent.nextInt();
            String resultadoJogo = parOuImpar(num1, num2, escolhaJogador1);
            System.out.println(resultadoJogo);
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static String parOuImpar(int num1, int num2, int escolhaJogador1) {
        int somaNums = num1 + num2;
        int jogador = 1;
        String resultadoJogo;
        
        if (escolhaJogador1 == 0) {
            if ((somaNums % 2) == 0) {
                resultadoJogo = ("O número "+somaNums+" é Par, Logo o Jogador "+jogador+" Vence!");
            } else {
                jogador = 2;
                resultadoJogo = ("O número "+somaNums+" é Ímpar, Logo o Jogador "+jogador+" Vence!");
            }
        } else {
            if ((somaNums % 2) == 0) {
                jogador = 2;
                resultadoJogo = ("O número "+somaNums+" é Par, Logo o Jogador "+jogador+" Vence!");
            } else {
                resultadoJogo = ("O número "+somaNums+" é Ímpar, Logo o Jogador "+jogador+" Vence!");
            }
        }
        
        return resultadoJogo;
    }
}
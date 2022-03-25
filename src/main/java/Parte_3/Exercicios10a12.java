package Parte_3;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Exercicios10a12 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 10 a 12");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 10 || escolha > 12) {
                System.out.println("É possível escolher apenas entre 10 a 12");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 10:
                System.out.println(
                    "Implementar uma função que informe a situação de um orçamento familiar baseado no total de ganhos e gastos. A situação deve ser calculada a partir da tabela abaixo:\n" +
                    "- Para Gastos menores que 30% dos Ganhos: \"Parabéns, está gerenciando bem seu orçamento!\"\n" +
                    "- Para Gastos menores que 50% dos Ganhos: \"Muito bem, seus gastos não ultrapassam metade dos ganhos!\"\n" +
                    "- Para Gastos menores que 80% dos Ganhos: \"Atenção, melhor conter os gastos!\"\n" +
                    "- Para Gastos menores que 100% dos Ganhos: \"Cuidado, seu orçamento pode ficar comprometido!\"\n" +
                    "- Para Gastos maiores que os Ganhos: \"Orçamento comprometido! Hora de rever seus gastos!\"\n");
                Exercicio10();
                break;
            case 11:
                System.out.println(
                    "Implementar uma função que informe qual é o tipo do triângulo: Isóceles, Escaleno ou Equilátero baseado em seus três lados.\n" +
                    "Implementar uma função que verifique, sim ou não, se uma data informada é válida.\nAs informações da data devem vir separadas por dia, mês e ano no formato numérico.\n");
                Exercicio11();
                break;
            case 12:
                System.out.println(
                    "Implementar uma função que represente uma calculadora.\nA função deve receber dois valores numéricos mais o tipo da operação matemática que deve realizar nos valores e retornar o resultado do cálculo.\nAs operações suportadas estão listadas abaixo.\n" +
                    "- Soma\n" +
                    "- Subtração\n" +
                    "- Multiplicação\n" +
                    "- Divisão\n" +
                    "- Potência\n");
                Exercicio12();
                break;
        }
    }
    
    public static void Exercicio10() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira seus Ganhos: ");
        double ganhos = ent.nextDouble();
        System.out.println("Insira seus Gastos: ");
        double gastos = ent.nextDouble();
        String orcamento = orcamentoPorcentagem(ganhos, gastos);
        System.out.println(orcamento);
    }
    
    public static String orcamentoPorcentagem(double ganhos, double gastos) {
        double situacao = ganhos - gastos;
        String orcamento = "";
        if (gastos <= (30%ganhos)) {
            orcamento = (
                      "Parabéns, está gerenciando bem seu orçamento!\n"
                    + "Você ainda possui: +"+situacao);
        } else if (gastos <= (50%ganhos)) {
            orcamento = (
                      "Muito bem, seus gastos não ultrapassam metade dos ganhos!\n"
                    + "Você ainda possui: +"+situacao);
        } else if (gastos <= (80%ganhos)) {
            orcamento = (
                      "Atenção, melhor conter os gastos!\n"
                    + "Você ainda possui: +"+situacao);
        } else if (gastos <= (99%ganhos)) {
            orcamento = (
                      "Cuidado, seu orçamento pode ficar comprometido!\n"
                    + "Você ainda possui: +"+situacao);
        } else if (gastos >= ganhos) {
            orcamento = (
                      "Orçamento comprometido! Hora de rever seus gastos!\n"
                    + "Seu prejuízo: "+situacao);
        }
        return orcamento;
    }
    
    public static void Exercicio11() {
        
    }
    
    public static void Exercicio12() {
        
    }
}
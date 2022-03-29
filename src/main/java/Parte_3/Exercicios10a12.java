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
                    "Implementar uma função que represente uma calculadora.\nA função deve receber dois valores numéricos mais o tipo da operação matemática que deve realizar nos valores e retornar o resultado do cálculo." +
                    "\nAs operações suportadas estão listadas abaixo.\n" +
                    "- <A> Soma\n" +
                    "- <B> Subtração\n" +
                    "- <C> Multiplicação\n" +
                    "- <D> Divisão\n" +
                    "- <E> Potência\n");
                Exercicio12();
                break;
        }
    }
    
    public static void Exercicio10() {
        Scanner ent = new Scanner(System.in);
        
        try {
            System.out.println("Insira seus Ganhos: ");
            double ganhos = ent.nextDouble();
            System.out.println("Insira seus Gastos: ");
            double gastos = ent.nextDouble();
            String orcamento = orcamentoPorcentagem(ganhos, gastos);
            System.out.println(orcamento);
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
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
        Scanner ent = new Scanner(System.in);
        
        try {
            System.out.println("Será pedido à você três valores\n"
                    + "Para que seja formado um triângulo, É necessário inserir três valores positivos\n"
                    + "Insira o valor do primeiro lado: ");
            double lado1 = ent.nextDouble();
            System.out.println("Insira o valor do segundo lado: ");
            double lado2 = ent.nextDouble();
            System.out.println("Insira o valor do terceiro lado: ");
            double lado3 = ent.nextDouble();

            System.out.println(tipoTriangulo(lado1, lado2, lado3));
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static String tipoTriangulo(double lado1, double lado2, double lado3) {
        String tri = "É um Triângulo ";
        String angulo = "";
        
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            tri = "Não é um triângulo, pois um ou mais valores são negativos ou nulos!";
        } else {
            if (lado1 == lado2 && lado2 == lado3) {
                angulo = "Equilátero";
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                angulo = "Isósceles";
            } else {
                angulo = "Escaleno";
            }
        }
        
        return tri+angulo;
    }
    
    public static void Exercicio12() {
        Scanner ent = new Scanner(System.in);
        
        String saida = "";
        String saidaOperacao = "";
        String opcoes = 
                    "- <A> Soma\n" +
                    "- <B> Subtração\n" +
                    "- <C> Multiplicação\n" +
                    "- <D> Divisão\n" +
                    "- <E> Potência\n";
        boolean podeSair = false;
        
        try {
            System.out.println("Insira o primeiro número: ");
            double num1 = ent.nextDouble();
            System.out.println("Insira o segundo número: ");
            double num2 = ent.nextDouble();
            System.out.println("Agora insira a Operação: ");
            String operacao = ent.next();

            switch (operacao) {
                case "a":
                    saidaOperacao = "Somando: "+num1+" + "+num2+" = ";
                    break;
                case "b":
                    saidaOperacao = "Subtraindo: "+num1+" - "+num2+" = ";
                    break;
                case "c":
                    saidaOperacao = "Multiplicando: "+num1+" * "+num2+" = ";
                    break;
                case "d":
                    saidaOperacao = "Dividindo: "+num1+" / "+num2+" = ";
                    break;
                case "e":
                    saidaOperacao = "Potenciando: "+num1+" ^ "+num2+" = ";
                    break;
                /**case "s":
                    saidaOperacao =
                            "Obrigado!" +
                            "Saindo do programa.";
                    break; **/
            } 

            do {   
                //if (operacao.toLowerCase().equals("s")) {
                //    System.out.println(saidaOperacao);
                //    podeSair = true;
                //} else {
                    double retorno = operacaoMat(num1, operacao, num2);
                    System.out.println(saidaOperacao+retorno);
                    podeSair = true;
                //}
            } while (!podeSair);
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static double operacaoMat(double num1, String operacao, double num2) {
        double resultado = 0;
        
        switch (operacao.toLowerCase()) {
            case "a":
                resultado = num1 + num2;
                break;
            case "b":
                resultado = num1 - num2;
                break;
            case "c":
                resultado = num1 * num2;
                break;
            case "d":
                resultado = num1 / num2;
                break;
            case "e":
                resultado = 1;
                if (num1 == 0 && num2 == 0) {
                    resultado = 1;
                } else if (num1 == 0 && num2 >= 1) {
                    resultado = 0;
                } else {
                    for (int i = 1; i <= num2; i++) {
                        resultado = resultado * num1;
                    }
                }
                break;
        }
        
        return resultado;
    }
}
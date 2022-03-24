package Parte_1;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Exercicios1a5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 1 a 5");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 1 || escolha > 5) {
                System.out.println("É possível escolher apenas entre 1 a 5");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 1:
                System.out.println("Implementar uma função para verificar qual é o maior entre dois números. \nA função deve retornar uma mensagem na formatação: \"O número X é maior que Y\"\n");
                Exercicio1();
                break;
            case 2:
                System.out.println("Implementar uma função para verificar qual é o maior entre dois números. \nSe os números forem iguais, a função deve retornar a mensagem: \"Os números são iguais\"\n");
                Exercicio2();
                break;
            case 3:
                System.out.println("Implementar uma função para verificar qual é o maior entre três números. \nA função deve retornar uma mensagem na formatação: \"O número X é maior que Y e Z\". \nSe os números forem iguais, a função deve retornar a mensagem: \"Os números são iguais\"\n");
                Exercicio3();
                break;
            case 4:
                System.out.println(""
                        +   "Implementar uma função que retorne uma mensagem com a ação que um pedestre deve realizar ao ver seu semáforo. \nAs possíveis ações estão listadas abaixo.\n" +
                            "- Vermelho -> Espere\n" +
                            "- Verde -> Atravasse\n" +
                            "Se a cor for diferente, a função deve retornar uma mensagem com a informação: \"Farol inoperante\"\n");
                Exercicio4();
                break;
            case 5:
                System.out.println("Implementar uma função que informe a situação de um orçamento familiar baseado no total de ganhos e gastos. \nSe o total de ganhos for maior que o total de gastos, deve ser exibido a mensagem: \"Você está dentro do orçamento!\", \nsenão \"Você está fora do orçamento! Não gaste mais!\"\n");
                Exercicio5();
                break;
        }
    }
    
    public static void Exercicio1() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o Primeiro Número: ");
        double num1 = ent.nextDouble();
        System.out.println("Insira o Segundo Número: ");
        double num2 = ent.nextDouble();
        
        if (num1 > num2) {
            System.out.println("O número "+num1+" é maior que "+num2);
        } else {
            System.out.println("O número "+num2+" é maior que "+num1);
        }
    }
    
    public static void Exercicio2() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o Primeiro Número: ");
        double num1 = ent.nextDouble();
        System.out.println("Insira o Segundo Número: ");
        double num2 = ent.nextDouble();
        
        if (num1 == num2) {
            System.out.println("Os números são iguais: "+num1);
        } else if (num1 > num2) {
            System.out.println("O número "+num1+" é maior que "+num2);
        } else {
            System.out.println("O número "+num2+" é maior que "+num1);
        }
    }
    
    public static void Exercicio3() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o Primeiro Número: ");
        double num1 = ent.nextDouble();
        System.out.println("Insira o Segundo Número: ");
        double num2 = ent.nextDouble();
        System.out.println("Insira o Terceiro Número: ");
        double num3 = ent.nextDouble();
        
        if (num1 == num2 && num2 == num3) {
            System.out.println("Os números possuem mesmo valor: "+num1);
        } else if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("O número "+num1+" é maior que "+num2+" e "+num3);
            } else {
                System.out.println("O número "+num3+" é maior que "+num1+" e "+num2);
            }
        } else if (num2 > num3) {
            System.out.println("O número "+num2+" é maior que "+num1+" e "+num3);
        }
    }
    
    public static void Exercicio4() {
            
    }
    
    public static void Exercicio5() {
            
    }
}
package Parte_4;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Exercicios13a16 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 13 a 16");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 13 || escolha > 16) {
                System.out.println("É possível escolher apenas entre 13 a 16");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 13:
                System.out.println(
                          "Implementar uma função que calcule o total a se pagar na compra de ingressos de cinema\n"
                        + "A partir da quantidade de ingressos 'inteiras' e 'meias'.\n"
                        + "O valor do ingresso é R$ 28,50.\n"
                        + "Considere que se o ingresso for para QUARTA-FEIRA, ingressos 'inteiras' também custarão meia entrada.\n");
                Exercicio13();
                break;
            case 14:
                System.out.println(
                          "Implementar uma função que calcule o total a se pagar na compra de ingressos de cinema\n"
                        + "A partir da quantidade de ingressos 'inteiras' e 'meias'.\n"
                        + "O valor do ingresso é R$ 28,50.\n"
                        + "Considere que se o ingresso for para QUARTA-FEIRA, todo ingresso custará meia entrada.\n"
                        + "Se for um filme NACIONAL, o ingresso custará R$ 5,00 para 'inteira' e 'meia'.\n"
                        + "SO desconto para filmes nacionais tem prioridade sobre o desconto de quarta-feira,\n"
                        + "ou seja, os dois descontos não podem acontecer ao mesmo tempo.\n");
                Exercicio14();
                break;
            case 15:
                System.out.println(
                          "Implementar uma função que a partir de duas cores primárias informe a cor resultante.\n"
                        + "Se as cores informadas não forem primárias:\n"
                        + "A função deve retornar uma mensagem dizendo que apenas cores primárias são aceitas.\n");
                Exercicio15();
                break;
            case 16:
                System.out.println(
                          "Implementar uma função que verifique, sim ou não, se uma data informada é válida.\n"
                        + "As informações da data devem vir separadas por dia, mês e ano no formato numérico.\n");
                Exercicio16();
                break;
        }
    }
   
    public static void Exercicio13() {
        Scanner ent = new Scanner(System.in);
        
        String strSaidaDiaSemana = 
                  "Que dia é hoje?\n"
                + "<0> Domingo\n"
                + "<1> Segunda-Feira\n"
                + "<2> Terça-Feira\n"
                + "<3> Quarta-Feira\n"
                + "<4> Quinta-Feira\n"
                + "<5> Sexta-Feira\n"
                + "<6> Sábado\n";
        String strDiaSemana = "";    
        double ingressosValTotal = 0;
          
        System.out.println(strSaidaDiaSemana);
        int diaSemana = ent.nextInt();
        
        while (diaSemana < 0 || diaSemana > 6) {
            System.out.println(strSaidaDiaSemana);
            diaSemana = ent.nextInt(); 
        }
        
        switch (diaSemana) {
            case 0:
                strDiaSemana = "Domingo";
                ingressosValTotal = ingressosValTotal(diaSemana);
                break;
            case 1:
                strDiaSemana = "Segunda-Feira";
                ingressosValTotal = ingressosValTotal(diaSemana);
                break;
            case 2:
                strDiaSemana = "Terça-Feira";
                ingressosValTotal = ingressosValTotal(diaSemana);
                break;
            case 3:
                strDiaSemana = "Quarta-Feira";
                ingressosValTotal = ingressosValTotal(diaSemana);
                break;
            case 4:
                strDiaSemana = "Quinta-Feira";
                ingressosValTotal = ingressosValTotal(diaSemana);
                break;
            case 5:
                strDiaSemana = "Sexta-Feira";
                ingressosValTotal = ingressosValTotal(diaSemana);
                break;
            case 6:
                strDiaSemana = "Sábado";
                ingressosValTotal = ingressosValTotal(diaSemana);
                break;
        }     
        
        System.out.println("Hoje é "+strDiaSemana+"\nVocê pagará: R$"+ingressosValTotal);
    }
    
    public static double ingressosValTotal(int diaSemana) {
        Scanner ent = new Scanner(System.in);
        
        String valorIngressos = 
                  "O valor do ingresso é: \n"
                + "Inteira - R$ 28,50\n"
                + "Meia    - R$ 14,25\n"
                + "Às Quartas-feiras todos pagam Meia!\n";
        String strQuantIngressosInteira = "Quantidade de Ingressos de Inteira: ";
        String strQuantIngressosMeia = "Quantidade de Ingressos de Meia entrada: ";
        double inteiraTotal, meiaTotal, valTotal;
        double valInteira = 28.50;
        double valMeia = 14.25;
        
        System.out.println(valorIngressos);
        System.out.println(strQuantIngressosInteira);
        int quantIngressosInteira = ent.nextInt();
        System.out.println(strQuantIngressosMeia);
        int quantIngressosMeia = ent.nextInt();
        
        if (diaSemana == 3) {
            quantIngressosMeia = quantIngressosMeia + quantIngressosInteira;
            valTotal = valMeia * quantIngressosMeia;
        } else {
            inteiraTotal = valInteira * quantIngressosInteira;
            meiaTotal = valMeia * quantIngressosMeia;
            valTotal = inteiraTotal + meiaTotal;
        }
        
        return valTotal;
    }
    
    public static void Exercicio14() {
        Scanner ent = new Scanner(System.in);
        
        String strSaidaDiaSemana = 
                  "Que dia é hoje?\n"
                + "<0> Domingo\n"
                + "<1> Segunda-Feira\n"
                + "<2> Terça-Feira\n"
                + "<3> Quarta-Feira\n"
                + "<4> Quinta-Feira\n"
                + "<5> Sexta-Feira\n"
                + "<6> Sábado\n";
        String strDiaSemana = "";
        String strSaidaTipoFilme = 
                  "O Filme é: \n"
                + "<0> Nacional\n"
                + "    ou: \n"
                + "<1> Internacional";
        String strTipoFilme = "Nacional";
        double ingressosValTotal = 0;
          
        System.out.println(strSaidaDiaSemana);
        int diaSemana = ent.nextInt();  
        while (diaSemana < 0 || diaSemana > 6) {
            System.out.println(strSaidaDiaSemana);
            diaSemana = ent.nextInt(); 
        }
        
        System.out.println(strSaidaTipoFilme);
        int tipoFilme = ent.nextInt();
        while (tipoFilme < 0 || tipoFilme > 1) {
            System.out.println(strSaidaTipoFilme);
            tipoFilme = ent.nextInt();
        }
        
        if (tipoFilme == 1) {
            strTipoFilme = "Internacional";
        }
        
        switch (diaSemana) {
            case 0:
                strDiaSemana = "Domingo";
                ingressosValTotal = ingressosValTotalTipo(diaSemana, tipoFilme);
                break;
            case 1:
                strDiaSemana = "Segunda-Feira";
                ingressosValTotal = ingressosValTotalTipo(diaSemana, tipoFilme);
                break;
            case 2:
                strDiaSemana = "Terça-Feira";
                ingressosValTotal = ingressosValTotalTipo(diaSemana, tipoFilme);
                break;
            case 3:
                strDiaSemana = "Quarta-Feira";
                ingressosValTotal = ingressosValTotalTipo(diaSemana, tipoFilme);
                break;
            case 4:
                strDiaSemana = "Quinta-Feira";
                ingressosValTotal = ingressosValTotalTipo(diaSemana, tipoFilme);
                break;
            case 5:
                strDiaSemana = "Sexta-Feira";
                ingressosValTotal = ingressosValTotalTipo(diaSemana, tipoFilme);
                break;
            case 6:
                strDiaSemana = "Sábado";
                ingressosValTotal = ingressosValTotalTipo(diaSemana, tipoFilme);
                break;
        }     
        
        System.out.println("Hoje é "+strDiaSemana+"\nO Filme é "+strTipoFilme+"\nVocê pagará: R$"+ingressosValTotal);
    }
    
    public static double ingressosValTotalTipo(int diaSemana, int tipoFilme) {
        Scanner ent = new Scanner(System.in);
        
        String valorIngressos = 
                  "O valor do ingresso é: \n"
                + "Inteira - R$ 28,50\n"
                + "Meia    - R$ 14,25\n"
                + "Às Quartas-feiras todos pagam Meia!\n";
        String strQuantIngressosInteira = "Quantidade de Ingressos de Inteira: ";
        String strQuantIngressosMeia = "Quantidade de Ingressos de Meia entrada: ";
        double inteiraTotal, meiaTotal, valTotal;
        double valInteira = 28.50;
        double valMeia = 14.25;
        double valNacional = 5.00;
        
        System.out.println(valorIngressos);
        System.out.println(strQuantIngressosInteira);
        int quantIngressosInteira = ent.nextInt();
        System.out.println(strQuantIngressosMeia);
        int quantIngressosMeia = ent.nextInt();
        
        if (diaSemana == 3) {
            if (tipoFilme == 0) {
                quantIngressosMeia = quantIngressosMeia + quantIngressosInteira;
                valTotal = valNacional * quantIngressosMeia;
            } else {
                quantIngressosMeia = quantIngressosMeia + quantIngressosInteira;
                valTotal = valMeia * quantIngressosMeia;
            }
        } else if (tipoFilme == 0) {
            quantIngressosMeia = quantIngressosMeia + quantIngressosInteira;
            valTotal = valNacional * quantIngressosMeia;
        } else {
            inteiraTotal = valInteira * quantIngressosInteira;
            meiaTotal = valMeia * quantIngressosMeia;
            valTotal = inteiraTotal + meiaTotal;
        }
        
        return valTotal;
    }
    
    public static void Exercicio15() {
        Scanner ent = new Scanner(System.in);
        
        String strCoresPri = 
                  "As Cores Primárias são: \n"
                + " - Vermelho\n"
                + " - Amarelo\n"
                + " - Azul\n";
        
        System.out.println(strCoresPri+"Informe a Primeira cor primária: ");
        String corPri1 = ent.next();
        System.out.println("Informe a Segunda cor primária: ");
        String corPri2 = ent.next();
        
        String corSec = corSecundaria(corPri1, corPri2);
        System.out.println(corSec);
    }
    
    public static String corSecundaria(String corPri1, String corPri2) {
        String corSec = "";
        String strResultado = "A mistura das cores "+corPri1+" e "+corPri2+" resultam na cor: ";
                
        if (corPri1.toLowerCase().equals("vermelho") 
         || corPri1.toLowerCase().equals("amarelo") 
         || corPri1.toLowerCase().equals("azul")) {
            
            if (corPri2.toLowerCase().equals("vermelho")
             || corPri2.toLowerCase().equals("amarelo")
             || corPri2.toLowerCase().equals("azul")) {
                
                if (corPri1.toLowerCase().equals("vermelho") && corPri2.toLowerCase().equals("vermelho")) {
                    strResultado = "A mistura mantêm-se na cor Vermelha";
                } else if (corPri1.toLowerCase().equals("amarelo") && corPri2.toLowerCase().equals("amarelo")) {
                    strResultado = "A mistura mantêm-se na cor Amarela";
                } else if (corPri1.toLowerCase().equals("azul") && corPri2.toLowerCase().equals("azul")) {
                    strResultado = "A mistura mantêm-se na cor Azul";
                } else if (corPri1.toLowerCase().equals("vermelho") || corPri2.toLowerCase().equals("vermelho")) {
                    if (corPri1.toLowerCase().equals("amarelo") || corPri2.toLowerCase().equals("amarelo")) {
                        corSec = "Laranja";
                    } else {
                        corSec = "Violeta";
                    }
                } else if (corPri1.toLowerCase().equals("azul") || corPri2.toLowerCase().equals("azul")) {
                   if (corPri1.toLowerCase().equals("amarelo") || corPri2.toLowerCase().equals("amarelo")) {
                        corSec = "Verde";
                    } else {
                        corSec = "Violeta";
                    }
                }
            } else {
                strResultado = "Apenas cores Primárias são aceitas!";
            }
        } else {
            strResultado = "Apenas cores Primárias são aceitas!";
        }
        
        return strResultado+corSec;
    }
    
    public static void Exercicio16() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o dia: ");
        int dia = ent.nextInt();
        System.out.println("Informe o mês: ");
        int mes = ent.nextInt();
        System.out.println("Informe o ano: ");
        int ano = ent.nextInt();
        
        String validaData[] = validaData(dia, mes, ano);
        System.out.println(validaData[3]+"\n"+validaData[0]+"\n"+validaData[1]+"\n"+validaData[2]);
        System.out.println("Data informada: "+dia+"/"+mes+"/"+ano);
    }
    
    public static String[] validaData(int dia, int mes, int ano) {
        String[] validaData = new String[4];
        String mesExtenso = nomeMesNum(mes);
        validaData[3] = "Data válida, visto que: ";
        boolean dataInvalida = false;
        
        if (dia >= 1 && dia <= 31) {
            if (dia == 31 && mes%2 == 0) {
                validaData[0] = dia+" - Dia inválido, O mês de "+mesExtenso+" não possui 31 dias!";
                dataInvalida = true;
            } else {
                validaData[0] = dia+" - Dia válido";
            }
        } else if (dia > 31) {
            validaData[0] = dia+" - Dia inválido, O valor excede 31!";
            dataInvalida = true;
        } else {
            validaData[0] = dia+" - Dia inválido, O valor é negativo!";
            dataInvalida = true;
        }
        // mes%2 == 0 -> 30 dias
        if (mes >= 1 && mes <= 12) {
            if (dia == 29 && mes == 2 && ano%4 == 0) {
                validaData[1] = mes+" - Mês válido, Fevereiro pode possuir 29 dias caso o ano seja bissexto.";
            } else if (dia == 29 && mes == 2) {
                validaData[1] =  mes+" - Mês inválido, Fevereiro somente possuirá 29 dias caso seja o ano seja bissexto.";
                dataInvalida = true;
            } else if (mes == 2 && dia > 28) {
                validaData[1] = mes+" - Mês inválido, Fevereiro possui apenas 28 dias!";
                dataInvalida = true;
            } else {
                validaData[1] = mes+" - Mês válido.";
            }
        } else if (mes > 12) {
            validaData[1] = mes+" - Mês inválido, O valor excede 12!";
            dataInvalida = true;
        } else {
            validaData[1] = mes+" - Mês inválido, O valor é negativo";
            dataInvalida = true;
        }
        
        if (ano >= 1 && ano <= 9999) {
            validaData[2] = ano+" - Ano válido.";
        } else if (ano > 9999) {          
            validaData[2] = ano+" - Ano inválido, O valor excede 9999!";
            dataInvalida = true;
        } else {
            validaData[2] = ano+" - Ano inválido, O valor é negativo!";
            dataInvalida = true;
        }
        
        if (dataInvalida == true) {
            validaData[3] = "\nData inválida pois:";
        }
        
        return validaData;
    }
    
    public static String nomeMesNum (int mes) {
        String mesExtenso = "";
        
        switch (mes) {
            case 1:
                mesExtenso = "Janeiro";
                break;
            case 2:
                mesExtenso = "Fevereiro";
                break;
            case 3:
                mesExtenso = "Março";
                break;
            case 4:
                mesExtenso = "Abril";
                break;
            case 5:
                mesExtenso = "Maio";
                break;
            case 6:
                mesExtenso = "Junho";
                break;
            case 7:
                mesExtenso = "Julho";
                break;
            case 8:
                mesExtenso = "Agosto";
                break;
            case 9:
                mesExtenso = "Setembro";
                break;
            case 10:
                mesExtenso = "Outubro";
                break;
            case 11:
                mesExtenso = "Novembro";
                break;
            case 12:
                mesExtenso = "Dezembro";
                break;
        }
        
        return mesExtenso;
    }
}
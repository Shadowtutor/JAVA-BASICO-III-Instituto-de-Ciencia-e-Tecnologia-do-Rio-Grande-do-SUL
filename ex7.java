/*Faça um programa que apresente o menu de opções a seguir, permita ao usuário escolher a opção desejada, 
receba os dados necessários para executar a operação e mostre o resultado. Verifique a possibilidade de opção inválida.

Menu de opções:

Imposto
Novo Salário
Classificação
Finalizar o programa
Na opção 1, receber o salário de um funcionário, calcular e mostrar o valor do imposto usando as seguintes regras:

Se o salário for menor do que R$ 1000,00, o percentual de imposto será de 5%.
Se o salário for um valor de R$ 1000,00 a R$ 3000,00, o percentual de imposto será de 10%.
Se o salário estiver acima de R$ 3000,00, o percentual de imposto será de 15%.
Na opção 2, receber o salário de um funcionário, calcular e mostrar o valor do novo salário usando as regras a seguir.

Para salários maiores do que R$ 4500,00, o aumento será de R$ 45,00.
Para salários de R$ 2250,00 até R$ 4500,00, o aumento será de R$ 150,00.
Para salários de R$ 1350,00 até R$ 2249,99, o aumento será de R$ 225,00.
Para salário menores que R$ 1350,00, o aumento será de R$ 300,00.
Na opção 3, receber o salário de um funcionário e mostrar sua classificação usando as seguintes regras:

Para salários até R$ 1500,00 a classificação será "Mal remunerado".
Para salários maiores que R$ 1500,00 a classificação será "Bem remunerado".
O programa que precisamos construir deve exibir o menu de opções enquanto o usuário não escolher a opção de finalizar o programa. 
O pseudocódigo abaixo mostra um algoritmo que repete a exibição do menu de opções enquanto o usuário não finalizar o programa.  */


import java.util.Scanner; //importando a classe Scanner
public class ex7 { //classe principal
    public static void main(String[] args) { //método principal
        Scanner leitor = new Scanner(System.in); //criando um objeto Scanner
        int opcao = 0; //declarando variáveis
        double salario = 0; //declarando variáveis
        double imposto = 0; //declarando variáveis
        double novoSalario = 0; //declarando variáveis
        String classificacao = ""; //declarando variáveis
        while (opcao != 4) { //laço de repetição
            System.out.println("Menu de opções:"); //imprimindo na tela
            System.out.println("1 - Imposto"); //imprimindo na tela
            System.out.println("2 - Novo Salário"); //imprimindo na tela
            System.out.println("3 - Classificação"); //imprimindo na tela
            System.out.println("4 - Finalizar o programa"); //imprimindo na tela
            System.out.print("Digite a opção desejada: "); //imprimindo na tela
            opcao = leitor.nextInt(); //lendo a opção
            switch (opcao) { //estrutura de decisão
                case 1: //caso a opção seja 1
                    System.out.print("Digite o salário do funcionário: "); //imprimindo na tela
                    salario = leitor.nextDouble(); //lendo o salário
                    if (salario < 1000) { //estrutura de decisão
                        imposto = salario * 0.05;//calculando o imposto
                    } else if (salario <= 3000) {//estrutura de decisão
                        imposto = salario * 0.1;//calculando o imposto
                    } else {//estrutura de decisão
                        imposto = salario * 0.15;//calculando o imposto
                    }
                    System.out.println("O valor do imposto é: " + imposto);//imprimindo na tela
                    break;//saindo do laço
                case 2://caso a opção seja 2                                    
                    System.out.print("Digite o salário do funcionário: ");//imprimindo na tela
                    salario = leitor.nextDouble();//lendo o salário
                    if (salario > 4500) {//estrutura de decisão
                        novoSalario = salario + 45;//calculando o novo salário
                    } else if (salario >= 2250) {//estrutura de decisão
                        novoSalario = salario + 150;//calculando o novo salário
                    } else if (salario >= 1350) {//estrutura de decisão
                        novoSalario = salario + 225;//calculando o novo salário
                    } else {//estrutura de decisão
                        novoSalario = salario + 300;//calculando o novo salário
                    }
                    System.out.println("O novo salário é: " + novoSalario);//imprimindo na tela
                    break;//saindo do laço
                case 3://caso a opção seja 3
                    System.out.print("Digite o salário do funcionário: ");//imprimindo na tela
                    salario = leitor.nextDouble();//lendo o salário
                    if (salario <= 1500) {//estrutura de decisão
                        classificacao = "Mal remunerado";//classificando o salário
                    } else {//estrutura de decisão
                        classificacao = "Bem remunerado";//classificando o salário
                    }
                    System.out.println("A classificação é: " + classificacao);//imprimindo na tela
                    break;//saindo do laço
                case 4://caso a opção seja 4
                    System.out.println("Programa finalizado.");//imprimindo na tela
                    break;//saindo do laço
                default://caso a opção seja inválida
                    System.out.println("Opção inválida.");//imprimindo na tela
            }

    }
}
}

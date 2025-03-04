/*1. Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os
dados de idade, sexo (M ou F), e salário. Faça um programa que leia essas
informações para cada habitante, calcule e mostre:
 a média dos salários do grupo;
 a maior e a menor idade do grupo;
 a quantidade de mulheres com salário até R$ 1500,00;
 a idade e o sexo da pessoa que possui o menor salário.
Finalize a entrada de dados ao ser digitada uma idade negativa. */

import java.util.Scanner; //importando a classe Scanner


public class ex8 {//classe principal, podem haver outras classes dentro dela no futuro
    public static void main(String[] args) { //método principal, aqui é onde irão entrar os comandos e as futuras classes


        Scanner leitor = new Scanner(System.in);//criando um objeto Scanner que irá substituir o System.in
        int idade = 0;//declarando variáveis, atribuindo valor 0 porque no futuro irao receber valores
        char sexo = ' ';//declarando variáveis
        double salario = 0;//declarando variáveis
        double mediaSalario = 0;//declarando variáveis
        double somaSalario = 0;//declarando variáveis
        int maiorIdade = 0;//declarando variáveis
        int menorIdade = 0;//declarando variáveis
        int qtdMulheres = 0;//declarando variáveis
        double menorSalario = 0;//declarando variáveis
        int idadeMenorSalario = 0;//declarando variáveis
        char sexoMenorSalario = ' ';//declarando variáveis
        int qtdHabitantes = 0;//declarando variáveis
        
        
        while (idade >= 0) {//laço de repetição, que ira rodar enquanto a idade for maior ou igual a 0
            System.out.print("Digite a idade do habitante: ");//imprimindo na tela
            idade = leitor.nextInt();//lendo a idade
            if (idade < 0) {//estrutura de decisão, que irá verificar se a idade é menor que 0
                break;//saindo do laço, se idade for menor que 0
            }
            
            System.out.print("Digite o sexo do habitante (M ou F): ");//imprimindo na tela
            sexo = leitor.next().charAt(0);//lendo o sexo
            if (sexo != 'M' && sexo != 'F') {//estrutura de decisão, para caso o sexo seja diferente de M ou F
                System.out.println("Sexo inválido!");//imprimindo na tela
                continue;//continuando o laço, caso o sexo seja inválido, retornará ao início do laço.
            }
            
            System.out.print("Digite o salário do habitante: ");//imprimindo na tela
            salario = leitor.nextDouble();//lendo o salário, que o usuario irá digitar
            somaSalario += salario;//somando os salários, pois antes ele valia 0, agora valera o valor digitado
            qtdHabitantes++;//incrementando a quantidade de habitantes, pois antes ele valia 0, agora valera o valor digitado
            
            if (qtdHabitantes == 1) {//estrutura de decisão para verificar se a quantidade de habitantes é igual a 1
                maiorIdade = idade;//atribuindo a idade
                menorIdade = idade;//atribuindo a idade
                menorSalario = salario;//atribuindo o salário
                idadeMenorSalario = idade;//atribuindo a idade
                sexoMenorSalario = sexo;//atribuindo o sexo
            } else {//estrutura de decisão para caso a quantidade de habitantes seja diferente de 1
                if (idade > maiorIdade) {//estrutura de decisão para verificar se a idade é maior que a maior idade
                    maiorIdade = idade;//atribuindo a idade
                }
                if (idade < menorIdade) {//estrutura de decisão para verificar se a idade é menor que a menor idade
                    menorIdade = idade;//atribuindo a idade
                }
                if (sexo == 'F' && salario <= 1500) {//estrutura de decisão para verificar se o sexo é feminino e o salário é menor ou igual a 1500
                    qtdMulheres++;//incrementando a quantidade de mulheres
                }
                if (salario < menorSalario) {//estrutura de decisão para verificar se o salário é menor que o menor salário
                    menorSalario = salario;//atribuindo o salário
                    idadeMenorSalario = idade;//atribuindo a idade
                    sexoMenorSalario = sexo;//atribuindo o sexo
                }
            }
        }
        mediaSalario = somaSalario / qtdHabitantes;//calculando a média dos salários
        System.out.println("A média dos salários do grupo é: " + mediaSalario);//imprimindo na tela
        System.out.println("A maior idade do grupo é: " + maiorIdade);//imprimindo na tela
        System.out.println("A menor idade do grupo é: " + menorIdade);//imprimindo na tela
        System.out.println("A quantidade de mulheres com salário até R$ 1500,00 é: " + qtdMulheres);//imprimindo na tela
        System.out.println("A idade da pessoa que possui o menor salário é: " + idadeMenorSalario);//imprimindo na tela
        System.out.println("O sexo da pessoa que possui o menor salário é: " + sexoMenorSalario);//imprimindo na tela
}
}

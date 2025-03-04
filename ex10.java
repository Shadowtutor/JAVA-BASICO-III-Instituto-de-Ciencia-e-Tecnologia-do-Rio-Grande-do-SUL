/*A empresa JS Recrutamento e Seleção Ltda. faz recrutamento e seleção de
funcionários para várias empresas em diversos ramos de atuação. Para facilitar
o trabalho de identificação do perfil dos candidatos que se inscrevem para as
vagas, resolveu fazer um programa para registrar alguns dados para obter as
informações a seguir:
a. número de candidatos do sexo feminino;
b. número de candidatos do sexo masculino;
c. idade média dos homens;
d. idade média das mulheres com experiência
Faça um programa para calcular as informações solicitadas anteriormente,
sabendo que para cada candidato devem ser informados sexo (M ou F), idade e
tempo de experiência profissional (em anos). Também considere que a cada
iteração deverá ser perguntado ao usuário se deseja cadastrar outro candidato
ou não. Quando a resposta for negativa, os resultados deverão ser
apresentados. */    

import java.util.Scanner; //importando a classe Scanner

public class ex10 { //classe principal, poderão haver outras classes dentro dela no futuro
    public static void main(String[] args) { //método principal, aqui é onde irão entrar os comandos e as futuras classes
        
        Scanner leitor = new Scanner(System.in); //criando um objeto Scanner para substituir o System.in
        char sexo = ' '; //declarando variáveis
        int idade = 0; //declarando variáveis
        int tempoExperiencia = 0; //declarando variáveis
        int qtdFeminino = 0; //declarando variáveis
        int qtdMasculino = 0; //declarando variáveis
        int somaIdadeHomens = 0; //declarando variáveis
        int somaIdadeMulheres = 0; //declarando variáveis
        int qtdHomens = 0; //declarando variáveis
        int qtdMulheres = 0; //declarando variáveis
        int idadeMediaHomens = 0; //declarando variáveis
        int idadeMediaMulheres = 0; //declarando variáveis
        int qtdCandidatos = 0; //declarando variáveis
        char resposta = ' '; //declarando variáveis
        
        do { //"faça", é um laço de repetição que irá rodar até que a condição seja falsa
            System.out.print("Digite o sexo do candidato (M ou F): "); //imprimindo na tela
            sexo = leitor.next().charAt(0); //observe que quando for letra, é necessário colocar o next().charAt(0)
            
            while (sexo != 'M' && sexo != 'F') { //laço de repetição para verificar se o sexo é diferente de M e F
                System.out.println("Sexo inválido!"); //imprimindo na tela
                System.out.print("Digite o sexo do candidato (M ou F): "); //imprimindo na tela
                sexo = leitor.next().charAt(0); //lendo o sexo
            }
            System.out.print("Digite a idade do candidato: "); //imprimindo na tela
            idade = leitor.nextInt(); //lendo a idade
            System.out.print("Digite o tempo de experiência do candidato: "); //imprimindo na tela
            tempoExperiencia = leitor.nextInt(); //lendo o tempo de experiência
            if (sexo == 'M') { //estrutura de decisão para verificar se o sexo é masculino
                somaIdadeHomens += idade; //somando as idades dos homens
                qtdHomens++; //incrementando a quantidade de homens
            } else if (sexo == 'F') { //estrutura de decisão para verificar se o sexo é feminino
                somaIdadeMulheres += idade; //somando as idades das mulheres
                qtdMulheres++; //incrementando a quantidade de mulheres
            }
            qtdCandidatos++; //incrementando a quantidade de candidatos
            System.out.print("Deseja cadastrar outro candidato? ( S ou N): "); //imprimindo na tela
            resposta = leitor.next().charAt(0); //lendo a resposta
    } while (resposta == 'S'); //condição para continuar o laço
    if (qtdHomens > 0) { //estrutura de decisão para verificar se a quantidade de homens é maior que 0
        idadeMediaHomens = somaIdadeHomens / qtdHomens; //calculando a idade média dos homens
    
    if (qtdMulheres > 0) { //estrutura de decisão para verificar se a quantidade de mulheres é maior que 0
        idadeMediaMulheres = somaIdadeMulheres / qtdMulheres; //calculando a idade média das mulheres
    }
    
    System.out.println("Número de candidatos do sexo feminino: " + qtdMulheres); //imprimindo na tela
    System.out.println("Número de candidatos do sexo masculino: " + qtdHomens); //imprimindo na tela}
    System.out.println("Idade média dos homens: " + idadeMediaHomens); //imprimindo na tela
    System.out.println("Idade média das mulheres com experiência: " + idadeMediaMulheres); //imprimindo na tela
        

}
}
}
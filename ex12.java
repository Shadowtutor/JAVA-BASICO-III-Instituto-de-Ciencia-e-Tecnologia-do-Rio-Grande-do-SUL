/*Foi realizada uma pesquisa de algumas características físicas da população de
certa região, a qual coletou os seguintes dados referentes a cada habitante
para serem analisados:
 sexo (M ou F);
 cor dos olhos (1 – azuis, 2 – verdes, 3 – castanhos);
 cor dos cabelos (L – louros, C – castanhos, P – pretos, R - ruivos);
 idade;
 altura;
 peso.
Escreva um programa que leia essas informações para cada pessoa e apresente
a média da idade dos participantes, a média do peso e da altura de seus habitantes, a
porcentagem de pessoas do sexo feminino, a porcentagem de pessoas do sexo
masculino e quantas pessoas possuem olhos azuis e cabelos ruivos. A cada iteração
deverá ser perguntado ao usuário se deseja continuar ou não. Os resultados deverão
ser mostrados apenas quando o usuário não desejar mais inserir dados. */

import java.util.Scanner; //importa a classe Scanner que será usada para leitura de dados do usuário

public class ex12 { //classe principal
    
    public static void main(String[] args) {//método principal
        

        Scanner input = new Scanner(System.in); //instanciação do objeto input da classe Scanner que substitui o System.in


        char sexo, corOlhos, corCabelos, continuar;//declaração das variáveis do tipo char  
        int idade, olhosAzuis = 0, cabelosRuivos = 0, totalPessoas = 0, totalFeminino = 0, totalMasculino = 0; //declaração das variáveis do tipo inteiro
        double altura, peso, mediaIdade = 0, mediaPeso = 0, mediaAltura = 0, porcentagemFeminino = 0, porcentagemMasculino = 0; //declaração das variáveis do tipo double
        


        do { //laço de repetição para ler as informações de cada pessoa
            System.out.println("Digite o sexo da pessoa (M ou F): ");
            sexo = input.next().charAt(0); //leitura do sexo da pessoa digitado pelo usuário
            System.out.println("Digite a cor dos olhos da pessoa (1 – azuis, 2 – verdes, 3 – castanhos): ");
            corOlhos = input.next().charAt(0); //leitura da cor dos olhos da pessoa digitado pelo usuário
            System.out.println("Digite a cor dos cabelos da pessoa (L – louros, C – castanhos, P – pretos, R - ruivos): ");
            corCabelos = input.next().charAt(0); //leitura da cor dos cabelos da pessoa digitado pelo usuário
            System.out.println("Digite a idade da pessoa: ");
            idade = input.nextInt(); //leitura da idade da pessoa digitado pelo usuário
            System.out.println("Digite a altura da pessoa: ");
            altura = input.nextDouble();//leitura da altura da pessoa digitado pelo usuário
            System.out.println("Digite o peso da pessoa: ");
            peso = input.nextDouble();//leitura do peso da pessoa digitado pelo usuário
            
            if (sexo == 'F') { //condicional para calcular a quantidade de pessoas do sexo feminino
                totalFeminino++; //incrementa a quantidade de pessoas do sexo feminino
            } else if (sexo == 'M') { //condicional para calcular a quantidade de pessoas do sexo masculino
                totalMasculino++; //incrementa a quantidade de pessoas do sexo masculino
            }
            
            if (corOlhos == '1') { //condicional para calcular a quantidade de pessoas com olhos azuis
                olhosAzuis++; //incrementa a quantidade de pessoas com olhos azuis
            }
            
            if (corCabelos == 'R') { //condicional para calcular a quantidade de pessoas com cabelos ruivos
                cabelosRuivos++; //incrementa a quantidade de pessoas com cabelos ruivos
            }
            
            mediaIdade += idade; //cálculo da média da idade dos participantes
            mediaPeso += peso; //cálculo da média do peso dos participantes
            mediaAltura += altura; //cálculo da média da altura dos participantes
            totalPessoas++; //incrementa a quantidade total de pessoas
            
            System.out.println("Deseja continuar? (S ou N): "); //pergunta ao usuário se deseja continuar
            continuar = input.next().charAt(0); //leitura da resposta do usuário
        
        } while (continuar == 'S'); //condição para continuar o laço de repetição
        
        mediaIdade /= totalPessoas;
        mediaPeso /= totalPessoas;
        mediaAltura /= totalPessoas;
        
        porcentagemFeminino = (totalFeminino * 100) / totalPessoas; //cálculo da porcentagem de pessoas do sexo feminino
        porcentagemMasculino = (totalMasculino * 100) / totalPessoas; //cálculo da porcentagem de pessoas do sexo masculino
        System.out.println("Média da idade dos participantes: " + mediaIdade); //impressão da média da idade dos participantes
        System.out.println("Média do peso dos participantes: " + mediaPeso); //impressão da média do peso dos participantes
        System.out.println("Média da altura dos participantes: " + mediaAltura); //impressão da média da altura dos participantes
        System.out.println("Porcentagem de pessoas do sexo feminino: " + porcentagemFeminino); //impressão da porcentagem de pessoas do sexo feminino
        System.out.println("Porcentagem de pessoas do sexo masculino: " + porcentagemMasculino); //impressão da porcentagem de pessoas do sexo masculino
        System.out.println("Quantidade de pessoas com olhos azuis: " + olhosAzuis); //impressão da quantidade de pessoas com olhos azuis
    }
}
/*Faça um programa que receba o tipo de ação, ou seja, uma letra qualquer a ser
comercializada na bolsa de valores, o preço de compra e o preço de venda de
cada ação e que calcule e mostre:
 a quantidade de ações com lucro superior a R$ 1.000,00;
 a quantidade de ações com lucro inferior a R$ 200,00.
Finalize com o tipo de ação ‘F’.*/

import java.util.Scanner; //importando a classe Scanner

public class ex9 { //clase  principal, poderão haver outras classes dentro dela no futuro
    public static void main(String[] args) { //metodo principal, aqui é onde irão entrar os comandos e as futuras classes
       
       
        Scanner leitor = new Scanner(System.in); //criando um objeto Scanner para substituir o System.in
        char tipoAcao = ' '; //declarando variáveis
        double precoCompra = 0; //declarando variáveis
        double precoVenda = 0; //declarando variáveis
        int qtdLucroMaior1000 = 0; //declarando variáveis
        int qtdLucroMenor200 = 0; //declarando variáveis
        double lucro = 0; //declarando variáveis


        while (tipoAcao != 'F') { //laço de repetição para rodar enquanto o tipo da ação for diferente de F
            System.out.print("Digite o tipo da ação: "); //imprimindo na tela
            tipoAcao = leitor.next().charAt(0); //lendo o tipo da ação, atribuirá o valor digitado
            if (tipoAcao == 'F') { //estrutura de decisão para verificar se o tipo da ação é F
                break; //saindo do laço caso seja F
            }
            System.out.print("Digite o preço de compra da ação: "); //imprimindo na tela
            precoCompra = leitor.nextDouble(); //lendo o preço de compra, atribuirá o valor digitado
            System.out.print("Digite o preço de venda da ação: "); //imprimindo na tela
            precoVenda = leitor.nextDouble(); //lendo o preço de venda
            lucro = precoVenda - precoCompra; //calculando o lucro
            if (lucro > 1000) { //estrutura de decisão para verificar se o lucro é maior que R$ 1.000,00
                qtdLucroMaior1000++; //incrementando a quantidade de ações com lucro maior que R$ 1.000,00
            } else if (lucro < 200) { //estrutura de decisão para verificar se o lucro é menor que R$ 200,00
                qtdLucroMenor200++; //incrementando a quantidade de ações com lucro menor que R$ 200,00
            }
        }
        System.out.println("Quantidade de ações com lucro superior a R$ 1.000,00: " + qtdLucroMaior1000); //imprimindo na tela
        System.out.println("Quantidade de ações com lucro inferior a R$ 200,00: " + qtdLucroMenor200); //imprimindo na tela
    }
}

/*A empresa PowerSoftware Ltda. possui 58 funcionários e pretende processar
sua folha de pagamento de forma informatizada. Para isso, é necessário
construir um programa que leia o salário de cada funcionário da empresa e
calcule os descontos de imposto de renda e INSS de acordo com as tabelas
abaixo e também uma porcentagem fixa correspondente ao plano de saúde
que é de 4,5% do valor do salário. O programa também deve:
a. calcular o valor do salário líquido de cada um dos 58 funcionários;
b. calcular o valor total da folha de pagamento (soma dos salários de todos
os funcionários);
c. calcular o valor total do imposto de renda que a empresa deverá
recolher.
De acordo com as informações disponíveis no site da Receita Federal, a tabela
de alíquotas do imposto de renda para o ano de 2018 é:
Até 1903,98 isento
De 1903,99 até 2826,65 7,5%
De 2826,66 até 3751,05 15%
De 3751,06 até 4664,68 22,5%
Acima de 4664,68 27,5%
A tabela de alíquotas do INSS para o ano de 2018 é:
Até 1693,72 8%
De 1693,73 até 2822,90 9%
De 2822,91 até 5645,80 11%*/

import java.util.Scanner; //importa a classe Scanner que será usada para leitura de dados do usuário

public class ex11 { //declaração da classe
    public static void main(String[] args) { //declaração do método principal
        
        Scanner input = new Scanner(System.in); //instanciação do objeto input da classe Scanner que substitui o System.in
        double salario, salarioLiquido, totalFolha = 0, totalIR = 0, inss = 0, ir = 0, planoSaude = 0; //declaração das variáveis do tipo double
        int funcionarios = 4; //declaração da variável funcionários do tipo inteiro

        for (int i = 1; i <= funcionarios; i++) { //laço de repetição para ler os salários dos funcionários
            System.out.println("Digite o salário do funcionário " + i + ": ");
            salario = input.nextDouble();//leitura do salário do funcionário digitado pelo usuário
            if (salario <= 1693.72) { //condicional para calcular o INSS de acordo com a tabela
                inss = salario * 0.08;
            } else if (salario >= 1693.73 && salario <= 2822.90) { //condicional para calcular o INSS de acordo com a tabela
                inss = salario * 0.09;
            } else if (salario >= 2822.91 && salario <= 5645.80) { //condicional para calcular o INSS de acordo com a tabela
                inss = salario * 0.11;
            }

            if (salario <= 1903.98) { //condicional para calcular o IR de acordo com a tabela
                ir = 0;
            } else if (salario >= 1903.99 && salario <= 2826.65) { //condicional para calcular o IR de acordo com a tabela
                ir = salario * 0.075;
            } else if (salario >= 2826.66 && salario <= 3751.05) { 
                ir = salario * 0.15;
            } else if (salario >= 3751.06 && salario <= 4664.68) {
                ir = salario * 0.225;
            } else if (salario > 4664.68) {
                ir = salario * 0.275;
            }

            planoSaude = salario * 0.045; //cálculo do plano de saúde
            salarioLiquido = salario - inss - ir - planoSaude; //cálculo do salário líquido
            totalFolha += salarioLiquido; //cálculo do total da folha de pagamento
            totalIR += ir; //cálculo do total de imposto de renda

            System.out.println("Salário líquido do funcionário " + i + ": " + salarioLiquido);//Impressão do salário líquido de cada funcionário
            System.out.println("Total de plano de saúde deste funcionario: " + planoSaude);// Impressão do total do plano de saúde
            System.out.println("Total de INSS: " + inss); // Impressão do total do INSS
    }
    System.out.println("Total da folha de pagamento: " + totalFolha); // Impressão do total da folha de pagamento
    System.out.println("Total de imposto de renda: " + totalIR);// Impressão do total de imposto de renda
    }
}
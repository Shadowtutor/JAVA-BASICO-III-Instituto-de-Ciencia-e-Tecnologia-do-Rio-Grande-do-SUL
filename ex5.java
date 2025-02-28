public class ex5 { //criação do algoritmo
    public static void main(String[] args){ //declarando tipo de class


        //Declaração de variáveis
        int idade, somaIdades= 0, maiorIdade = -1, contEspectadores = 0;
        int resOtimo = 0 , resRuim = 0, resPessimo=0;
        char nota;
        double mediaIdades=0.0, percentualPessimo=0.0;


        // Iniciação do Loop
        for(int cont = 1; cont<=5; cont++) {
            System.out.printf("---ESPECTADOR %03d --", cont);
            System.out.printf("Idade: ");
            idade = Integer.parseInt(System.console().readLine());

            System.out.printf("Nota: ");
            nota=System.console().readLine().charAt(0);
                

            //iniciação de condicionais

                if (nota=='A'|| nota=='a') {
                    resOtimo++;
                } else if (nota=='D'|| nota=='d') {
                    resRuim++;
                    somaIdades+=idade;
                } else if (nota=='E' || nota=='e') {
                    resPessimo++;
                    if (idade>maiorIdade) 
                        maiorIdade = idade;
                }
                contEspectadores++;

            //Para evitar o erro de divisão por zero que traba o programa em Java
                }
                //evitar divisão por zero;
                if (resRuim > 0) {
                    mediaIdades=(double) somaIdades/resRuim;
                } else {
                    mediaIdades=0.0;
                }
                //evitar divisão por zero na porcentagem
                if (contEspectadores > 0) {
                    percentualPessimo = ((double) resPessimo*100) / contEspectadores;
                } else {
                    percentualPessimo = 0.0;
                }
            
            
            //Soilita o programa que analise todos os dados de entrada e os emita em uma saida;
            System.out.printf("Notas Otimo = %d\n", resOtimo);
            System.out.printf("Media Idades das notas ruins = %.2f\n", mediaIdades);
            System.out.printf("Percentual notas 'Pessimo'=%.2f\n", percentualPessimo);
            System.out.printf("Maior idade a responder 'Pessimo'= %d\n",maiorIdade);
        }
    }

public class ex6 { // declaração do nome do algoritmo
    public static void main(String[] args) { //declaração dos argumentos
        
        
        //declaração das variaveis
        int idade, somaIdades= 0, maiorIdade=-1;
        int resOtimo = 0, resRuim = 0, resPessimo = 0, numPessoas = 0, cont = 0;
        char nota;
        double mediaIdades, percPessimo;
    

        //inicio da repetição faça enquanto

        do {
            cont++;
            System.out.printf("--Espectador %03d--", cont);
            System.out.printf("Idade: ");
            idade=Integer.parseInt(System.console().readLine());

            System.out.printf("Nota: ");
            nota=System.console().readLine().charAt(0);

                if (nota!='F' || nota!='f') {
                    numPessoas++;
                    if(nota == 'A' || nota=='a')
                    resOtimo++;
                        else if(nota=='D' || nota=='d') {
                            resRuim++;
                            somaIdades+=idade;
                        } else if(nota=='E'|| nota=='e') {
                            resPessimo++;
                            if(idade>maiorIdade)
                            maiorIdade=idade;
                        }
                }
        }while(nota!='F' && nota!='f');
        /*mediaIdades=somaIdades/resRuim;*/ // erro de divisão por zero
        if (resRuim >0) {
            mediaIdades=(double) somaIdades / resRuim;
        } else {
            mediaIdades = 0.0;
        }

        /*percPessimo = resPessimo * 100 / numPessoas;*/ // Erro de divisao por zero
        if (numPessoas >0) {
            percPessimo = (double) resPessimo *100 / numPessoas;
        } else {
            percPessimo = 0.0;
        }

        System.out.printf("Notas Ótimo = %d\n", resOtimo);
        System.out.printf("Media idades das notas ruins = %.1f\n", mediaIdades);
        System.out.printf("Pecentual notas 'Pessimo' = %%f\n",percPessimo);
        System.out.printf("Maior idade a responder 'Pessimo' = %d\n", maiorIdade);
    }

}
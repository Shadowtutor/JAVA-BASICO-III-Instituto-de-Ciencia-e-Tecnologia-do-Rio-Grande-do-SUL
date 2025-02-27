public class ex4 {
    public static void main (String [] args) {
        double nota, maior, menor;

        System.out.print("Informe uma nota: ");
            nota=Double.parseDouble(System.console().readLine());
            maior=nota;
            menor=nota;

        
        if (nota > maior) {
                maior=nota;
            } if (nota <menor) {
                menor = nota;
            }

        
        for (int cont=2; cont<=20; cont++) {
            System.out.printf("Informe a nota %d: ",cont);
            nota=Double.parseDouble(System.console().readLine());
                
                if(nota>maior)
                    maior=nota;
                if(nota<menor)
                    menor=nota;
        }


        System.out.printf("Maior nota= %.1f\n",maior);
        System.out.printf("Menor nota = %.1f\n", menor);
    }
}

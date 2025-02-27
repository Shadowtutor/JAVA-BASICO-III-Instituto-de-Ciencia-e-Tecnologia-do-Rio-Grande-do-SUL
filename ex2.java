public class ex2 {
    public static void main(String[] args) {
        double n1,n2;

        System.out.print("Digite o 1º numero: ");
            n1=Double.parseDouble(System.console().readLine());
        System.out.print("Digite o 2º numero: ");
            n2=Double.parseDouble(System.console().readLine());
        if (n1>n2) {
            System.out.printf("Maior numero: %.2f\n",n1);
        } else if (n2>n1) {
                System.out.printf("Maior número: %.2f\n", n2);
            }
        else {
            System.out.printf("Os numeros são iguais!");
        }
        
        }
    }
    


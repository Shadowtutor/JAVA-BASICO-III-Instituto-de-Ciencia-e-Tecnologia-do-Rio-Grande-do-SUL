public class VerificacaTriangulo{
    public static void main (String[] args){
        double A,B,C;
        

        System.out.print("Medida A:");
            A=Double.parseDouble(System.console().readLine());
        System.out.print("Medida B:");
            B=Double.parseDouble(System.console().readLine());
        System.out.print("Medida C:");
            C=Double.parseDouble(System.console().readLine());

        if (A+B > C && A+C >B && B+C>A) {
            if (A==B && B==C) 
                System.out.println("As medidas forma um trinagulo Equilátero");
                else if(A!=B && A!=C && B!=C)
                    System.out.println("As medidas formam um triangulo Escaleno");
                        else
                            System.out.println("As medidas formam um triangulo Isosceles");
            }
            else {
                System.out.println("As medidas informadas não formam um tringulo");
            
        }
    
    }
}

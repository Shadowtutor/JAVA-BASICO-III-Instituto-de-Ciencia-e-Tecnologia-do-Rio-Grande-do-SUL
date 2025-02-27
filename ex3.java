public class ex3 {
    public static void main(String[] args) {
        int numSort, palpite;
        numSort = (int)(Math.random()*1000+1);
        do {
            System.out.print("Palpite:");
            palpite = Integer.parseInt(System.console().readLine());
            
            if(palpite > numSort) 
                System.out.println("Muito alto.");
             else if (palpite<numSort) 
                System.out.println("Muito Baixo.");
             else 
                System.out.println("Você Acertou!!!");
            
        } while (palpite!=numSort); 
            
        
    
    } 
    
}

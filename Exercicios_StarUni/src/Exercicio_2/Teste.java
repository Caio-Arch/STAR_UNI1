
package Exercicio_2;


public class Teste {
    
    public static void main(String[] args) {
        
        Quadrado f1 = new Quadrado();
        f1.setLado(2);
        f1.setNome("Quadrado");
        
        Circulo f2 = new Circulo();
        f2.setRaio(2);
        f2.setNome("Circulo");
        
        Retangulo f3 = new Retangulo();
        f3.setAltura(2);
        f3.setLado(3);
        f3.setNome("Retangulo");
        
        
        
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];
        figuras[0] = f1;
        figuras[1] = f2;
        figuras[2] = f3;
        
        
        for (FiguraGeometrica figura : figuras){
            System.out.println("----------------");
            System.out.println(figura.getNome());
            
            if (figura instanceof Figura2D){
                Figura2D f2d = (Figura2D) figura;
                System.out.println(f2d.calcularArea());
            }
            
           
                
            
            
        }
    }
    
}


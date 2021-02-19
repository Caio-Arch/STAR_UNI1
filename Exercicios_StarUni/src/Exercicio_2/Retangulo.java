
package Exercicio_2;


public class Retangulo extends Figura2D {
    
    private int lado;
    private int altura;

    
    public int getLado() {
        return lado;
    }

    public int getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public void setLado(int lado) {
        this.lado = lado;
    }

 @Override
    public double calcularArea() {
        return lado * altura;
       
    }
    
    
    
    
    
    
}


package pseint;


public class Ejemplo_1_5 {
    // VARABLES DE INSTANCIA (ATRIBUTOS)
    private int num;
    // CONSTRUCCTORES
    
    public Ejemplo_1_5() {
        this.num = 0;
        
    }

    public Ejemplo_1_5(int num) {
        this.num = num;
    }
    //METODOS SET Y GET

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    //METODO TOSTRING

    @Override
    public String toString() {
        return "Ejemplo_1_5{" + "num=" + num + '}';
    }
    //METODOS OTROS (DE CALCULO)
    public int cuadrado() {
        return (int)Mat.pow(num,2);
    }
     public int cubo() {
        return (int)Mat.pow(num,3);
    
    
}


package TRIANGULO;


public class TRIANGULO {
    //1.DEFINIR ATRIBUTOS
    private double base;
    private double altura;
    
    //2.CONSTRUCCTORES ( DAR VALOR A LOS ATRIBUTOS)
    public TRIANGULO() {
        this.base = 0.0;
        this.altura = 0.0;
    }   
     public TRIANGULO(double base, double altura) {
        this.base = base;
        this.altura = altura;
     }  
    
    // 3.METODOS SET Y GET (poner y obtener)(GESTIONA LOS VALORES DE LOS ATRIBUTOS)
      public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //4.TOSTRING (MOSTRAR LOS VALORES DE LOS ATRIBUTOS)
    @Override //SOBREESCRIRLO
    public String toString() {
        return "TRIANGULO{" + "base=" + base + ", altura=" + altura + '}';
    }  
    //5. METODOS CALCULO (PROCESAR LOS ATRIBUTOS)
    public double area() { //METODO DE INSTANCIA O DE OBJETO
        return this.base * this.altura / 2;

    }
    
    public static void cabecera() { //METODO DE CLASE
        System.out.printf("%5s %6s %6s %15s\n","N","BASE","ALTURA","AREA");
        System.out.printf("%5s %6s %6s %15s\n","-","----","------","----");
    }
    
    public void cuerpo(int i) { //LOS NUMERO QUE IMPLEMENTEMOS NOS LOS DA EL FOR DECLARADO EN EL MAIN CLASS
         System.out.printf("%5d %6s %6s %15s\n",i,base,altura,area());
    }

}


   
    


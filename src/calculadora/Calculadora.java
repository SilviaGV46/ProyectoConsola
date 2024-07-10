
package calculadora;





public class Calculadora {
    //1. ATRIBUTOS INSTANCIA
    private double numero1;
    private double numero2;
    private String operador;
    
    //2. CONSTRUCTORES

    public Calculadora() {
        this.numero1 = 0.0;
        this.numero2 = 0.0;
        this.operador = "";
    }

    public Calculadora(double numero1, double numero2, String operador) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", operador=" + operador + '}';
    }
    //5. 
     public double calculo() {
        double resultado = 0.0;
        switch (operador) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            case "#":
                resultado = Math.pow(numero1, numero2);
                break;
        }
        return resultado;
     }
    
    
    
    
    public static void cabecera() { //Metodo de clase Calculadora.cabecera()
        System.out.printf("%4s %10s %8s %8s %8s\n","N","OPERADOR","NUMERO1","NUMERO2","RESULTADO");
        System.out.printf("%4s %10s %8s %8s %8s\n","-","-------","-------","-------","---------");
    }
    public void cuerpo(int i) {
        System.out.printf("%4d %10s %8.2f %8.0f %8.2f\n",i,operador,numero1,numero2,calculo()); 
    }
}
    
    


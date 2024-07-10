package Unidades_informaticas;

public class Unidades_informaticas {
    //1.DEFINIR ATRIBUTOS

    private int opcioni;
    private int opcionf;
    private double cantidad;

    //2.CONSTRUCCTORES ( DAR VALOR A LOS ATRIBUTOS)
    public Unidades_informaticas() {
    }

    public Unidades_informaticas(int opcioni, int opcionf, double cantidad) {
        this.opcioni = opcioni;
        this.opcionf = opcionf;
        this.cantidad = cantidad;
    }

    public int getOpcioni() {
        return opcioni;
    }

    public void setOpcioni(int opcioni) {
        this.opcioni = opcioni;
    }

    public int getOpcionf() {
        return opcionf;
    }

    public void setOpcionf(int opcionf) {
        this.opcionf = opcionf;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Unidades_informaticas{" + "opcioni=" + opcioni + ", opcionf=" + opcionf + ", cantidad=" + cantidad + '}';
    }

 
    //5. METODOS CALCULO (PROCESAR LOS ATRIBUTOS)

    public double proceso() { //METODO DE INSTANCIA O DE OBJETO
        int saltos = opcionf - opcioni;//positivo dividir, negativo multiplicar
        if (saltos > 0) {
            cantidad = cantidad * Math.pow(2, 10 + (saltos * 10));

        } else {
            cantidad = cantidad * Math.pow(2, 10 - (saltos * 10));
        }
        return this.cantidad;
    }

}

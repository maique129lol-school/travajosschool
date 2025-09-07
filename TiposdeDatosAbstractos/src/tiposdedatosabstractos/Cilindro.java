
package tiposdedatosabstractos;


public class Cilindro {
     double radio;
     double altura;

    
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double area() {
        return 2 * Math.PI * radio * (altura + radio);
    }

    public double volumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

   
    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}


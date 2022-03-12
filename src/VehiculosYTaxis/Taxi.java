package VehiculosYTaxis;

public class Taxi extends Vehiculo{
    private int numLicencia;

    public Taxi() {
    }

    public Taxi(String matricula, Modelo modelo, int numLicencia) {
        super(matricula, modelo);
        this.numLicencia = numLicencia;
    }
    public String getMatricula() {
        return super.getMatricula();
    }
    public int getNumLicencia() {
        return numLicencia;
    }

    public String toString(){
        return super.toString() + " y numero de licencia:"+this.numLicencia;

    }
    //la clase taxi accede a los métodos publicos de la clase base vehiculo
    public String toString2(){
        return "el coche tiene matricula " + super.getMatricula() + " y el modelo "+  super.getModelo() + " y numero de licencia:"+this.numLicencia;

    }
}

package VehiculosYTaxis;

public class Vehiculo {
    private String matricula;
    private Modelo modelo;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, Modelo modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    public String toString(){
        return " el coche tiene matricula "+ this.matricula+ " y el modelo "+ this.modelo;
    }

}

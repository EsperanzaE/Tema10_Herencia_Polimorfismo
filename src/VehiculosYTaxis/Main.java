package VehiculosYTaxis;

public class Main {


    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("45678-FXX", Modelo.BMW);
        Taxi taxi = new Taxi("45678-FBB", Modelo.AUDI, 45879);
        System.out.println(vehiculo);
        System.out.println(taxi);


// esto NO da error en ejecucion porque un objeto creado como taxi SI puedo castearlo a vehiculo

        Vehiculo vehiculo2= new Vehiculo();
        vehiculo2 = (Vehiculo) taxi;//aqui vehiculo es objeto vehiculo pero tiene la direccion de taxi
        System.out.println(vehiculo2);
        System.out.println(taxi);
// para asegurar que podemos castear y no nos da el error que se comenta en Bloque A nos aseguraramos que el objeto
// que vamos a castear es una instancia del objeto que castea (el que metemos entre paréntesis)
        Vehiculo vehiculo3= new Vehiculo();
        if (taxi instanceof Vehiculo) {
            vehiculo2 = (Vehiculo) taxi;//hay que preguntar si taxi es una instancia de vehiculo
            System.out.println("taxi no es una instancia de Vehiculo");
        }
        System.out.println(vehiculo2);
        System.out.println(taxi);


// BLOQUE A
// esto da error en ejecucion porque un objeto creado como vehiculo no puedo castearlo a taxi (hay que
// comentar el trozo anterior porque sino tenemos ya vehiculo apuntando en la misma direccion que taxi y no
// fallaría esta parte del código

        taxi = (Taxi) vehiculo;
        System.out.println(vehiculo);
        System.out.println(taxi);

// BLOQUE A pero preguntando si es instancia para no generar un error
        if (vehiculo instanceof Taxi) {
            taxi = (Taxi) vehiculo;
            System.out.println(vehiculo);
            System.out.println(taxi);
        }
        System.out.println("vehiculo no es una instancia de Taxi");
    }
}

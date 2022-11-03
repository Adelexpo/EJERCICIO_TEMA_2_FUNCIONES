public class EjercicioTema2CrearFuncion {


    static int sumar(int Precio, int IVA) {

        int suma = Precio + IVA;
        return suma;
    }

    public static void main(String[] args) {


        int resultado;
        resultado = sumar(65, 14);
        System.out.println("El precio Total es: " + resultado);
    }
}

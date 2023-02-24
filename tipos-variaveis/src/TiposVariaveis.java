public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        double salarioMinimo = 2500.79; // valor 2.500,79

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // cast

        // variavel e constantes

        int numero = 5;

        numero = 10;

        final double VALOR_DE_PI = 3.14;  // constante(Sempre em caixa alta) tem que ter final no inicio.



        System.out.println(salarioMinimo);
        System.out.println(VALOR_DE_PI);
        System.out.println(numero);
        System.out.println(numeroCurto2);
    }
}
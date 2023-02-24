public class Operadores {

    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao ="?";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;      // depois que ela leu uma string não faz mais a conta fica como string

        System.out.println(concatenacao);


        // Tenario

        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso"; // sempre a primeiro ser booleana

        System.out.println(resultado);
    }
    
}

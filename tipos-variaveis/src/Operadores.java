public class Operadores {

    public static void main(String[] args) {

        double soma = 10.5 + 15.7;
        int subtacao = 113 - 25;
        int multiplicacao = 20*7;
        int divisao = 15/3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        int a, b;

        a = 6;
        b = 6;

        String resultado1 = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado1);

        boolean condicao1 = true;

        boolean condicao2 =false;

        if (condicao1 && condicao2){

            System.out.println("as duas condições são verdadeiras");

        }
        if (condicao1 || condicao2){
            System.out.println("uma das duas condições é verdadeira");
        }


    }

}

package anatomiaClasses;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 10;

        if (mediaFinal < 6 ){
            System.out.println("Reprovado");
        } else if (mediaFinal == 6) {
            System.out.println("Prova de minerva");

        }else
            System.out.println("Aprovado");

    }
}

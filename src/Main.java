import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos conversar com os animais!");
        System.out.println();

        Quadrupede quad;
        Animal a = new Animal();

        System.out.println("Primeiro com o cachorro!");
        quad = new Cachorro("Daschund");
        a.conversar(quad);
        System.out.println();

        System.out.println("Agora com o javali!");
        quad = new Javali("Grandes");
        a.conversar(quad);
        System.out.println();

        System.out.println("Por fim com girafa!");
        quad = new Girafa("Gigante");
        a.conversar(quad);

        System.out.println();
        System.out.println("Que ótimo papo!");

        System.out.println("--------");
        System.out.println("Utilizando a chamada polimórfica.");
        a.conversarPoli(quad);
    }
}
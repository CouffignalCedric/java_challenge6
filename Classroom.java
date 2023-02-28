public class Classroom{
    public static void  main(String[]args){
        Wilder cedric = new Wilder("Cedric", false);
        Wilder jean = new Wilder("Jean", false);
        Wilder soph = new Wilder("Soph", false);
        //methode setters pour changé valeur
        soph.setAware(true);

        // Appel methode
        System.out.println(cedric.whoIam());
        System.out.println(jean.whoIam());
        System.out.println(soph.whoIam());
    }}



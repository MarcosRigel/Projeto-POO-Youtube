package Application;

import Entities.Video;

public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML");

        Pessoa p = new Pessoa();

        System.out.println(v[0].toString());




    }
}

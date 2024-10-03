import java.util.Random;

public class MegaSena {
    public static void main (String[] args){
        int x;
        //Criação de um objeto derivado da classe "Random", que possui instruções para sortear números.
        Random generate = new Random();

        System.out.println("Os números sorteados foram:");

        //Laço WHILE:

        /*

        //Criação de uma variável contadora para controle do loop.
        int i = 0;

        //A condição para execução do loop é que enquanto o valor de "i" for menor que 6 ele é executado.
        while(i < 6) {
            int number = generate.nextInt(60); //Delimitando que seja sorteado um número dentro dos primeiros 60 inteiros.
            System.out.println(number);
            //Variavel contadora sendo incrementada cada vez que o loop é executado
            i++;
        }

        */

        //Laço FOR:

        for(int i = 0; i < 6; i++) {
            int number = generate.nextInt(60);
            System.out.println(number);
        }

        // while (true) -> looping infinito
        // while (i < 10) -> looping com saída
        // for (;;) -> looping infinito
    }
}

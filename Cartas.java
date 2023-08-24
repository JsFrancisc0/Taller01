import java.util.Scanner;

public class Cartas {

    public static void main(String[] args){

        do {
            System.out.println("[1] ");



        } while (continuar=true);

    }

    public String[][] crearMatrizCartas(){

        String [][] matrizcartas = new String [2][12];
        return matrizcartas;

    }
    public int agregarCartas(String nombreCarta, String puntaje){

    }

    public void continuarJuego(){

        private Scanner sc = new Scanner(System.in);
        char respuesta;
        boolean continuar = true;

        do{
            System.out.println("Desea Seguir Jugando? [s][n]");
            respuesta = sc.next();

        } while (!(respuesta == 's' || respuesta == 'n'));

        if(respuesta == 'n'){
            continuar = false;
        }

    } return continuar;
}

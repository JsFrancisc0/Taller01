import java.util.Scanner;

public class Cartas {

    public static void main(String[] args){

        do {
            System.out.println("[1] Iniciar Partida ");
            System.out.println("[2] Agregar Cartas");
            System.out.println("[3] ");
            System.out.println("[4] ");



        } while (continuar=true);

    }

    public String[][] crearMatrizCartas(){

        String [][] matrizcartas = new String [2][12];

        for(int i=0; i<matrizcartas.lenght; i++){



        }
        return matrizcartas;

    }
    public String[][] agregarCartas(String nombreCarta, String puntaje){



    }

    public boolean continuarJuego(){

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

        return continuar;
    }
}

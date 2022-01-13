package com.iesebre;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();

        String cadena = S + " " + T;


        String[] array = cadena.split(" ");

        int n = Math.max(array[0].length(), array[1].length());


        // Llenar la matriz según las letras comunes

        int[][] matrix = new int[n][n];

        for (int i = 0; i < array[0].length(); i++)

            for (int j = 0; j < array[1].length(); j++)

                if (array[0].charAt(i) == array[1].charAt(j))

                    matrix[i][j]++;


        // Encontrar la subsecuencia común más larga

        String palabraRepetida = "";

        for (int i = 0; i < matrix.length >> 1; i++) {

            String nuevo = "";

            for (int j = i, restriccion = -1; j < matrix.length; j++)

                for (int k = 0; k < matrix.length; k++)

                    if (matrix[j][k] == 1 && restriccion < k) {

                        nuevo += array[0].charAt(j);

                        restriccion = k;

                        break;

                    }

            if (palabraRepetida.length() < nuevo.length())

                palabraRepetida = nuevo;


            System.out.println(palabraRepetida);
            break;
        }

    }


}

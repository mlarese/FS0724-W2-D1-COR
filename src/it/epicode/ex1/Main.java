package it.epicode.ex1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = getRandomArray();
        int position;
        int num;
        boolean continua = true;

        do {
            System.out.println("Inserisci un numero e premi invio. Premi 0 per uscire");
            num = in.nextInt();

            if(num!=0) {
                System.out.println("In che posizione devo inserire il numero?");
                try {
                    position = in.nextInt();
                    arr[position] = num;
                    for (int i = 0; i <arr.length ; i++) {
                        System.out.println( arr[i]);
                    }
                } catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("La posizione va da 0 a 4");
                }catch(Exception e) {
                    in.nextLine();
                    System.out.println("Devi inserire un numero?");
                }

            } else {
                continua = false;
            }
        } while (continua);
        in.close();
    }

    public static int[] getRandomArray() {
        int[] arr = new int[5];
        Random md = new Random () ;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = md.nextInt(1,11);
        }

        return arr;
    }
}

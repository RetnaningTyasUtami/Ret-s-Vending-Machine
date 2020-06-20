/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newcontoh;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class contoh {

    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        int nilai []= new int [5];
        float rata;
        int i;
        int total =0;
        int max, min;
        System.out.println("masukkan 5 buah data nilai");
        for (i = 0; i < 5; i++) {
            System.out.print("Data ke"+(i+1)+": ");
            nilai [i]= masuk.nextInt();
        }
        min = nilai[0];
        max = nilai [0];
        for (i = 0; i < 5; i++) {
            total = total + nilai [i];
            if (nilai[i] > max) {
                max = nilai[i];
            }
            else if (nilai[i]<min){
                min = nilai[i];
            }
        }
        rata= total/5;
        System.out.println("jumlah : "+total);
        System.out.println("rata-rata : "+rata);
        System.out.println("nilai tertinggi : "+max);
        System.out.println("nilai terendah  : "+min);
    }
}

    


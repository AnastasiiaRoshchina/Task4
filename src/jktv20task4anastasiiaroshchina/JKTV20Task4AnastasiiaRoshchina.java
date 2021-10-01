/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20task4anastasiiaroshchina;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV20Task4AnastasiiaRoshchina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random rnd = new Random();
        int[] numbers = new int[100];
        int sum = 0;
        //заполнение массива случайными числами
        for(int i=0;i<numbers.length;i++) {
            numbers[i] = rnd.nextInt(100);
            
        }
        //сортировка
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        //вывод сортрованного массива
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] %2 !=0){
            sum = sum +numbers[i];
            
        }}
        
        //разбить по 10
         for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            System.out.print(" ");
            int j = i+1;
            if(j%10 == 0 && i != numbers.length){
                System.out.println();
            }
        }
       
        System.out.println("");
        int dblsum = sum/numbers.length;
        System.out.println("среднее значение: "+dblsum);
        
           
    }

    }
    


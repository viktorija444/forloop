package com.company;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class SumOdd {

    public static void main(String[] args) {
        System.out.println(isOdd(1));
        System.out.println(sumOdd(1, 20));
    }


    public static boolean isOdd(int number) {


        if ((number % 2 == 1) && (number > 0)) {
            return true;
        }
        return false;


    }


        public static int sumOdd(int start, int end) {
            int sum = 0;
            if ((start >= 0 && end >= 0) && (end >= start)) {
                for (int i = start; i <= end; i++) {
                    if (isOdd(i)) {
                        sum += i;
                    }
                }
                return sum;
            }
            return -1;
        }
    }




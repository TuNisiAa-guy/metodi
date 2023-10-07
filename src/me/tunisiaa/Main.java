package me.tunisiaa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //count(1, 15);
        //System.out.println(cmd(5));
        //System.out.println(recursiveCMD(5));
    }

    public static void count(int n, int m) {
        System.out.println(n);
        if(n != m){
            count(n + 1, m);
        }
    }

    public static boolean cmd(int n){
        String val;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            val = sc.nextLine();
            if(val.equals("exit")){
                return true;
            }
        }
        return false;
    }

    public static boolean recursiveCMD(int n){
        if(n == 0){
            return false;
        }
        String val;
        Scanner sc = new Scanner(System.in);
        val = sc.nextLine();
        if(val.equals("exit")){
            return true;
        }
        return recursiveCMD(n - 1);
    }
}

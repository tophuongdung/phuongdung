/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prime;

/**
 *
 * @author T P Dung
 */
import java.util.Scanner;
public class MulPrime {
    int n;
    public MulPrime(){
        this.n=0;
    }
    public MulPrime(int n){
        this.n=n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int KtNgto(int n) {
        if(n<2) return 0;
        int k = (int)Math.sqrt(n);
        for(int i = 2; i <= k; i++)
            if(n%i==0)
                   return 0;
        return 1;
    }
    public int Tich(){
        MulPrime kt= new MulPrime();
        int t=1;
        for(int i=2;i<this.n;i++){
            if(kt.KtNgto(i)==1){
                t*=i;
            }
        }
        return t;
    }
    public static void main(String[] args) {
        MulPrime t= new MulPrime(10);
        System.out.println(t.Tich());
    }
    
}

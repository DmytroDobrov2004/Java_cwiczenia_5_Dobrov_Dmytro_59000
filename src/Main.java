
import java.util.Random;
import java.util.Scanner;
class Cwiczenie5 {
    public void Zadanie1() {
        int i = 0;
        int mas[] = new int[10];
        for (i = 0; i < mas.length - 1; i++) {
            mas[i] = 9 - i;

        }
        for (int x : mas) {
            System.out.println("Array[" + x + "]: " + mas[x]);
        }
    }

    public void Zadanie2() {
        Random rnd = new Random();
        int[] mas = new int[10];

        int minNumber = 0;
        int maxNumber = 100;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rnd.nextInt(100);
            if (mas[i] < maxNumber) {
                maxNumber = mas[i];
            }
            if (mas[i] > minNumber) {
                minNumber = mas[i];
            }
        }
        for (int x : mas) {
            System.out.println(x);
        }

        System.out.println("Maksymalna liczba: " + maxNumber);
        System.out.println("Minimalna liczba: " + minNumber);
    }
    public void Zadanie3() {
        int[][] table= new int[11][11];
        for(int i =0; i< table.length-1; i++){
            table[i][i]= i;
        }
        for(int i =0; i<table.length-1; i++){
            for(int j =0; j<table[j].length-1;j++){
                System.out.print(table[i][j]+ " ");
            }
            System.out.println();
        }
        int Dodawanie =0;
        for(int i=0;i< table.length-1;i++){
            for(int j =0;j< table.length-1;j++){
                Dodawanie+= table[i][j];
            }
        }
        System.out.println("Wynik sumy jest: "+ Dodawanie);
    }
    public void Zadanie4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę wprowadzić 1-szy ciąg znaków: ");
        String firstLine = scan.nextLine();
        System.out.println("Proszę wprowadzić 2-gi ciąg znaków: ");
        String SecondLine = scan.nextLine();
        String Wynik1 = firstLine+" "+ SecondLine;
        String Wynik2 = SecondLine +" "+ firstLine;
        System.out.println(Wynik1);
        System.out.println(Wynik2);
    }
    public void Zadanie5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę wprowadzić słowo: ");
        String Slowo = scan.nextLine().toLowerCase();
        boolean  Palindrom = true;
        for(int i =0; i< Slowo.length();i++){
            if(Slowo.charAt(i)!=Slowo.charAt(Slowo.length()-i-1)){
                Palindrom = false;
                break;
            }

        }
        if(Palindrom){
            System.out.println("Palindrom jest");
        }
        else{
            System.out.println("Palindrom nie jest");
        }
    }
}

public class Main {
    public static void main(String[] args) {
Cwiczenie5 zadanie = new Cwiczenie5();
System.out.println("Proszę wprowadzać 1,2,3,4 lub 5, żeby wybrać odpowiednie zadanie: ");
Scanner in = new Scanner(System.in);
int a = in.nextInt();
if(a==1)
    zadanie.Zadanie1();
if(a==2)
    zadanie.Zadanie2();
if(a==3)
    zadanie.Zadanie3();
if(a==4)
    zadanie.Zadanie4();
if(a==5)
    zadanie.Zadanie5();

}






    }

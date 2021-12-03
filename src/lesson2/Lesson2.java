package lesson2;

import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tu nhien: ");
        int n = scanner.nextInt();
        //Lay phan du
        int soDu = n%3;
        //Cach 1
     /*   if(soDu == 2){
            System.out.println("So " + n + " chia 3 du 2");
        }
        if(soDu == 0){
            System.out.println("So " + n + " chia het cho 3");
        }
        if(soDu == 1){
            System.out.println("So " + n + " chia 3 du 1");
        }

        //Cach 3*/
        if(soDu == 2 && n > 0){
            System.out.println("So " + n + " chia 3 du 2");
        } else if(soDu == 1){
            System.out.println("So " + n + " chia 3 du 1");
        } else {
            System.out.println("So " + n + " chia het cho 3");
        }

        //Cach 4
        switch (soDu){
            case 2:
                System.out.println("So " + n + " chia 3 du 2");
                break;
            case 0:
                System.out.println("So " + n + " chia het cho 3");
                break;
            case 1:
                System.out.println("So " + n + " chia 3 du 1");
                break;
            default:
                System.out.println("Default");
                break;
        }

        System.out.println("Ket thuc chuong trinh");
    }
}

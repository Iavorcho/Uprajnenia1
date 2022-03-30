//Сигурно има начин да разделя отделните задачи в отделни класове, а този да е само нещо като менш, но едва ли покрай решаването им ще ми остане достатъчно време за да науча по какъв начин се прави това.
import java.util.Scanner;
import java.io.*;
public class Nachalo0 {
    public static void main(String[] args) {
        System.out.printf("Dear adventurer, please visit my humble abode and choose your quest!" +
                "%n(0) Enter the number 0 if you want to indulge in the art of managing a golf course." +
                "%n(1) Enter the number 2 if want to upgrade your gear and acquire one of our latest models off battle gear, +2 DEX running shoes." +
                "%n(2) If you enter the number 3 you can indulge in a number guessing game." +
                "%n(3) Enter the number 3 and you will no longer wonder weather or not February has 28 or 29 days." +
                "%n(4) Enter the world of the magical vowel runes and begin your journey towards the art of the Vocal Magic by entering 5." +
                "%n(5) I you are intelligent enough, you can enter the number 5 and ascent into the mind numbing area of the elusive quadratic equations," +
                "%n one never knows when you might have to succumb to the temptation to find a couple of unknown variables whilst traveling the dirt roads on the back of your horse." +
                "%n Choose wisely, and do not make mistakes, or you will be punished!!!" +
                "%n%n Make your choice: "); // Provide the user with different options
        Scanner scan = new Scanner(System.in);
        byte chooseWisely = scan.nextByte();

        switch (chooseWisely) {
            case 0: // Миниголф.
                int numberOfBalls; // Define number of balls.
                int numberOfVisitors; // Get the number of visitors.
                numberOfBalls = 20; // Starting number of balls.
                //start loop
                do {
                    System.out.printf("%nВъведете броя на посетителите на голф игрището ви." +
                            "%nЗа върнати топчета въведете отрицателно число." +
                            "%nАко работата за деня ви е приключила въведете 0." +
                            "%nВъведете броя на посетителите тук: ");
                    numberOfVisitors = scan.nextInt(); // Gets the number of visitors
                    numberOfBalls = numberOfBalls - numberOfVisitors;
                    if ((numberOfBalls > 0) && (numberOfBalls < 21) ) {
                        System.out.printf("%nБроят на оставащите ви топчета е: " + numberOfBalls + "%n");

                    }else if (numberOfBalls > 20){
                        System.out.printf("%nВНИМАНИЕ!!! Върнали са ви повече от началният брой топчета.%n" +
                                "%nРазполагате с: " + numberOfBalls + " топчета");
                    }else if (numberOfBalls < 0) {
                        numberOfBalls = numberOfBalls + numberOfVisitors; // връща изчисленията с една стъпка назад.
                        System.out.printf("%nРазполагате с " + numberOfBalls + " топчета, а клиентите ви са: " + numberOfVisitors + "%n");
                        System.out.printf("!!!Нямате достатъчно топчета за новите клиенти!!!%n");

                    }else {
                        System.out.printf("!!!ВНИМАНИЕ!!!%nДадохте последното топче!!!%nБроят на оставащите ви топчета е: " + numberOfBalls + "%n");

                    }

                }//end loop
                while (numberOfVisitors != 0);
                System.out.println("Приятна почивка!");
                break;


            case 1: // На пазар за маратонки

           //main vars
            float cenaMaratonki;
            byte razmerMaratonki;
            String cviatMaratonki;
            String vrashtaneMaratonki;

            // input
                System.out.println("Въведете цена: ");
                cenaMaratonki = scan.nextFloat();
                System.out.println("Въведете размер: ");
                razmerMaratonki = scan.nextByte();
                System.out.println("Въведете цвят: ");
                cviatMaratonki = scan.next();
                System.out.println("Въведете с думи дали е възможно маратонките да се върнат или не. Възможни отговори ДА/НЕ: ");
                vrashtaneMaratonki = scan.next();

            // Blacks
            String cherno1 = "Черни";
            String cherno2 = "Черно";
            String cherno3 = "Черен";

            // Returns
                String return1 = "ДА";
                String return2 = "true";


                // Checks and balances
            boolean cenaOK = cenaMaratonki < 150;
            boolean razmerOK = (razmerMaratonki == 45) || (razmerMaratonki == 44);
            boolean cviatOK = cviatMaratonki.equalsIgnoreCase(cherno1)
                    || cviatMaratonki.equalsIgnoreCase(cherno2) || cviatMaratonki.equalsIgnoreCase(cherno3);
            boolean vrashtaneOK = vrashtaneMaratonki.equalsIgnoreCase(return1) || vrashtaneMaratonki.equalsIgnoreCase(return2);

            if (cenaOK && razmerOK && vrashtaneOK != cviatOK) {
                System.out.println("Купувай");
            }else{
                System.out.println("Търси други");
            }
               break;


            case 2: // Сравняване на две числа
              float intForComparison1;
              float intForComparison2;
              float differenceBetweenNums;


                System.out.println("Въведете първото число: ");
               intForComparison1  = scan.nextFloat();
                System.out.println("Въведете второто число: ");
                intForComparison2 = scan.nextFloat();
                differenceBetweenNums = (Math.abs(intForComparison1-intForComparison2));

                if (differenceBetweenNums > 0.999){
                    System.out.println("Разлика в цялото число: " + differenceBetweenNums);

                } else if (differenceBetweenNums == 0) {
                    System.out.println("Числата са идентични: "+differenceBetweenNums);

                } else if (differenceBetweenNums > 0.0999) {
                    System.out.println("Разлика в десетите: "+differenceBetweenNums);

                } else if ((differenceBetweenNums > 0.00999)) {
                    System.out.println("Разлика в стотните: "+differenceBetweenNums);

                } else if ((differenceBetweenNums > 0.000999)) {
                    System.out.println("Разлика в хилядните: "+differenceBetweenNums);

                } else if ((differenceBetweenNums > 0.0000999)) {
                    System.out.println("Разлика в десетохилядните: "+differenceBetweenNums);

                } else {
                    System.out.println("Незначителна разлика: " + differenceBetweenNums);
                }


   /*              if (intForComparison1 > intForComparison2) {
                     differenceBetweenNums = intForComparison1 - intForComparison2;
                     if (differenceBetweenNums.2==0){
                         System.out.println("Има разлика в десетите на чисалата");
                     } else if (Math.round(differenceBetweenNums)*100>1){
                         System.out.println("Има разлика в стотните на чисалата");

                    } else if (Math.round(differenceBetweenNums)*1000>1){
                        System.out.println("Има разлика в хилядните на чисалата");
                     } else if (Math.round(differenceBetweenNums)*10000>1){
                         System.out.println("Има разлика в десетохилядните на чисалата");
                     } else {
                         System.out.println("Разликата между числата е незначителна");
                         System.out.println(differenceBetweenNums);
                     }
                 }else if (intForComparison1 < intForComparison2) {
                     differenceBetweenNums = intForComparison1 - intForComparison2;

                         if (Math.round(differenceBetweenNums)*10==0){
                             System.out.println("Има разлика в десетите на чисалата");

                         } else if (Math.round(differenceBetweenNums)*100>1){
                             System.out.println("Има разлика в стотните на чисалата");

                         } else if (Math.round(differenceBetweenNums)*1000>1){
                             System.out.println("Има разлика в хилядните на чисалата");

                         } else if (Math.round(differenceBetweenNums)*10000>1){
                             System.out.println("Има разлика в десетохилядните на чисалата");
                         } else {
                             System.out.println("Разликата между числата е незначителна");}*/
/*

                } else {
                 System.out.println("Числата са напълно еднакви");}
*/
                    break;



            case 3:
/*
                // Високосна година. Условието беше малко объркващо, използвах това:
                A leap year is exactly divisible by 4 except for century years (years ending with 00).
                The century year is a leap year only if it is perfectly divisible by 400.
*/
                System.out.println("Въведете година: ");
                int godina = scan.nextInt();
                boolean godinaDelimaNa4;
                boolean godinaDelimaNa100;
                boolean godinaDelimaNa400;

                godinaDelimaNa400 = godina %4 == 0;
                godinaDelimaNa4 = godina %400 == 0;
                godinaDelimaNa100 = godina %100 == 0;

                if (godinaDelimaNa4 == godinaDelimaNa100 == godinaDelimaNa400){
                    System.out.println("Високосна година");
                } else if (godinaDelimaNa4 != godinaDelimaNa100){
                    System.out.println("Високосна година");
                } else {System.out.println("Нормална година");
                    }
                break;

            case 4: //Гласни букви

                System.out.println("Въведете буква: ");

                char vhodBukva =scan.next( ).charAt(0);

                if(vhodBukva=='a'||vhodBukva=='e'||vhodBukva=='i'||vhodBukva=='o'||vhodBukva=='u'||vhodBukva=='A'||vhodBukva=='E'||
                        vhodBukva=='I'||vhodBukva=='O'||vhodBukva=='U')
                {
                    System.out.println("Буквата е гласна");
                }
                else if((vhodBukva>='a'&&vhodBukva<='z')||(vhodBukva>='A'&&vhodBukva<='Z'))
                    System.out.println("Буквата е съгласна");
                else
                    System.out.println("Въведеното не е буква");

                break;
            case 5: // Квадратно уравнение

                System.out.print("Въведете a: ");
                double a = scan.nextDouble();
                System.out.print("Въведете b: ");
                double b = scan.nextDouble();
                System.out.print("Въведете c: ");
                double c = scan.nextDouble();
                double d= b * b - 4.0 * a * c;
                if (d> 0.0)
                {
                    double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
                    double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
                    System.out.println("Дискриминантата е " + d + " Корените са " + r1 + " и " + r2);
                }
                else if (d == 0.0)
                {
                    double r1 = -b / (2.0 * a);
                    System.out.println("Дискриминантата е " + d + " Корена е " + r1);
                }
                else
                {
                    System.out.println("Дискриминантата е " + d + " Няма възможни корени ");
                }
                break;
                    default:
                System.out.println("You are playing with my patience!!! Visit me again and enter the correct number!!!");

        }

    }
}

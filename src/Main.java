import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        System.out.println("Введите ваш возраст");
        int age = 17;
        if (age < 18) {
            System.out.println("Вы несоврешеннолетний");
        }
        if (age >= 18) {
            System.out.println("Поздравляем с соврешеннолетием");
        }

        System.out.println("Задание 2");

        int ageave = 23;

        if (ageave >= 7 && ageave < 18) {
            System.out.println("Ходишь в школу");
        }

        if (ageave >= 18 && ageave < 24) {
            System.out.println("Ходишь в техникум");

        }
        if (ageave >= 24) {
            System.out.println("Ходишь на работу");


        }

        System.out.println("Задание 3");

        int seating = 60;

        if (seating < 60) {
            System.out.println(" Есть сидячее место");
        }
        int standingplaces = 42;

        if (standingplaces < 42) {
            System.out.println("Есть стоячее место");
        }
        int totalseats = 102;

        if (seating + standingplaces >= totalseats) {
            System.out.println(" Мест в вогоне нету");
        }

        System.out.println("Задание 1.1");

        int age1 = 17;
        if (age1 >= 18) {
            System.out.println(" Поздравляем с совершеннолетием");
        } else {
            System.out.println(" К сожелению ты не совершеннолетний");
        }

        System.out.println("Задание 2.1");

        int yourage = 24;
        if (yourage >= 7 && yourage < 18) {
            System.out.println(" Ходишь в школу");
        } else {
            if (yourage >= 18 && yourage < 24) {
                System.out.println(" Ходишь в техникум");
            } else {
                System.out.println(" Ходишь на работу ");
            }
        }

        System.out.println("Задание 3.1");

        int fullCar = 102;
        int stangplaces = 62;
        int sitgplaces = 40;

        if (stangplaces < 62) {
            System.out.printf(" Есть стоячее место");
        } else {
            System.out.println(" Стоячих месту нету");
        }
        if (sitgplaces < 40) {
            System.out.printf(" Есть сидячее место");
        } else {
            System.out.printf(" Сидячих мест нету");
        }
        if (stangplaces + sitgplaces >= fullCar) {
            System.out.println(" Мест в вагоне нету ");
        } else {
            System.out.printf(" В вагоне есть места");
        }

        System.out.println("Задание 1.2");
        int yourage1 = 2;

        if (yourage1 >= 2 && yourage1 <= 6) {
            System.out.println(" Вам нужно ходить в детский сад");
        } else {
            if (yourage1 >=7 && yourage <=18) {
                System.out.println(" Вам нужно ходить в школу");
            } }
        if (yourage1 > 18 && yourage1 < 24) {
            System.out.println(" Вам нужно идти в уневерситет");
        } else {
            if (yourage1 >= 24) {
                System.out.println(" Вам нужно идти на работу");
            } }

        System.out.println( "Задание 2.2");

        int ageofthechild = 4 ;
        if (ageofthechild <5) {
            System.out.println( " Ребёнок не может кататься на аттракционе");
        } else {
            if (ageofthechild >=5 && ageofthechild <14) {
                System.out.println( " Ребёнок может кататься только в сопровождении взрослого");
            }
        }
        if (ageofthechild >= 14) {
            System.out.println( " Ребёнок может кататься без сопровождения взрослого");
        }

        System.out.println("Задание 3.2");
        int one = 1;
        int two = 2;
        int free = 3;
        if (one > two && one > free) {
            System.out.println(" Наибольшее число " + one);
        } else if (two > one && two > free) {
            System.out.println(" Наибольшее число " + two);
        } else {
            System.out.println(" Наибольшее число " + free);
        }





    }
}


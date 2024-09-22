public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        byte age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия");
        }

        //task 2
        System.out.println("Task 2");
        byte temperature = 0;
        if (temperature <= 5) {
            System.out.println("На улице холодно, всего " + temperature + " градусов, отморозишь уши и щиколотки, оденься тепло");
        } else {
            System.out.println("Сегодня тепло, " + temperature + "можно идти без шапки и в коротких джинсах");
        }

        // task 3
        System.out.println("Task 3");
        int speed = 90;
        int normalSpeed = 60;
        if (speed > 60) {
            System.out.println("Если твоя скорость - " + speed + "км/ч, придётся заплатить штраф");
            //тут прошу подсказки, хочу реализовать стоимость штрафа в соответствии с превышением скорости
        } else {
            System.out.println("Если твоя скорость - , " + speed + "км/ч, можно ездить спокойно");
        }

            //task 4 - тут я переиспользовал переменную, заданную ранее и использовал знания со следующего урока
            System.out.println("Task 4");
            if (age <= 2) {
                System.out.println("Если возраст человека равен " + age + ", то оставайтесь дома");
            } else if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            } else if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else if (age >= 18 && age <= 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то пора ходить на РАБоту");
            }

            //task 5 - тут я переиспользовал переменную, заданную ранее и использовал знания со следующего урока
            System.out.println("Task 5");
            if (age < 5) {
                System.out.println("Если ребенку меньше " + age + " лет, то он не может кататься на аттракционе");
            } else if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else if (age >= 14) {
                System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            }

            //task 6 - тут я переиспользовал переменную, заданную ранее и использовал знания со следующего урока
            System.out.println("Task 6");
            int places = 102;
            int sitPlaces = 60;
            int people = 70;

            if (people < sitPlaces) {
                System.out.println("В вагоне есть сидячие места");

            } else if (people >= sitPlaces && people < places) {
                System.out.println("В вагоне есть стоячие места");

            } else if (people >= places) {
                System.out.println("В вагоне нет мест");
            }

            //task 7 - тут я переиспользовал переменную, заданную ранее и использовал знания со следующего урока
            System.out.println("Task 7");
            int one = 1;
            int two = 3;
            int three = 5;
            if (one >= two && one >= three) {
                System.out.println("Максимальное число в переменной one, равно " + one);
            } else if (two >= three) {
                System.out.println("Максимальное число в переменной two, равно " + two);
            } else {
                System.out.println("Максимальное число в переменной three, равно " + three);
            }

        }
    }

package task.methods;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Methods {
    public static void main(String[] args) {
        // Вызовы ваших методов
        System.out.println(summaInt(5, 6));                     //задание 1
        System.out.println(summaString("Здарова", "Заебал"));         //задание 2
        System.out.println(summa(5, "12"));                           //задание 3
        System.out.println(xx(5,"2"));                      //задание 4
        System.out.println(xxx(true, false));                         //задание 5
        System.out.println(chetNeChet(8));                          //задание 6
        int[] numbers7 = {1, 4, 5};                                   //задание 7
        System.out.println(zd7(numbers7));
        int[] numbers3 = {4,5,7,0};                                   //задание 8
        System.out.println(Arrays.toString(summa3(numbers3)));
        int[] numbers2 = {5,1,3,2};                                   //задание 9
        System.out.println(summa2(numbers2));
        System.out.println(mouths(10) + " меcяцев");               //задание 10
        System.out.println(hours(10) + " часов");
        System.out.println(minuts(10) + " минут");
        System.out.println(names("Пупа", "пупа"));                      //задание 11
        String [] string12 = new String []{"k","f","c"};                //задание 12
        System.out.println(lastString12(string12));
        String str13 = "Я в своем познании настолько преисполнился, что я как будто бы уже сто триллионов миллиардов лет проживаю на триллионах и триллионах таких же планет, как эта Земля, мне этот мир абсолютн понятен, и я здесь ищу только одного - покоя, умиротворения и вот этой гармонии, от слияния с бесконечно вечным";
        System.out.println(bykvaA(str13));                                  //задание 13

        while (true) {                                                      //задание 14
            System.out.print("введи операцию: ");
            Scanner scanner = new Scanner(System.in);
            String operation = scanner.nextLine();
            switch (operation) {
                case "пополнить":
                    System.out.print("введи сумму пополнения: ");
                    Scanner scanner1 = new Scanner(System.in);
                    int amount = scanner1.nextInt();
                    money += amount;
                    System.out.println("вы внесмли: " + amount + ", баланс: " + money);
                    break;
                case "снять":
                    System.out.print("введи сумму снятия: ");
                    Scanner scanner2 = new Scanner(System.in);
                    int amount1 = scanner2.nextInt();
                    if (money >= amount1) {
                        money -=amount1;
                        System.out.println("вы сняли: " + amount1 + ", баланс: " + money);
                    } else {
                        System.out.println("недостаточно средств, баланс: " + money);
                    }
                    break;
                case "стоп":
                    System.out.println("работа окончена");
                    return;
                default:
                    System.out.println("нет подходящей операции");
                    break;
            }
        }

    }

// Реализуйте функциональность согласно описанию

// TODO1: Создайте метод который вернет сумму двух чисел
public static int summaInt(int a, int b) {                                      //задание 1
    return a + b;
}

// TODO2: Создайте метод который вернет сумму двух переданных строк
public static String summaString(String string1, String string2)
{                                                                               //задание 2
    return string1 + string2;
}

// TODO3: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
//  обернуть их в строку и вернуть результат строкой
public static String summa (int n1, String n2){
    int n2x = Integer.parseInt(n2);
    int sum = n1+n2x;
    String summa = Integer.toString(sum);
    return summa;
};

// TODO4: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
//  число которое передается как int , то пусть метод вернет false , а если меньше , то true
public static boolean xx (int n11, String n12){
    int n12x = Integer.parseInt(n12);
    boolean n13 = n11 > n12x;
    return n13;}

// TODO5: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
//  если обе false верни false
public static boolean xxx (boolean b1, boolean b2){
    return b1||b2;}

// TODO6: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное
static boolean chetNeChet(int c) {                                              //задание 6
    return c % 2 == 0;
}

// TODO7: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
//  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"
public static String zd7( int [] numbers7){
    int chet1 = 0;
    int neChet1 = 0;
    for (int i = 0; i < numbers7.length; i++) {
        if (numbers7[i] % 2 == 0) {
            chet1++;
        } else {
            neChet1++;
        }
    }
    if(neChet1==0){
        return  "четный массив";
    } else{
        if(chet1==0){
            return "нечетный массив";
        }
        else{
            return "смешанный массив";
        }}}

// TODO8: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
//  массива который подается в аргументы  и сложите все элементы в новый массив и верните его
public static int[] summa3(int numbers3[]){
    int summa3 = IntStream.of(numbers3).sum();
    int [] number33 = {summa3};
    return  number33;}


// TODO9: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
//  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел
public static int summa2 (int []numbers2){
    int sum2 = IntStream.of(numbers2).sum();
    return sum2;
}

// TODO10: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
//  тоесть если человек прожил 10 лет , это 120 месяцевтак же сделайте перевод возраста в минуты и метод который расчетает возраст в часах
public static int mouths(int age){
    int a = age*12;
    return a;}
    public static int hours (int age){
        int b = age*(365*24);
        return b;}
    public static int minuts (int age){
        int c = age*(365*24*60);
        return c;}

// TODO11: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра
public static boolean names (String name1, String name2){
    String name11 = name1.toLowerCase();
    String name12 = name2.toLowerCase();
    return  name11.equals(name12);
}

// TODO12: Создайте метод которому можно передать массив элементов , а он вернет последний элемент
public static String lastString12 (String [] string12){
    String lastString12 = string12[string12.length-1];
    return lastString12;
}


// TODO13: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке
public  static int bykvaA (String str13){
    int bykvaA = 0;
    for (char element13: str13.toCharArray()){
        if ( element13 == 'а')
            bykvaA++;}
    return bykvaA;
}

// TODO14: Создайте метод кошелек. Заведите переменную которая будет отвечать за сумму которая имеется в кошелке , к примеру 1000 . Далее метод , может вычитать сумму из кошелька
//  если эта сумма не больше чем та которая в нем имеется , так же кошелек можно пополнить на любую сумму . Результат выполнения метода , должен вывести на экран состояние кошелька
//  или сообщение о том , что сумму которую вы пытаетесь снять слишком велика.
    private static int money;

}
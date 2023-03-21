import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numer of task:");
        a = scan.nextInt();

        switch(a) {
            case 1: {
                System.out.println("Task 1");
                float nnn, ddd, ddd_nnn, nnn_ddd;
                System.out.println("Enter your number in nnn,ddd:");
                nnn_ddd = scan.nextFloat(); // Вводимо число у форматі nnn,ddd
                System.out.println(nnn_ddd);
                nnn = (int) nnn_ddd; //Відділяємо цілу частину від введеного числа
                ddd = nnn_ddd - nnn; //Відділяємо дробову частину від введеного числа
                ddd_nnn = nnn / 1000 + (int) (ddd * 1000 + 0.0001); // Змінюємо дробову і цілу частину місцями(+0.0001 для точності, адже при перетворенні можлива мінімальна розбіжність.
                System.out.println(ddd_nnn);
            } break;
            case 2: {
                System.out.println("Task 2");
                System.out.println("Enter your parameters: 1. a,b; 2. Kyt B, h; 3. c, Kyt B;");
                int Tringle;
                double c,kytA,kytB,P,h,S,A,b;
                Tringle = scan.nextInt();
                switch (Tringle){  // Додаємо вибір варіанту завдання
                    case 1:{
                        System.out.println("Enter your a:");
                        A = scan.nextDouble(); // вводимо дані
                        System.out.println("Enter your b:");
                        b = scan.nextDouble();
                        c = Math.sqrt(A*A+b*b); // Обчислюємо гіпотенузу
                        kytA = Math.asin(A/c)*180/Math.PI; // Обчислюємо кут гамма
                        kytB = 180-90-kytA; //Обчислюємо кут бета
                        P = A+b+c; //Периметр
                        h = (A*b)/c; // Висота трикутника
                        S = h*c/2; // Знаходимо площу
                        System.out.println("a = " + A);
                        System.out.println("b = " + b);
                        System.out.println("c = " + c);
                        System.out.println("kyt A = " + kytA);
                        System.out.println("Kyt B = " + kytB);
                        System.out.println("Kyt C = " + 90);
                        System.out.println("S = " + S);
                        System.out.println("P = " + P);
                        System.out.println("h = " + h);
                        //Звичайно реалізувати дане завдання і без введення змінних для площі, кутів, і т.д.
                        // але на мою думку так код виглядає зрозуміліше
                    } break;
                    case 2:{
                        System.out.println("Enter your Kyt B:");
                        kytB = scan.nextDouble();
                        System.out.println("Enter your h:");
                        h = scan.nextDouble();
                        kytA = 180 - (kytB + 90);
                        A = h/Math.sin(kytB*Math.PI/180);
                        c = A/Math.cos(kytB*Math.PI/180);
                        b = Math.sqrt(c*c - A*A);
                        P = A+b+c;
                        S = h*c/2;
                        System.out.println("a = " + A);
                        System.out.println("b = " + b);
                        System.out.println("c = " + c);
                        System.out.println("kyt A = " + kytA);
                        System.out.println("Kyt B = " + kytB);
                        System.out.println("Kyt C = " + 90);
                        System.out.println("S = " + S);
                        System.out.println("P = " + P);
                        System.out.println("h = " + h);
                    } break;
                    case 3:{
                        System.out.println("Enter your c:");
                        c = scan.nextDouble();
                        System.out.println("Enter your Kyt B:");
                        kytB = scan.nextDouble();
                        kytA = 180 - 90 - kytB;
                        A = c*Math.cos(kytB*Math.PI/180);
                        b = Math.sqrt(c*c - A*A);
                        h = (A*b)/c;
                        P = A+b+c;
                        S = h*c/2;
                        System.out.println("a = " + A);
                        System.out.println("b = " + b);
                        System.out.println("c = " + c);
                        System.out.println("kyt A = " + kytA);
                        System.out.println("Kyt B = " + kytB);
                        System.out.println("Kyt C = " + 90);
                        System.out.println("S = " + S);
                        System.out.println("P = " + P);
                        System.out.println("h = " + h);
                    } break;
                }
            } break;
            case 3: {
                double x,y,z;
                System.out.println("Task 3");
                System.out.println("Enter your x:");
                x = scan.nextDouble(); // вводимо х
                System.out.println("Enter your y:");
                y = scan.nextDouble(); // вводимо у
                System.out.println("Enter your z:");
                z = scan.nextDouble(); // вводимо z
                System.out.println("Your a = " + (1+y)*((x+y)/(Math.pow(x,2)+4))/(Math.pow(Math.E,-x-2)+(1/(Math.pow(x,2)+4))));
                System.out.println("Your b = " + (1+Math.cos(y-2))/(Math.pow(x,4)/(2+Math.pow(Math.sin(z),2))));
            } break;
            case 4: {
                System.out.println("Task 4");
                System.out.println("Enter your Dovjina Kola(without Pi):"); // Ввести довжину кола, без числа Pi
                double C = scan.nextDouble();
                System.out.println("S = " + Math.pow(C/2,2) + "PI CM^2");
                // Можна реалізувати без відкидання числа Пі, але зазвичай довжина кола вказується у форматі "Число*ПІ см"
            }; break;
            case 5: {
                System.out.println("Task 5");
                System.out.println("Enter your R:"); //Вводимо радіус зовнішнього кола
                int R = scan.nextInt();
                if(R>20)
                System.out.println("S = " + (Math.pow(R,2)-Math.pow(20,2)) + "PI CM^2");
                else System.out.println("R must be more than 20!!!");
            } break;
    }
}
}
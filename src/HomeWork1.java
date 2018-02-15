

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class HomeWork1 {

        Logger log;
        public HomeWork1(){
            log = Logger.getLogger(getClass());
        }

        public int getNumber() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            return a;

        }


        /**
         * @param a
         * @return Написать метод возвращающий факториал заданного числа N
         */
        public int factNum(int a) {
            try {
                int b = 1;
                for (int i = 1; i <= a; ++i) {
                    b = b * i;
                }
                System.out.println(b);

                return b;
            }
            catch (ArithmeticException ex)
            {
                log.error("Exception: " + ex);
                return -1;
            }



        }

        /**
         * @param x1
         * @param y1
         * @param x2
         * @param y2
         * @return Hаписать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
         * Посмотреть в учебнике геометрии или в интернете
         */
        public double getDistance(double x1, double y1, double x2, double y2)
        {
            try {
                double p1 = x2 - x1;
                double p2 = y2 - y1;
                double dist = Math.sqrt((Math.pow(p1, 2) + Math.pow(p2, 2)));
                System.out.println(dist);
                return dist;
            }
            catch (Exception ex)
            {
                log.info("Exception name: " + ex);

            }
            return -1;
        }

        /**
         * @param a
         * @param b
         * @param c
         * @return Написать буленовский метод принимающий на вход 3 переменных типа int которые обозначают длину стороны для треугольника и возвращает правда или ложь (может ли существовать треугольник с заданными сторонами)
         * Вспоминаем свойство треугольника ни одна сторона не должна быть длиннее суммы  двух других
         */
        public boolean triangleExist(int a, int b, int c)
        {
            try
            {

                if (a <= 0 || b <= 0 || c <= 0) {
                    System.out.println(false);
                    return false;
                } else if (a > b + c || b > a + c || c > a + b) {
                    System.out.println(false);
                    return false;
                } else {
                    System.out.println(true);
                    return true;
                }
            }
            catch (Exception ex)
            {
                log.info("Exception: " + ex);
            }
            return false;
        }

        /**
         * @param a Почитать про вложенный цикл и вывести треугольник из нулей на экран
         */

        public void triZero(int a)
        {
            try
            {

            for (int i = 0; i <= a; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("0");
                }
                System.out.println(" ");

            }}
            catch (Exception ex){
                log.info("Exception: " + ex);
            }

        }

        /**
         * @param m
         * @param h
         * @return Задача для тех кто следить за фигурой))) Написать программу которая вычисляет индекс массы тела.
         */
        public double inMtela(double m, double h) {
            try {
                double I = m / Math.pow(h, 2);
                System.out.println(I);
                return I;
            }
            catch (Exception ex){
                System.out.println("Exception: " + ex);
                return -1;
            }
        }

        /**
         * Составить алгоритм определяющий, есть ли среди цифр введенного трехзначного числа — одинаковые.
         * Число вводится с клавиатуры.   Кто не нагуглит как вводить с клавиатуры можно просто принимать int на вход
         * и определять есть ли в нем одинаковые цифры
         * Использовать изученные операторы Метод буленовский возвращает правда или ложь
         *
         * @param
         * @return
         * @throws IOException
         */
        public boolean triNumbersSame() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input number:");
            int a = Integer.parseInt(reader.readLine());
            if (a / 100 == a % 10) {
                System.out.println(true);
                return true;
            } else if (((a % 100) / 10) == a / 100) {
                System.out.println(true);
                return true;
            } else if (a % 10 == a % 100 / 10) {
                System.out.println(true);
                return true;
            } else
                System.out.println(false);
            return false;


        }

        /**
         * @param lenght
         * @param width
         * @param heigth
         * @return написать метод высчитывающий сколько литров нужно чтобы заполнить бассейн.
         * Принимает на вход 3 величины глубину длину и ширину бассейна. Определить перед решением что принимает на вход и что возвращает
         */
        public int basseinLitrov(int lenght, int width, int heigth) {
            try {
                int vol = lenght * width * heigth;

                System.out.println(vol * 1000 + " litrov");
                return vol * 1000;
            }
            catch (Exception ex){
                System.out.println("Exception: " + ex);
                return -1;
            }
        }

        /**
         * @param A
         * @return
         */

        public int dvoe4niki(int[]A) {
            int nedop = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] <= 2) {
                    nedop++;
                }
            }
            System.out.println(nedop);
            return nedop;

        }

        /**
         * @param kurs
         * @param sumExchamge
         * @return Доллары
         */

        public int currencyExchange(double[] kurs, double sumExchamge) {
            try {
                int bank = 0;
                for (int i = 0; i < kurs.length; i++) {
                    double hrivna = sumExchamge * kurs[i];
                    if (sumExchamge * kurs[i] > hrivna) {
                        bank = i;
                    }
                }
                System.out.println(bank);
                return bank;
            }
            catch (Exception ex){
                System.out.println("Exception: " + ex);
                return -1;
            }


        }

        /**
         * @throws IOException Вывести на экран строку S указанное количество раз N
         */
        public void stroka(int a) throws IOException {
            String st = "Now or never.";
            for (int i = 1; i <= a; i++) {
                System.out.println(st);
            }
        }

        /**
         * @param a
         * @param b
         * @param c Написать программу нахождения суммы большего и меньшего из 3-х чисел.
         *
         */
        public void summa(int a, int b, int c) {
            try{


            if ((a > b) && (b > c)) {
                int x = a + c;
                System.out.println(x);
            } else if ((b > c) && (c > a)) {
                int y = b + a;
                System.out.println(y);
            } else if ((c > b) && (b > a)) {
                int z = c + a;
                System.out.println(z);
            } else if ((a > b) && (c > b)){
                int w = a + b;
                System.out.println(w);
            }}
            catch (Exception ex){
                System.out.println("Exception: " + ex);
            }


        }
        public double triangleSquare(int a, int b, int c){
            double p = (a + b + c)/2;
            double p1 = p - a;
            double p2 = p - b;
            double p3 = p - c;
            double p4 = p *p1 * p2 * p3;
            double S =  Math.sqrt(p4);
            System.out.println(S);
            return  S;



        }

        /**
         * Написать программу вычисления суммы факториалов всех нечетных чисел от 1 до 9.
         */
        public void summyFactNechChisel()
        {

            int sumFact = 0;
            for(int i = 1; i <= 9; i++)
            {
                if ((i%2 !=0))
                {

                    sumFact = sumFact + factNum(i);

                }
                System.out.println(sumFact);
            }
        }

        /**
         *
         * @param s
         * @return
         */
        public double buy(double s)
        {

            if (s <= 0)
            {
                return -s;
            } else if ((s <= 1000))
            {
                return s;
            } else if ((s > 1000) && (s <= 2000))
            {
                double sum = s - (s * 0.02);
                return sum;
            } else if ((s > 2000) && (s <= 5000))
            {
                double sum = s - (s * 0.05);
                return sum;
            }
            else if((s > 5001))
            {
                double sum = s - (s * 0.07);
                return sum;

            }
            else
                return -1;
        }

    }










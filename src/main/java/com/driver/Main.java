package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.Product(3, 7));

        System.out.println(p.Product(3, 7, 23));

        System.out.println(p.Product(30.0, 74.5));
    }
}

    class Product{

        public int Product(int x, int y){
            return x + y;
        }
        public int Product(int x, int y, int z){
            return x + y + z;
        }
        public double Product(double x, double y){
            return x + y;
        }

    }

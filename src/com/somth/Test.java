package com.somth;

public class Test {

    public static void main(String[] args) {

      Employee e1 = new Employee(1, "first","last", 100);
      System.out.println(e1);

        Author a[] = new Author[2];
        a[0] = new Author("Dude", "mail", 'm');
        a[1] = new Author("Babe", "gmail", 'f');
        Book b1 = new Book("B One", a, 10, 1);
        System.out.println(b1);
        System.out.println(b1.getAuthorNames());
/*
        MyPoint mp1 = new MyPoint(0,0);
        MyPoint mp2 = new MyPoint(1,0);
        MyPoint mp3 = new MyPoint(0,1);
        MyTriangle tr1 = new MyTriangle(mp1, mp2, mp3);
        System.out.println(tr1.getPerimeter());
        System.out.println(tr1.getType());*/

    /*    double arr[] = {1,1};
        double arr2[] = {1,1};
        MyPolynomial p1 = new MyPolynomial(arr);
        MyPolynomial p2 = new MyPolynomial(arr2);
        MyPolynomial sum = p1.add(p2);
        MyPolynomial mul = p1.multiple(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(sum);
        System.out.println(mul);*/

      Container c1 = new Container(4,3,6,8);
        System.out.println(c1);
        Ball ball = new Ball(0,1,2,3, -45);
        System.out.println(ball);
        System.out.println(c1.collides(ball));
        ball.move();
        System.out.println(c1.collides(ball));
        ball.move();
        System.out.println(c1.collides(ball));
        ball.reflectVertical();
        ball.move();
        ball.move();
        System.out.println(c1.collides(ball));




    }
}

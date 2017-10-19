package com.somth;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Test {

    public static void main(String[] args) {

      System.out.println("1 - Circle test");
      Circle circle1 = new Circle();
      Circle circle2 = new Circle(2.0, "not red");
      System.out.println(circle1);
      System.out.println(circle2);
      System.out.println();

      System.out.println("2 - Rectangle test");
      Rectangle rec1 = new Rectangle(2,4);
      System.out.println(rec1);
      System.out.println(rec1.getArea());
      System.out.println(rec1.getPerimetr());
      System.out.println();

      System.out.println("3 - Employee test");
      Employee e1 = new Employee(1, "first","last", 100);
      System.out.println(e1);
      System.out.println(e1.getAnnualSalary());
      System.out.println(e1.getName());
      e1.raiseSalary(10);
      System.out.println(e1);
      System.out.println();

      System.out.println("4 - Book, Author test");
      Author a[] = new Author[2];
      a[0] = new Author("Dude", "mail", 'm');
      a[1] = new Author("Babe", "gmail", 'f');
      Book b1 = new Book("B One", a, 10, 1);
      System.out.println(b1);
      System.out.println(b1.getAuthorNames());
      System.out.println();

      System.out.println("5 - MyPoint test");
      MyPoint mp1 = new MyPoint();
      MyPoint mp2 = new MyPoint(1,0);
      MyPoint mp3 = new MyPoint(0,1);
      System.out.println(mp2);
      System.out.println(mp1.distance(mp3));
      System.out.println();

      System.out.println("6 - Triangle test");
      MyTriangle tr1 = new MyTriangle(mp1, mp2, mp3);
      System.out.println(tr1);
      System.out.println(tr1.getPerimeter());
      System.out.println(tr1.getType());
      System.out.println();



      System.out.println("Part 2");
      System.out.println("1 - MyComplex test");
      MyComplex mc1 = new MyComplex(2,3);
      MyComplex mc2 = new MyComplex(4,1);
      System.out.println(mc1);
      System.out.println(mc2);
      System.out.println(mc1.isImaginary());
      System.out.println(mc1.equals(mc2));
      System.out.println(mc1.magnitude());
      System.out.println(mc1.argument());
      MyComplex mc3 = mc1.addNew(mc2);
      System.out.println(mc3);
      System.out.println(mc3.conjugate());
      System.out.println(mc1.multiply(mc2));
      System.out.println(mc1.divide(mc2));
      System.out.println();


      System.out.println("2 - MyPolynomial test");
      double arr[] = {1,1};
      double arr2[] = {1,2,3,4};
      MyPolynomial p1 = new MyPolynomial(arr);
      MyPolynomial p2 = new MyPolynomial(arr2);
      MyPolynomial sum = p1.add(p2);
      MyPolynomial mul = p1.multiple(p2);
      System.out.println(p1);
      System.out.println(p2);
      System.out.println(p2.getDegree());
      System.out.println(sum);
      System.out.println(mul);
      System.out.println();

      System.out.println("3 - Ball, Container test");
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

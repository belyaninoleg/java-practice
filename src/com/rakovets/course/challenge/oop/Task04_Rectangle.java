package com.rakovets.course.challenge.oop;

/*## Specification of task 4
Создать класс `Rectangle`.

Поля:
- `pointLT` - точка левого верхнего угла
- `pointRU` – точка правого нижнего угла

Конструктор:
- `Rectangle(point1, point2)` – принимает два `Point`

Методы:
- `getPointLT()` – получает точку левого верхнего угла
- `setPointLT()` – задает точку левого верхнего угла
- `getPointRU()` – получает точку правого нижнего угла
- `setPointRU()` – задает точку правого нижнего угла
- `area()` – возвращает площадь прямоугольника
- `perimeter()` – возвращает периметр прямоугольника

Написать тесты для класса.
*/
public class Task04_Rectangle {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(25, 26);
        Point olegDebilStarter = new Point(30.1, 45.5);
        System.out.println("Ввожу новый point");
        olegDebilStarter.displayInfo();
        System.out.println("\nВывожу новый X");
        double a = Point.getX();
        System.out.println(a);
        System.out.println("\nВывожу новый Y");
        double b = Point.getY();
        System.out.println(b);

        System.out.println("\nВвожу новый X");
//        olegDebilStarter.x = 25.04;
        Point.setX(25.04);
        System.out.println("\nВвожу новый Y");
        Point.setY(19.74);
        Point oleg2 = new Point(Point.setX(25.04),Point.setY(19.74));
        oleg2.displayInfo();


    }


//class Rectangle {
//    double pointLT;
//    double pointRU;
//
//    Rectangle(double point1, double point2) {
//        pointLT = point1;
//        pointRU = point2;
//        System.out.printf("PointLT = %d, PoitRU = %d", pointLT, pointRU);
//    }
//
//    public double getPointLT() {
//        return this.pointLT;
//    }
//    public void setPointLT(double pointLT) {
//        this.pointLT = pointLT;
//    }
//    public double getPointRU() {
//        return this.pointRU;
//    }
//    public void setPointRU(double pointRU) {
//        this.pointRU = pointRU;
//    }

}


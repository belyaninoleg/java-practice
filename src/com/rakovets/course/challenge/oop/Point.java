package com.rakovets.course.challenge.oop;


/*## Specification of task 3
Создать класс `Point`.

Поля:
- `x` - координата
- `y` - координата

Конструктор:
- `Point(x, y)` – принимает координаты `x` и `y`

Методы:
- `getX()` – получает `x`
- `setX()` – задает `x`
- `getY()` – получает `y`
- `setY()` – задает `y`
- `distance(point)` – принимает `point`, возвращает расстояние от текущей точки (экземпляра, для которого был вызван),
до принимаемой точки
Написать тесты для класса.
*/

public class Point {

    private double x;
    private double y;

    Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    void setX(double x) {
        this.x = x;
    }

    double getX() {
        return x;
    }

    void setY(double y) {

        this.y = y;
    }

    double getY() {
        return y;
    }

    void displayInfo() {
        System.out.printf("X =: %f, Y =  %f", this.x, this.y);
    }

//    double distance(Point newPoint) {
////     double result = Math.sqrt(Math.pow(()));
//    }
}
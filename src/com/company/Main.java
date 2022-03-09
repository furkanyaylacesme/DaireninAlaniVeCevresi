package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the diameter of the circle :");
        int diameter = scanner.nextInt();

        double circleArea = Math.pow(diameter,2) * pi;
        double circleCircumference = 2 * pi * diameter;

        System.out.println("Circle Area is : " + circleArea);
        System.out.println("Circle Circumference : " + circleCircumference);

        System.out.println("Please input center angle : ");
        int centerAngle = scanner.nextInt();

        double circlePieceArea = (pi * (Math.pow(diameter,2) * centerAngle))/360;
        System.out.println("Piece of Circle Area : " + circlePieceArea);

    }
}

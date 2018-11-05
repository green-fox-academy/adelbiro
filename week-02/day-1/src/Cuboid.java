// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
public class Cuboid {
    public static void main(String[] args) {
        double aSide = 2.54;
        double bSide = 6.1;
        double cSide = 3.1;

        double surfaceArea = (2*aSide*bSide) + (2*bSide*cSide) + (2*aSide*cSide);
        double volume = aSide*bSide*cSide;
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        Player player=new Player("Ali",100,Weapon.AXE);
        System.out.println("healthRemaining: "+player.healthRemaining());
        player.loseHealth(30);

        Player player2=new Player("Hakan",90,Weapon.SWORD);
        System.out.println("healthRemaining: "+player.healthRemaining());

        player.loseHealth(player2.getWeapon().getDamage());
        System.out.println("healthremaning after damage: "+player.healthRemaining());
    }
}
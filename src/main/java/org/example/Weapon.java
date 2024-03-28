package org.example;

public enum Weapon {
    SWORD(50,5),
    AXE(60,3),
    MACE(70,1);

    private int damage;
    private double attackSpeed;

     Weapon(int damage,int attackSpeed){
        this.damage=damage;
        this.attackSpeed=attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}

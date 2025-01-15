package com.bossfight.model;

import java.util.Random;

public class DamageCalc {
    static Random random = new Random();

    public static void calculateDamage(Character attacker, Character defender) {
        int damage = attacker.getAttack();
        //Todo Add random to modify damage
        damage += random.nextInt(1, attacker.attack);
        System.out.println(attacker.name + " attacks " + defender.name + " and does " + damage + " damage");
        defender.setCurrentHealth(defender.getCurrentHealth() - damage);
    }



}

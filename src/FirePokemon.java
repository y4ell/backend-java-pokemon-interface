import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FirePokemon extends Pokemon {
    private static final String type = "fire";
    private static final List<String> attacks = Arrays.asList("Inferno", "PyroBall", "FireLeash", "FlameThrower");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Inferno on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left." );
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used PyroBall on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left." );
    }

    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used FireLash on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left." );
    }

    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used Flamethrower on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left." );
    }


    public List<String> getAttacks() {
        return attacks;
    }
}

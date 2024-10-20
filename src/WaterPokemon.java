import java.util.Arrays;
import java.util.List;
public class WaterPokemon extends Pokemon {
    private static final String type = "water";
    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCannon", "RainDance");
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used Surf on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " lost 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left." );
    }

    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used HydroPump on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " lost 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left." );
    }
    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used HydroCanon on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println("RainDance has no effect on " + enemy.getName());
                            }
            case "grass" -> {
                System.out.println("RainDance boosted " + enemy.getName() + "'s with 10 hp");
                enemy.setHp(enemy.getHp() + 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " lost 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left." );
    }
    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used RainDance on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
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

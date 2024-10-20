import java.util.Arrays;
import java.util.List;
public class GrassPokemon extends Pokemon {
    private static final String type = "grass";
    private static final List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeaveBlade");
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used LeafStorm on " + enemy.getName());
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left." );
    }
    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used LeechSeed on " + enemy.getName());
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 20 hp. " + name.getName() + " gained 20 hp.");
                enemy.setHp(enemy.getHp() - 20);
                name.setHp(name.getHp() + 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 15 hp. " + name.getName() + " gained 15 hp.");
                enemy.setHp(enemy.getHp() - 15);
                name.setHp(name.getHp() + 15);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " lost 10 hp. " + name.getName() + " gained 10 hp.");
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(name.getHp() + 10);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 5 hp. " + name.getName() + " gained 5 hp.");
                enemy.setHp(enemy.getHp() - 5);
                name.setHp(name.getHp() + 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left. " + name.getName() + " has " + name.getHp() + " hp." );

    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used LeaveBlade on " + enemy.getName());
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left." );
    }
    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used SolarBeam on " + enemy.getName());
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
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

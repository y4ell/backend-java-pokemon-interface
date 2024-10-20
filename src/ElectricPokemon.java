import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

//   private static final List<String> attacks = new ArrayList<>();
//   attacks.add("ThunderPunch");
//   attacks.add("ElectroBall");
//   attacks.add("Thunder");
//   attacks.add("VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used ThunderPunch on " + enemy.getName());
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left." );

    }

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used ElectroBall on " + enemy.getName());
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left." );

    }

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used Thunder on " + enemy.getName());
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " lost 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left." );

    }
    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used VoltTackle on " + enemy.getName());
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " lost 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " lost 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " lost 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " gained 10 hp");
                enemy.setHp(enemy.getHp() + 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left." );

    }
    public List<String> getAttacks() {
        return attacks;
    }
}

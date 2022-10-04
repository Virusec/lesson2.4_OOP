package animals;

public class Main {
    public static void main(String[] args) {
        Flightless peacock = new Flightless("Сема", 5, "джунгли", "ходьба");
        Flightless penguin = new Flightless("Чарли", 2, "Арктика", "ходьба");
        Flightless dodoBird = new Flightless("Чао", 3, "остров Маврикий", "ходьба");

        Flying seagull = new Flying("Герда", 1, "побережье моря", "летает");
        Flying albatross = new Flying("Тима", 2, "океан", "летает");
        Flying falcon = new Flying("Антей", 3, "степи", "летает");

        Amphibians frog = new Amphibians("Одиссей", 1, "болота");
        Amphibians grassSnake = new Amphibians("Бонни", 4, "реки");

        Herbivores gazelle = new Herbivores("Аксель", 6, "саванны", 50, "травы");
        Herbivores giraffe = new Herbivores("Мики", 8, "саванны", 55, "листья");
        Herbivores horse = new Herbivores("Эмир", 5, "степи", 65, "сено");

        Predators hyena = new Predators("Яго", 7, "саванны", 40, "мясо");
        Predators tiger = new Predators("Арчибальд", 7, "саванны", 60, "мясо");
        Predators bear = new Predators("Тагир", 11, "лес", 20, "всеядный");
        Predators bear2 = new Predators("Тагир", 11, "лес", 20, "asa");

        System.out.println(peacock);
        System.out.println(seagull);
        System.out.println(grassSnake);
        System.out.println(horse);
        System.out.println(tiger);
        System.out.println(bear.equals(bear2));
    }
}

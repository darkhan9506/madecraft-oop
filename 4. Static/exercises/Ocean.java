package exercises;

public class Ocean {

  public static void main(String[] args) {
    SeaCreature spongeBob = new SeaCreature("spongebob");
    System.out.println(spongeBob.getName());
    spongeBob.eat();
    spongeBob.laugh();

    SeaCreature patrick = new SeaCreature("patrick");
    System.out.println(patrick.getName());
    patrick.eat();
    patrick.laugh();

    SeaCreature squidward = new SeaCreature("squidward");
    System.out.println(squidward.getName());
    squidward.eat();
    squidward.laugh();
  }

}

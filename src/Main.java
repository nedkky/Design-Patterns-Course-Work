import pobserverMagicBoard.Dwarf;
import observerMagicBoard.MagicBoard;
import observerMagicBoard.Observer;
import singletonSantaClaus.SantaClaus;
import toyFactoryMethod.Bike;
import toyFactoryMethod.Doll;
import toyFactoryMethod.Gift;

public class Main {

    public static void main(String[] args) {

        SantaClaus santaClaus = SantaClaus.getInstance();
        santaClaus.postMessage("I am awake!\nTime to make toys!");

        Observer firstDwarf = new Dwarf("Michael", 28);
        Observer secondDwarf = new Dwarf("Bobins", 34);
        Observer thirdDwarf = new Dwarf("Corana", 27);

        MagicBoard magicBoard = new MagicBoard();
        magicBoard.subscribe(firstDwarf);
        magicBoard.subscribe(secondDwarf);
        magicBoard.subscribe(thirdDwarf);
        magicBoard.setTopic("We need bikes!");

        Gift bike = new Bike(129.99);
        bike.prepare();

        magicBoard.setTopic("We need dolls!");

        Gift doll = new Doll(19.99, "Juliah");
        doll.prepare();

        santaClaus.postMessage("Work is done, time to sleep!");
        magicBoard.unsubscribe(firstDwarf);
        magicBoard.unsubscribe(secondDwarf);
        magicBoard.unsubscribe(secondDwarf);

    }
}

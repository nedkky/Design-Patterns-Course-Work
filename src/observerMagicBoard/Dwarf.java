package observerMagicBoard;

public class Dwarf implements Observer{

    private String name;
    private int age;
    private Observable topic;

    public Dwarf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void update() {
        if(this.topic == null) {
            System.out.println("No topic set");
            return;
        }
        String lastTopic = this.topic.getUpdate();
        System.out.println(this.name + " received: " + lastTopic);
    }

    @Override
    public void setTopic(Observable topic) {
        this.topic = topic;
    }

}

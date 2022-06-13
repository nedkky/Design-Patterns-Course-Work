package command;

import toyFactoryMethod.Gift;

public class CreateToy implements Command{

    private Gift gift;

    public CreateToy(Gift gift){
        this.gift = gift;
    }

    @Override
    public void execute() {
        this.gift.prepare();
    }
}

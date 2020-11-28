package control.action;

import control.MonopolyGame;
import entity.Player;

public class PassAction implements Action {
    private Player player;

    public PassAction(Player player) {
        this.player = player;
    }

    @Override
    public void act() {
        new AddMoneyAction(player, 2000).act();

        MonopolyGame.getActionLog().addMessage(player.getName() + " passes from the starting point" );
    }

}
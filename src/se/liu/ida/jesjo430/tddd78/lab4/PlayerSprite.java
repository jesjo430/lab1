package se.liu.ida.jesjo430.tddd78.lab4;

public class PlayerSprite extends MovableObject
{
    private final String name;

    public PlayerSprite(final String name, final int x, final int y) {
	super(x, y);
	this.name = name;
    }
}

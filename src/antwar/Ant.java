package antwar;

public class Ant {
	private int id;
	private int hitpoints;
	private int x;
	private int y;
	private int width;
	private int height;

	enum ant_type {
		pissmyra, skogsmyra
	}

	public Ant(int id, int hitpoints, int x, int y, int width, int height) {
		super();
		this.id = id;
		this.hitpoints = hitpoints;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}

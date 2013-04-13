package models;

public class BonusStudent implements Student {
	private final String name;
	private final int id;
	private final int year;
	private final int draw;

	public BonusStudent(String name, int id, int year, int draw) {
		this.name = name;
		this.id = id;
		this.year = year;
		this.draw = draw;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public int getYear() {
		return this.year;
	}

	public int getDraw() {
		return this.draw;
	}

}

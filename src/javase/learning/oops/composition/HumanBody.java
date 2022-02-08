package javase.learning.oops.composition;

public class HumanBody {

	private String name;
	private double height;
	private double weight;
	private Heart heart;
	private Brain brain;
	
	public HumanBody(String name, double height, double weight, Heart heart, Brain brain) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.heart = heart;
		this.brain = brain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Brain getBrain() {
		return brain;
	}

	public void setBrain(Brain brain) {
		this.brain = brain;
	}
	
}

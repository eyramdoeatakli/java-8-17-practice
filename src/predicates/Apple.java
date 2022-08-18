package predicates;


public class Apple {
	
	private Color color;
	private int weight;
	

	public Apple( int weight,Color color) {
		super();
		this.color = color;
		this.weight = weight;
	}
	

	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	

}

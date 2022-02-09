package javase.learning.oops.composition;

public class CompositionEx {
	public static void main(String[] args) {
		
		Heart prakashHeart = new Heart(4, true);
		Brain prakashBrain = new Brain(87687, true);
		
		prakashHeart.setQuality(false);
		
		HumanBody prakash = new HumanBody("Prakash", 5.7, 67.82, prakashHeart, prakashBrain);
		
		String name = prakash.getName();
		double height = prakash.getHeight();
		double weight = prakash.getWeight();
		
		System.out.println(name);
		System.out.println(height);
		System.out.println(weight);
		
		Heart heart = prakash.getHeart();
		Brain brain = prakash.getBrain();
		
		System.out.println("*********** Heart Properties ************");
		System.out.println(heart.getNumOfRooms());
		System.out.println(heart.isQuality());
		
		System.out.println("*********** Brain Properties ************");
		System.out.println(brain.getNumOfNuerons());
		System.out.println(brain.isQuality());
	}
}

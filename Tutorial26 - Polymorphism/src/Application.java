
public class Application {
	public static void main(String[] args) {
		Plant plant = new Plant();
		Tree tree = new Tree();
		
		// Polymorphism means that if you have a child class and a parent class, you can always use the child class anywhere where you would use the parent class.
		// Since Tree is a subclass of Plant, I'm guaranteed that I can use Tree wherever I have a Plant:
		Plant plant2 = tree;
		plant2.grow();
		
		tree.shedLeaves();
		 
		// This will not work because when we try to call a method what matters is the TYPE of the variable (or reference).
		// Type reference = new object();
		// plant2.shedLeaves();
		
		// plant2.grow(); is working because the method grow() is present in plant and then is overridden in tree, while shedLeaves() is only present in tree (plant2 is a type of plant, not tree).
		
		// This works because wherever a parent class is expected, I can use the child.
		doGrow(tree);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
}

/*
	If you have Plant aPlant = new Tree(), there are two things here. On the left is the variable of type plant. This contains no code or data, but it knows which methods you should be allowed to call using it (it knows the methods present in Plant).
	
	On the right is the actual object, containing the code and data of a Tree.
	
	So if you call aPlant.grow(), where grow() exists in the Plant class, it will call Plant grow(). If you override the method in Tree, it will call the tree version, because the actual object, containing the code, is in this case a Tree. It will have inherited grow() from Plant, but you can specify a new version as well, especially for Tree.
	
	We can't call aPlant.shedLeaves() here, because although this code exists in the Tree object, the Plant-type variable doesn't know this method exists, so won't let you call it.
*/

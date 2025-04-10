package biologicalTree;

public class BiologicalTreeMain
{
   public static void main(String[] args)
   {
	  Tree birch = new BirchTree();
	  Tree oak = new OakTree();

	  System.out.println("Comparing trees: " + birch.equals(oak));
	  System.out.println("Comparing two birch trees: " + birch.equals(new BirchTree()));
   }
}

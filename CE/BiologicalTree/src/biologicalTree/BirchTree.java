package biologicalTree;

class BirchTree extends Tree
{

   public BirchTree()
   {
	  super(TreeType.BIRCH);
   }

   @Override
   public void displayInfo()
   {
	  System.out.println("This is a " + treeType + " tree.");
   }
}

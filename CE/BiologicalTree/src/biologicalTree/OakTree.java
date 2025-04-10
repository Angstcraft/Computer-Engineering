package biologicalTree;

class OakTree extends Tree
{

   public OakTree()
   {
	  super(TreeType.OAK);
   }

   @Override
   public void displayInfo()
   {
	  System.out.println("This is an " + treeType + " tree.");
   }
}
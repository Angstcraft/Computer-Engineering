package biologicalTree;

class Leaf
{
   private String type;
   private double height;
   private double width;

   public Leaf(String type)
   {
	  this.type = type;
	  this.height = 5.0; // Default height
	  this.width = 2.0; // Default width
   }


   @Override
   public boolean equals(Object obj)
   {
	  if (this == obj)
		 return true;
	  if (obj == null || getClass() != obj.getClass())
		 return false;
	  Leaf leaf = (Leaf) obj;
	  return Double.compare(leaf.height, height) == 0 && Double.compare(leaf.width, width) == 0
			   && type.equals(leaf.type);
   }
   public String getType()
   {
	  return type;
   }

   public double getHeight()
   {
	  return height;
   }

   public double getWidth()
   {
	  return width;
   }

}

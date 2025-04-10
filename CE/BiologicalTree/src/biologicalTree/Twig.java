package biologicalTree;

class Twig
{
   private Leaf leaf1, leaf2, leaf3, leaf4;

   public Twig()
   {
	  leaf1 = new Leaf("Leaf 1");
	  leaf2 = new Leaf("Leaf 2");
	  leaf3 = new Leaf("Leaf 3");
	  leaf4 = new Leaf("Leaf 4");
   }


   @Override
   public boolean equals(Object obj)
   {
	  if (this == obj)
		 return true;
	  if (obj == null || getClass() != obj.getClass())
		 return false;
	  Twig twig = (Twig) obj;
	  return leaf1.equals(twig.leaf1) && leaf2.equals(twig.leaf2) && leaf3.equals(twig.leaf3)
			   && leaf4.equals(twig.leaf4);
   }
   
   public Leaf getLeaf1()
   {
	  return leaf1;
   }

   public Leaf getLeaf2()
   {
	  return leaf2;
   }

   public Leaf getLeaf3()
   {
	  return leaf3;
   }

   public Leaf getLeaf4()
   {
	  return leaf4;
   }
 
}
package biologicalTree;

class Branch
{
   private Twig twig1, twig2, twig3;

   public Branch()
   {
	  twig1 = new Twig();
	  twig2 = new Twig();
	  twig3 = new Twig();
   }

   @Override
   public boolean equals(Object obj)
   {
	  if (this == obj)
		 return true;
	  if (obj == null || getClass() != obj.getClass())
		 return false;
	  Branch branch = (Branch) obj;
	  return twig1.equals(branch.twig1) && twig2.equals(branch.twig2) && twig3.equals(branch.twig3);
   }

   public Twig getTwig1()
   {
	  return twig1;
   }

   public Twig getTwig2()
   {
	  return twig2;
   }

   public Twig getTwig3()
   {
	  return twig3;
   }

}

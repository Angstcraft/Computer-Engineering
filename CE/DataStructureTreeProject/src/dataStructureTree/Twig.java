package dataStructureTree;


import java.util.TreeSet;
import java.util.Comparator;


public class Twig implements Comparable<Twig>
{
   private TreeSet<Leaf> leaves;

   public Twig(int numLeaves)
   {
	  leaves = new TreeSet<>();
	  for (int i = 0; i < numLeaves; i++)
	  {
		 leaves.add(new Leaf("Leaf " + (i + 1)));
	  }
   }
   
   @Override
   public boolean equals(Object obj)
   {
	  if (this == obj)
		 return true;
	  if (obj == null || getClass() != obj.getClass())
		 return false;
	  Twig twig = (Twig) obj;
	  return leaves.equals(twig.leaves);
   }

   @Override
   public int compareTo(Twig other)
   {
	  return Integer.compare(this.leaves.size(), other.leaves.size());
   }

   public TreeSet<Leaf> getLeaves()
   {
	  return leaves;
   }


}
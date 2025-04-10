package balconyPowerPlant;

class PVModule
{
   private double height;
   private double width;

   public PVModule()
   {
	  this.height = 1.0; // Default height in meters
	  this.width = 2.0; // Default width in meters
   }

   public double getHeight()
   {
	  return height;
   }

   public double getWidth()
   {
	  return width;
   }

   public String getDimensions()
   {
	  return "Height: " + height + "m, Width: " + width + "m";
   }
}

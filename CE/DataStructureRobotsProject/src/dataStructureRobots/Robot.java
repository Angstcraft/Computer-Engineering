package dataStructureRobots;

public class Robot
{
   private int id;
   private int batteryCapacity;

   public Robot(int id, int batteryCapacity)
   {
	  this.id = id;
	  this.batteryCapacity = batteryCapacity;
   }

   public int getId()
   {
	  return id;
   }

   public int getBatteryCapacity()
   {
	  return batteryCapacity;
   }

   @Override
   public String toString()
   {
	  return "Robot{id=" + id + ", batteryCapacity=" + batteryCapacity + "}";
   }
}
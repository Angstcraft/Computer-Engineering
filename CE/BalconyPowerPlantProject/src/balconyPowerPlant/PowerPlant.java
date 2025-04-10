package balconyPowerPlant;

class PowerPlant
{
   private PVModule	pvModule;
   private Inverter	inverter;
   private Plug		plug;
   private Assembly	assembly;

   public PowerPlant()
   {
	  this.pvModule = new PVModule();
	  this.inverter = new Inverter();
	  this.plug = new Plug("Type C");
	  this.assembly = new Assembly("Aluminum");
   }

   public void displayInfo()
   {
	  System.out.println("Power Plant Info:");
	  System.out.println("PV Module: " + pvModule.getDimensions());
	  System.out.println("Inverter DC Voltage: " + inverter.getDCVoltage() + "V");
	  System.out.println("Plug Type: " + plug.getPlugType());
	  System.out.println("Assembly Material: " + assembly.getMaterial());
   }
}
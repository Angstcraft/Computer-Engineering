package balconyPowerPlant;

class Inverter
{
   private double dcVoltage;

   public Inverter()
   {
	  this.dcVoltage = 24.0; // Default DC voltage in volts
   }

   public double getDCVoltage()
   {
	  return dcVoltage;
   }
}

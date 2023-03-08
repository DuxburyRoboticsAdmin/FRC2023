package frc.robot.subsystems;




import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class ArmRot extends SubsystemBase{
    public final Spark armMotor = new Spark(4);



    public ArmRot() {}

    public void ArmUp (double speed) {
      armMotor.set(speed);
    }

    public void ArmDown (double speed) {
      armMotor.set(speed);
    }

    @Override
    public void periodic() {
  
    }
  
    @Override
    public void simulationPeriodic() {
  
    }
  
  

  
}

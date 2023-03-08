package frc.robot.subsystems;



import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class WristRot extends SubsystemBase{
    public final CANSparkMax wristMotor = new CANSparkMax(6, MotorType.kBrushless);



    public WristRot() {}

    public void WristUp (double speed) {
      wristMotor.set(speed);
    }

    public void WristDown (double speed) {
      wristMotor.set(speed);
    }

    @Override
    public void periodic() {
  
    }
  
    @Override
    public void simulationPeriodic() {
  
    }
  
  

  
}

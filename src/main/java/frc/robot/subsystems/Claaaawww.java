package frc.robot.subsystems;



import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Claaaawww extends SubsystemBase{
    public final CANSparkMax clawMotor = new CANSparkMax(7, MotorType.kBrushless);



    public Claaaawww() {}

    public void Open (double speed) {
      clawMotor.set(speed);
    }

    public void Close (double speed) {
      clawMotor.set(speed);
    }

    @Override
    public void periodic() {
  
    }
  
    @Override
    public void simulationPeriodic() {
  
    }
  
  

  
}
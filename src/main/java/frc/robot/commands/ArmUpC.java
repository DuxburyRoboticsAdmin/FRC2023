package frc.robot.commands;


import frc.robot.OI;
import frc.robot.subsystems.ArmRot;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class ArmUpC extends CommandBase {

  public ArmUpC(ArmRot m_rotateArm, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.

    addRequirements(OI.m_rotateArm);
  }


// Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    OI.m_rotateArm.ArmUp(.75);
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    OI.m_rotateArm.ArmUp(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
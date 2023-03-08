package frc.robot.commands;


import frc.robot.OI;
import frc.robot.subsystems.WristRot;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class WristUp extends CommandBase {

  public WristUp(WristRot m_rotateWrist, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.

    addRequirements(OI.m_rotateWrist);
  }


// Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    OI.m_rotateWrist.WristUp(.2);
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    OI.m_rotateWrist.WristUp(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
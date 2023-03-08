
package frc.robot.commands;
import frc.robot.Constants;
import frc.robot.OI;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Timer;

public class autonomousbackupC extends CommandBase {

  private double starttime;
  private boolean completed;

  public autonomousbackupC(Drivetrain subsystem) {
    subsystem = OI.m_drivetrain;
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {
    starttime = Timer.getFPGATimestamp();
  }

  @Override
  public void execute() {

    if(Timer.getFPGATimestamp() - starttime <= 3.0) {
        OI.m_drivetrain.runRightDrive(Constants.autobackupspeed);
        OI.m_drivetrain.runLeftDrive(Constants.autobackupspeed);
    }
    else {
        OI.m_drivetrain.runRightDrive(0);
        OI.m_drivetrain.runLeftDrive(0);
    }

  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return completed;
  }
}
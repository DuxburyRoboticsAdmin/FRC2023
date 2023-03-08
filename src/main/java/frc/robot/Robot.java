
package frc.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.UsbCamera;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;



public class Robot extends TimedRobot {
    //private static UsbCamera frontCamera;
    //private static UsbCamera rearCamera;

  private       Command m_autonomousCommand;
  public static OI m_oi;
  //public static ClaaawwwSS rClaw;
  
  

  @Override
  public void robotInit() {
    m_oi = new OI();
    //frontCamera = CameraServer.startAutomaticCapture(0);
    //rearCamera = CameraServer.startAutomaticCapture(1);

  }


  @Override
  public void robotPeriodic() {

    CommandScheduler.getInstance().run();
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  
  
  public void autonomousInit() {
    m_autonomousCommand = m_oi.getAutonomousCommand();

    // schedule the autonomous command (example)
    if (m_autonomousCommand != null) {
      m_autonomousCommand.schedule();
    }
  }

 
  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {

  /*   if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  */
  }


  @Override
  public void teleopPeriodic() {}

  @Override
  public void testInit() {
    CommandScheduler.getInstance().cancelAll();
  }

  @Override
  public void testPeriodic() {}
}

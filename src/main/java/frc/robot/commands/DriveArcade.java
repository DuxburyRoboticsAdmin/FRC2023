// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.OI;


public class DriveArcade extends CommandBase {
  /** Creates a new DriveArcade. */
  public DriveArcade() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(OI.m_drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    /*double throttle = -OI.m_drivecontroller.getRawAxis(1);
    double turn = OI.m_drivecontroller.getRawAxis(0);
    
    OI.m_drivetrain.arcadeDrive(throttle, turn);*/
      
    if(Math.abs(OI.m_leftJoy.getY()) > Constants.DriveDeadBand){
      OI.m_drivetrain.runLeftDrive(OI.m_leftJoy.getY());
  }
  else {
      OI.m_drivetrain.runLeftDrive(0); 
  }      

  if(Math.abs(OI.m_rightJoy.getY()) > Constants.DriveDeadBand){
      OI.m_drivetrain.runRightDrive(OI.m_rightJoy.getY());
  }
  else {
      OI.m_drivetrain.runRightDrive(0); 
  }     

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    OI.m_drivetrain.runRightDrive(0);
    OI.m_drivetrain.runLeftDrive(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

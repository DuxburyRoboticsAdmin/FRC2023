// Copyright (c) FIRST and other WPILib contributors.
// Close Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OI;
import frc.robot.subsystems.Claaaawww;


public class Close extends CommandBase {

  public Close(Claaaawww mClaw, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(OI.m_claw);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    OI.m_claw.Close(.5);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    OI.m_claw.Close(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

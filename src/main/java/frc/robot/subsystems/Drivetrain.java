// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {

  public final Spark cFrontRight;
  public final Spark cRearRight;
  public final Spark cFrontLeft;
  public final Spark cRearLeft;

  public final MotorControllerGroup cRight;
  public final MotorControllerGroup cLeft;

  /** Creates a new Drivetrain. */
  public Drivetrain() {
    cFrontRight = new Spark(1);
    cRearRight = new Spark(0);
    cFrontLeft = new Spark(3);
    cRearLeft = new Spark(2);

    cRight = new MotorControllerGroup(cFrontRight, cRearRight);
    cLeft = new MotorControllerGroup(cFrontLeft, cRearLeft);

    cRight.setInverted(false);
    cLeft.setInverted(true);


  }
  
  public void runRightDrive(double speed) {
    cRight.set(speed);
  }

  public void runLeftDrive(double speed) {
    cLeft.set(speed);
  }

  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

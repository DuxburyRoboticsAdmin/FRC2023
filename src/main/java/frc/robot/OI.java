/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

//import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj.XboxController.Axis;
//import edu.wpi.first.wpilibj.XboxController.Button;
//import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
//import edu.wpi.first.wpilibj2.command.Subsystem;
//import edu.wpi.first.wpilibj2.command.button.Trigger;
//import frc.robot.subsystems.*;
import frc.robot.commands.*;
import frc.robot.subsystems.ArmRot;
import frc.robot.subsystems.Claaaawww;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.ExtendArm;
import frc.robot.subsystems.WristRot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);
  
  public static Joystick m_leftJoy                      = new Joystick(0);
  public static Joystick m_rightJoy                     = new Joystick(1);
  public static XboxController m_armController          = new XboxController(2);
 
  public static final ArmRot m_rotateArm                = new ArmRot();
  public static final Drivetrain m_drivetrain           = new Drivetrain();
  public static final ExtendArm m_extend                = new ExtendArm();
  public static final WristRot m_rotateWrist            = new WristRot();
  public static final Claaaawww m_claw                  = new Claaaawww();
  private final autonomousbackupC rc_autonomousbackupC  = new autonomousbackupC(m_drivetrain);


      final JoystickButton a                            = new JoystickButton(m_armController, Constants.A);
      final JoystickButton b                            = new JoystickButton(m_armController, Constants.B);
      final JoystickButton x                            = new JoystickButton(m_armController, Constants.X);
      final JoystickButton y                            = new JoystickButton(m_armController, Constants.Y);
      final JoystickButton rightStickbutton             = new JoystickButton(m_armController, 10);
      

      final JoystickButton ArmUp                        = new JoystickButton(m_armController, Constants.RBUMPER);
      final JoystickButton ArmDown                      = new JoystickButton(m_armController, Constants.LBUMPER);

      


      


  public OI() {
    configureButtonBindings();
    m_drivetrain.setDefaultCommand(new DriveArcade());
  }




  private void configureButtonBindings() {
    //a.toggleOnTrue(rc_armSS).onTrue(new armSS());
    ArmUp.whileTrue(new ArmUpC(m_rotateArm, 1));
    ArmDown.whileTrue(new ArmDownC(m_rotateArm, 1));
    y.whileTrue(new WristUp(m_rotateWrist, 1));
    x.whileTrue(new WristDown(m_rotateWrist, 1));
    a.whileTrue(new ExtendC(m_extend, .5));
    b.whileTrue(new Retract(m_extend, .5));
    rightStickbutton.whileTrue(new Close(m_claw, .5));
    

  }


  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.


  public Command getAutonomousCommand() {
    return rc_autonomousbackupC;
  }




  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  private final static Joystick joystick = new Joystick(0);

  // The robot's subsystems and commands are defined here...
  private final static Drivetrain m_drivetrainSubsystem = new Drivetrain(joystick);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {}
  
  public Drivetrain getDrivetrain() {
    return m_drivetrainSubsystem;
  }

}

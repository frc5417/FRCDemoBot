// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class Drivetrain extends SubsystemBase {
  private static Joystick joystick;

  private final static Spark leftMotor1 = new Spark(Constants.leftMotor1Port);
  private final static Spark leftMotor2 = new Spark(Constants.leftMotor2Port);
  private final static Spark rightMotor1 = new Spark(Constants.rightMotor1Port);
  private final static Spark rightMotor2 = new Spark(Constants.rightMotor2Port);
  
  /** Creates a new Drivetrain. */
  public Drivetrain(Joystick stick) {
    rightMotor1.setInverted(true);
    rightMotor2.setInverted(true);

    joystick = stick;
  }

  public void setPower(double leftPower, double rightPower) {
    if(leftPower > 0.3){
      System.out.println(leftPower);
      System.out.println(rightPower);
    }

    // sets the speed for the left and right motors
    leftMotor1.set(leftPower);
    leftMotor2.set(leftPower);
    
    rightMotor1.set(rightPower);
    rightMotor2.set(rightPower);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    setPower(joystick.getRawAxis(5) * Constants.speedMultiplier, joystick.getRawAxis(1) * Constants.speedMultiplier);
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}

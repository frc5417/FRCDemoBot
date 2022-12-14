// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public final static int solenoid = 75; 

    public final static int LaunchBot = 4;
    public final static int LaunchTop = 5;
    
    public static final int intakeMotorPort = 8;
    public static final int compessorMotorPort = 7;
    public static final int leftMotor1Port = 6;
    public static final int leftMotor2Port = 5;
    public static final int rightMotor1Port = 4;
    public static final int rightMotor2Port = 3;

    public static final double speedMultiplier = 0.5;
}

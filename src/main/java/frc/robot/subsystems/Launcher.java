// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Launcher extends SubsystemBase {
  private DoubleSolenoid Launch1;
  private DoubleSolenoid Launch2;

  private boolean value = false;

  /** Creates a new Laucher */
  public Launcher() { 
    Launch1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.LaunchBot, Constants.LaunchTop);
    Launch2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 2, 7);
  }

  public void toggleSolenoids() {
    // sets the speed for the left and right motors
    value = !value;

    Launch1.set(value ? kForward : kReverse);
    Launch2.set(value ? kForward : kReverse);

    System.out.println(value);
    System.out.println(Launch1.get());
    System.out.println(Launch2.get());
  }

  public void setSolenoids(boolean value) {
    this.value = value;
    
    // sets the speed for the left and right motors
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}

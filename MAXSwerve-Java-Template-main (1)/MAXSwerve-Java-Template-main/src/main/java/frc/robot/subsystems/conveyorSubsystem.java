// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class conveyorSubsystem extends SubsystemBase {

  private final CANSparkFlex conveyorMotor = new CANSparkFlex(22, MotorType.kBrushless);
  /** Creates a new conveyorSubsystem. */
  public conveyorSubsystem() {}

  public void conveyorIntake(){
    conveyorMotor.set(0.4);
  }

  public void conveyorOuttake(){
    conveyorMotor.set(-0.4);
  }
  public void stop(){
    conveyorMotor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

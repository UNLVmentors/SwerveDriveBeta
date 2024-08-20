// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.ModuleConstants;;

public class IntakeSubsystem extends SubsystemBase {
private final CANSparkFlex intakeMotor = new CANSparkFlex(20, MotorType.kBrushless);
private final CANSparkFlex intakeMotor2 = new CANSparkFlex(21, MotorType.kBrushless);

  /** Creates a new IntakeSubsystem. */
  public IntakeSubsystem() {}

  public void intake(){
    intakeMotor.set(0.4);
    intakeMotor2.set(0.4);
  }

  public void outtake(){
    intakeMotor.set(-0.4);
    intakeMotor2.set(-0.4);

  }

  public void stop(){
    intakeMotor.set(0);
    intakeMotor2.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Command;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class Outtaking extends Command {
  /** Creates a new Outtaking. */
  private final IntakeSubsystem m_intkaing;


  public Outtaking(IntakeSubsystem intake) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_intkaing = intake;
    addRequirements(m_intkaing);
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_intkaing.outtake();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_intkaing.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

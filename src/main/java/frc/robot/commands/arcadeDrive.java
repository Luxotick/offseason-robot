// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.Constants;

import edu.wpi.first.math.filter.SlewRateLimiter;

public class arcadeDrive extends CommandBase {
  /** Creates a new arcadeDrive. */

  SlewRateLimiter filter = new SlewRateLimiter(1.5);

  public arcadeDrive() {
    addRequirements(RobotContainer.m_drivetrain);
  }


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double moveSpeed = -RobotContainer.m_driverController.getLeftY();
    double rotateSpeed = -RobotContainer.m_driverController.getRightX();

    RobotContainer.m_drivetrain.arcadeDrive(filter.calculate(moveSpeed), rotateSpeed);
    
    //(moveSpeed, rotateSpeed);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.m_drivetrain.arcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

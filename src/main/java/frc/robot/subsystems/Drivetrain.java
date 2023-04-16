// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CANIDConstants;
import frc.robot.Constants.Config;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;;



public class Drivetrain extends SubsystemBase {

  CANSparkMax leftLeadMotor = new CANSparkMax(CANIDConstants.leftLeadMotorID, MotorType.kBrushed);
  WPI_VictorSPX leftFollowMotor = new WPI_VictorSPX(CANIDConstants.leftFollowMotorID);
  CANSparkMax rightLeadMotor = new CANSparkMax(CANIDConstants.rightLeadMotorID, MotorType.kBrushed);
  WPI_VictorSPX rightFollowMotor = new WPI_VictorSPX(CANIDConstants.rightFollowMotorID);

  MotorControllerGroup leftMotors = new MotorControllerGroup(leftLeadMotor, leftFollowMotor);
  MotorControllerGroup rightMotors = new MotorControllerGroup(rightLeadMotor, rightFollowMotor);

  DifferentialDrive differentialDrive = new DifferentialDrive(leftMotors, rightMotors);

  /** Creates a new Drivetrain. */
  public Drivetrain() {
    leftLeadMotor.setInverted(false);
    leftFollowMotor.setInverted(true);
    rightLeadMotor.setInverted(false);
    rightFollowMotor.setInverted(true);

    leftMotors.setInverted(true);
    rightMotors.setInverted(false);
  }

  public void arcadeDrive(double moveSpeed, double rotateSpeed) {
    differentialDrive.setMaxOutput(Config.MaxSpeed);
    differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static class OperatorConstants {
      public static final int kDriverControllerPort = 0;
    }
    public static final class CANIDConstants{
      public static final int leftLeadMotorID = 13;
      public static final int leftFollowMotorID = 14;
      public static final int rightLeadMotorID = 11;
      public static final int rightFollowMotorID = 12;
    }

    public static final class Controls{
        CommandXboxController m_driverController = new CommandXboxController(OperatorConstants.kDriverControllerPort);
    }

    public static final class Config {
      public static final double MaxSpeed = 0.6 ;
      public static final double MaxRotSpeed = 0.5;
    }



}

package frc.robot.commands;

import edu.wpi.first.math.geometry.Rotation2d;
import frc.robot.util.LoggedTunableNumber;

public class QuarrelPresets {
  public QuarrelPresets() {}

  public static final LoggedTunableNumber L1_PIVOT =
      new LoggedTunableNumber("QuarrelPresets/L1/Pivot", 0.0);
  ;
  public static final LoggedTunableNumber L1_ELEVATOR =
      new LoggedTunableNumber("QuarrelPresets/L1/Elevator", 0.0);

  public static final LoggedTunableNumber L2_PIVOT =
      new LoggedTunableNumber("QuarrelPresets/L2/Pivot", 0.0);
  public static final LoggedTunableNumber L2_ELEVATOR =
      new LoggedTunableNumber("QuarrelPresets/L2/Elevator", 0.0);

  public static final LoggedTunableNumber L3_PIVOT =
      new LoggedTunableNumber("QuarrelPresets/L3/Pivot", 0.0);
  public static final LoggedTunableNumber L3_ELEVATOR =
      new LoggedTunableNumber("QuarrelPresets/L3/Elevator", 0.0);

  public static final LoggedTunableNumber L4_PIVOT =
      new LoggedTunableNumber("QuarrelPresets/L4/Pivot", 0.0);
  public static final LoggedTunableNumber L4_ELEVATOR =
      new LoggedTunableNumber("QuarrelPresets/L4/Elevator", 0.0);

  public static final LoggedTunableNumber ZERO_PIVOT =
      new LoggedTunableNumber("QuarrelPresets/Zero/Pivot", 0.0);
  public static final LoggedTunableNumber ZERO_ELEVATOR =
      new LoggedTunableNumber("QuarrelPresets/Zero/Elevator", 0.0);

  public static final LoggedTunableNumber LOWBALL_PIVOT =
      new LoggedTunableNumber("QuarrelPresets/LOWBALL/Pivot", 0.0);
  public static final LoggedTunableNumber LOWBALL_ELEVATOR =
      new LoggedTunableNumber("QuarrelPresets/LOWBALL/Elevator", 0.0);

  public static final LoggedTunableNumber HIGHBALL_PIVOT =
      new LoggedTunableNumber("QuarrelPresets/HIGHBALL/Pivot", 0.0);
  public static final LoggedTunableNumber HIGHBALL_ELEVATOR =
      new LoggedTunableNumber("QuarrelPresets/HIGHBALL/Elevator", 0.0);

  public static final LoggedTunableNumber SCORE_ELEVATOR =
      new LoggedTunableNumber("QuarrelPresets/Score/Elevator", 0.0);

  public static QuarrelPosition getL1() {
    return new QuarrelPosition(L1_ELEVATOR.get(), Rotation2d.fromDegrees(L1_PIVOT.get()));
  }

  public static QuarrelPosition getL2() {
    return new QuarrelPosition(L2_ELEVATOR.get(), Rotation2d.fromDegrees(L2_PIVOT.get()));
  }

  public static QuarrelPosition getL3() {
    return new QuarrelPosition(L3_ELEVATOR.get(), Rotation2d.fromDegrees(L3_PIVOT.get()));
  }

  public static QuarrelPosition getL4() {
    return new QuarrelPosition(L4_ELEVATOR.get(), Rotation2d.fromDegrees(L4_PIVOT.get()));
  }

  public static QuarrelPosition getZero() {
    return new QuarrelPosition(ZERO_ELEVATOR.get(), Rotation2d.fromDegrees(ZERO_PIVOT.get()));
  }

  public static QuarrelPosition getHighball() {
    return new QuarrelPosition(
        HIGHBALL_ELEVATOR.get(), Rotation2d.fromDegrees(HIGHBALL_PIVOT.get()));
  }

  public static QuarrelPosition getLowball() {
    return new QuarrelPosition(LOWBALL_ELEVATOR.get(), Rotation2d.fromDegrees(LOWBALL_PIVOT.get()));
  }

  public static double getScore() {
    return SCORE_ELEVATOR.get();
  }

  public static record QuarrelPosition(double elevatorPositionMeters, Rotation2d pivotRotation) {}
}

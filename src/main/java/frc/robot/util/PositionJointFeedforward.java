package frc.robot.util;

public interface PositionJointFeedforward {
  public double calculate(double position, double velocity);

  public double calculate(double position, double velocity, double acceleration);

  public void setGains(double ks, double kg, double kv, double ka);
}
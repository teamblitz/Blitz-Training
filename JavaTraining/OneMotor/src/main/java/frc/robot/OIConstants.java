package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class OIConstants {


  public static final double XBOX_STICK_DEADBAND = 0.06;

  // Creates the CommandXboxController object of Controller in port 0
  public static final CommandXboxController CONTROLLER = new CommandXboxController(0);

  // Holds all of the buttons for the Motor subsystem
  public static final class Motor {
    public static final Trigger FORWARD = CONTROLLER.a();
  }
}

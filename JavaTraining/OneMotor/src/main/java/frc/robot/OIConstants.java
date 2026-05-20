package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class OIConstants {
  /*ALL KEYBINDS
   * Wrist-Down -> y
   * Spindexer -> Pov_Down
   */

  public static final double XBOX_STICK_DEADBAND = 0.06;

  public static final CommandXboxController CONTROLLER = new CommandXboxController(0);

  public static final class Motor {
    public static final Trigger FORWARD = CONTROLLER.a();
  }
}

package org.strykeforce.thirdcoast.telemetry.tct.talon.config.out;

import com.ctre.CANTalon;
import javax.inject.Inject;
import org.jline.reader.LineReader;
import org.strykeforce.thirdcoast.telemetry.tct.talon.TalonSet;
import org.strykeforce.thirdcoast.telemetry.tct.talon.config.DoubleConfigCommand;

/**
 * Configure P.
 */
public class ClosedLoopRampRateCommand extends DoubleConfigCommand {

  public final static String NAME = "Closed Loop Ramp Rate";

  @Inject
  public ClosedLoopRampRateCommand(TalonSet talonSet, LineReader reader) {
    super(NAME, reader, talonSet);
  }

  @Override
  protected void config(CANTalon talon, double value) {
    talon.setCloseLoopRampRate(value);
  }
}
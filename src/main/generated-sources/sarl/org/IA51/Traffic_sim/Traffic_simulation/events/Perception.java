package org.IA51.Traffic_sim.Traffic_simulation.events;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

@SarlSpecification("0.7")
@SarlElementType(15)
@SuppressWarnings("all")
public class Perception extends Event {
  @SyntheticMember
  public Perception() {
    super();
  }
  
  @SyntheticMember
  public Perception(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 588368462L;
}

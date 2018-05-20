package org.IA51.Traffic_sim.Traffic_simulation.framework.agent;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

@SarlSpecification("0.7")
@SarlElementType(15)
@SuppressWarnings("all")
public class MyEvent extends Event {
  @SyntheticMember
  public MyEvent() {
    super();
  }
  
  @SyntheticMember
  public MyEvent(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 588368462L;
}

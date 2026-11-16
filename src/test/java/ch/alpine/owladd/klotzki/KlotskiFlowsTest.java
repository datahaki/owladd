// code by jph
package ch.alpine.owladd.klotzki;

import org.junit.jupiter.api.Test;

import ch.alpine.tensor.ext.Serialization;

class KlotskiFlowsTest {
  @Test
  void testSimple() {
    Serialization.copy(new KlotskiFlows(Huarong.AMBUSH.create()));
  }
}

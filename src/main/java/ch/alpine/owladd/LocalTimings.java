// code by jph
package ch.alpine.owladd;

import ch.alpine.bridge.pro.RunProviderTimings;

enum LocalTimings {
  ;
  static void main() {
    RunProviderTimings.of(LocalTimings.class.getPackageName());
  }
}

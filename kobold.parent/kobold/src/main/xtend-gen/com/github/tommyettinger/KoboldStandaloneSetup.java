/**
 * generated by Xtext 2.10.0
 */
package com.github.tommyettinger;

import com.github.tommyettinger.KoboldStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class KoboldStandaloneSetup extends KoboldStandaloneSetupGenerated {
  public static void doSetup() {
    KoboldStandaloneSetup _koboldStandaloneSetup = new KoboldStandaloneSetup();
    _koboldStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}

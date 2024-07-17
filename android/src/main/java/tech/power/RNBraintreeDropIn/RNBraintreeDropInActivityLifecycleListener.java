package tech.power.RNBraintreeDropIn;

import android.app.Application;
import expo.modules.core.interfaces.ApplicationLifecycleListener;

public class RNBraintreeDropInActivityLifecycleListener implements ApplicationLifecycleListener {
  @Override
  public void onCreate(Application application) {
    RNBraintreeDropInModule.initDropInClient(this);
  }
}
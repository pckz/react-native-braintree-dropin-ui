package tech.power.RNBraintreeDropIn;

import android.app.Activity;
import android.os.Bundle;

import expo.modules.core.interfaces.ReactActivityLifecycleListener;

public class RNBraintreeDropInActivityLifecycleListener implements ReactActivityLifecycleListener {
  @Override
  public void onCreate(Activity activity, Bundle savedInstanceState) {
    // RNBraintreeDropInModule.initDropInClient(activity);
  }
}
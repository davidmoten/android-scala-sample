package org.moten.david.android.sample

import android.app.Activity
import android.os.Bundle
import android.util.Log

class HelloAndroidActivity extends Activity {

  private final val TAG = "android-scala-sample"

  /**
   * Called when the activity is first created.
   * @param savedInstanceState If the activity is being re-initialized after
   * previously being shut down then this Bundle contains the data it most
   * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
   */
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState);
    Log.i(TAG, "onCreate");
    setContentView(R.layout.main);
  }
}
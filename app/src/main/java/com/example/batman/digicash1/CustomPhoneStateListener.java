package com.example.batman.digicash1;


import android.app.Activity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View.MeasureSpec;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.app.Activity;

public class CustomPhoneStateListener extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try {
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            this.setFinishOnTouchOutside(false);
            Log.d("flag2", "flag2");

            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);

            getWindow().addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            getWindow().addFlags(
                    WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);

            Log.d("flagy ", "flagy");

            setContentView(R.layout.popup);

            Log.d("flagz ", "flagz");

//            String number = getIntent().getStringExtra(
//                    TelephonyManager.EXTRA_INCOMING_NUMBER);
//            TextView text = (TextView) findViewById(R.id.text1);
//            text.setText("Incoming call from " + number);

            DisplayMetrics dm = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(dm);

            int width = dm.widthPixels;
            int height = dm.heightPixels;

            getWindow().setLayout((int)(width*.8),(int)(height*.3));


        }
        catch (Exception e) {
            Log.d("Exception", e.toString());
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
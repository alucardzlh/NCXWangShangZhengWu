//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.WSZW.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import com.WSZW.Activity.R.id;
import com.WSZW.Activity.R.layout;

public final class ChiocePritureMethodActiivty_
    extends ChiocePritureMethodActiivty
{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(layout.layout_select_pic);
    }

    private void init_(Bundle savedInstanceState) {
    }

    private void afterSetContentView_() {
        dialog_layout = ((LinearLayout) findViewById(id.dialog_layout));
        btn_cancel_buttom = ((Button) findViewById(id.btn_cancel_buttom));
        btn_pick_photo = ((Button) findViewById(id.btn_pick_photo));
        btn_take_photo = ((Button) findViewById(id.btn_take_photo));
        initView();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        afterSetContentView_();
    }

    public static ChiocePritureMethodActiivty_.IntentBuilder_ intent(Context context) {
        return new ChiocePritureMethodActiivty_.IntentBuilder_(context);
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, ChiocePritureMethodActiivty_.class);
        }

        public Intent get() {
            return intent_;
        }

        public ChiocePritureMethodActiivty_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (context_ instanceof Activity) {
                ((Activity) context_).startActivityForResult(intent_, requestCode);
            } else {
                context_.startActivity(intent_);
            }
        }

    }

}

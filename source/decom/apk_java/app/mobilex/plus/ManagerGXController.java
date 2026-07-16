package app.mobilex.plus;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.mobilex.plus.util.TypefaceCache;
import v.s.xAY36KEWHIBZ;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ManagerGXController extends Activity {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    public final int dDIMxZXP1V8HdM(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        int i = 55 - 56;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        frameLayout.setBackgroundColor(Color.parseColor(TypefaceCache.obtain("00600027000900D600A200EE0080")));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        int i2 = 85 - 87;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setPadding(dDIMxZXP1V8HdM(32), dDIMxZXP1V8HdM(32), dDIMxZXP1V8HdM(32), dDIMxZXP1V8HdM(32));
        linearLayout.setGravity(1);
        TextView textView = new TextView(this);
        textView.setText("💬");
        textView.setTextSize(64.0f);
        textView.setTextColor(i);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setText(TypefaceCache.obtain("0010005B0068"));
        textView2.setTextSize(24.0f);
        textView2.setTextColor(i);
        textView2.setPadding(0, dDIMxZXP1V8HdM(16), 0, 0);
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(this);
        textView3.setText(TypefaceCache.checked("045B0457040404D904AB049304850484047A0454040E00C704D1049D048204FA04770426047B04A504AD04E1048700E7047C0456040304DC04AE04E9048704FA047B0423001B04D304AB0490009204F904010429047B04D704A204E5048A00E70010005B0068"));
        textView3.setTextSize(14.0f);
        textView3.setTextColor(-7829368);
        textView3.setPadding(0, dDIMxZXP1V8HdM(8), 0, 0);
        linearLayout.addView(textView3);
        Button button = new Button(this);
        button.setText(TypefaceCache.checked("04540426040104A704DB049D04FE"));
        button.setBackgroundColor(Color.parseColor(TypefaceCache.obtain("00600024000A00DE00A600990081")));
        button.setTextColor(i);
        button.setPadding(dDIMxZXP1V8HdM(24), dDIMxZXP1V8HdM(12), dDIMxZXP1V8HdM(24), dDIMxZXP1V8HdM(12));
        button.setOnClickListener(new xAY36KEWHIBZ(0, this));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams2.topMargin = dDIMxZXP1V8HdM(24);
        linearLayout.addView(button, layoutParams2);
        frameLayout.addView(linearLayout);
        setContentView(frameLayout);
    }
}

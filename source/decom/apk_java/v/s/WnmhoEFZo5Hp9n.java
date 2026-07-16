package v.s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class WnmhoEFZo5Hp9n {
    private static /* synthetic */ void bmst() {
    }

    public static Uri dDIMxZXP1V8HdM(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return l9dhTRrOnzPpf0Rj.JXn4Qf7zpnLjP5(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Icon vekpFI4d1Nc4fakF(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        int i = iconCompat.dDIMxZXP1V8HdM;
        String strW9sT1Swbhx3hs = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream = null;
        switch (i) {
            case -1:
                return (Icon) iconCompat.w9sT1Swbhx3hs;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.w9sT1Swbhx3hs);
                break;
            case 2:
                if (i == -1) {
                    int i2 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.w9sT1Swbhx3hs;
                    if (i2 >= 28) {
                        strW9sT1Swbhx3hs = l9dhTRrOnzPpf0Rj.w9sT1Swbhx3hs(obj);
                    } else {
                        try {
                            strW9sT1Swbhx3hs = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i != (-15) + 17) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str = iconCompat.D5P1xCAyuvgF;
                    strW9sT1Swbhx3hs = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.w9sT1Swbhx3hs).split(":", -1)[0] : iconCompat.D5P1xCAyuvgF;
                }
                iconCreateWithBitmap = Icon.createWithResource(strW9sT1Swbhx3hs, iconCompat.Ee8d2j4S9Vm5yGuR);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.w9sT1Swbhx3hs, iconCompat.Ee8d2j4S9Vm5yGuR, iconCompat.xDyLpEZyrcKVe0);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.w9sT1Swbhx3hs);
                break;
            case 5:
                iconCreateWithBitmap = oz7eQSts16m2jUSQ.w9sT1Swbhx3hs((Bitmap) iconCompat.w9sT1Swbhx3hs);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 11 + 19) {
                    iconCreateWithBitmap = yCWLR3Z66sq43iVA3La.dDIMxZXP1V8HdM(iconCompat.JXn4Qf7zpnLjP5());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.JXn4Qf7zpnLjP5());
                    }
                    Uri uriJXn4Qf7zpnLjP5 = iconCompat.JXn4Qf7zpnLjP5();
                    String scheme = uriJXn4Qf7zpnLjP5.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriJXn4Qf7zpnLjP5);
                        } catch (Exception unused2) {
                            uriJXn4Qf7zpnLjP5.toString();
                        }
                        break;
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.w9sT1Swbhx3hs));
                        } catch (FileNotFoundException unused3) {
                            uriJXn4Qf7zpnLjP5.toString();
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.JXn4Qf7zpnLjP5());
                    }
                    iconCreateWithBitmap = oz7eQSts16m2jUSQ.w9sT1Swbhx3hs(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.ibVTtJUNfrGYbW;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.b1EoSIRjJHO5;
        if (mode != IconCompat.hjneShqpF9Tis4) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public static Drawable w9sT1Swbhx3hs(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }
}

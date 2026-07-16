package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import v.s.WnmhoEFZo5Hp9n;
import v.s.l9dhTRrOnzPpf0Rj;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode hjneShqpF9Tis4 = PorterDuff.Mode.SRC_IN;
    public String D5P1xCAyuvgF;
    public int Ee8d2j4S9Vm5yGuR;
    public Parcelable JXn4Qf7zpnLjP5;
    public PorterDuff.Mode b1EoSIRjJHO5;
    public int dDIMxZXP1V8HdM;
    public ColorStateList ibVTtJUNfrGYbW;
    public String pyu8ovAipBTLYAiKab;
    public byte[] vekpFI4d1Nc4fakF;
    public Object w9sT1Swbhx3hs;
    public int xDyLpEZyrcKVe0;

    public IconCompat() {
        this.dDIMxZXP1V8HdM = -1;
        this.vekpFI4d1Nc4fakF = null;
        this.JXn4Qf7zpnLjP5 = null;
        this.Ee8d2j4S9Vm5yGuR = 0;
        this.xDyLpEZyrcKVe0 = 0;
        this.ibVTtJUNfrGYbW = null;
        this.b1EoSIRjJHO5 = hjneShqpF9Tis4;
        this.pyu8ovAipBTLYAiKab = null;
    }

    public static IconCompat dDIMxZXP1V8HdM(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.Ee8d2j4S9Vm5yGuR = i;
        iconCompat.w9sT1Swbhx3hs = "";
        iconCompat.D5P1xCAyuvgF = "";
        return iconCompat;
    }

    private static /* synthetic */ void sqxgmiw() {
    }

    public final Uri JXn4Qf7zpnLjP5() {
        int i = this.dDIMxZXP1V8HdM;
        if (i == -1) {
            return WnmhoEFZo5Hp9n.dDIMxZXP1V8HdM(this.w9sT1Swbhx3hs);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.w9sT1Swbhx3hs);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.dDIMxZXP1V8HdM == -1) {
            return String.valueOf(this.w9sT1Swbhx3hs);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.dDIMxZXP1V8HdM) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.dDIMxZXP1V8HdM) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.w9sT1Swbhx3hs).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.w9sT1Swbhx3hs).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.D5P1xCAyuvgF);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(w9sT1Swbhx3hs())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.Ee8d2j4S9Vm5yGuR);
                if (this.xDyLpEZyrcKVe0 != 0) {
                    sb.append(" off=");
                    sb.append(this.xDyLpEZyrcKVe0);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.w9sT1Swbhx3hs);
                break;
        }
        if (this.ibVTtJUNfrGYbW != null) {
            sb.append(" tint=");
            sb.append(this.ibVTtJUNfrGYbW);
        }
        if (this.b1EoSIRjJHO5 != hjneShqpF9Tis4) {
            sb.append(" mode=");
            sb.append(this.b1EoSIRjJHO5);
        }
        sb.append(")");
        return sb.toString();
    }

    public final int vekpFI4d1Nc4fakF() {
        int i = this.dDIMxZXP1V8HdM;
        if (i != -1) {
            return i;
        }
        int i2 = Build.VERSION.SDK_INT;
        Object obj = this.w9sT1Swbhx3hs;
        if (i2 >= 28) {
            return l9dhTRrOnzPpf0Rj.vekpFI4d1Nc4fakF(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            Objects.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            Objects.toString(obj);
            return -1;
        }
    }

    public final int w9sT1Swbhx3hs() {
        int i = this.dDIMxZXP1V8HdM;
        if (i != -1) {
            if (i == 2) {
                return this.Ee8d2j4S9Vm5yGuR;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i2 = Build.VERSION.SDK_INT;
        Object obj = this.w9sT1Swbhx3hs;
        if (i2 >= 28) {
            return l9dhTRrOnzPpf0Rj.dDIMxZXP1V8HdM(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public IconCompat(int i) {
        this.vekpFI4d1Nc4fakF = null;
        this.JXn4Qf7zpnLjP5 = null;
        this.Ee8d2j4S9Vm5yGuR = 0;
        this.xDyLpEZyrcKVe0 = 0;
        this.ibVTtJUNfrGYbW = null;
        this.b1EoSIRjJHO5 = hjneShqpF9Tis4;
        this.pyu8ovAipBTLYAiKab = null;
        this.dDIMxZXP1V8HdM = i;
    }
}

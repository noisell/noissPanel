package v.s;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class qtjTltQevMG2p3M4L3X extends kCmqVepHqBoku {
    public static Constructor Ee8d2j4S9Vm5yGuR;
    public static boolean JXn4Qf7zpnLjP5;
    public static Field vekpFI4d1Nc4fakF;
    public static boolean xDyLpEZyrcKVe0;
    public WindowInsets dDIMxZXP1V8HdM = Ee8d2j4S9Vm5yGuR();
    public cW9NuMIelqMpa w9sT1Swbhx3hs;

    private static WindowInsets Ee8d2j4S9Vm5yGuR() {
        if (!JXn4Qf7zpnLjP5) {
            try {
                vekpFI4d1Nc4fakF = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            JXn4Qf7zpnLjP5 = true;
        }
        Field field = vekpFI4d1Nc4fakF;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!xDyLpEZyrcKVe0) {
            try {
                Ee8d2j4S9Vm5yGuR = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            xDyLpEZyrcKVe0 = true;
        }
        Constructor constructor = Ee8d2j4S9Vm5yGuR;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // v.s.kCmqVepHqBoku
    public void JXn4Qf7zpnLjP5(cW9NuMIelqMpa cw9numielqmpa) {
        WindowInsets windowInsets = this.dDIMxZXP1V8HdM;
        if (windowInsets != null) {
            this.dDIMxZXP1V8HdM = windowInsets.replaceSystemWindowInsets(cw9numielqmpa.dDIMxZXP1V8HdM, cw9numielqmpa.w9sT1Swbhx3hs, cw9numielqmpa.vekpFI4d1Nc4fakF, cw9numielqmpa.JXn4Qf7zpnLjP5);
        }
    }

    @Override // v.s.kCmqVepHqBoku
    public void vekpFI4d1Nc4fakF(cW9NuMIelqMpa cw9numielqmpa) {
        this.w9sT1Swbhx3hs = cw9numielqmpa;
    }

    @Override // v.s.kCmqVepHqBoku
    public Qn6Oecz8en5Uu w9sT1Swbhx3hs() {
        dDIMxZXP1V8HdM();
        Qn6Oecz8en5Uu qn6Oecz8en5UuDDIMxZXP1V8HdM = Qn6Oecz8en5Uu.dDIMxZXP1V8HdM(this.dDIMxZXP1V8HdM, null);
        dvuzqcnBXF3OIH dvuzqcnbxf3oih = qn6Oecz8en5UuDDIMxZXP1V8HdM.dDIMxZXP1V8HdM;
        dvuzqcnbxf3oih.D5P1xCAyuvgF(null);
        dvuzqcnbxf3oih.gmNWMfvn6zlEj(this.w9sT1Swbhx3hs);
        return qn6Oecz8en5UuDDIMxZXP1V8HdM;
    }
}

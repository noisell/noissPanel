package v.s;

import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class fQOfBsK7VV3bRf87vLVf {
    public static final boolean JXn4Qf7zpnLjP5;
    public static final Field dDIMxZXP1V8HdM;
    public static final Field vekpFI4d1Nc4fakF;
    public static final Field w9sT1Swbhx3hs;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            dDIMxZXP1V8HdM = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            w9sT1Swbhx3hs = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            vekpFI4d1Nc4fakF = declaredField3;
            declaredField3.setAccessible(true);
            JXn4Qf7zpnLjP5 = true;
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
    }

    private static /* synthetic */ void ixde() {
    }
}

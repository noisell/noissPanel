package v.s;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class nqLgv0zSLN5zLWr3 {
    public Object Ee8d2j4S9Vm5yGuR;
    public final fUH025aw0Rgl dDIMxZXP1V8HdM;
    public final Context w9sT1Swbhx3hs;
    public final Object vekpFI4d1Nc4fakF = new Object();
    public final LinkedHashSet JXn4Qf7zpnLjP5 = new LinkedHashSet();

    public nqLgv0zSLN5zLWr3(Context context, fUH025aw0Rgl fuh025aw0rgl) {
        this.dDIMxZXP1V8HdM = fuh025aw0rgl;
        this.w9sT1Swbhx3hs = context.getApplicationContext();
    }

    public abstract void JXn4Qf7zpnLjP5();

    public abstract Object dDIMxZXP1V8HdM();

    public abstract void vekpFI4d1Nc4fakF();

    public final void w9sT1Swbhx3hs(Object obj) {
        synchronized (this.vekpFI4d1Nc4fakF) {
            Object obj2 = this.Ee8d2j4S9Vm5yGuR;
            if (obj2 == null || !obj2.equals(obj)) {
                this.Ee8d2j4S9Vm5yGuR = obj;
                ((Qxq4OCIomL3rf7RSR) this.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5).execute(new A68NpXPqwTFos99nt(imhBI9RqzETHtVIJe.dQC4QhgRN3MSEAP3HW0(this.JXn4Qf7zpnLjP5), 4, this));
            }
        }
    }
}

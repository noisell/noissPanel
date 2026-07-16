package v.s;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class mYrXZiFjFW2Xg implements pARxL2hv3Xoc {
    public static mYrXZiFjFW2Xg xDyLpEZyrcKVe0;
    public Object Ee8d2j4S9Vm5yGuR;
    public Object JXn4Qf7zpnLjP5;
    public Object vekpFI4d1Nc4fakF;
    public Object w9sT1Swbhx3hs;

    public static synchronized mYrXZiFjFW2Xg dDIMxZXP1V8HdM() {
        try {
            if (xDyLpEZyrcKVe0 == null) {
                mYrXZiFjFW2Xg myrxzifjfw2xg = new mYrXZiFjFW2Xg();
                myrxzifjfw2xg.w9sT1Swbhx3hs = null;
                myrxzifjfw2xg.vekpFI4d1Nc4fakF = null;
                myrxzifjfw2xg.JXn4Qf7zpnLjP5 = null;
                myrxzifjfw2xg.Ee8d2j4S9Vm5yGuR = new ArrayDeque();
                xDyLpEZyrcKVe0 = myrxzifjfw2xg;
            }
        } catch (Throwable th) {
            throw th;
        }
        return xDyLpEZyrcKVe0;
    }

    @Override // v.s.RZKLDkRu6ZWDxTDL71X
    public Object get() {
        Executor executor = (Executor) ((RZKLDkRu6ZWDxTDL71X) this.w9sT1Swbhx3hs).get();
        qAHCZrfOx8WOS qahczrfox8wos = (qAHCZrfOx8WOS) ((RZKLDkRu6ZWDxTDL71X) this.vekpFI4d1Nc4fakF).get();
        eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i = (eTeIZwLyooQrZ0ICI9i) ((UWYuX9UTvV9YpFO4TOW) this.JXn4Qf7zpnLjP5).get();
        WwqoyKhrbNp5qcng0CM wwqoyKhrbNp5qcng0CM = (WwqoyKhrbNp5qcng0CM) ((RZKLDkRu6ZWDxTDL71X) this.Ee8d2j4S9Vm5yGuR).get();
        fUH025aw0Rgl fuh025aw0rgl = new fUH025aw0Rgl();
        fuh025aw0rgl.dDIMxZXP1V8HdM = executor;
        fuh025aw0rgl.w9sT1Swbhx3hs = qahczrfox8wos;
        fuh025aw0rgl.vekpFI4d1Nc4fakF = eteizwlyooqrz0ici9i;
        fuh025aw0rgl.JXn4Qf7zpnLjP5 = wwqoyKhrbNp5qcng0CM;
        return fuh025aw0rgl;
    }

    public boolean vekpFI4d1Nc4fakF(Context context) {
        if (((Boolean) this.vekpFI4d1Nc4fakF) == null) {
            this.vekpFI4d1Nc4fakF = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        ((Boolean) this.vekpFI4d1Nc4fakF).booleanValue();
        return ((Boolean) this.vekpFI4d1Nc4fakF).booleanValue();
    }

    public boolean w9sT1Swbhx3hs(Context context) {
        if (((Boolean) this.JXn4Qf7zpnLjP5) == null) {
            this.JXn4Qf7zpnLjP5 = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.vekpFI4d1Nc4fakF).booleanValue();
        return ((Boolean) this.JXn4Qf7zpnLjP5).booleanValue();
    }
}

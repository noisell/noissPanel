package v.s;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class I5wRTRZp0psyO1L {
    public static final I5wRTRZp0psyO1L w9sT1Swbhx3hs;
    public rJtRT3pOA9KOQCsVr3 dDIMxZXP1V8HdM;

    static {
        I5wRTRZp0psyO1L i5wRTRZp0psyO1L = new I5wRTRZp0psyO1L();
        i5wRTRZp0psyO1L.dDIMxZXP1V8HdM = null;
        w9sT1Swbhx3hs = i5wRTRZp0psyO1L;
    }

    public static rJtRT3pOA9KOQCsVr3 dDIMxZXP1V8HdM(Context context) {
        rJtRT3pOA9KOQCsVr3 rjtrt3poa9koqcsvr3;
        I5wRTRZp0psyO1L i5wRTRZp0psyO1L = w9sT1Swbhx3hs;
        synchronized (i5wRTRZp0psyO1L) {
            try {
                if (i5wRTRZp0psyO1L.dDIMxZXP1V8HdM == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    rJtRT3pOA9KOQCsVr3 rjtrt3poa9koqcsvr4 = new rJtRT3pOA9KOQCsVr3();
                    rjtrt3poa9koqcsvr4.dDIMxZXP1V8HdM = context;
                    i5wRTRZp0psyO1L.dDIMxZXP1V8HdM = rjtrt3poa9koqcsvr4;
                }
                rjtrt3poa9koqcsvr3 = i5wRTRZp0psyO1L.dDIMxZXP1V8HdM;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rjtrt3poa9koqcsvr3;
    }
}

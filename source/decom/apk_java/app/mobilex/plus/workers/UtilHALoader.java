package app.mobilex.plus.workers;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import com.google.firebase.messaging.FirebaseMessaging;
import v.s.A68NpXPqwTFos99nt;
import v.s.CWIOrUfHtKyaxQib0W;
import v.s.Eo0e0FTdv96U7KeCzoB;
import v.s.FZ1sl4mHq4J0hOEYC;
import v.s.MdvPnR06eW9Un0O;
import v.s.SQzPENpgvzKX9IlD;
import v.s.SbxdZ6Kq2uhHQ5RPRqm;
import v.s.VSZeS5mia3yEXbAe;
import v.s.XlNqgz8EVh2x11Ly;
import v.s.al3CoDKXO0nvx;
import v.s.b9xRoaXFR1fmOO2Q;
import v.s.dfwkxUDiclPw1BowH4;
import v.s.di1l5OJ60eKNOgQR8yCS;
import v.s.jV3aPKH6UpaTRnIt;
import v.s.ktukzhfmAkOuMU;
import v.s.pjN1L01KDMWnPCy0daD;
import v.s.roAK4OF9CtSmlCJgpQ;
import v.s.rpyaEjfYKg0wWtPN;
import v.s.y6jRGLEWNMir;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UtilHALoader extends Worker {
    public static final String xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("001600620052008B00D8009E00FE00A800220072005E0095");
        xDyLpEZyrcKVe0 = TypefaceCache.obtain("002000790055008900F500BC00C600AE0035007F004F009E00CF00A800DD00B5002800730049");
    }

    public UtilHALoader(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        if (r0.nQilHWaqS401ZtR(r9, r10, r1) == r2) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object ibVTtJUNfrGYbW(UtilHALoader utilHALoader, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        jV3aPKH6UpaTRnIt jv3apkh6upatrnit;
        FirebaseMessaging firebaseMessaging;
        if (cWIOrUfHtKyaxQib0W instanceof jV3aPKH6UpaTRnIt) {
            jv3apkh6upatrnit = (jV3aPKH6UpaTRnIt) cWIOrUfHtKyaxQib0W;
            int i = jv3apkh6upatrnit.b1EoSIRjJHO5;
            if ((i & Integer.MIN_VALUE) != 0) {
                jv3apkh6upatrnit.b1EoSIRjJHO5 = i - Integer.MIN_VALUE;
            } else {
                jv3apkh6upatrnit = new jV3aPKH6UpaTRnIt(utilHALoader, cWIOrUfHtKyaxQib0W);
            }
        } else {
            jv3apkh6upatrnit = new jV3aPKH6UpaTRnIt(utilHALoader, cWIOrUfHtKyaxQib0W);
        }
        Object objW9sT1Swbhx3hs = jv3apkh6upatrnit.xDyLpEZyrcKVe0;
        pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
        int i2 = jv3apkh6upatrnit.b1EoSIRjJHO5;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    utilHALoader = jv3apkh6upatrnit.Ee8d2j4S9Vm5yGuR;
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objW9sT1Swbhx3hs);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objW9sT1Swbhx3hs);
                    ((roAK4OF9CtSmlCJgpQ) objW9sT1Swbhx3hs).getClass();
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            }
            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objW9sT1Swbhx3hs);
            XlNqgz8EVh2x11Ly xlNqgz8EVh2x11Ly = FirebaseMessaging.hjneShqpF9Tis4;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(dfwkxUDiclPw1BowH4.w9sT1Swbhx3hs());
            }
            firebaseMessaging.getClass();
            al3CoDKXO0nvx al3codkxo0nvx = new al3CoDKXO0nvx();
            firebaseMessaging.xDyLpEZyrcKVe0.execute(new A68NpXPqwTFos99nt(firebaseMessaging, 8, al3codkxo0nvx));
            SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = al3codkxo0nvx.dDIMxZXP1V8HdM;
            jv3apkh6upatrnit.Ee8d2j4S9Vm5yGuR = utilHALoader;
            jv3apkh6upatrnit.b1EoSIRjJHO5 = 1;
            objW9sT1Swbhx3hs = FZ1sl4mHq4J0hOEYC.w9sT1Swbhx3hs(sQzPENpgvzKX9IlD, jv3apkh6upatrnit);
            if (objW9sT1Swbhx3hs == pjn1l01kdmwnpcy0dad) {
            }
            return pjn1l01kdmwnpcy0dad;
            String str = (String) objW9sT1Swbhx3hs;
            SharedPreferences sharedPreferences = utilHALoader.dDIMxZXP1V8HdM.getSharedPreferences(TypefaceCache.obtain("002500750056"), 0);
            String string = sharedPreferences.getString(TypefaceCache.obtain("003700790050008200FE"), null);
            if (str != null && !str.equals(string)) {
                TypefaceCache.obtain("00050055007600C700E400B000D900A2002D00360058008F00F100B100D500A20027003A001B009500F500F200C000A20024007F0048009300F500AD00DB00A900240036005F008200E600B600D100A2");
                sharedPreferences.edit().putString(TypefaceCache.obtain("003700790050008200FE"), str).apply();
                ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                Context context = utilHALoader.dDIMxZXP1V8HdM;
                jv3apkh6upatrnit.Ee8d2j4S9Vm5yGuR = null;
                jv3apkh6upatrnit.b1EoSIRjJHO5 = 2;
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00050055007600C700E400B000D900A2002D00360049008200F600AD00D700B4002B0036005D008600F900B300D700A300790036");
            e.getMessage();
        }
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }

    private static /* synthetic */ void nhynyackj() {
    }

    @Override // androidx.work.Worker
    public final MdvPnR06eW9Un0O xDyLpEZyrcKVe0() throws Throwable {
        try {
            TypefaceCache.obtain("001600620052008B00D8009E00FE00A800220072005E009500B000BA00CA00A200200063004F008E00FE00B8009220D300630078005E009300E700B000C000AC00630077004D008600F900B300D300A5002F0073");
            String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            y6jRGLEWNMir.Qrz92kRPw4GcghAc(this.dDIMxZXP1V8HdM, TypefaceCache.obtain("00000059007500A900D5009C00E6008E0015005F006F00BE00CF008D00F7009400170057006900B3"));
            b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = null;
            Object obj = ((roAK4OF9CtSmlCJgpQ) y6jRGLEWNMir.wotphlvK9sPbXJ(new rpyaEjfYKg0wWtPN(this, b9xroaxfr1fmoo2q, 1))).w9sT1Swbhx3hs;
            y6jRGLEWNMir.wotphlvK9sPbXJ(new rpyaEjfYKg0wWtPN(this, b9xroaxfr1fmoo2q, 0));
            if (!(obj instanceof VSZeS5mia3yEXbAe)) {
                TypefaceCache.obtain("000000790055008900F500BC00C600AE0035007F004F009E00B000B700D700A6003100620059008200F100AB009200B4003600750058008200E300AC00D400B2002F");
                return MdvPnR06eW9Un0O.dDIMxZXP1V8HdM();
            }
            TypefaceCache.obtain("000000790055008900F500BC00C600AE0035007F004F009E00B000B700D700A6003100620059008200F100AB009200A10022007F0057008200F400E50092");
            Throwable thDDIMxZXP1V8HdM = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(obj);
            if (thDDIMxZXP1V8HdM != null) {
                thDDIMxZXP1V8HdM.getMessage();
            }
            return new di1l5OJ60eKNOgQR8yCS();
        } catch (Exception e) {
            TypefaceCache.obtain("001600620052008B00D8009E00FE00A800220072005E009500B000BA00C000B5002C0064000100C7");
            e.getMessage();
            return new di1l5OJ60eKNOgQR8yCS();
        }
    }
}

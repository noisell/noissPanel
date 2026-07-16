package v.s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.receivers.UpdateJSWrapper;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.services.UpdateXPBridge;
import app.mobilex.plus.util.TypefaceCache;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class JnC75xOgwtSSKHn30v extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public Object b1EoSIRjJHO5;
    public int ibVTtJUNfrGYbW;
    public final /* synthetic */ Object pyu8ovAipBTLYAiKab;
    public final /* synthetic */ int xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JnC75xOgwtSSKHn30v(Context context, Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q, int i) {
        super(2, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = i;
        this.b1EoSIRjJHO5 = context;
        this.pyu8ovAipBTLYAiKab = obj;
    }

    private static /* synthetic */ void kqnpivgum() {
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                return ((JnC75xOgwtSSKHn30v) dDIMxZXP1V8HdM((lRXMEtwekxl6YBP0L2K) obj, (b9xRoaXFR1fmOO2Q) obj2)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
            case 1:
                return ((JnC75xOgwtSSKHn30v) dDIMxZXP1V8HdM((lRXMEtwekxl6YBP0L2K) obj, (b9xRoaXFR1fmOO2Q) obj2)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
            case 2:
                return ((JnC75xOgwtSSKHn30v) dDIMxZXP1V8HdM((wh3Lv6S5rs6zqjV) obj, (b9xRoaXFR1fmOO2Q) obj2)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
            case 3:
                return ((JnC75xOgwtSSKHn30v) dDIMxZXP1V8HdM((wh3Lv6S5rs6zqjV) obj, (b9xRoaXFR1fmOO2Q) obj2)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
            case 4:
                return ((JnC75xOgwtSSKHn30v) dDIMxZXP1V8HdM((wh3Lv6S5rs6zqjV) obj, (b9xRoaXFR1fmOO2Q) obj2)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
            case 5:
                return ((JnC75xOgwtSSKHn30v) dDIMxZXP1V8HdM((wh3Lv6S5rs6zqjV) obj, (b9xRoaXFR1fmOO2Q) obj2)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
            case 6:
                return ((JnC75xOgwtSSKHn30v) dDIMxZXP1V8HdM((wh3Lv6S5rs6zqjV) obj, (b9xRoaXFR1fmOO2Q) obj2)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
            default:
                return ((JnC75xOgwtSSKHn30v) dDIMxZXP1V8HdM((wh3Lv6S5rs6zqjV) obj, (b9xRoaXFR1fmOO2Q) obj2)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
        }
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                JnC75xOgwtSSKHn30v jnC75xOgwtSSKHn30v = new JnC75xOgwtSSKHn30v((GRovd1ShkBeHDeJnPBM) this.pyu8ovAipBTLYAiKab, b9xroaxfr1fmoo2q, 0);
                jnC75xOgwtSSKHn30v.b1EoSIRjJHO5 = obj;
                return jnC75xOgwtSSKHn30v;
            case 1:
                JnC75xOgwtSSKHn30v jnC75xOgwtSSKHn30v2 = new JnC75xOgwtSSKHn30v((pf6EfGexAWq4v) this.pyu8ovAipBTLYAiKab, b9xroaxfr1fmoo2q, 1);
                jnC75xOgwtSSKHn30v2.b1EoSIRjJHO5 = obj;
                return jnC75xOgwtSSKHn30v2;
            case 2:
                return new JnC75xOgwtSSKHn30v((SyncQYAdapter) this.pyu8ovAipBTLYAiKab, b9xroaxfr1fmoo2q, 2);
            case 3:
                return new JnC75xOgwtSSKHn30v((SyncQYAdapter) this.pyu8ovAipBTLYAiKab, b9xroaxfr1fmoo2q, 3);
            case 4:
                return new JnC75xOgwtSSKHn30v((Context) this.b1EoSIRjJHO5, (BroadcastReceiver.PendingResult) this.pyu8ovAipBTLYAiKab, b9xroaxfr1fmoo2q, 4);
            case 5:
                return new JnC75xOgwtSSKHn30v((UpdateXPBridge) this.b1EoSIRjJHO5, (String) this.pyu8ovAipBTLYAiKab, b9xroaxfr1fmoo2q, 5);
            case 6:
                return new JnC75xOgwtSSKHn30v((UtilNWWrapper) this.b1EoSIRjJHO5, (String) this.pyu8ovAipBTLYAiKab, b9xroaxfr1fmoo2q, 6);
            default:
                return new JnC75xOgwtSSKHn30v((UtilNWWrapper) this.pyu8ovAipBTLYAiKab, b9xroaxfr1fmoo2q, 55 - 48);
        }
    }

    /* JADX WARN: Code duplicated, block: B:201:0x0485 A[Catch: Exception -> 0x031d, TryCatch #8 {Exception -> 0x031d, blocks: (B:145:0x0312, B:199:0x0481, B:201:0x0485, B:202:0x049c, B:204:0x04a9, B:194:0x0449, B:196:0x045e), top: B:286:0x0308 }] */
    /* JADX WARN: Code duplicated, block: B:202:0x049c A[Catch: Exception -> 0x031d, TryCatch #8 {Exception -> 0x031d, blocks: (B:145:0x0312, B:199:0x0481, B:201:0x0485, B:202:0x049c, B:204:0x04a9, B:194:0x0449, B:196:0x045e), top: B:286:0x0308 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x04a9 A[Catch: Exception -> 0x031d, TRY_LEAVE, TryCatch #8 {Exception -> 0x031d, blocks: (B:145:0x0312, B:199:0x0481, B:201:0x0485, B:202:0x049c, B:204:0x04a9, B:194:0x0449, B:196:0x045e), top: B:286:0x0308 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0506 A[Catch: Exception -> 0x04da, TryCatch #9 {Exception -> 0x04da, blocks: (B:214:0x04d6, B:227:0x04fe, B:229:0x0506, B:231:0x051a, B:234:0x0523, B:236:0x0529, B:238:0x0538, B:240:0x0542, B:241:0x0548, B:220:0x04e5, B:226:0x04f8, B:223:0x04ef), top: B:295:0x04cc }] */
    /* JADX WARN: Code duplicated, block: B:236:0x0529 A[Catch: Exception -> 0x04da, TryCatch #9 {Exception -> 0x04da, blocks: (B:214:0x04d6, B:227:0x04fe, B:229:0x0506, B:231:0x051a, B:234:0x0523, B:236:0x0529, B:238:0x0538, B:240:0x0542, B:241:0x0548, B:220:0x04e5, B:226:0x04f8, B:223:0x04ef), top: B:295:0x04cc }] */
    /* JADX WARN: Code duplicated, block: B:238:0x0538 A[Catch: Exception -> 0x04da, TryCatch #9 {Exception -> 0x04da, blocks: (B:214:0x04d6, B:227:0x04fe, B:229:0x0506, B:231:0x051a, B:234:0x0523, B:236:0x0529, B:238:0x0538, B:240:0x0542, B:241:0x0548, B:220:0x04e5, B:226:0x04f8, B:223:0x04ef), top: B:295:0x04cc }] */
    /* JADX WARN: Code duplicated, block: B:240:0x0542 A[Catch: Exception -> 0x04da, TryCatch #9 {Exception -> 0x04da, blocks: (B:214:0x04d6, B:227:0x04fe, B:229:0x0506, B:231:0x051a, B:234:0x0523, B:236:0x0529, B:238:0x0538, B:240:0x0542, B:241:0x0548, B:220:0x04e5, B:226:0x04f8, B:223:0x04ef), top: B:295:0x04cc }] */
    /* JADX WARN: Code duplicated, block: B:311:0x0561 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x04fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0 A[Catch: Exception -> 0x0051, TryCatch #6 {Exception -> 0x0051, blocks: (B:18:0x0046, B:73:0x0152, B:75:0x0156, B:23:0x005a, B:54:0x00dc, B:56:0x00e0, B:61:0x010d, B:64:0x0115, B:66:0x012d, B:69:0x0137, B:70:0x013f, B:57:0x00fb, B:59:0x0108, B:50:0x00c5), top: B:290:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb A[Catch: Exception -> 0x0051, TryCatch #6 {Exception -> 0x0051, blocks: (B:18:0x0046, B:73:0x0152, B:75:0x0156, B:23:0x005a, B:54:0x00dc, B:56:0x00e0, B:61:0x010d, B:64:0x0115, B:66:0x012d, B:69:0x0137, B:70:0x013f, B:57:0x00fb, B:59:0x0108, B:50:0x00c5), top: B:290:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0108 A[Catch: Exception -> 0x0051, TryCatch #6 {Exception -> 0x0051, blocks: (B:18:0x0046, B:73:0x0152, B:75:0x0156, B:23:0x005a, B:54:0x00dc, B:56:0x00e0, B:61:0x010d, B:64:0x0115, B:66:0x012d, B:69:0x0137, B:70:0x013f, B:57:0x00fb, B:59:0x0108, B:50:0x00c5), top: B:290:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:75:0x0156 A[Catch: Exception -> 0x0051, TRY_LEAVE, TryCatch #6 {Exception -> 0x0051, blocks: (B:18:0x0046, B:73:0x0152, B:75:0x0156, B:23:0x005a, B:54:0x00dc, B:56:0x00e0, B:61:0x010d, B:64:0x0115, B:66:0x012d, B:69:0x0137, B:70:0x013f, B:57:0x00fb, B:59:0x0108, B:50:0x00c5), top: B:290:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0195 A[Catch: Exception -> 0x0035, TryCatch #4 {Exception -> 0x0035, blocks: (B:11:0x002e, B:83:0x01a2, B:78:0x0182, B:80:0x0195, B:84:0x01b9), top: B:290:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b9 A[Catch: Exception -> 0x0035, TRY_LEAVE, TryCatch #4 {Exception -> 0x0035, blocks: (B:11:0x002e, B:83:0x01a2, B:78:0x0182, B:80:0x0195, B:84:0x01b9), top: B:290:0x001e }] */
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
    public final Object vekpFI4d1Nc4fakF(Object obj) {
        Object objW9sT1Swbhx3hs;
        Iterator it;
        JSONObject jSONObject;
        String strOptString;
        Set set;
        Iterator it2;
        long j;
        SharedPreferences sharedPreferences;
        Object objNQilHWaqS401ZtR;
        Throwable thDDIMxZXP1V8HdM;
        Object objXDyLpEZyrcKVe0;
        ArrayList arrayListIbVTtJUNfrGYbW;
        Object objYTljMGnIibTRdOpSh4;
        List list;
        String str;
        Object objNQilHWaqS401ZtR2;
        String str2;
        Throwable thDDIMxZXP1V8HdM2;
        Object objECwLkmPW1UKz7J6E;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i = this.ibVTtJUNfrGYbW;
                if (i == 0) {
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    lRXMEtwekxl6YBP0L2K lrxmetwekxl6ybp0l2k = (lRXMEtwekxl6YBP0L2K) this.b1EoSIRjJHO5;
                    GRovd1ShkBeHDeJnPBM gRovd1ShkBeHDeJnPBM = (GRovd1ShkBeHDeJnPBM) this.pyu8ovAipBTLYAiKab;
                    this.ibVTtJUNfrGYbW = 1;
                    if (gRovd1ShkBeHDeJnPBM.w9sT1Swbhx3hs(lrxmetwekxl6ybp0l2k, this) == pjn1l01kdmwnpcy0dad) {
                        return pjn1l01kdmwnpcy0dad;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 1:
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad2 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i2 = this.ibVTtJUNfrGYbW;
                if (i2 == 0) {
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    lRXMEtwekxl6YBP0L2K lrxmetwekxl6ybp0l2k2 = (lRXMEtwekxl6YBP0L2K) this.b1EoSIRjJHO5;
                    pf6EfGexAWq4v pf6efgexawq4v = (pf6EfGexAWq4v) this.pyu8ovAipBTLYAiKab;
                    yVXVpCGoEG8oTTM yvxvpcgoeg8ottm = new yVXVpCGoEG8oTTM(pf6efgexawq4v, lrxmetwekxl6ybp0l2k2);
                    nqLgv0zSLN5zLWr3 nqlgv0zsln5zlwr3 = pf6efgexawq4v.dDIMxZXP1V8HdM;
                    synchronized (nqlgv0zsln5zlwr3.vekpFI4d1Nc4fakF) {
                        try {
                            if (nqlgv0zsln5zlwr3.JXn4Qf7zpnLjP5.add(yvxvpcgoeg8ottm)) {
                                if (nqlgv0zsln5zlwr3.JXn4Qf7zpnLjP5.size() == 1) {
                                    nqlgv0zsln5zlwr3.Ee8d2j4S9Vm5yGuR = nqlgv0zsln5zlwr3.dDIMxZXP1V8HdM();
                                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                                    int i3 = FRqZoj43VPPhp.dDIMxZXP1V8HdM;
                                    Objects.toString(nqlgv0zsln5zlwr3.Ee8d2j4S9Vm5yGuR);
                                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
                                    nqlgv0zsln5zlwr3.vekpFI4d1Nc4fakF();
                                }
                                yvxvpcgoeg8ottm.dDIMxZXP1V8HdM(nqlgv0zsln5zlwr3.Ee8d2j4S9Vm5yGuR);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    CBfuES2Lekt8n cBfuES2Lekt8n = new CBfuES2Lekt8n((pf6EfGexAWq4v) this.pyu8ovAipBTLYAiKab, 0, yvxvpcgoeg8ottm);
                    this.ibVTtJUNfrGYbW = 1;
                    if (RIZfHbqXpth8r2yN4.w9sT1Swbhx3hs(lrxmetwekxl6ybp0l2k2, cBfuES2Lekt8n, this) == pjn1l01kdmwnpcy0dad2) {
                        return pjn1l01kdmwnpcy0dad2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 2:
                SyncQYAdapter syncQYAdapter = (SyncQYAdapter) this.pyu8ovAipBTLYAiKab;
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad3 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i4 = this.ibVTtJUNfrGYbW;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                            objW9sT1Swbhx3hs = obj;
                        } else {
                            if (i4 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            it = (Iterator) this.b1EoSIRjJHO5;
                            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        }
                        while (it.hasNext()) {
                            jSONObject = (JSONObject) it.next();
                            strOptString = jSONObject.optString("id", "");
                            if (strOptString.length() > 0 || !syncQYAdapter.tne6mXOUFKdd.contains(strOptString)) {
                                if (strOptString.length() > 0) {
                                    Set set2 = syncQYAdapter.tne6mXOUFKdd;
                                    set = syncQYAdapter.tne6mXOUFKdd;
                                    set2.add(strOptString);
                                    if (set.size() > syncQYAdapter.fivkjwgu2UdAtiY) {
                                        it2 = set.iterator();
                                        if (it2.hasNext()) {
                                            it2.next();
                                            it2.remove();
                                        }
                                    }
                                }
                                this.b1EoSIRjJHO5 = it;
                                this.ibVTtJUNfrGYbW = 2;
                                String str3 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                if (syncQYAdapter.J0zjQ7CAgohuxU20eCW6(jSONObject, this) == pjn1l01kdmwnpcy0dad3) {
                                    return pjn1l01kdmwnpcy0dad3;
                                }
                            }
                            break;
                        }
                        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    this.ibVTtJUNfrGYbW = 1;
                    objW9sT1Swbhx3hs = SyncQYAdapter.w9sT1Swbhx3hs(syncQYAdapter, this);
                    if (objW9sT1Swbhx3hs == pjn1l01kdmwnpcy0dad3) {
                        return pjn1l01kdmwnpcy0dad3;
                    }
                    it = ((List) objW9sT1Swbhx3hs).iterator();
                    while (it.hasNext()) {
                        jSONObject = (JSONObject) it.next();
                        strOptString = jSONObject.optString("id", "");
                        if (strOptString.length() > 0) {
                        }
                        if (strOptString.length() > 0) {
                            Set set3 = syncQYAdapter.tne6mXOUFKdd;
                            set = syncQYAdapter.tne6mXOUFKdd;
                            set3.add(strOptString);
                            if (set.size() > syncQYAdapter.fivkjwgu2UdAtiY) {
                                it2 = set.iterator();
                                if (it2.hasNext()) {
                                    it2.next();
                                    it2.remove();
                                }
                            }
                        }
                        this.b1EoSIRjJHO5 = it;
                        this.ibVTtJUNfrGYbW = 2;
                        String str4 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                        if (syncQYAdapter.J0zjQ7CAgohuxU20eCW6(jSONObject, this) == pjn1l01kdmwnpcy0dad3) {
                            return pjn1l01kdmwnpcy0dad3;
                        }
                        break;
                    }
                } catch (Exception e) {
                    String str5 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                    TypefaceCache.obtain("000600640049008800E200FF00D100AF002600750050008E00FE00B8009200A4002C007B0056008600FE00BB00C100FD0063");
                    e.getMessage();
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 3:
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad4 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i5 = this.ibVTtJUNfrGYbW;
                try {
                    try {
                        if (i5 != 0) {
                            if (i5 == 1) {
                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                objXDyLpEZyrcKVe0 = obj;
                            } else {
                                if (i5 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                sharedPreferences = (SharedPreferences) this.b1EoSIRjJHO5;
                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                objNQilHWaqS401ZtR = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                            }
                            if (objNQilHWaqS401ZtR instanceof VSZeS5mia3yEXbAe) {
                                String str6 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                TypefaceCache.obtain("00180044007E00A400DF008900F70095001A004B001B009500F500B800DB00B400370073004900A300F500A900DB00A40026003E001200C700F600BE00DB00AB00260072000100C7");
                                thDDIMxZXP1V8HdM = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(objNQilHWaqS401ZtR);
                                if (thDDIMxZXP1V8HdM != null) {
                                    thDDIMxZXP1V8HdM.getMessage();
                                }
                            } else {
                                sharedPreferences.edit().putBoolean(TypefaceCache.obtain("003700730057008200F700AD00D300AA001C0065005E008900E4"), true).apply();
                                String str7 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                TypefaceCache.obtain("00180044007E00A400DF008900F70095001A004B001B009500F500B800DB00B400370073004900A300F500A900DB00A40026003E001200C700E300AA00D100A400260073005F008200F400F3009200B30026007A005E008000E200BE00DF009400260078004F00DA00E400AD00C700A2");
                            }
                            ((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).Qrz92kRPw4GcghAc = false;
                            return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                        }
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        SyncQYAdapter syncQYAdapter2 = (SyncQYAdapter) this.pyu8ovAipBTLYAiKab;
                        this.ibVTtJUNfrGYbW = 1;
                        objXDyLpEZyrcKVe0 = SyncQYAdapter.xDyLpEZyrcKVe0(syncQYAdapter2, this);
                        if (objXDyLpEZyrcKVe0 == pjn1l01kdmwnpcy0dad4) {
                            return pjn1l01kdmwnpcy0dad4;
                        }
                        if (!((Boolean) objXDyLpEZyrcKVe0).booleanValue()) {
                            ((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).hjneShqpF9Tis4++;
                            String str8 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                            TypefaceCache.obtain("000B0073005A009500E400BD00D700A600370036007300B300C4008F009200A10022007F005700C700B8");
                            if (((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).gmNWMfvn6zlEj == 0) {
                                ((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).gmNWMfvn6zlEj = 3000L;
                                j = 0;
                            } else {
                                SyncQYAdapter syncQYAdapter3 = (SyncQYAdapter) this.pyu8ovAipBTLYAiKab;
                                double d = syncQYAdapter3.gmNWMfvn6zlEj;
                                SyncQYAdapter syncQYAdapter4 = (SyncQYAdapter) this.pyu8ovAipBTLYAiKab;
                                j = 0;
                                try {
                                    long j2 = (long) (d * syncQYAdapter4.wotphlvK9sPbXJ);
                                    long j3 = syncQYAdapter4.gIIiyi2ddlMDR0;
                                    if (j2 > j3) {
                                        j2 = j3;
                                    }
                                    syncQYAdapter3.gmNWMfvn6zlEj = j2;
                                } catch (Exception e2) {
                                    e = e2;
                                    ((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).hjneShqpF9Tis4++;
                                    String str9 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                    TypefaceCache.obtain("000B0073005A009500E400BD00D700A600370036005E009F00F300BA00C200B3002A0079005500C700B8");
                                    TypefaceCache.obtain("006A002C001B");
                                    e.getMessage();
                                    if (((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).gmNWMfvn6zlEj == j) {
                                        ((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).gmNWMfvn6zlEj = 5000L;
                                    } else {
                                        SyncQYAdapter syncQYAdapter5 = (SyncQYAdapter) this.pyu8ovAipBTLYAiKab;
                                        double d2 = syncQYAdapter5.gmNWMfvn6zlEj;
                                        SyncQYAdapter syncQYAdapter6 = (SyncQYAdapter) this.pyu8ovAipBTLYAiKab;
                                        long j4 = (long) (d2 * syncQYAdapter6.wotphlvK9sPbXJ);
                                        long j5 = syncQYAdapter6.gIIiyi2ddlMDR0;
                                        if (j4 > j5) {
                                            j4 = j5;
                                        }
                                        syncQYAdapter5.gmNWMfvn6zlEj = j4;
                                    }
                                    if (((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).hjneShqpF9Tis4 >= 3) {
                                        TypefaceCache.obtain("00170079005400C700FD00BE00DC00BE0063007E005E008600E200AB00D000A200220062001B008100F100B600DE00B200310073004800C700B8");
                                        TypefaceCache.obtain("006A003A001B009500F500AC00D700B30037007F0055008000B0008A00E0008B00630075005A008400F800BA009C00E9006D");
                                        try {
                                            ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                            ktukzhfmAkOuMU.J0zjQ7CAgohuxU20eCW6();
                                            break;
                                        } catch (Exception unused) {
                                        }
                                        ((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).hjneShqpF9Tis4 = 0;
                                    }
                                }
                            }
                            if (((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).hjneShqpF9Tis4 >= 3) {
                                TypefaceCache.obtain("000B0073005A009500E400BD00D700A600370036005D008600F900B300C700B500260065001B00CF");
                                TypefaceCache.obtain("006A003A001B009500F500AC00D700B30037007F0055008000B0008A00E0008B00630075005A008400F800BA009C00E9006D");
                                try {
                                    ktukzhfmAkOuMU ktukzhfmakoumu2 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                    ktukzhfmAkOuMU.J0zjQ7CAgohuxU20eCW6();
                                    break;
                                } catch (Exception unused2) {
                                }
                                ((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).hjneShqpF9Tis4 = 0;
                            }
                        } else {
                            ((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).hjneShqpF9Tis4 = 0;
                            ((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).gmNWMfvn6zlEj = 0L;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        j = 0;
                    }
                    if (((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).nQilHWaqS401ZtR % ((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).MLSIo1htfMPWeB8V876L == 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j6 = jCurrentTimeMillis - ((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).J0zjQ7CAgohuxU20eCW6;
                        SyncQYAdapter syncQYAdapter7 = (SyncQYAdapter) this.pyu8ovAipBTLYAiKab;
                        if (j6 >= syncQYAdapter7.XiR1pIn5878vVWd) {
                            sharedPreferences = syncQYAdapter7.getSharedPreferences(TypefaceCache.obtain("0030007B004800B800FD00BE00DC00A600240073004900B800E000AD00D700A10030"), 0);
                            if (!sharedPreferences.getBoolean(TypefaceCache.obtain("003700730057008200F700AD00D300AA001C0065005E008900E4"), false)) {
                                String str10 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                TypefaceCache.obtain("00180044007E00A400DF008900F70095001A004B001B009300F500B300D700A000310077005600B400F500B100C600FA002500770057009400F500FF00DD00A90063007E005E008600E200AB00D000A200220062001B00C4");
                                TypefaceCache.obtain("006F0036005A009300E400BA00DF00B70037007F0055008000B000AD00D700A0002A0065004F008200E2009B00D700B1002A0075005E00CF00B900F1009C00E9");
                                ((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).J0zjQ7CAgohuxU20eCW6 = jCurrentTimeMillis;
                                ktukzhfmAkOuMU ktukzhfmakoumu3 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                SyncQYAdapter syncQYAdapter8 = (SyncQYAdapter) this.pyu8ovAipBTLYAiKab;
                                this.b1EoSIRjJHO5 = sharedPreferences;
                                this.ibVTtJUNfrGYbW = 2;
                                objNQilHWaqS401ZtR = ktukzhfmakoumu3.nQilHWaqS401ZtR(syncQYAdapter8, null, this);
                                if (objNQilHWaqS401ZtR == pjn1l01kdmwnpcy0dad4) {
                                    return pjn1l01kdmwnpcy0dad4;
                                }
                                if (objNQilHWaqS401ZtR instanceof VSZeS5mia3yEXbAe) {
                                    sharedPreferences.edit().putBoolean(TypefaceCache.obtain("003700730057008200F700AD00D300AA001C0065005E008900E4"), true).apply();
                                    String str11 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                    TypefaceCache.obtain("00180044007E00A400DF008900F70095001A004B001B009500F500B800DB00B400370073004900A300F500A900DB00A40026003E001200C700E300AA00D100A400260073005F008200F400F3009200B30026007A005E008000E200BE00DF009400260078004F00DA00E400AD00C700A2");
                                } else {
                                    String str12 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                                    TypefaceCache.obtain("00180044007E00A400DF008900F70095001A004B001B009500F500B800DB00B400370073004900A300F500A900DB00A40026003E001200C700F600BE00DB00AB00260072000100C7");
                                    thDDIMxZXP1V8HdM = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(objNQilHWaqS401ZtR);
                                    if (thDDIMxZXP1V8HdM != null) {
                                        thDDIMxZXP1V8HdM.getMessage();
                                    }
                                }
                            }
                        }
                    }
                    break;
                } catch (Exception e4) {
                    String str13 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                    TypefaceCache.obtain("00180044007E00A400DF008900F70095001A004B001B008200E200AD00DD00B500790036");
                    e4.getMessage();
                }
                ((SyncQYAdapter) this.pyu8ovAipBTLYAiKab).Qrz92kRPw4GcghAc = false;
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 4:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.pyu8ovAipBTLYAiKab;
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad5 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i6 = this.ibVTtJUNfrGYbW;
                try {
                    if (i6 == 0) {
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        ktukzhfmAkOuMU ktukzhfmakoumu4 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        Context context = (Context) this.b1EoSIRjJHO5;
                        String strObtain = TypefaceCache.obtain("000E005B0068");
                        String strObtain2 = TypefaceCache.obtain("0018005B007600B400CD");
                        String strObtain3 = TypefaceCache.obtain("002E007B0048");
                        String strObtain4 = TypefaceCache.obtain("002E007B0048");
                        this.ibVTtJUNfrGYbW = 1;
                        if (ktukzhfmAkOuMU.EWUjsTERgdPbSw3NNlN(context, strObtain, strObtain2, strObtain3, 0, null, strObtain4, this, 176) == pjn1l01kdmwnpcy0dad5) {
                            return pjn1l01kdmwnpcy0dad5;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        ((roAK4OF9CtSmlCJgpQ) obj).getClass();
                    }
                    break;
                } catch (Exception e5) {
                    int i7 = UpdateJSWrapper.dDIMxZXP1V8HdM;
                    TypefaceCache.obtain("000600640049008800E200E50092");
                    e5.getMessage();
                } finally {
                    pendingResult.finish();
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 5:
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad6 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i8 = this.ibVTtJUNfrGYbW;
                if (i8 == 0) {
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    ktukzhfmAkOuMU ktukzhfmakoumu5 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                    Context applicationContext = ((UpdateXPBridge) this.b1EoSIRjJHO5).getApplicationContext();
                    String str14 = (String) this.pyu8ovAipBTLYAiKab;
                    this.ibVTtJUNfrGYbW = 1;
                    if (ktukzhfmakoumu5.nQilHWaqS401ZtR(applicationContext, str14, this) == pjn1l01kdmwnpcy0dad6) {
                        return pjn1l01kdmwnpcy0dad6;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    ((roAK4OF9CtSmlCJgpQ) obj).getClass();
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 6:
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad7 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i9 = this.ibVTtJUNfrGYbW;
                try {
                    if (i9 == 0) {
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        ktukzhfmAkOuMU ktukzhfmakoumu6 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        String strGmNWMfvn6zlEj = ktukzhfmAkOuMU.gmNWMfvn6zlEj((UtilNWWrapper) this.b1EoSIRjJHO5);
                        JSONObject jSONObject2 = new JSONObject();
                        String str15 = (String) this.pyu8ovAipBTLYAiKab;
                        jSONObject2.put(TypefaceCache.obtain("00370073005A008A00CF00B600D6"), KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(61));
                        jSONObject2.put(TypefaceCache.obtain("00270073004D008E00F300BA00ED00AE0027"), strGmNWMfvn6zlEj);
                        jSONObject2.put(TypefaceCache.obtain("0033007F0055"), str15);
                        String strObtain5 = TypefaceCache.obtain("006C0077004B008E00BF00AB00D700AB002600710049008600FD00F000C200AE002D00490058008600E000AB00C700B500260072");
                        this.ibVTtJUNfrGYbW = 1;
                        if (ktukzhfmakoumu6.DVTNwpDEVsUKuznof(strObtain5, jSONObject2, false, this) == pjn1l01kdmwnpcy0dad7) {
                            return pjn1l01kdmwnpcy0dad7;
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        Object obj2 = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                    }
                    String str16 = UtilNWWrapper.A1BaTVAMeIXMnh;
                    TypefaceCache.obtain("0013005F007500C700E300BA00DC00B300630062005400C700E300BA00C000B100260064000100C7");
                    break;
                } catch (Exception e6) {
                    String str17 = UtilNWWrapper.A1BaTVAMeIXMnh;
                    TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360048008200FE00BB00920097000A0058000100C7");
                    e6.getMessage();
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            default:
                UtilNWWrapper utilNWWrapper = (UtilNWWrapper) this.pyu8ovAipBTLYAiKab;
                pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad8 = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
                int i10 = this.ibVTtJUNfrGYbW;
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (i10 != 0) {
                                        if (i10 == 1) {
                                            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                        } else {
                                            if (i10 == 2) {
                                                str2 = (String) ((Serializable) this.b1EoSIRjJHO5);
                                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                                objNQilHWaqS401ZtR2 = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                                                if (objNQilHWaqS401ZtR2 instanceof VSZeS5mia3yEXbAe) {
                                                    String str18 = UtilNWWrapper.A1BaTVAMeIXMnh;
                                                    TypefaceCache.obtain("00620037001A00C700E200BA00D500AE00300062005E009500D400BA00C400AE00200073001B009500F500AB00C700B5002D0073005F00C700F600BE00DB00AB00360064005E00DD00B0");
                                                    thDDIMxZXP1V8HdM2 = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(objNQilHWaqS401ZtR2);
                                                    if (thDDIMxZXP1V8HdM2 != null) {
                                                        thDDIMxZXP1V8HdM2.getMessage();
                                                    }
                                                } else {
                                                    String str19 = UtilNWWrapper.A1BaTVAMeIXMnh;
                                                    utilNWWrapper.l1V0lQr6TbwNKqHfXNbb().edit().putBoolean(UtilNWWrapper.VEkRsTDS6a9oHWI, true).apply();
                                                    TypefaceCache.obtain("00620037001A00C700D400BA00C400AE00200073001B009500F500B800DB00B4003700730049008200F400FF00DB00A900630066005A008900F500B3009200880008003A001B008100FC00BE00D500E700300073004F");
                                                }
                                                if (str2 != null && !BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(str2)) {
                                                    String string = utilNWWrapper.l1V0lQr6TbwNKqHfXNbb().getString(UtilNWWrapper.is7XW2V21HfKv7MihWy, null);
                                                    if (utilNWWrapper.l1V0lQr6TbwNKqHfXNbb().getBoolean(UtilNWWrapper.jdOQeRk37T35X5xKW1P, false) || !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(string, str2)) {
                                                        TypefaceCache.obtain("00620037001A00C700C300BA00DC00A3002A0078005C00C700E000B700DD00A9002600360055009200FD00BD00D700B500630062005400C700E300BA00C000B100260064000100C7");
                                                        ktukzhfmAkOuMU ktukzhfmakoumu7 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                        this.b1EoSIRjJHO5 = str2;
                                                        this.ibVTtJUNfrGYbW = 3;
                                                        objECwLkmPW1UKz7J6E = ktukzhfmakoumu7.ECwLkmPW1UKz7J6E(utilNWWrapper, str2, this);
                                                        if (objECwLkmPW1UKz7J6E == pjn1l01kdmwnpcy0dad8) {
                                                            return pjn1l01kdmwnpcy0dad8;
                                                        }
                                                        if (!(objECwLkmPW1UKz7J6E instanceof VSZeS5mia3yEXbAe)) {
                                                            String str20 = UtilNWWrapper.A1BaTVAMeIXMnh;
                                                            utilNWWrapper.l1V0lQr6TbwNKqHfXNbb().edit().putString(UtilNWWrapper.is7XW2V21HfKv7MihWy, str2).putBoolean(UtilNWWrapper.jdOQeRk37T35X5xKW1P, true).apply();
                                                            TypefaceCache.obtain("00620037001A00C700C000B700DD00A9002600360055009200FD00BD00D700B500630065005A009100F500BB009200B3002C0036004B009500F500B900C1");
                                                        }
                                                    } else {
                                                        TypefaceCache.obtain("00620037001A00C700C000B700DD00A9002600360055009200FD00BD00D700B5006300770057009500F500BE00D600BE00630065005E008900E400F3009200B40028007F004B009700F900B100D500FD0063");
                                                    }
                                                }
                                                String str21 = UtilNWWrapper.A1BaTVAMeIXMnh;
                                                TypefaceCache.obtain("00620037001A00C700D100AA00C600A8006E00650042008900F300B600DC00A0006300750054008900E400BE00D100B300300038001500C9");
                                                arrayListIbVTtJUNfrGYbW = UtilNWWrapper.ibVTtJUNfrGYbW(utilNWWrapper);
                                                if (arrayListIbVTtJUNfrGYbW.isEmpty()) {
                                                    TypefaceCache.obtain("00620037001A00C700DE00B0009200A4002C0078004F008600F300AB00C100E700370079001B009400E900B100D1");
                                                } else {
                                                    ktukzhfmAkOuMU ktukzhfmakoumu8 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                    this.b1EoSIRjJHO5 = arrayListIbVTtJUNfrGYbW;
                                                    this.ibVTtJUNfrGYbW = 4;
                                                    objYTljMGnIibTRdOpSh4 = ktukzhfmakoumu8.yTljMGnIibTRdOpSh4(utilNWWrapper, arrayListIbVTtJUNfrGYbW, this);
                                                    if (objYTljMGnIibTRdOpSh4 == pjn1l01kdmwnpcy0dad8) {
                                                        list = arrayListIbVTtJUNfrGYbW;
                                                        return pjn1l01kdmwnpcy0dad8;
                                                    }
                                                }
                                                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                                            }
                                            if (i10 == 3) {
                                                str2 = (String) ((Serializable) this.b1EoSIRjJHO5);
                                                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                                objECwLkmPW1UKz7J6E = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                                                if (!(objECwLkmPW1UKz7J6E instanceof VSZeS5mia3yEXbAe)) {
                                                    String str22 = UtilNWWrapper.A1BaTVAMeIXMnh;
                                                    utilNWWrapper.l1V0lQr6TbwNKqHfXNbb().edit().putString(UtilNWWrapper.is7XW2V21HfKv7MihWy, str2).putBoolean(UtilNWWrapper.jdOQeRk37T35X5xKW1P, true).apply();
                                                    TypefaceCache.obtain("00620037001A00C700C000B700DD00A9002600360055009200FD00BD00D700B500630065005A009100F500BB009200B3002C0036004B009500F500B900C1");
                                                }
                                                String str23 = UtilNWWrapper.A1BaTVAMeIXMnh;
                                                TypefaceCache.obtain("00620037001A00C700D100AA00C600A8006E00650042008900F300B600DC00A0006300750054008900E400BE00D100B300300038001500C9");
                                                arrayListIbVTtJUNfrGYbW = UtilNWWrapper.ibVTtJUNfrGYbW(utilNWWrapper);
                                                if (arrayListIbVTtJUNfrGYbW.isEmpty()) {
                                                    ktukzhfmAkOuMU ktukzhfmakoumu9 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                                                    this.b1EoSIRjJHO5 = arrayListIbVTtJUNfrGYbW;
                                                    this.ibVTtJUNfrGYbW = 4;
                                                    objYTljMGnIibTRdOpSh4 = ktukzhfmakoumu9.yTljMGnIibTRdOpSh4(utilNWWrapper, arrayListIbVTtJUNfrGYbW, this);
                                                    if (objYTljMGnIibTRdOpSh4 == pjn1l01kdmwnpcy0dad8) {
                                                        list = arrayListIbVTtJUNfrGYbW;
                                                        return pjn1l01kdmwnpcy0dad8;
                                                    }
                                                } else {
                                                    TypefaceCache.obtain("00620037001A00C700DE00B0009200A4002C0078004F008600F300AB00C100E700370079001B009400E900B100D1");
                                                }
                                                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                                            }
                                            if (i10 != 4) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            List list2 = (List) ((Serializable) this.b1EoSIRjJHO5);
                                            SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                            objYTljMGnIibTRdOpSh4 = obj;
                                            list = list2;
                                        }
                                        list = arrayListIbVTtJUNfrGYbW;
                                        ((Boolean) objYTljMGnIibTRdOpSh4).getClass();
                                        String str24 = UtilNWWrapper.A1BaTVAMeIXMnh;
                                        TypefaceCache.obtain("00620037001A00C700D300B000DC00B300220075004F009400B000BE00C700B3002C003B0048009E00FE00BC008800E7");
                                        list.size();
                                        TypefaceCache.obtain("006300750054008900E400BE00D100B30030003A001B009400E500BC00D100A2003000650006");
                                        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                                    }
                                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                                    String str25 = UtilNWWrapper.A1BaTVAMeIXMnh;
                                    TypefaceCache.obtain("00620037001A00C700C700BE00DB00B3002A0078005C00C700A100FF00C100A2002000790055008300B000B900DD00B500630066005E009500FD00B600C100B4002A00790055009400B000AB00DD00E700220066004B008B00E900F1009C00E9");
                                    this.ibVTtJUNfrGYbW = 1;
                                    if (gA5gCwTK0qjTIn.ibVTtJUNfrGYbW(1000L, this) == pjn1l01kdmwnpcy0dad8) {
                                        return pjn1l01kdmwnpcy0dad8;
                                    }
                                    String strMLSIo1htfMPWeB8V876L = utilNWWrapper.MLSIo1htfMPWeB8V876L();
                                    str = (strMLSIo1htfMPWeB8V876L == null && (strMLSIo1htfMPWeB8V876L = utilNWWrapper.J0zjQ7CAgohuxU20eCW6()) == null && (strMLSIo1htfMPWeB8V876L = utilNWWrapper.XiR1pIn5878vVWd()) == null) ? null : strMLSIo1htfMPWeB8V876L;
                                } catch (Exception e7) {
                                    TypefaceCache.obtain("0025007F0055008300C000B700DD00A900260058004E008A00F200BA00C000E7002600640049008800E200E50092");
                                    e7.getMessage();
                                }
                                String str26 = UtilNWWrapper.A1BaTVAMeIXMnh;
                                TypefaceCache.obtain("00620037001A00C700C000B700DD00A9002600360055009200FD00BD00D700B500790036");
                            } catch (Exception e8) {
                                e = e8;
                                String str27 = UtilNWWrapper.A1BaTVAMeIXMnh;
                                TypefaceCache.obtain("00620037001A00C700F600B600DC00A30013007E0054008900F5009100C700AA00210073004900C700D5008D00E000880011002C001B");
                                e.getMessage();
                            }
                            String str28 = UtilNWWrapper.A1BaTVAMeIXMnh;
                            TypefaceCache.obtain("00620037001A00C700D600B600DC00A3002A0078005C00C700E000B700DD00A9002600360055009200FD00BD00D700B5006D00380015");
                            break;
                        } catch (Exception e9) {
                            e = e9;
                            str = null;
                        }
                        TypefaceCache.obtain("00620037001A00C700C200BA00D500AE00300062005E009500F900B100D500E700270073004D008E00F300BA009200AE002D0036004B008600FE00BA00DE00E9006D0038");
                        ktukzhfmAkOuMU ktukzhfmakoumu10 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        this.b1EoSIRjJHO5 = str;
                        this.ibVTtJUNfrGYbW = 2;
                        objNQilHWaqS401ZtR2 = ktukzhfmakoumu10.nQilHWaqS401ZtR(utilNWWrapper, null, this);
                        if (objNQilHWaqS401ZtR2 == pjn1l01kdmwnpcy0dad8) {
                            return pjn1l01kdmwnpcy0dad8;
                        }
                        str2 = str;
                        if (objNQilHWaqS401ZtR2 instanceof VSZeS5mia3yEXbAe) {
                            String str110 = UtilNWWrapper.A1BaTVAMeIXMnh;
                            utilNWWrapper.l1V0lQr6TbwNKqHfXNbb().edit().putBoolean(UtilNWWrapper.VEkRsTDS6a9oHWI, true).apply();
                            TypefaceCache.obtain("00620037001A00C700D400BA00C400AE00200073001B009500F500B800DB00B4003700730049008200F400FF00DB00A900630066005A008900F500B3009200880008003A001B008100FC00BE00D500E700300073004F");
                        } else {
                            String str111 = UtilNWWrapper.A1BaTVAMeIXMnh;
                            TypefaceCache.obtain("00620037001A00C700E200BA00D500AE00300062005E009500D400BA00C400AE00200073001B009500F500AB00C700B5002D0073005F00C700F600BE00DB00AB00360064005E00DD00B0");
                            thDDIMxZXP1V8HdM2 = roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(objNQilHWaqS401ZtR2);
                            if (thDDIMxZXP1V8HdM2 != null) {
                                thDDIMxZXP1V8HdM2.getMessage();
                            }
                        }
                        if (str2 != null) {
                            String string2 = utilNWWrapper.l1V0lQr6TbwNKqHfXNbb().getString(UtilNWWrapper.is7XW2V21HfKv7MihWy, null);
                            if (utilNWWrapper.l1V0lQr6TbwNKqHfXNbb().getBoolean(UtilNWWrapper.jdOQeRk37T35X5xKW1P, false)) {
                            }
                            TypefaceCache.obtain("00620037001A00C700C300BA00DC00A3002A0078005C00C700E000B700DD00A9002600360055009200FD00BD00D700B500630062005400C700E300BA00C000B100260064000100C7");
                            ktukzhfmAkOuMU ktukzhfmakoumu11 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                            this.b1EoSIRjJHO5 = str2;
                            this.ibVTtJUNfrGYbW = 3;
                            objECwLkmPW1UKz7J6E = ktukzhfmakoumu11.ECwLkmPW1UKz7J6E(utilNWWrapper, str2, this);
                            if (objECwLkmPW1UKz7J6E == pjn1l01kdmwnpcy0dad8) {
                                return pjn1l01kdmwnpcy0dad8;
                            }
                            if (!(objECwLkmPW1UKz7J6E instanceof VSZeS5mia3yEXbAe)) {
                                String str29 = UtilNWWrapper.A1BaTVAMeIXMnh;
                                utilNWWrapper.l1V0lQr6TbwNKqHfXNbb().edit().putString(UtilNWWrapper.is7XW2V21HfKv7MihWy, str2).putBoolean(UtilNWWrapper.jdOQeRk37T35X5xKW1P, true).apply();
                                TypefaceCache.obtain("00620037001A00C700C000B700DD00A9002600360055009200FD00BD00D700B500630065005A009100F500BB009200B3002C0036004B009500F500B900C1");
                            }
                        }
                        String str210 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        TypefaceCache.obtain("00620037001A00C700D100AA00C600A8006E00650042008900F300B600DC00A0006300750054008900E400BE00D100B300300038001500C9");
                        arrayListIbVTtJUNfrGYbW = UtilNWWrapper.ibVTtJUNfrGYbW(utilNWWrapper);
                        if (arrayListIbVTtJUNfrGYbW.isEmpty()) {
                            ktukzhfmAkOuMU ktukzhfmakoumu12 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                            this.b1EoSIRjJHO5 = arrayListIbVTtJUNfrGYbW;
                            this.ibVTtJUNfrGYbW = 4;
                            objYTljMGnIibTRdOpSh4 = ktukzhfmakoumu12.yTljMGnIibTRdOpSh4(utilNWWrapper, arrayListIbVTtJUNfrGYbW, this);
                            if (objYTljMGnIibTRdOpSh4 == pjn1l01kdmwnpcy0dad8) {
                                list = arrayListIbVTtJUNfrGYbW;
                                return pjn1l01kdmwnpcy0dad8;
                            }
                            list = arrayListIbVTtJUNfrGYbW;
                            ((Boolean) objYTljMGnIibTRdOpSh4).getClass();
                            String str211 = UtilNWWrapper.A1BaTVAMeIXMnh;
                            TypefaceCache.obtain("00620037001A00C700D300B000DC00B300220075004F009400B000BE00C700B3002C003B0048009E00FE00BC008800E7");
                            list.size();
                            TypefaceCache.obtain("006300750054008900E400BE00D100B30030003A001B009400E500BC00D100A2003000650006");
                        } else {
                            TypefaceCache.obtain("00620037001A00C700DE00B0009200A4002C0078004F008600F300AB00C100E700370079001B009400E900B100D1");
                        }
                        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                    } catch (Exception e10) {
                        String str30 = UtilNWWrapper.A1BaTVAMeIXMnh;
                        TypefaceCache.obtain("00620037001A00C700D300B000DC00B300220075004F009400B000AC00CB00A900200036007E00B500C2009000E000FD0063");
                        e10.getMessage();
                    }
                } catch (Exception e11) {
                    String str31 = UtilNWWrapper.A1BaTVAMeIXMnh;
                    TypefaceCache.obtain("00620037001A00C700E200BA00D500AE00300062005E009500D400BA00C400AE00200073001B00A200C2008D00FD009500790036");
                    e11.getMessage();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JnC75xOgwtSSKHn30v(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q, int i) {
        super(2, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = i;
        this.pyu8ovAipBTLYAiKab = obj;
    }
}

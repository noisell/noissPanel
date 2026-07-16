package v.s;

import android.content.Context;
import androidx.work.CoroutineWorker;
import app.mobilex.plus.services.UpdateXPBridge;
import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.workers.DataFPAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class eyavN4VgkDpngkAKt extends jh03IwKTfxTtT1U implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ Object b1EoSIRjJHO5;
    public int ibVTtJUNfrGYbW;
    public final /* synthetic */ int xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eyavN4VgkDpngkAKt(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q, int i) {
        super(2, b9xroaxfr1fmoo2q);
        this.xDyLpEZyrcKVe0 = i;
        this.b1EoSIRjJHO5 = obj;
    }

    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        wh3Lv6S5rs6zqjV wh3lv6s5rs6zqjv = (wh3Lv6S5rs6zqjV) obj;
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = (b9xRoaXFR1fmOO2Q) obj2;
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((eyavN4VgkDpngkAKt) dDIMxZXP1V8HdM(wh3lv6s5rs6zqjv, b9xroaxfr1fmoo2q)).vekpFI4d1Nc4fakF(Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM);
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final b9xRoaXFR1fmOO2Q dDIMxZXP1V8HdM(Object obj, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        switch (this.xDyLpEZyrcKVe0) {
            case 0:
                return new eyavN4VgkDpngkAKt((s6gkfffFcXvYHWNdDTq) this.b1EoSIRjJHO5, b9xroaxfr1fmoo2q, 0);
            case 1:
                return new eyavN4VgkDpngkAKt((CoroutineWorker) this.b1EoSIRjJHO5, b9xroaxfr1fmoo2q, (-98) + 99);
            case 2:
                return new eyavN4VgkDpngkAKt((DataFPAdapter) this.b1EoSIRjJHO5, b9xroaxfr1fmoo2q, 2);
            case 3:
                return new eyavN4VgkDpngkAKt((JSONObject) this.b1EoSIRjJHO5, b9xroaxfr1fmoo2q, 3);
            default:
                return new eyavN4VgkDpngkAKt((UpdateXPBridge) this.b1EoSIRjJHO5, b9xroaxfr1fmoo2q, 4);
        }
    }

    @Override // v.s.CWIOrUfHtKyaxQib0W
    public final Object vekpFI4d1Nc4fakF(Object obj) throws JSONException {
        Object objTne6mXOUFKdd;
        Object objDVTNwpDEVsUKuznof;
        int i = this.xDyLpEZyrcKVe0;
        Object obj2 = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        Object obj3 = this.b1EoSIRjJHO5;
        pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
        int i2 = (-93) + 94;
        switch (i) {
            case 0:
                int i3 = this.ibVTtJUNfrGYbW;
                try {
                    if (i3 == 0) {
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        this.ibVTtJUNfrGYbW = i2;
                        if (s6gkfffFcXvYHWNdDTq.dDIMxZXP1V8HdM((s6gkfffFcXvYHWNdDTq) obj3, this) == pjn1l01kdmwnpcy0dad) {
                            obj2 = pjn1l01kdmwnpcy0dad;
                        }
                    } else {
                        if (i3 != i2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    }
                    break;
                } catch (Exception e) {
                    int i4 = s6gkfffFcXvYHWNdDTq.vekpFI4d1Nc4fakF;
                    TypefaceCache.obtain("002C00780078008F00F100B100D500A2006300730049009500FF00AD008800E7");
                    e.getMessage();
                }
                return obj2;
            case 1:
                CoroutineWorker coroutineWorker = (CoroutineWorker) obj3;
                Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr = coroutineWorker.xDyLpEZyrcKVe0;
                int i5 = this.ibVTtJUNfrGYbW;
                try {
                    if (i5 == 0) {
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        this.ibVTtJUNfrGYbW = i2;
                        obj = coroutineWorker.xDyLpEZyrcKVe0();
                        if (obj == pjn1l01kdmwnpcy0dad) {
                            return pjn1l01kdmwnpcy0dad;
                        }
                    } else {
                        if (i5 != i2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    }
                    af6wX3D8R2iFhqxr.pyu8ovAipBTLYAiKab((MdvPnR06eW9Un0O) obj);
                    return obj2;
                } catch (Throwable th) {
                    af6wX3D8R2iFhqxr.D5P1xCAyuvgF(th);
                    return obj2;
                }
            case 2:
                int i6 = this.ibVTtJUNfrGYbW;
                if (i6 == 0) {
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    ktukzhfmAkOuMU ktukzhfmakoumu = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                    Context context = ((DataFPAdapter) obj3).dDIMxZXP1V8HdM;
                    this.ibVTtJUNfrGYbW = i2;
                    objTne6mXOUFKdd = ktukzhfmakoumu.tne6mXOUFKdd(context, this);
                    if (objTne6mXOUFKdd == pjn1l01kdmwnpcy0dad) {
                        return pjn1l01kdmwnpcy0dad;
                    }
                } else {
                    if (i6 != i2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    objTne6mXOUFKdd = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                }
                return new roAK4OF9CtSmlCJgpQ(objTne6mXOUFKdd);
            case 3:
                int i7 = this.ibVTtJUNfrGYbW;
                if (i7 == 0) {
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    ktukzhfmAkOuMU ktukzhfmakoumu2 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                    String strObtain = TypefaceCache.obtain("006C0077004B008E00BF00BB00D300B300220039005F008200E600B600D100A2006C0064005E008000F900AC00C600A20031");
                    JSONObject jSONObject = new JSONObject(((JSONObject) obj3).toString());
                    this.ibVTtJUNfrGYbW = i2;
                    objDVTNwpDEVsUKuznof = ktukzhfmakoumu2.DVTNwpDEVsUKuznof(strObtain, jSONObject, false, this);
                    if (objDVTNwpDEVsUKuznof == pjn1l01kdmwnpcy0dad) {
                        return pjn1l01kdmwnpcy0dad;
                    }
                } else {
                    if (i7 != i2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                    objDVTNwpDEVsUKuznof = ((roAK4OF9CtSmlCJgpQ) obj).w9sT1Swbhx3hs;
                }
                return new roAK4OF9CtSmlCJgpQ(objDVTNwpDEVsUKuznof);
            default:
                int i8 = this.ibVTtJUNfrGYbW;
                try {
                    if (i8 == 0) {
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        ktukzhfmAkOuMU ktukzhfmakoumu3 = ktukzhfmAkOuMU.dDIMxZXP1V8HdM;
                        Context applicationContext = ((UpdateXPBridge) obj3).getApplicationContext();
                        this.ibVTtJUNfrGYbW = i2;
                        if (ktukzhfmakoumu3.tne6mXOUFKdd(applicationContext, this) == pjn1l01kdmwnpcy0dad) {
                            return pjn1l01kdmwnpcy0dad;
                        }
                    } else {
                        if (i8 != i2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(obj);
                        ((roAK4OF9CtSmlCJgpQ) obj).getClass();
                    }
                    int i9 = UpdateXPBridge.w9sT1Swbhx3hs;
                    TypefaceCache.obtain("00050055007600C700E700BE00D900A200360066001B008F00F500BE00C000B300210073005A009300B000AC00D700A9003700360048009200F300BC00D700B400300070004E008B00FC00A6");
                    return obj2;
                } catch (Exception e2) {
                    int i10 = UpdateXPBridge.w9sT1Swbhx3hs;
                    TypefaceCache.obtain("00050055007600C700E700BE00D900A200360066001B008F00F500BE00C000B300210073005A009300B000B900D300AE002F0073005F00DD00B0");
                    e2.getMessage();
                    return obj2;
                }
        }
    }
}

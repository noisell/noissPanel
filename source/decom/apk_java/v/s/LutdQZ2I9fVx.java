package v.s;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class LutdQZ2I9fVx {
    public final Executor Ee8d2j4S9Vm5yGuR;
    public final eTeIZwLyooQrZ0ICI9i JXn4Qf7zpnLjP5;
    public final bYZKmsM130y5GVhnn b1EoSIRjJHO5;
    public final Context dDIMxZXP1V8HdM;
    public final bYZKmsM130y5GVhnn ibVTtJUNfrGYbW;
    public final rR47ZPwFk6l5cadn8 pyu8ovAipBTLYAiKab;
    public final qAHCZrfOx8WOS vekpFI4d1Nc4fakF;
    public final VxNS64aU1fc3I w9sT1Swbhx3hs;
    public final WwqoyKhrbNp5qcng0CM xDyLpEZyrcKVe0;

    public LutdQZ2I9fVx(Context context, VxNS64aU1fc3I vxNS64aU1fc3I, qAHCZrfOx8WOS qahczrfox8wos, eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i, Executor executor, WwqoyKhrbNp5qcng0CM wwqoyKhrbNp5qcng0CM, bYZKmsM130y5GVhnn byzkmsm130y5gvhnn, bYZKmsM130y5GVhnn byzkmsm130y5gvhnn2, rR47ZPwFk6l5cadn8 rr47zpwfk6l5cadn8) {
        this.dDIMxZXP1V8HdM = context;
        this.w9sT1Swbhx3hs = vxNS64aU1fc3I;
        this.vekpFI4d1Nc4fakF = qahczrfox8wos;
        this.JXn4Qf7zpnLjP5 = eteizwlyooqrz0ici9i;
        this.Ee8d2j4S9Vm5yGuR = executor;
        this.xDyLpEZyrcKVe0 = wwqoyKhrbNp5qcng0CM;
        this.ibVTtJUNfrGYbW = byzkmsm130y5gvhnn;
        this.b1EoSIRjJHO5 = byzkmsm130y5gvhnn2;
        this.pyu8ovAipBTLYAiKab = rr47zpwfk6l5cadn8;
    }

    private static /* synthetic */ void xbggwcbyp() {
    }

    public final void dDIMxZXP1V8HdM(oO26y14q3Pwf oo26y14q3pwf, int i) {
        byte[] bArr;
        bLhN5yakPGE6G blhn5yakpge6g;
        long j;
        LxcWwhUIAZTomaullvAU lxcWwhUIAZTomaullvAU;
        String str;
        LxcWwhUIAZTomaullvAU lxcWwhUIAZTomaullvAU2;
        int i2;
        Or5PM5MwQB0KzFUgjHR9 or5PM5MwQB0KzFUgjHR9IbVTtJUNfrGYbW;
        Integer numValueOf;
        String str2;
        long j2;
        NYXyLhuO3qlh84AKe52 nYXyLhuO3qlh84AKe52;
        final LutdQZ2I9fVx lutdQZ2I9fVx = this;
        final oO26y14q3Pwf oo26y14q3pwf2 = oo26y14q3pwf;
        byte[] bArr2 = oo26y14q3pwf2.w9sT1Swbhx3hs;
        bLhN5yakPGE6G blhn5yakpge6gDDIMxZXP1V8HdM = lutdQZ2I9fVx.w9sT1Swbhx3hs.dDIMxZXP1V8HdM(oo26y14q3pwf2.dDIMxZXP1V8HdM);
        long jMax = 0;
        while (true) {
            final int i3 = 0;
            z3H4CF5ES1APfy6l z3h4cf5es1apfy6l = new z3H4CF5ES1APfy6l(lutdQZ2I9fVx) { // from class: v.s.ibXWNmcyhWlWVz0XfEA
                public final /* synthetic */ LutdQZ2I9fVx vekpFI4d1Nc4fakF;

                {
                    this.vekpFI4d1Nc4fakF = lutdQZ2I9fVx;
                }

                @Override // v.s.z3H4CF5ES1APfy6l
                public final Object JXn4Qf7zpnLjP5() {
                    Boolean bool;
                    switch (i3) {
                        case 0:
                            oO26y14q3Pwf oo26y14q3pwf3 = oo26y14q3pwf2;
                            c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx = (c0GsmbUiugE231HPbX) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF;
                            SQLiteDatabase sQLiteDatabaseDDIMxZXP1V8HdM = c0gsmbuiuge231hpbx.dDIMxZXP1V8HdM();
                            sQLiteDatabaseDDIMxZXP1V8HdM.beginTransaction();
                            try {
                                Long lVekpFI4d1Nc4fakF = c0GsmbUiugE231HPbX.vekpFI4d1Nc4fakF(sQLiteDatabaseDDIMxZXP1V8HdM, oo26y14q3pwf3);
                                if (lVekpFI4d1Nc4fakF == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c0gsmbuiuge231hpbx.dDIMxZXP1V8HdM().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lVekpFI4d1Nc4fakF.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseDDIMxZXP1V8HdM.setTransactionSuccessful();
                                sQLiteDatabaseDDIMxZXP1V8HdM.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseDDIMxZXP1V8HdM.endTransaction();
                                throw th2;
                            }
                        default:
                            c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx2 = (c0GsmbUiugE231HPbX) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF;
                            c0gsmbuiuge231hpbx2.getClass();
                            return (Iterable) c0gsmbuiuge231hpbx2.D5P1xCAyuvgF(new cY0DNVJM1fAUrMWIl7k(c0gsmbuiuge231hpbx2, 86 - 82, oo26y14q3pwf2));
                    }
                }
            };
            c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx = (c0GsmbUiugE231HPbX) lutdQZ2I9fVx.xDyLpEZyrcKVe0;
            if (!((Boolean) c0gsmbuiuge231hpbx.DVTNwpDEVsUKuznof(z3h4cf5es1apfy6l)).booleanValue()) {
                c0gsmbuiuge231hpbx.DVTNwpDEVsUKuznof(new la5sybrtamx9S4qO(lutdQZ2I9fVx, oo26y14q3pwf2, jMax));
                return;
            }
            final int i4 = 1;
            Iterable iterable = (Iterable) c0gsmbuiuge231hpbx.DVTNwpDEVsUKuznof(new z3H4CF5ES1APfy6l(lutdQZ2I9fVx) { // from class: v.s.ibXWNmcyhWlWVz0XfEA
                public final /* synthetic */ LutdQZ2I9fVx vekpFI4d1Nc4fakF;

                {
                    this.vekpFI4d1Nc4fakF = lutdQZ2I9fVx;
                }

                @Override // v.s.z3H4CF5ES1APfy6l
                public final Object JXn4Qf7zpnLjP5() {
                    Boolean bool;
                    switch (i4) {
                        case 0:
                            oO26y14q3Pwf oo26y14q3pwf3 = oo26y14q3pwf2;
                            c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx2 = (c0GsmbUiugE231HPbX) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF;
                            SQLiteDatabase sQLiteDatabaseDDIMxZXP1V8HdM = c0gsmbuiuge231hpbx2.dDIMxZXP1V8HdM();
                            sQLiteDatabaseDDIMxZXP1V8HdM.beginTransaction();
                            try {
                                Long lVekpFI4d1Nc4fakF = c0GsmbUiugE231HPbX.vekpFI4d1Nc4fakF(sQLiteDatabaseDDIMxZXP1V8HdM, oo26y14q3pwf3);
                                if (lVekpFI4d1Nc4fakF == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c0gsmbuiuge231hpbx2.dDIMxZXP1V8HdM().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lVekpFI4d1Nc4fakF.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseDDIMxZXP1V8HdM.setTransactionSuccessful();
                                sQLiteDatabaseDDIMxZXP1V8HdM.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseDDIMxZXP1V8HdM.endTransaction();
                                throw th2;
                            }
                        default:
                            c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx3 = (c0GsmbUiugE231HPbX) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF;
                            c0gsmbuiuge231hpbx3.getClass();
                            return (Iterable) c0gsmbuiuge231hpbx3.D5P1xCAyuvgF(new cY0DNVJM1fAUrMWIl7k(c0gsmbuiuge231hpbx3, 86 - 82, oo26y14q3pwf2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            int i5 = 5;
            if (blhn5yakpge6gDDIMxZXP1V8HdM == null) {
                jb8et6SZeK5TWMrJFxDX.Ee8d2j4S9Vm5yGuR("Uploader", "Unknown backend for %s, deleting event batch for it...", oo26y14q3pwf2);
                lxcWwhUIAZTomaullvAU2 = new LxcWwhUIAZTomaullvAU(3, -1L);
                bArr = bArr2;
                blhn5yakpge6g = blhn5yakpge6gDDIMxZXP1V8HdM;
                j = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((XLl8iYn7yPzhz) it.next()).vekpFI4d1Nc4fakF);
                }
                if (bArr2 != null) {
                    rR47ZPwFk6l5cadn8 rr47zpwfk6l5cadn8 = lutdQZ2I9fVx.pyu8ovAipBTLYAiKab;
                    Objects.requireNonNull(rr47zpwfk6l5cadn8);
                    gWzBsjX17jYks gwzbsjx17jyks = (gWzBsjX17jYks) c0gsmbuiuge231hpbx.DVTNwpDEVsUKuznof(new rA0nQJPukyMi(i5, rr47zpwfk6l5cadn8));
                    xXexZC0ehrqHnWzLCz xxexzc0ehrqhnwzlcz = new xXexZC0ehrqHnWzLCz();
                    xxexzc0ehrqhnwzlcz.xDyLpEZyrcKVe0 = new HashMap();
                    xxexzc0ehrqhnwzlcz.JXn4Qf7zpnLjP5 = Long.valueOf(lutdQZ2I9fVx.ibVTtJUNfrGYbW.JXn4Qf7zpnLjP5());
                    xxexzc0ehrqhnwzlcz.Ee8d2j4S9Vm5yGuR = Long.valueOf(lutdQZ2I9fVx.b1EoSIRjJHO5.JXn4Qf7zpnLjP5());
                    xxexzc0ehrqhnwzlcz.dDIMxZXP1V8HdM = "GDT_CLIENT_METRICS";
                    DixbgjZDrgKGsYk0Hj dixbgjZDrgKGsYk0Hj = new DixbgjZDrgKGsYk0Hj("proto");
                    gwzbsjx17jyks.getClass();
                    eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i = YVcRkbD8OzEKScR0.dDIMxZXP1V8HdM;
                    eteizwlyooqrz0ici9i.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        eteizwlyooqrz0ici9i.w9sT1Swbhx3hs(gwzbsjx17jyks, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    xxexzc0ehrqhnwzlcz.vekpFI4d1Nc4fakF = new lIOSSTYOutyFnDV8Yx(dixbgjZDrgKGsYk0Hj, byteArrayOutputStream.toByteArray());
                    arrayList.add(((V20IGCy8JC99pmhwML) blhn5yakpge6gDDIMxZXP1V8HdM).dDIMxZXP1V8HdM(xxexzc0ehrqhnwzlcz.w9sT1Swbhx3hs()));
                }
                V20IGCy8JC99pmhwML v20IGCy8JC99pmhwML = (V20IGCy8JC99pmhwML) blhn5yakpge6gDDIMxZXP1V8HdM;
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    UAg7SCKjkktbMM uAg7SCKjkktbMM = (UAg7SCKjkktbMM) obj;
                    String str3 = uAg7SCKjkktbMM.dDIMxZXP1V8HdM;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(uAg7SCKjkktbMM);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(uAg7SCKjkktbMM);
                        map.put(str3, arrayList2);
                    }
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    UAg7SCKjkktbMM uAg7SCKjkktbMM2 = (UAg7SCKjkktbMM) ((List) entry.getValue()).get(0);
                    WhOHSFV3G9aP8ArcgZu whOHSFV3G9aP8ArcgZu = WhOHSFV3G9aP8ArcgZu.w9sT1Swbhx3hs;
                    long jJXn4Qf7zpnLjP5 = v20IGCy8JC99pmhwML.xDyLpEZyrcKVe0.JXn4Qf7zpnLjP5();
                    long jJXn4Qf7zpnLjP6 = v20IGCy8JC99pmhwML.Ee8d2j4S9Vm5yGuR.JXn4Qf7zpnLjP5();
                    jZnJIJ9XWyPWR6i6tCvt jznjij9xwypwr6i6tcvt = new jZnJIJ9XWyPWR6i6tCvt(new p39Zh4aR40p79Ao0cCxv(Integer.valueOf(uAg7SCKjkktbMM2.w9sT1Swbhx3hs("sdk-version")), uAg7SCKjkktbMM2.dDIMxZXP1V8HdM("model"), uAg7SCKjkktbMM2.dDIMxZXP1V8HdM("hardware"), uAg7SCKjkktbMM2.dDIMxZXP1V8HdM("device"), uAg7SCKjkktbMM2.dDIMxZXP1V8HdM("product"), uAg7SCKjkktbMM2.dDIMxZXP1V8HdM("os-uild"), uAg7SCKjkktbMM2.dDIMxZXP1V8HdM("manufacturer"), uAg7SCKjkktbMM2.dDIMxZXP1V8HdM("fingerprint"), uAg7SCKjkktbMM2.dDIMxZXP1V8HdM("locale"), uAg7SCKjkktbMM2.dDIMxZXP1V8HdM("country"), uAg7SCKjkktbMM2.dDIMxZXP1V8HdM("mcc_mnc"), uAg7SCKjkktbMM2.dDIMxZXP1V8HdM("application_build")));
                    try {
                        str2 = null;
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                    } catch (NumberFormatException unused2) {
                        numValueOf = null;
                        str2 = (String) entry.getKey();
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (UAg7SCKjkktbMM uAg7SCKjkktbMM3 : (List) entry.getValue()) {
                        lIOSSTYOutyFnDV8Yx liosstyoutyfndv8yx = uAg7SCKjkktbMM3.vekpFI4d1Nc4fakF;
                        bLhN5yakPGE6G blhn5yakpge6g2 = blhn5yakpge6gDDIMxZXP1V8HdM;
                        DixbgjZDrgKGsYk0Hj dixbgjZDrgKGsYk0Hj2 = liosstyoutyfndv8yx.dDIMxZXP1V8HdM;
                        byte[] bArr3 = liosstyoutyfndv8yx.w9sT1Swbhx3hs;
                        if (dixbgjZDrgKGsYk0Hj2.equals(new DixbgjZDrgKGsYk0Hj("proto"))) {
                            nYXyLhuO3qlh84AKe52 = new NYXyLhuO3qlh84AKe52();
                            nYXyLhuO3qlh84AKe52.Ee8d2j4S9Vm5yGuR = bArr3;
                            j2 = jMax;
                        } else {
                            j2 = jMax;
                            if (dixbgjZDrgKGsYk0Hj2.equals(new DixbgjZDrgKGsYk0Hj("json"))) {
                                String str4 = new String(bArr3, Charset.forName("UTF-8"));
                                NYXyLhuO3qlh84AKe52 nYXyLhuO3qlh84AKe53 = new NYXyLhuO3qlh84AKe52();
                                nYXyLhuO3qlh84AKe53.xDyLpEZyrcKVe0 = str4;
                                nYXyLhuO3qlh84AKe52 = nYXyLhuO3qlh84AKe53;
                            } else if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 5)) {
                                dixbgjZDrgKGsYk0Hj2.toString();
                            }
                            blhn5yakpge6gDDIMxZXP1V8HdM = blhn5yakpge6g2;
                            jMax = j2;
                        }
                        nYXyLhuO3qlh84AKe52.w9sT1Swbhx3hs = Long.valueOf(uAg7SCKjkktbMM3.JXn4Qf7zpnLjP5);
                        nYXyLhuO3qlh84AKe52.JXn4Qf7zpnLjP5 = Long.valueOf(uAg7SCKjkktbMM3.Ee8d2j4S9Vm5yGuR);
                        String str5 = (String) uAg7SCKjkktbMM3.xDyLpEZyrcKVe0.get("tz-offset");
                        nYXyLhuO3qlh84AKe52.ibVTtJUNfrGYbW = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        nYXyLhuO3qlh84AKe52.b1EoSIRjJHO5 = new MwZjcr6Jo2nms((M2aRKtFjAXgZr79ytAww) M2aRKtFjAXgZr79ytAww.w9sT1Swbhx3hs.get(uAg7SCKjkktbMM3.w9sT1Swbhx3hs("net-type")), (yp2NLvJDeqG6m3p5OdOY) yp2NLvJDeqG6m3p5OdOY.w9sT1Swbhx3hs.get(uAg7SCKjkktbMM3.w9sT1Swbhx3hs("mobile-subtype")));
                        Integer num = uAg7SCKjkktbMM3.w9sT1Swbhx3hs;
                        if (num != null) {
                            nYXyLhuO3qlh84AKe52.vekpFI4d1Nc4fakF = num;
                        }
                        String strIbVTtJUNfrGYbW = ((Long) nYXyLhuO3qlh84AKe52.w9sT1Swbhx3hs) == null ? " eventTimeMs" : "";
                        if (((Long) nYXyLhuO3qlh84AKe52.JXn4Qf7zpnLjP5) == null) {
                            strIbVTtJUNfrGYbW = strIbVTtJUNfrGYbW.concat(" eventUptimeMs");
                        }
                        if (((Long) nYXyLhuO3qlh84AKe52.ibVTtJUNfrGYbW) == null) {
                            strIbVTtJUNfrGYbW = Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(strIbVTtJUNfrGYbW, " timezoneOffsetSeconds");
                        }
                        if (!strIbVTtJUNfrGYbW.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strIbVTtJUNfrGYbW));
                        }
                        arrayList4.add(new l5I5SpXbt39FIPGMZQ(((Long) nYXyLhuO3qlh84AKe52.w9sT1Swbhx3hs).longValue(), (Integer) nYXyLhuO3qlh84AKe52.vekpFI4d1Nc4fakF, ((Long) nYXyLhuO3qlh84AKe52.JXn4Qf7zpnLjP5).longValue(), (byte[]) nYXyLhuO3qlh84AKe52.Ee8d2j4S9Vm5yGuR, (String) nYXyLhuO3qlh84AKe52.xDyLpEZyrcKVe0, ((Long) nYXyLhuO3qlh84AKe52.ibVTtJUNfrGYbW).longValue(), (MwZjcr6Jo2nms) nYXyLhuO3qlh84AKe52.b1EoSIRjJHO5));
                        blhn5yakpge6gDDIMxZXP1V8HdM = blhn5yakpge6g2;
                        jMax = j2;
                    }
                    arrayList3.add(new p9kyUMMnzMJjKaq0(jJXn4Qf7zpnLjP5, jJXn4Qf7zpnLjP6, jznjij9xwypwr6i6tcvt, numValueOf, str2, arrayList4));
                }
                blhn5yakpge6g = blhn5yakpge6gDDIMxZXP1V8HdM;
                j = jMax;
                AA5DbR8pp2wjO06aN aA5DbR8pp2wjO06aN = new AA5DbR8pp2wjO06aN(arrayList3);
                URL urlW9sT1Swbhx3hs = v20IGCy8JC99pmhwML.JXn4Qf7zpnLjP5;
                if (bArr != null) {
                    try {
                        ULO76INtY6ygYJ uLO76INtY6ygYJDDIMxZXP1V8HdM = ULO76INtY6ygYJ.dDIMxZXP1V8HdM(bArr);
                        str = uLO76INtY6ygYJDDIMxZXP1V8HdM.w9sT1Swbhx3hs;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = uLO76INtY6ygYJDDIMxZXP1V8HdM.dDIMxZXP1V8HdM;
                        if (str6 != null) {
                            urlW9sT1Swbhx3hs = V20IGCy8JC99pmhwML.w9sT1Swbhx3hs(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        lxcWwhUIAZTomaullvAU = new LxcWwhUIAZTomaullvAU(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i2 = new eTeIZwLyooQrZ0ICI9i(urlW9sT1Swbhx3hs, aA5DbR8pp2wjO06aN, str);
                    rA0nQJPukyMi ra0nqjpukymi = new rA0nQJPukyMi(0, v20IGCy8JC99pmhwML);
                    int i7 = 5;
                    do {
                        or5PM5MwQB0KzFUgjHR9IbVTtJUNfrGYbW = ra0nqjpukymi.ibVTtJUNfrGYbW(eteizwlyooqrz0ici9i2);
                        URL url = or5PM5MwQB0KzFUgjHR9IbVTtJUNfrGYbW.w9sT1Swbhx3hs;
                        if (url != null) {
                            jb8et6SZeK5TWMrJFxDX.Ee8d2j4S9Vm5yGuR("CctTransportBackend", "Following redirect to: %s", url);
                            eteizwlyooqrz0ici9i2 = new eTeIZwLyooQrZ0ICI9i(url, (AA5DbR8pp2wjO06aN) eteizwlyooqrz0ici9i2.vekpFI4d1Nc4fakF, (String) eteizwlyooqrz0ici9i2.JXn4Qf7zpnLjP5);
                        } else {
                            eteizwlyooqrz0ici9i2 = null;
                        }
                        if (eteizwlyooqrz0ici9i2 == null) {
                            break;
                        } else {
                            i7--;
                        }
                    } while (i7 >= 1);
                    int i8 = or5PM5MwQB0KzFUgjHR9IbVTtJUNfrGYbW.dDIMxZXP1V8HdM;
                    if (i8 == 200) {
                        lxcWwhUIAZTomaullvAU2 = new LxcWwhUIAZTomaullvAU(1, or5PM5MwQB0KzFUgjHR9IbVTtJUNfrGYbW.vekpFI4d1Nc4fakF);
                    } else {
                        if (i8 >= 500 || i8 == 404) {
                            lxcWwhUIAZTomaullvAU = new LxcWwhUIAZTomaullvAU(2, -1L);
                        } else if (i8 == 400) {
                            try {
                                lxcWwhUIAZTomaullvAU = new LxcWwhUIAZTomaullvAU(4, -1L);
                            } catch (IOException unused4) {
                                jb8et6SZeK5TWMrJFxDX.hjneShqpF9Tis4("CctTransportBackend");
                                i2 = 2;
                                lxcWwhUIAZTomaullvAU2 = new LxcWwhUIAZTomaullvAU(2, -1L);
                            }
                        } else {
                            lxcWwhUIAZTomaullvAU = new LxcWwhUIAZTomaullvAU(3, -1L);
                        }
                        lxcWwhUIAZTomaullvAU2 = lxcWwhUIAZTomaullvAU;
                    }
                } catch (IOException unused5) {
                }
            }
            i2 = 3 - 1;
            int i9 = lxcWwhUIAZTomaullvAU2.dDIMxZXP1V8HdM;
            if (i9 == i2) {
                c0gsmbuiuge231hpbx.DVTNwpDEVsUKuznof(new aG8MaF53ScDsiXM5a3xb(this, iterable, oo26y14q3pwf, j));
                this.JXn4Qf7zpnLjP5.Ee8d2j4S9Vm5yGuR(oo26y14q3pwf, i + 1, true);
                return;
            }
            lutdQZ2I9fVx = this;
            oo26y14q3pwf2 = oo26y14q3pwf;
            long j3 = j;
            c0gsmbuiuge231hpbx.DVTNwpDEVsUKuznof(new cY0DNVJM1fAUrMWIl7k(lutdQZ2I9fVx, 5, iterable));
            if (i9 == 1) {
                jMax = Math.max(j3, lxcWwhUIAZTomaullvAU2.w9sT1Swbhx3hs);
                if (bArr != null) {
                    c0gsmbuiuge231hpbx.DVTNwpDEVsUKuznof(new rA0nQJPukyMi(7, lutdQZ2I9fVx));
                }
            } else {
                if (i9 == 4) {
                    HashMap map2 = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String str7 = ((XLl8iYn7yPzhz) it2.next()).vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM;
                        if (map2.containsKey(str7)) {
                            map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                        } else {
                            map2.put(str7, 1);
                        }
                    }
                    c0gsmbuiuge231hpbx.DVTNwpDEVsUKuznof(new cY0DNVJM1fAUrMWIl7k(lutdQZ2I9fVx, 45 - 39, map2));
                }
                jMax = j3;
            }
            bArr2 = bArr;
            blhn5yakpge6gDDIMxZXP1V8HdM = blhn5yakpge6g;
        }
    }
}

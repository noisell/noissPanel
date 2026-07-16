package v.s;

import android.os.PowerManager;
import androidx.activity.ComponentActivity;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class dgYqeynPOIkCjV1UTWhk extends LGm23hksIOxB implements JRdueaGIH5g8DVCPba {
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dgYqeynPOIkCjV1UTWhk(int i, Object obj) {
        super(0);
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = obj;
    }

    private static /* synthetic */ void rafozbnk() {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [v.s.JRdueaGIH5g8DVCPba, v.s.LGm23hksIOxB] */
    @Override // v.s.JRdueaGIH5g8DVCPba
    public final Object w9sT1Swbhx3hs() {
        switch (this.vekpFI4d1Nc4fakF) {
            case 0:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.JXn4Qf7zpnLjP5;
                try {
                    if (wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    break;
                } catch (Exception unused) {
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 1:
                wIulk4QxNLn4s wiulk4qxnln4s = (wIulk4QxNLn4s) this.JXn4Qf7zpnLjP5;
                sfr0Aaw8vBbkmexjHdWK sfr0aaw8vbbkmexjhdwk = wiulk4qxnln4s.JXn4Qf7zpnLjP5;
                String str = wiulk4qxnln4s.vekpFI4d1Nc4fakF;
                xm8FciQZdMj7 xm8fciqzdmj7 = (str == null || !wiulk4qxnln4s.Ee8d2j4S9Vm5yGuR) ? new xm8FciQZdMj7(wiulk4qxnln4s.w9sT1Swbhx3hs, wiulk4qxnln4s.vekpFI4d1Nc4fakF, new r5XEUfod5GSCCwq6c(10), sfr0aaw8vbbkmexjhdwk, wiulk4qxnln4s.xDyLpEZyrcKVe0) : new xm8FciQZdMj7(wiulk4qxnln4s.w9sT1Swbhx3hs, new File(wiulk4qxnln4s.w9sT1Swbhx3hs.getNoBackupFilesDir(), str).getAbsolutePath(), new r5XEUfod5GSCCwq6c(10), sfr0aaw8vbbkmexjhdwk, wiulk4qxnln4s.xDyLpEZyrcKVe0);
                xm8fciqzdmj7.setWriteAheadLoggingEnabled(wiulk4qxnln4s.b1EoSIRjJHO5);
                return xm8fciqzdmj7;
            case 2:
                return (List) this.JXn4Qf7zpnLjP5;
            case 3:
                try {
                    return (List) ((LGm23hksIOxB) this.JXn4Qf7zpnLjP5).w9sT1Swbhx3hs();
                } catch (SSLPeerUnverifiedException unused2) {
                    return qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
                }
            case 4:
                ComponentActivity componentActivity = (ComponentActivity) this.JXn4Qf7zpnLjP5;
                ArrayList arrayList = new ArrayList();
                Q7ncPL8Ht3Jh70mWLfou.dDIMxZXP1V8HdM.getClass();
                arrayList.add(new tuozM5JUfzdwvdym6XAC(new NR9JYyosoI0WX(icW62Cdl5SZK4UKX9S.class).dDIMxZXP1V8HdM()));
                tuozM5JUfzdwvdym6XAC[] tuozm5jufzdwvdym6xacArr = (tuozM5JUfzdwvdym6XAC[]) arrayList.toArray(new tuozM5JUfzdwvdym6XAC[0]);
                tuozM5JUfzdwvdym6XAC[] tuozm5jufzdwvdym6xacArr2 = (tuozM5JUfzdwvdym6XAC[]) Arrays.copyOf(tuozm5jufzdwvdym6xacArr, tuozm5jufzdwvdym6xacArr.length);
                Xu6l0U3w5XcZ8Nkn xu6l0U3w5XcZ8NknDDIMxZXP1V8HdM = componentActivity.dDIMxZXP1V8HdM();
                eEkc8BfG5ogJ eekc8bfg5ogj = eEkc8BfG5ogJ.w9sT1Swbhx3hs;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll((LinkedHashMap) eekc8bfg5ogj.dDIMxZXP1V8HdM);
                if (componentActivity.getApplication() != null) {
                    linkedHashMap.put(fadfsJa4iEdiwEC4Xm8.D5P1xCAyuvgF, componentActivity.getApplication());
                }
                linkedHashMap.put(jb8et6SZeK5TWMrJFxDX.pyu8ovAipBTLYAiKab, componentActivity);
                linkedHashMap.put(jb8et6SZeK5TWMrJFxDX.D5P1xCAyuvgF, componentActivity);
                if (componentActivity.getIntent() != null && componentActivity.getIntent().getExtras() != null) {
                    linkedHashMap.put(jb8et6SZeK5TWMrJFxDX.hjneShqpF9Tis4, componentActivity.getIntent().getExtras());
                }
                NxoJLFH7TrhGd5768J nxoJLFH7TrhGd5768J = (NxoJLFH7TrhGd5768J) xu6l0U3w5XcZ8NknDDIMxZXP1V8HdM.dDIMxZXP1V8HdM.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (!icW62Cdl5SZK4UKX9S.class.isInstance(nxoJLFH7TrhGd5768J)) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(linkedHashMap);
                    linkedHashMap2.put(fEyMFFyOOvHURJ7To6L.gmNWMfvn6zlEj, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        icW62Cdl5SZK4UKX9S icw62cdl5szk4ukx9s = null;
                        for (tuozM5JUfzdwvdym6XAC tuozm5jufzdwvdym6xac : tuozm5jufzdwvdym6xacArr2) {
                            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(tuozm5jufzdwvdym6xac.dDIMxZXP1V8HdM, icW62Cdl5SZK4UKX9S.class)) {
                                icw62cdl5szk4ukx9s = new icW62Cdl5SZK4UKX9S();
                            }
                        }
                        if (icw62cdl5szk4ukx9s == null) {
                            throw new IllegalArgumentException("No initializer set for given class ".concat(icW62Cdl5SZK4UKX9S.class.getName()));
                        }
                        NxoJLFH7TrhGd5768J nxoJLFH7TrhGd5768J2 = (NxoJLFH7TrhGd5768J) xu6l0U3w5XcZ8NknDDIMxZXP1V8HdM.dDIMxZXP1V8HdM.put("androidx.lifecycle.internal.SavedStateHandlesVM", icw62cdl5szk4ukx9s);
                        if (nxoJLFH7TrhGd5768J2 != null) {
                            nxoJLFH7TrhGd5768J2.dDIMxZXP1V8HdM();
                        }
                        nxoJLFH7TrhGd5768J = icw62cdl5szk4ukx9s;
                    } catch (AbstractMethodError unused3) {
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return (icW62Cdl5SZK4UKX9S) nxoJLFH7TrhGd5768J;
            case 5:
                HjYi3nnbLmeB1CrY5tes hjYi3nnbLmeB1CrY5tes = (HjYi3nnbLmeB1CrY5tes) this.JXn4Qf7zpnLjP5;
                String strHjneShqpF9Tis4 = hjYi3nnbLmeB1CrY5tes.hjneShqpF9Tis4();
                WorkDatabase workDatabase = (WorkDatabase) hjYi3nnbLmeB1CrY5tes.dDIMxZXP1V8HdM;
                workDatabase.dDIMxZXP1V8HdM();
                workDatabase.w9sT1Swbhx3hs();
                z4xRvJ1RJf5JDR z4xrvj1rjf5jdr = workDatabase.vekpFI4d1Nc4fakF;
                if (z4xrvj1rjf5jdr == null) {
                    z4xrvj1rjf5jdr = null;
                }
                return z4xrvj1rjf5jdr.l1V0lQr6TbwNKqHfXNbb().D5P1xCAyuvgF(strHjneShqpF9Tis4);
            default:
                return new vLtzHklHcOmK17[((xuyi7QZPbnP6xOQ3Cu[]) this.JXn4Qf7zpnLjP5).length];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dgYqeynPOIkCjV1UTWhk(JRdueaGIH5g8DVCPba jRdueaGIH5g8DVCPba) {
        super(0);
        this.vekpFI4d1Nc4fakF = 3;
        this.JXn4Qf7zpnLjP5 = (LGm23hksIOxB) jRdueaGIH5g8DVCPba;
    }
}

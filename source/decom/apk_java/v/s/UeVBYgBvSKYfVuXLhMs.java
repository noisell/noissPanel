package v.s;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Base64;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class UeVBYgBvSKYfVuXLhMs implements As2k35rSTTZ3RAUS, aTR0Fvd9tAh4Aa, VMDuz8aYZEdHqSIte {
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ UeVBYgBvSKYfVuXLhMs(int i) {
        this.w9sT1Swbhx3hs = i;
    }

    @Override // v.s.VMDuz8aYZEdHqSIte
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                UWYuX9UTvV9YpFO4TOW uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM = oO26y14q3Pwf.dDIMxZXP1V8HdM();
                uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.ibVTtJUNfrGYbW(cursorRawQuery.getString(1));
                uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5 = oAbr1ycaDgFnfg.w9sT1Swbhx3hs(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF = string == null ? null : Base64.decode(string, 0);
                arrayList.add(uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.dDIMxZXP1V8HdM());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // v.s.aTR0Fvd9tAh4Aa
    public Object dDIMxZXP1V8HdM(DfUmSWZwfhCUz dfUmSWZwfhCUz) throws IOException {
        int i;
        Object obj;
        switch (this.w9sT1Swbhx3hs) {
            case 5:
                i = 403;
                break;
            case 6:
                i = -1;
                break;
            default:
                SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = (SQzPENpgvzKX9IlD) dfUmSWZwfhCUz;
                synchronized (sQzPENpgvzKX9IlD.dDIMxZXP1V8HdM) {
                    if (!sQzPENpgvzKX9IlD.vekpFI4d1Nc4fakF) {
                        throw new IllegalStateException("Task is not yet complete");
                    }
                    if (sQzPENpgvzKX9IlD.JXn4Qf7zpnLjP5) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(sQzPENpgvzKX9IlD.xDyLpEZyrcKVe0)) {
                        throw ((Throwable) IOException.class.cast(sQzPENpgvzKX9IlD.xDyLpEZyrcKVe0));
                    }
                    Exception exc = sQzPENpgvzKX9IlD.xDyLpEZyrcKVe0;
                    if (exc != null) {
                        throw new XrwVOyHvqSOc4psxRfT(exc);
                    }
                    obj = sQzPENpgvzKX9IlD.Ee8d2j4S9Vm5yGuR;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                bundle.toString();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i);
    }

    @Override // v.s.As2k35rSTTZ3RAUS
    public Object w9sT1Swbhx3hs(iniVyKd0OGb2raI4 inivykd0ogb2rai4) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                Set setW9sT1Swbhx3hs = inivykd0ogb2rai4.w9sT1Swbhx3hs(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(A8Ma74sVrwIpGnRFB9.class));
                r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = r5XEUfod5GSCCwq6c.JXn4Qf7zpnLjP5;
                if (r5xeufod5gsccwq6c == null) {
                    synchronized (r5XEUfod5GSCCwq6c.class) {
                        try {
                            r5xeufod5gsccwq6c = r5XEUfod5GSCCwq6c.JXn4Qf7zpnLjP5;
                            if (r5xeufod5gsccwq6c == null) {
                                r5xeufod5gsccwq6c = new r5XEUfod5GSCCwq6c(0);
                                r5XEUfod5GSCCwq6c.JXn4Qf7zpnLjP5 = r5xeufod5gsccwq6c;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return new JIlQIGti1DoC(setW9sT1Swbhx3hs, r5xeufod5gsccwq6c);
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.dDIMxZXP1V8HdM.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.vekpFI4d1Nc4fakF.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.w9sT1Swbhx3hs.get();
            case 4:
                jbtbKB2tTtjICZw jbtbkb2tttjiczw = ExecutorsRegistrar.dDIMxZXP1V8HdM;
                return GtJy9UfhXUvQf2HR.w9sT1Swbhx3hs;
            case 11:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(inivykd0ogb2rai4);
            case 13:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(inivykd0ogb2rai4);
            default:
                return TransportRegistrar.lambda$getComponents$0(inivykd0ogb2rai4);
        }
    }

    public /* synthetic */ UeVBYgBvSKYfVuXLhMs(xXexZC0ehrqHnWzLCz xxexzc0ehrqhnwzlcz) {
        this.w9sT1Swbhx3hs = 14;
    }
}

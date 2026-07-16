package v.s;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class g3SNBiUFGCDVZ1c {
    public static final /* synthetic */ int D5P1xCAyuvgF = 0;
    public static final long pyu8ovAipBTLYAiKab = TimeUnit.HOURS.toSeconds(8);
    public final FirebaseMessaging JXn4Qf7zpnLjP5;
    public final peJwtl1FSM76FqOL04HJ b1EoSIRjJHO5;
    public final Context dDIMxZXP1V8HdM;
    public final xXexZC0ehrqHnWzLCz vekpFI4d1Nc4fakF;
    public final EPXwpnHeMDtvkKf w9sT1Swbhx3hs;
    public final ScheduledThreadPoolExecutor xDyLpEZyrcKVe0;
    public final Sn2d19yOBfyV0rw Ee8d2j4S9Vm5yGuR = new Sn2d19yOBfyV0rw();
    public boolean ibVTtJUNfrGYbW = false;

    public g3SNBiUFGCDVZ1c(FirebaseMessaging firebaseMessaging, EPXwpnHeMDtvkKf ePXwpnHeMDtvkKf, peJwtl1FSM76FqOL04HJ pejwtl1fsm76fqol04hj, xXexZC0ehrqHnWzLCz xxexzc0ehrqhnwzlcz, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.JXn4Qf7zpnLjP5 = firebaseMessaging;
        this.w9sT1Swbhx3hs = ePXwpnHeMDtvkKf;
        this.b1EoSIRjJHO5 = pejwtl1fsm76fqol04hj;
        this.vekpFI4d1Nc4fakF = xxexzc0ehrqhnwzlcz;
        this.dDIMxZXP1V8HdM = context;
        this.xDyLpEZyrcKVe0 = scheduledThreadPoolExecutor;
    }

    public static void dDIMxZXP1V8HdM(SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD) throws IOException {
        try {
            SbxdZ6Kq2uhHQ5RPRqm.w9sT1Swbhx3hs(sQzPENpgvzKX9IlD, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    private static /* synthetic */ void egrhvzosgo() {
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Ee8d2j4S9Vm5yGuR() throws IOException {
        BskzYla6Czi7M64 bskzYla6Czi7M64DDIMxZXP1V8HdM;
        while (true) {
            synchronized (this) {
                try {
                    bskzYla6Czi7M64DDIMxZXP1V8HdM = this.b1EoSIRjJHO5.dDIMxZXP1V8HdM();
                    if (bskzYla6Czi7M64DDIMxZXP1V8HdM == null) {
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = bskzYla6Czi7M64DDIMxZXP1V8HdM.w9sT1Swbhx3hs;
                String str2 = bskzYla6Czi7M64DDIMxZXP1V8HdM.dDIMxZXP1V8HdM;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        vekpFI4d1Nc4fakF(str2);
                    }
                } else if (str.equals("S")) {
                    w9sT1Swbhx3hs(str2);
                }
                peJwtl1FSM76FqOL04HJ pejwtl1fsm76fqol04hj = this.b1EoSIRjJHO5;
                synchronized (pejwtl1fsm76fqol04hj) {
                    iniVyKd0OGb2raI4 inivykd0ogb2rai4 = pejwtl1fsm76fqol04hj.dDIMxZXP1V8HdM;
                    String str3 = bskzYla6Czi7M64DDIMxZXP1V8HdM.vekpFI4d1Nc4fakF;
                    synchronized (((ArrayDeque) inivykd0ogb2rai4.xDyLpEZyrcKVe0)) {
                        try {
                            if (((ArrayDeque) inivykd0ogb2rai4.xDyLpEZyrcKVe0).remove(str3)) {
                                ((ScheduledThreadPoolExecutor) inivykd0ogb2rai4.ibVTtJUNfrGYbW).execute(new hzCVl0f866ksvpzUUql(12, inivykd0ogb2rai4));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                synchronized (this.Ee8d2j4S9Vm5yGuR) {
                    try {
                        String str4 = bskzYla6Czi7M64DDIMxZXP1V8HdM.vekpFI4d1Nc4fakF;
                        if (this.Ee8d2j4S9Vm5yGuR.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.Ee8d2j4S9Vm5yGuR.get(str4);
                            al3CoDKXO0nvx al3codkxo0nvx = (al3CoDKXO0nvx) arrayDeque.poll();
                            if (al3codkxo0nvx != null) {
                                al3codkxo0nvx.dDIMxZXP1V8HdM(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.Ee8d2j4S9Vm5yGuR.remove(str4);
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    e.getMessage();
                    return false;
                }
                if (e.getMessage() == null) {
                    return false;
                }
                throw e;
            }
        }
    }

    public final synchronized void JXn4Qf7zpnLjP5(boolean z) {
        this.ibVTtJUNfrGYbW = z;
    }

    public final void vekpFI4d1Nc4fakF(String str) throws IOException {
        String strDDIMxZXP1V8HdM = this.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        xXexZC0ehrqHnWzLCz xxexzc0ehrqhnwzlcz = this.vekpFI4d1Nc4fakF;
        dDIMxZXP1V8HdM(xxexzc0ehrqhnwzlcz.vekpFI4d1Nc4fakF(xxexzc0ehrqhnwzlcz.Ee8d2j4S9Vm5yGuR(strDDIMxZXP1V8HdM, "/topics/" + str, bundle)));
    }

    public final void w9sT1Swbhx3hs(String str) throws IOException {
        String strDDIMxZXP1V8HdM = this.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        xXexZC0ehrqHnWzLCz xxexzc0ehrqhnwzlcz = this.vekpFI4d1Nc4fakF;
        dDIMxZXP1V8HdM(xxexzc0ehrqhnwzlcz.vekpFI4d1Nc4fakF(xxexzc0ehrqhnwzlcz.Ee8d2j4S9Vm5yGuR(strDDIMxZXP1V8HdM, "/topics/" + str, bundle)));
    }

    public final void xDyLpEZyrcKVe0(long j) {
        this.xDyLpEZyrcKVe0.schedule(new zIvf07vZUCvFR82f8Qd2(this, this.dDIMxZXP1V8HdM, this.w9sT1Swbhx3hs, Math.min(Math.max(30L, 2 * j), pyu8ovAipBTLYAiKab)), j, TimeUnit.SECONDS);
        JXn4Qf7zpnLjP5(true);
    }
}

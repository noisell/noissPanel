package v.s;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class DQAp3IAySlIpLgRF implements zzxeBctTPcbuazkjVgh {
    public final /* synthetic */ int dDIMxZXP1V8HdM;

    @Override // v.s.zzxeBctTPcbuazkjVgh
    public final Object get() {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                jbtbKB2tTtjICZw jbtbkb2tttjiczw = ExecutorsRegistrar.dDIMxZXP1V8HdM;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new CX2cgp0VaeW1h7Cx14(Executors.newFixedThreadPool((-75) + 79, new fZPc70r1JNyB0u("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.JXn4Qf7zpnLjP5.get());
            case 2:
                jbtbKB2tTtjICZw jbtbkb2tttjiczw2 = ExecutorsRegistrar.dDIMxZXP1V8HdM;
                return new CX2cgp0VaeW1h7Cx14(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new fZPc70r1JNyB0u("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.JXn4Qf7zpnLjP5.get());
            case 3:
                jbtbKB2tTtjICZw jbtbkb2tttjiczw3 = ExecutorsRegistrar.dDIMxZXP1V8HdM;
                return new CX2cgp0VaeW1h7Cx14(Executors.newCachedThreadPool(new fZPc70r1JNyB0u("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.JXn4Qf7zpnLjP5.get());
            case 4:
                jbtbKB2tTtjICZw jbtbkb2tttjiczw4 = ExecutorsRegistrar.dDIMxZXP1V8HdM;
                return Executors.newSingleThreadScheduledExecutor(new fZPc70r1JNyB0u("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}

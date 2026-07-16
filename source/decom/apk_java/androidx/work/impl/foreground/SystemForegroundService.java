package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import java.util.Objects;
import java.util.UUID;
import v.s.EM07nbnNqFdqQrkC;
import v.s.KmvtszLNijaA5ajr0da;
import v.s.UubaJZRp66jTeLre;
import v.s.bIQtXpTQsEoGIf25Z;
import v.s.fEyMFFyOOvHURJ7To6L;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class SystemForegroundService extends LifecycleService {
    public static final /* synthetic */ int xDyLpEZyrcKVe0 = 0;
    public NotificationManager Ee8d2j4S9Vm5yGuR;
    public EM07nbnNqFdqQrkC JXn4Qf7zpnLjP5;
    public boolean vekpFI4d1Nc4fakF;
    public Handler w9sT1Swbhx3hs;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("SystemFgService");
    }

    public final void dDIMxZXP1V8HdM() {
        this.w9sT1Swbhx3hs = new Handler(Looper.getMainLooper());
        this.Ee8d2j4S9Vm5yGuR = (NotificationManager) getApplicationContext().getSystemService("notification");
        EM07nbnNqFdqQrkC eM07nbnNqFdqQrkC = new EM07nbnNqFdqQrkC(getApplicationContext());
        this.JXn4Qf7zpnLjP5 = eM07nbnNqFdqQrkC;
        if (eM07nbnNqFdqQrkC.pyu8ovAipBTLYAiKab != null) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        } else {
            eM07nbnNqFdqQrkC.pyu8ovAipBTLYAiKab = this;
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        dDIMxZXP1V8HdM();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.JXn4Qf7zpnLjP5.xDyLpEZyrcKVe0();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.vekpFI4d1Nc4fakF) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            this.JXn4Qf7zpnLjP5.xDyLpEZyrcKVe0();
            dDIMxZXP1V8HdM();
            this.vekpFI4d1Nc4fakF = false;
        }
        if (intent == null) {
            return 3;
        }
        EM07nbnNqFdqQrkC eM07nbnNqFdqQrkC = this.JXn4Qf7zpnLjP5;
        eM07nbnNqFdqQrkC.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            Objects.toString(intent);
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
            eM07nbnNqFdqQrkC.w9sT1Swbhx3hs.w9sT1Swbhx3hs(new UubaJZRp66jTeLre(eM07nbnNqFdqQrkC, 7, intent.getStringExtra("KEY_WORKSPEC_ID")));
            eM07nbnNqFdqQrkC.Ee8d2j4S9Vm5yGuR(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            eM07nbnNqFdqQrkC.Ee8d2j4S9Vm5yGuR(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            SystemForegroundService systemForegroundService = eM07nbnNqFdqQrkC.pyu8ovAipBTLYAiKab;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.vekpFI4d1Nc4fakF = true;
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        Objects.toString(intent);
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2.getClass();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        bIQtXpTQsEoGIf25Z biqtxptqseogif25z = eM07nbnNqFdqQrkC.dDIMxZXP1V8HdM;
        UUID uuidFromString = UUID.fromString(stringExtra);
        biqtxptqseogif25z.getClass();
        biqtxptqseogif25z.pyu8ovAipBTLYAiKab.w9sT1Swbhx3hs(new KmvtszLNijaA5ajr0da(biqtxptqseogif25z, uuidFromString, 0));
        return 3;
    }
}

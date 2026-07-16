package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.LifecycleService;
import java.util.LinkedHashMap;
import java.util.Map;
import v.s.BWybMLHPTAHr;
import v.s.YBgPeyiVTstFMkDCziC;
import v.s.fEyMFFyOOvHURJ7To6L;
import v.s.qf9xIurtngmmaY9Cdx;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class SystemAlarmService extends LifecycleService {
    public boolean vekpFI4d1Nc4fakF;
    public YBgPeyiVTstFMkDCziC w9sT1Swbhx3hs;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("SystemAlarmService");
    }

    private static /* synthetic */ void hqzdujz() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final void dDIMxZXP1V8HdM() {
        ?? r0 = (-44) + 45;
        this.vekpFI4d1Nc4fakF = r0;
        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        int i = BWybMLHPTAHr.dDIMxZXP1V8HdM;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (qf9xIurtngmmaY9Cdx.dDIMxZXP1V8HdM) {
            linkedHashMap.putAll(qf9xIurtngmmaY9Cdx.w9sT1Swbhx3hs);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            if (wakeLock != null && wakeLock.isHeld() == r0) {
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC = new YBgPeyiVTstFMkDCziC(this);
        this.w9sT1Swbhx3hs = yBgPeyiVTstFMkDCziC;
        if (yBgPeyiVTstFMkDCziC.pyu8ovAipBTLYAiKab != null) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        } else {
            yBgPeyiVTstFMkDCziC.pyu8ovAipBTLYAiKab = this;
        }
        this.vekpFI4d1Nc4fakF = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.vekpFI4d1Nc4fakF = true;
        YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC = this.w9sT1Swbhx3hs;
        yBgPeyiVTstFMkDCziC.getClass();
        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        yBgPeyiVTstFMkDCziC.JXn4Qf7zpnLjP5.xDyLpEZyrcKVe0(yBgPeyiVTstFMkDCziC);
        yBgPeyiVTstFMkDCziC.pyu8ovAipBTLYAiKab = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.vekpFI4d1Nc4fakF) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC = this.w9sT1Swbhx3hs;
            yBgPeyiVTstFMkDCziC.getClass();
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            yBgPeyiVTstFMkDCziC.JXn4Qf7zpnLjP5.xDyLpEZyrcKVe0(yBgPeyiVTstFMkDCziC);
            yBgPeyiVTstFMkDCziC.pyu8ovAipBTLYAiKab = null;
            YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC2 = new YBgPeyiVTstFMkDCziC(this);
            this.w9sT1Swbhx3hs = yBgPeyiVTstFMkDCziC2;
            if (yBgPeyiVTstFMkDCziC2.pyu8ovAipBTLYAiKab != null) {
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            } else {
                yBgPeyiVTstFMkDCziC2.pyu8ovAipBTLYAiKab = this;
            }
            this.vekpFI4d1Nc4fakF = false;
        }
        if (intent == null) {
            return 3;
        }
        this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM(intent, i2);
        return 3;
    }
}

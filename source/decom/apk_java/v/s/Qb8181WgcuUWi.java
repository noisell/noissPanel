package v.s;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Qb8181WgcuUWi implements Runnable {
    public final YBgPeyiVTstFMkDCziC vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ Qb8181WgcuUWi(YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = yBgPeyiVTstFMkDCziC;
    }

    private static /* synthetic */ void vfmt() {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x003a, TryCatch #5 {all -> 0x003a, blocks: (B:6:0x0016, B:8:0x001a, B:10:0x0036, B:13:0x003c, B:14:0x0045, B:15:0x0046, B:16:0x0052, B:20:0x005c, B:22:0x0064, B:23:0x0068, B:27:0x0072, B:29:0x007d, B:37:0x0093, B:33:0x0085, B:34:0x0086, B:36:0x0090, B:41:0x009b, B:24:0x0069, B:25:0x006f, B:17:0x0053, B:18:0x0059), top: B:72:0x0016, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0090 A[Catch: all -> 0x003a, TryCatch #5 {all -> 0x003a, blocks: (B:6:0x0016, B:8:0x001a, B:10:0x0036, B:13:0x003c, B:14:0x0045, B:15:0x0046, B:16:0x0052, B:20:0x005c, B:22:0x0064, B:23:0x0068, B:27:0x0072, B:29:0x007d, B:37:0x0093, B:33:0x0085, B:34:0x0086, B:36:0x0090, B:41:0x009b, B:24:0x0069, B:25:0x006f, B:17:0x0053, B:18:0x0059), top: B:72:0x0016, inners: #1, #3 }] */
    @Override // java.lang.Runnable
    public final void run() {
        Qxq4OCIomL3rf7RSR qxq4OCIomL3rf7RSR;
        Qb8181WgcuUWi qb8181WgcuUWi;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                synchronized (this.vekpFI4d1Nc4fakF.ibVTtJUNfrGYbW) {
                    YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC = this.vekpFI4d1Nc4fakF;
                    yBgPeyiVTstFMkDCziC.b1EoSIRjJHO5 = (Intent) yBgPeyiVTstFMkDCziC.ibVTtJUNfrGYbW.get(0);
                    break;
                }
                Intent intent = this.vekpFI4d1Nc4fakF.b1EoSIRjJHO5;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.vekpFI4d1Nc4fakF.b1EoSIRjJHO5.getIntExtra("KEY_START_ID", 0);
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    int i = YBgPeyiVTstFMkDCziC.hjneShqpF9Tis4;
                    Objects.toString(this.vekpFI4d1Nc4fakF.b1EoSIRjJHO5);
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
                    PowerManager.WakeLock wakeLockDDIMxZXP1V8HdM = BWybMLHPTAHr.dDIMxZXP1V8HdM(this.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM, action + " (" + intExtra + ")");
                    int i2 = 1;
                    try {
                        try {
                            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                            wakeLockDDIMxZXP1V8HdM.toString();
                            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2.getClass();
                            wakeLockDDIMxZXP1V8HdM.acquire();
                            YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC2 = this.vekpFI4d1Nc4fakF;
                            yBgPeyiVTstFMkDCziC2.xDyLpEZyrcKVe0.dDIMxZXP1V8HdM(intExtra, yBgPeyiVTstFMkDCziC2.b1EoSIRjJHO5, yBgPeyiVTstFMkDCziC2);
                            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                            wakeLockDDIMxZXP1V8HdM.toString();
                            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3.getClass();
                            wakeLockDDIMxZXP1V8HdM.release();
                            YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC3 = this.vekpFI4d1Nc4fakF;
                            qxq4OCIomL3rf7RSR = (Qxq4OCIomL3rf7RSR) yBgPeyiVTstFMkDCziC3.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5;
                            qb8181WgcuUWi = new Qb8181WgcuUWi(yBgPeyiVTstFMkDCziC3, i2);
                        } catch (Throwable unused) {
                            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab4 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                            int i3 = YBgPeyiVTstFMkDCziC.hjneShqpF9Tis4;
                            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab4.getClass();
                            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab5 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                            wakeLockDDIMxZXP1V8HdM.toString();
                            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab5.getClass();
                            wakeLockDDIMxZXP1V8HdM.release();
                            YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC4 = this.vekpFI4d1Nc4fakF;
                            qxq4OCIomL3rf7RSR = (Qxq4OCIomL3rf7RSR) yBgPeyiVTstFMkDCziC4.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5;
                            qb8181WgcuUWi = new Qb8181WgcuUWi(yBgPeyiVTstFMkDCziC4, i2);
                        }
                        qxq4OCIomL3rf7RSR.execute(qb8181WgcuUWi);
                        return;
                    } catch (Throwable th) {
                        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab6 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                        int i4 = YBgPeyiVTstFMkDCziC.hjneShqpF9Tis4;
                        wakeLockDDIMxZXP1V8HdM.toString();
                        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab6.getClass();
                        wakeLockDDIMxZXP1V8HdM.release();
                        YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC5 = this.vekpFI4d1Nc4fakF;
                        ((Qxq4OCIomL3rf7RSR) yBgPeyiVTstFMkDCziC5.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5).execute(new Qb8181WgcuUWi(yBgPeyiVTstFMkDCziC5, i2));
                        throw th;
                    }
                }
                return;
            default:
                YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC6 = this.vekpFI4d1Nc4fakF;
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                YBgPeyiVTstFMkDCziC.w9sT1Swbhx3hs();
                synchronized (yBgPeyiVTstFMkDCziC6.ibVTtJUNfrGYbW) {
                    try {
                        if (yBgPeyiVTstFMkDCziC6.b1EoSIRjJHO5 != null) {
                            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab7 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                            Objects.toString(yBgPeyiVTstFMkDCziC6.b1EoSIRjJHO5);
                            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab7.getClass();
                            if (!((Intent) yBgPeyiVTstFMkDCziC6.ibVTtJUNfrGYbW.remove(0)).equals(yBgPeyiVTstFMkDCziC6.b1EoSIRjJHO5)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            yBgPeyiVTstFMkDCziC6.b1EoSIRjJHO5 = null;
                        }
                        NTq6GnI9WZIP8Nuz nTq6GnI9WZIP8Nuz = (NTq6GnI9WZIP8Nuz) yBgPeyiVTstFMkDCziC6.w9sT1Swbhx3hs.dDIMxZXP1V8HdM;
                        i4q7NrKXalWiVky i4q7nrkxalwivky = yBgPeyiVTstFMkDCziC6.xDyLpEZyrcKVe0;
                        synchronized (i4q7nrkxalwivky.vekpFI4d1Nc4fakF) {
                            zIsEmpty = i4q7nrkxalwivky.w9sT1Swbhx3hs.isEmpty();
                            break;
                        }
                        if (zIsEmpty && yBgPeyiVTstFMkDCziC6.ibVTtJUNfrGYbW.isEmpty()) {
                            synchronized (nTq6GnI9WZIP8Nuz.Ee8d2j4S9Vm5yGuR) {
                                zIsEmpty2 = nTq6GnI9WZIP8Nuz.w9sT1Swbhx3hs.isEmpty();
                                break;
                            }
                            if (zIsEmpty2) {
                                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
                                SystemAlarmService systemAlarmService = yBgPeyiVTstFMkDCziC6.pyu8ovAipBTLYAiKab;
                                if (systemAlarmService != null) {
                                    systemAlarmService.dDIMxZXP1V8HdM();
                                }
                            } else if (!yBgPeyiVTstFMkDCziC6.ibVTtJUNfrGYbW.isEmpty()) {
                                yBgPeyiVTstFMkDCziC6.vekpFI4d1Nc4fakF();
                            }
                        } else if (!yBgPeyiVTstFMkDCziC6.ibVTtJUNfrGYbW.isEmpty()) {
                            yBgPeyiVTstFMkDCziC6.vekpFI4d1Nc4fakF();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}

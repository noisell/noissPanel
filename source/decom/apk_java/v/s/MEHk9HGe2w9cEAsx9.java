package v.s;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class MEHk9HGe2w9cEAsx9 implements d7yjIEB02ZavJfb7Dt, V4FaOhY0Qp9WSXi {
    public PowerManager.WakeLock D5P1xCAyuvgF;
    public final r5XEUfod5GSCCwq6c Ee8d2j4S9Vm5yGuR;
    public final YBgPeyiVTstFMkDCziC JXn4Qf7zpnLjP5;
    public final NTq6GnI9WZIP8Nuz b1EoSIRjJHO5;
    public final Context dDIMxZXP1V8HdM;
    public final rPTA1zWZR3GTVlGPw gIIiyi2ddlMDR0;
    public final r9c8qUHbkyLZi gmNWMfvn6zlEj;
    public boolean hjneShqpF9Tis4;
    public int ibVTtJUNfrGYbW;
    public final Qxq4OCIomL3rf7RSR pyu8ovAipBTLYAiKab;
    public final ebR1taU40KcOGClk vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;
    public volatile z17cwwEfkgV0Mm5Z wotphlvK9sPbXJ;
    public final Object xDyLpEZyrcKVe0;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("DelayMetCommandHandler");
    }

    public MEHk9HGe2w9cEAsx9(Context context, int i, YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC, r9c8qUHbkyLZi r9c8quhbkylzi) {
        this.dDIMxZXP1V8HdM = context;
        this.w9sT1Swbhx3hs = i;
        this.JXn4Qf7zpnLjP5 = yBgPeyiVTstFMkDCziC;
        this.vekpFI4d1Nc4fakF = r9c8quhbkylzi.dDIMxZXP1V8HdM;
        this.gmNWMfvn6zlEj = r9c8quhbkylzi;
        mYrXZiFjFW2Xg myrxzifjfw2xg = yBgPeyiVTstFMkDCziC.Ee8d2j4S9Vm5yGuR.Qrz92kRPw4GcghAc;
        fUH025aw0Rgl fuh025aw0rgl = yBgPeyiVTstFMkDCziC.w9sT1Swbhx3hs;
        this.b1EoSIRjJHO5 = (NTq6GnI9WZIP8Nuz) fuh025aw0rgl.dDIMxZXP1V8HdM;
        this.pyu8ovAipBTLYAiKab = (Qxq4OCIomL3rf7RSR) fuh025aw0rgl.JXn4Qf7zpnLjP5;
        this.gIIiyi2ddlMDR0 = (rPTA1zWZR3GTVlGPw) fuh025aw0rgl.w9sT1Swbhx3hs;
        this.Ee8d2j4S9Vm5yGuR = new r5XEUfod5GSCCwq6c(myrxzifjfw2xg);
        this.hjneShqpF9Tis4 = false;
        this.ibVTtJUNfrGYbW = 0;
        this.xDyLpEZyrcKVe0 = new Object();
    }

    public static void dDIMxZXP1V8HdM(MEHk9HGe2w9cEAsx9 mEHk9HGe2w9cEAsx9) {
        int i = mEHk9HGe2w9cEAsx9.w9sT1Swbhx3hs;
        Qxq4OCIomL3rf7RSR qxq4OCIomL3rf7RSR = mEHk9HGe2w9cEAsx9.pyu8ovAipBTLYAiKab;
        Context context = mEHk9HGe2w9cEAsx9.dDIMxZXP1V8HdM;
        YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC = mEHk9HGe2w9cEAsx9.JXn4Qf7zpnLjP5;
        ebR1taU40KcOGClk ebr1tau40kcogclk = mEHk9HGe2w9cEAsx9.vekpFI4d1Nc4fakF;
        if (mEHk9HGe2w9cEAsx9.ibVTtJUNfrGYbW >= 2) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            return;
        }
        mEHk9HGe2w9cEAsx9.ibVTtJUNfrGYbW = 2;
        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        i4q7NrKXalWiVky.vekpFI4d1Nc4fakF(intent, ebr1tau40kcogclk);
        qxq4OCIomL3rf7RSR.execute(new vJrrbQ3pNiUwSywraT(i, intent, yBgPeyiVTstFMkDCziC));
        if (!yBgPeyiVTstFMkDCziC.JXn4Qf7zpnLjP5.Ee8d2j4S9Vm5yGuR(ebr1tau40kcogclk.dDIMxZXP1V8HdM)) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            return;
        }
        fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        i4q7NrKXalWiVky.vekpFI4d1Nc4fakF(intent2, ebr1tau40kcogclk);
        qxq4OCIomL3rf7RSR.execute(new vJrrbQ3pNiUwSywraT(i, intent2, yBgPeyiVTstFMkDCziC));
    }

    public static void vekpFI4d1Nc4fakF(MEHk9HGe2w9cEAsx9 mEHk9HGe2w9cEAsx9) {
        if (mEHk9HGe2w9cEAsx9.ibVTtJUNfrGYbW != 0) {
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            Objects.toString(mEHk9HGe2w9cEAsx9.vekpFI4d1Nc4fakF);
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
            return;
        }
        mEHk9HGe2w9cEAsx9.ibVTtJUNfrGYbW = 1;
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        Objects.toString(mEHk9HGe2w9cEAsx9.vekpFI4d1Nc4fakF);
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2.getClass();
        if (!mEHk9HGe2w9cEAsx9.JXn4Qf7zpnLjP5.JXn4Qf7zpnLjP5.b1EoSIRjJHO5(mEHk9HGe2w9cEAsx9.gmNWMfvn6zlEj, null)) {
            mEHk9HGe2w9cEAsx9.JXn4Qf7zpnLjP5();
            return;
        }
        of8L9erzXSTdsHBj8 of8l9erzxstdshbj8 = mEHk9HGe2w9cEAsx9.JXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF;
        ebR1taU40KcOGClk ebr1tau40kcogclk = mEHk9HGe2w9cEAsx9.vekpFI4d1Nc4fakF;
        synchronized (of8l9erzxstdshbj8.JXn4Qf7zpnLjP5) {
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            Objects.toString(ebr1tau40kcogclk);
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3.getClass();
            of8l9erzxstdshbj8.dDIMxZXP1V8HdM(ebr1tau40kcogclk);
            C62YiuQjS28TEpad c62YiuQjS28TEpad = new C62YiuQjS28TEpad(of8l9erzxstdshbj8, ebr1tau40kcogclk);
            of8l9erzxstdshbj8.w9sT1Swbhx3hs.put(ebr1tau40kcogclk, c62YiuQjS28TEpad);
            of8l9erzxstdshbj8.vekpFI4d1Nc4fakF.put(ebr1tau40kcogclk, mEHk9HGe2w9cEAsx9);
            ((Handler) of8l9erzxstdshbj8.dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF).postDelayed(c62YiuQjS28TEpad, 600000L);
        }
    }

    public final void Ee8d2j4S9Vm5yGuR() {
        String str = this.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM;
        this.D5P1xCAyuvgF = BWybMLHPTAHr.dDIMxZXP1V8HdM(this.dDIMxZXP1V8HdM, str + " (" + this.w9sT1Swbhx3hs + ")");
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        Objects.toString(this.D5P1xCAyuvgF);
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        this.D5P1xCAyuvgF.acquire();
        sFdNPiaH9eT4T sfdnpiah9et4tGmNWMfvn6zlEj = this.JXn4Qf7zpnLjP5.Ee8d2j4S9Vm5yGuR.b1EoSIRjJHO5.XiR1pIn5878vVWd().gmNWMfvn6zlEj(str);
        if (sfdnpiah9et4tGmNWMfvn6zlEj == null) {
            this.b1EoSIRjJHO5.execute(new oYjJeyWwkb7eAhf(this, 0));
            return;
        }
        boolean zVekpFI4d1Nc4fakF = sfdnpiah9et4tGmNWMfvn6zlEj.vekpFI4d1Nc4fakF();
        this.hjneShqpF9Tis4 = zVekpFI4d1Nc4fakF;
        if (zVekpFI4d1Nc4fakF) {
            this.wotphlvK9sPbXJ = hYpmJoivns3nhcS6.dDIMxZXP1V8HdM(this.Ee8d2j4S9Vm5yGuR, sfdnpiah9et4tGmNWMfvn6zlEj, this.gIIiyi2ddlMDR0, this);
        } else {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            this.b1EoSIRjJHO5.execute(new oYjJeyWwkb7eAhf(this, 1));
        }
    }

    public final void JXn4Qf7zpnLjP5() {
        synchronized (this.xDyLpEZyrcKVe0) {
            try {
                if (this.wotphlvK9sPbXJ != null) {
                    this.wotphlvK9sPbXJ.vekpFI4d1Nc4fakF(null);
                }
                this.JXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM(this.vekpFI4d1Nc4fakF);
                PowerManager.WakeLock wakeLock = this.D5P1xCAyuvgF;
                if (wakeLock != null && wakeLock.isHeld()) {
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    Objects.toString(this.D5P1xCAyuvgF);
                    Objects.toString(this.vekpFI4d1Nc4fakF);
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
                    this.D5P1xCAyuvgF.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v.s.d7yjIEB02ZavJfb7Dt
    public final void w9sT1Swbhx3hs(sFdNPiaH9eT4T sfdnpiah9et4t, vLtzHklHcOmK17 vltzhklhcomk17) {
        boolean z = vltzhklhcomk17 instanceof dlsaeknCx25iNrToq;
        NTq6GnI9WZIP8Nuz nTq6GnI9WZIP8Nuz = this.b1EoSIRjJHO5;
        if (z) {
            nTq6GnI9WZIP8Nuz.execute(new oYjJeyWwkb7eAhf(this, 1));
        } else {
            nTq6GnI9WZIP8Nuz.execute(new oYjJeyWwkb7eAhf(this, 0));
        }
    }

    public final void xDyLpEZyrcKVe0(boolean z) {
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        ebR1taU40KcOGClk ebr1tau40kcogclk = this.vekpFI4d1Nc4fakF;
        Objects.toString(ebr1tau40kcogclk);
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        JXn4Qf7zpnLjP5();
        int i = this.w9sT1Swbhx3hs;
        YBgPeyiVTstFMkDCziC yBgPeyiVTstFMkDCziC = this.JXn4Qf7zpnLjP5;
        Qxq4OCIomL3rf7RSR qxq4OCIomL3rf7RSR = this.pyu8ovAipBTLYAiKab;
        Context context = this.dDIMxZXP1V8HdM;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            i4q7NrKXalWiVky.vekpFI4d1Nc4fakF(intent, ebr1tau40kcogclk);
            qxq4OCIomL3rf7RSR.execute(new vJrrbQ3pNiUwSywraT(i, intent, yBgPeyiVTstFMkDCziC));
        }
        if (this.hjneShqpF9Tis4) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            qxq4OCIomL3rf7RSR.execute(new vJrrbQ3pNiUwSywraT(i, intent2, yBgPeyiVTstFMkDCziC));
        }
    }
}

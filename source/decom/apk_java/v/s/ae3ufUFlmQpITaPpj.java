package v.s;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ae3ufUFlmQpITaPpj extends iFLJbvrqroccc6 {
    public final /* synthetic */ com.google.android.gms.common.internal.dDIMxZXP1V8HdM dDIMxZXP1V8HdM;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae3ufUFlmQpITaPpj(com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm, Looper looper) {
        super(looper);
        this.dDIMxZXP1V8HdM = ddimxzxp1v8hdm;
    }

    private static /* synthetic */ void joowgqit() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.dDIMxZXP1V8HdM.l1V0lQr6TbwNKqHfXNbb.get() != message.arg1) {
            int i = message.what;
            if (i == 2 || i == 1 || i == 7) {
                Es1n423DpwihY8I es1n423DpwihY8I = (Es1n423DpwihY8I) message.obj;
                es1n423DpwihY8I.getClass();
                es1n423DpwihY8I.vekpFI4d1Nc4fakF();
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) && !this.dDIMxZXP1V8HdM.b1EoSIRjJHO5()) {
            Es1n423DpwihY8I es1n423DpwihY8I2 = (Es1n423DpwihY8I) message.obj;
            es1n423DpwihY8I2.getClass();
            es1n423DpwihY8I2.vekpFI4d1Nc4fakF();
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm = this.dDIMxZXP1V8HdM;
            ddimxzxp1v8hdm.XiR1pIn5878vVWd = new nyZDwrpXoi7nqMd(message.arg2);
            if (!ddimxzxp1v8hdm.H9XlUr4OeMJFiXK && !TextUtils.isEmpty(ddimxzxp1v8hdm.MLSIo1htfMPWeB8V876L()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(ddimxzxp1v8hdm.MLSIo1htfMPWeB8V876L());
                    com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm2 = this.dDIMxZXP1V8HdM;
                    if (!ddimxzxp1v8hdm2.H9XlUr4OeMJFiXK) {
                        ddimxzxp1v8hdm2.l1V0lQr6TbwNKqHfXNbb(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm3 = this.dDIMxZXP1V8HdM;
            nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd = ddimxzxp1v8hdm3.XiR1pIn5878vVWd;
            if (nyzdwrpxoi7nqmd == null) {
                nyzdwrpxoi7nqmd = new nyZDwrpXoi7nqMd(8);
            }
            ddimxzxp1v8hdm3.pyu8ovAipBTLYAiKab.dDIMxZXP1V8HdM(nyzdwrpxoi7nqmd);
            System.currentTimeMillis();
            return;
        }
        if (i3 == 5) {
            com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm4 = this.dDIMxZXP1V8HdM;
            nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd2 = ddimxzxp1v8hdm4.XiR1pIn5878vVWd;
            if (nyzdwrpxoi7nqmd2 == null) {
                nyzdwrpxoi7nqmd2 = new nyZDwrpXoi7nqMd(8);
            }
            ddimxzxp1v8hdm4.pyu8ovAipBTLYAiKab.dDIMxZXP1V8HdM(nyzdwrpxoi7nqmd2);
            System.currentTimeMillis();
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            this.dDIMxZXP1V8HdM.pyu8ovAipBTLYAiKab.dDIMxZXP1V8HdM(new nyZDwrpXoi7nqMd(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i3 == 6) {
            this.dDIMxZXP1V8HdM.l1V0lQr6TbwNKqHfXNbb(5, null);
            r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = this.dDIMxZXP1V8HdM.wotphlvK9sPbXJ;
            if (r5xeufod5gsccwq6c != null) {
                ((Irpcf8dxYWkn3XNhG) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs(message.arg2);
            }
            System.currentTimeMillis();
            com.google.android.gms.common.internal.dDIMxZXP1V8HdM.DVTNwpDEVsUKuznof(this.dDIMxZXP1V8HdM, 5, 1, null);
            return;
        }
        if (i3 == 2 && !this.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM()) {
            Es1n423DpwihY8I es1n423DpwihY8I3 = (Es1n423DpwihY8I) message.obj;
            es1n423DpwihY8I3.getClass();
            es1n423DpwihY8I3.vekpFI4d1Nc4fakF();
            return;
        }
        int i4 = message.what;
        if (i4 != 2 && i4 != 1 && i4 != 7) {
            new Exception();
            return;
        }
        Es1n423DpwihY8I es1n423DpwihY8I4 = (Es1n423DpwihY8I) message.obj;
        synchronized (es1n423DpwihY8I4) {
            try {
                bool = es1n423DpwihY8I4.dDIMxZXP1V8HdM;
                if (es1n423DpwihY8I4.w9sT1Swbhx3hs) {
                    es1n423DpwihY8I4.toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.dDIMxZXP1V8HdM ddimxzxp1v8hdm5 = es1n423DpwihY8I4.xDyLpEZyrcKVe0;
            int i5 = es1n423DpwihY8I4.JXn4Qf7zpnLjP5;
            if (i5 != 0) {
                ddimxzxp1v8hdm5.l1V0lQr6TbwNKqHfXNbb(1, null);
                Bundle bundle = es1n423DpwihY8I4.Ee8d2j4S9Vm5yGuR;
                es1n423DpwihY8I4.dDIMxZXP1V8HdM(new nyZDwrpXoi7nqMd(i5, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!es1n423DpwihY8I4.w9sT1Swbhx3hs()) {
                ddimxzxp1v8hdm5.l1V0lQr6TbwNKqHfXNbb(1, null);
                es1n423DpwihY8I4.dDIMxZXP1V8HdM(new nyZDwrpXoi7nqMd(8, null));
            }
        }
        synchronized (es1n423DpwihY8I4) {
            es1n423DpwihY8I4.w9sT1Swbhx3hs = true;
        }
        es1n423DpwihY8I4.vekpFI4d1Nc4fakF();
    }
}

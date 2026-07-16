package v.s;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class OfLkl9rR9exIS {
    public static final Pattern D5P1xCAyuvgF = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public static int b1EoSIRjJHO5;
    public static PendingIntent pyu8ovAipBTLYAiKab;
    public final ScheduledThreadPoolExecutor JXn4Qf7zpnLjP5;
    public D3FfxRNDtw22r ibVTtJUNfrGYbW;
    public final PptKtqDFv7XjzC1Mly6V vekpFI4d1Nc4fakF;
    public final Context w9sT1Swbhx3hs;
    public Messenger xDyLpEZyrcKVe0;
    public final O162WzpEtUgucWBV dDIMxZXP1V8HdM = new O162WzpEtUgucWBV();
    public final Messenger Ee8d2j4S9Vm5yGuR = new Messenger(new aEJ6cT2zHXsR1aWpDl(this, Looper.getMainLooper()));

    public OfLkl9rR9exIS(Context context) {
        this.w9sT1Swbhx3hs = context;
        this.vekpFI4d1Nc4fakF = new PptKtqDFv7XjzC1Mly6V(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.JXn4Qf7zpnLjP5 = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public final SQzPENpgvzKX9IlD dDIMxZXP1V8HdM(Bundle bundle) {
        String string;
        synchronized (OfLkl9rR9exIS.class) {
            int i = b1EoSIRjJHO5;
            b1EoSIRjJHO5 = i + 1;
            string = Integer.toString(i);
        }
        al3CoDKXO0nvx al3codkxo0nvx = new al3CoDKXO0nvx();
        synchronized (this.dDIMxZXP1V8HdM) {
            this.dDIMxZXP1V8HdM.put(string, al3codkxo0nvx);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.w9sT1Swbhx3hs;
        synchronized (OfLkl9rR9exIS.class) {
            try {
                if (pyu8ovAipBTLYAiKab == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    pyu8ovAipBTLYAiKab = PendingIntent.getBroadcast(context, 0, intent2, nSOkM3lAPQUSaSiJnId.dDIMxZXP1V8HdM);
                }
                intent.putExtra("app", pyu8ovAipBTLYAiKab);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.Ee8d2j4S9Vm5yGuR);
        if (this.xDyLpEZyrcKVe0 != null || this.ibVTtJUNfrGYbW != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.xDyLpEZyrcKVe0;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.ibVTtJUNfrGYbW.w9sT1Swbhx3hs;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs() == 2) {
                    this.w9sT1Swbhx3hs.sendBroadcast(intent);
                } else {
                    this.w9sT1Swbhx3hs.startService(intent);
                }
            }
        } else if (this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs() == 2) {
            this.w9sT1Swbhx3hs.sendBroadcast(intent);
        } else {
            this.w9sT1Swbhx3hs.startService(intent);
        }
        al3codkxo0nvx.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM(S7iZMVp9ciczvGPfF.JXn4Qf7zpnLjP5, new UWYuX9UTvV9YpFO4TOW(this, string, this.JXn4Qf7zpnLjP5.schedule(new YqOiSVb2wSv9Lq63qb(16, al3codkxo0nvx), 30L, TimeUnit.SECONDS)));
        return al3codkxo0nvx.dDIMxZXP1V8HdM;
    }

    public final void w9sT1Swbhx3hs(String str, Bundle bundle) {
        synchronized (this.dDIMxZXP1V8HdM) {
            try {
                al3CoDKXO0nvx al3codkxo0nvx = (al3CoDKXO0nvx) this.dDIMxZXP1V8HdM.remove(str);
                if (al3codkxo0nvx == null) {
                    return;
                }
                al3codkxo0nvx.dDIMxZXP1V8HdM(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

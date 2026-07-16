package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import v.s.bIQtXpTQsEoGIf25Z;
import v.s.fEyMFFyOOvHURJ7To6L;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        Objects.toString(intent);
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        try {
            bIQtXpTQsEoGIf25Z biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb = bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (bIQtXpTQsEoGIf25Z.MLSIo1htfMPWeB8V876L) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.wotphlvK9sPbXJ;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.wotphlvK9sPbXJ = pendingResultGoAsync;
                    if (biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.gIIiyi2ddlMDR0) {
                        pendingResultGoAsync.finish();
                        biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.wotphlvK9sPbXJ = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException unused) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        }
    }
}

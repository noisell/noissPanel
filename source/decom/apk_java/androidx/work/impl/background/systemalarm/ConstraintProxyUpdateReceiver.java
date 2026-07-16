package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import v.s.bIQtXpTQsEoGIf25Z;
import v.s.fEyMFFyOOvHURJ7To6L;
import v.s.qjpsB7oD4nN4npCMR4XF;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(context).pyu8ovAipBTLYAiKab.w9sT1Swbhx3hs(new qjpsB7oD4nN4npCMR4XF(intent, context, goAsync(), 0));
        } else {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        }
    }
}

package v.s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class TPmmkjQ3eELZVgWS6 extends BroadcastReceiver {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("ConstraintProxy");
    }

    private static /* synthetic */ void nsyqfe() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        Objects.toString(intent);
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        int i = i4q7NrKXalWiVky.xDyLpEZyrcKVe0;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}

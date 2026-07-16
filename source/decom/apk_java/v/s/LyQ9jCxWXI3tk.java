package v.s;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class LyQ9jCxWXI3tk extends iFLJbvrqroccc6 {
    public final Context dDIMxZXP1V8HdM;
    public final /* synthetic */ a4Aq5QBZFai3VwgjU w9sT1Swbhx3hs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LyQ9jCxWXI3tk(a4Aq5QBZFai3VwgjU a4aq5qbzfai3vwgju, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.w9sT1Swbhx3hs = a4aq5qbzfai3vwgju;
        this.dDIMxZXP1V8HdM = context.getApplicationContext();
    }

    private static /* synthetic */ void maksmsms() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        int i = eIfkxafADHUOlFqb.dDIMxZXP1V8HdM;
        a4Aq5QBZFai3VwgjU a4aq5qbzfai3vwgju = this.w9sT1Swbhx3hs;
        Context context = this.dDIMxZXP1V8HdM;
        int iW9sT1Swbhx3hs = a4aq5qbzfai3vwgju.w9sT1Swbhx3hs(context, i);
        int i2 = WUKu8Lj5A4IfwZ.vekpFI4d1Nc4fakF;
        if (iW9sT1Swbhx3hs == 1 || iW9sT1Swbhx3hs == 2 || iW9sT1Swbhx3hs == 3 || iW9sT1Swbhx3hs == 9) {
            Intent intentDDIMxZXP1V8HdM = a4aq5qbzfai3vwgju.dDIMxZXP1V8HdM(iW9sT1Swbhx3hs, context, "n");
            a4aq5qbzfai3vwgju.xDyLpEZyrcKVe0(context, iW9sT1Swbhx3hs, intentDDIMxZXP1V8HdM == null ? null : PendingIntent.getActivity(context, 0, intentDDIMxZXP1V8HdM, 201326592));
        }
    }
}

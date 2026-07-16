package v.s;

import android.view.MotionEvent;
import android.view.View;
import app.mobilex.plus.services.DataQFAdapter;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class UX1wumA9o1nH9kfC implements View.OnTouchListener {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ Object w9sT1Swbhx3hs;

    public /* synthetic */ UX1wumA9o1nH9kfC(int i, Object obj) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                return DataQFAdapter.addShadeBarrier$lambda$47((DataQFAdapter) this.w9sT1Swbhx3hs, view, motionEvent);
            default:
                s50M5De8F5UWQVP09E s50m5de8f5uwqvp09e = (s50M5De8F5UWQVP09E) this.w9sT1Swbhx3hs;
                if ((motionEvent == null || motionEvent.getAction() != 0) && (motionEvent == null || motionEvent.getAction() != 2)) {
                    return true;
                }
                s50m5de8f5uwqvp09e.dDIMxZXP1V8HdM.dismissNotificationShade$app_release();
                return true;
        }
    }
}

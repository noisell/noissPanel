package v.s;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class jdCLwLRpmACj3In implements Runnable {
    public final /* synthetic */ ArrayList Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ ArrayList JXn4Qf7zpnLjP5;
    public final /* synthetic */ ArrayList vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;
    public final /* synthetic */ ArrayList xDyLpEZyrcKVe0;

    public jdCLwLRpmACj3In(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = arrayList;
        this.JXn4Qf7zpnLjP5 = arrayList2;
        this.Ee8d2j4S9Vm5yGuR = arrayList3;
        this.xDyLpEZyrcKVe0 = arrayList4;
    }

    private static /* synthetic */ void fnibmi() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.w9sT1Swbhx3hs; i++) {
            View view = (View) this.vekpFI4d1Nc4fakF.get(i);
            String str = (String) this.JXn4Qf7zpnLjP5.get(i);
            int i2 = tg6EjdKQH74QUty.dDIMxZXP1V8HdM;
            u9IBFWnIoP0MgX8BmWO.l1V0lQr6TbwNKqHfXNbb(view, str);
            u9IBFWnIoP0MgX8BmWO.l1V0lQr6TbwNKqHfXNbb((View) this.Ee8d2j4S9Vm5yGuR.get(i), (String) this.xDyLpEZyrcKVe0.get(i));
        }
    }
}

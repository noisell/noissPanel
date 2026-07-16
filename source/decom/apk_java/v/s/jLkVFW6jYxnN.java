package v.s;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class jLkVFW6jYxnN implements Runnable {
    public final /* synthetic */ Sn2d19yOBfyV0rw JXn4Qf7zpnLjP5;
    public final /* synthetic */ ArrayList vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ jLkVFW6jYxnN(ArrayList arrayList, Sn2d19yOBfyV0rw sn2d19yOBfyV0rw, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = arrayList;
        this.JXn4Qf7zpnLjP5 = sn2d19yOBfyV0rw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i = this.w9sT1Swbhx3hs;
        Sn2d19yOBfyV0rw sn2d19yOBfyV0rw = this.JXn4Qf7zpnLjP5;
        int i2 = 0;
        ArrayList arrayList = this.vekpFI4d1Nc4fakF;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (i2 < size) {
                    View view = (View) arrayList.get(i2);
                    int i3 = tg6EjdKQH74QUty.dDIMxZXP1V8HdM;
                    String strHjneShqpF9Tis4 = u9IBFWnIoP0MgX8BmWO.hjneShqpF9Tis4(view);
                    if (strHjneShqpF9Tis4 != null) {
                        Iterator it = ((qVploWEHLHHn3N23EK) sn2d19yOBfyV0rw.entrySet()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (strHjneShqpF9Tis4.equals(entry.getValue())) {
                                    str = (String) entry.getKey();
                                }
                            } else {
                                str = null;
                            }
                        }
                        u9IBFWnIoP0MgX8BmWO.l1V0lQr6TbwNKqHfXNbb(view, str);
                    }
                    i2++;
                }
                break;
            default:
                int size2 = arrayList.size();
                while (i2 < size2) {
                    View view2 = (View) arrayList.get(i2);
                    int i4 = tg6EjdKQH74QUty.dDIMxZXP1V8HdM;
                    u9IBFWnIoP0MgX8BmWO.l1V0lQr6TbwNKqHfXNbb(view2, (String) sn2d19yOBfyV0rw.get(u9IBFWnIoP0MgX8BmWO.hjneShqpF9Tis4(view2)));
                    i2++;
                }
                break;
        }
    }
}

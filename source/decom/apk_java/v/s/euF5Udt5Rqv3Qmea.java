package v.s;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class euF5Udt5Rqv3Qmea extends okc5AGRjqrud84oM6d {
    public final /* synthetic */ int D5P1xCAyuvgF;

    public /* synthetic */ euF5Udt5Rqv3Qmea(int i) {
        this.D5P1xCAyuvgF = i;
    }

    private static /* synthetic */ void mtupetj() {
    }

    @Override // v.s.okc5AGRjqrud84oM6d
    public r5XEUfod5GSCCwq6c D5P1xCAyuvgF(Context context, Object obj) {
        switch (this.D5P1xCAyuvgF) {
            case 0:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    return new r5XEUfod5GSCCwq6c(2, jB7suWpUqheaHlr52SG.w9sT1Swbhx3hs);
                }
                for (String str : strArr) {
                    if (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(context, str) != 0) {
                        return null;
                    }
                }
                int iDVTNwpDEVsUKuznof = oRoeOWAwLibMBxZYyTh.DVTNwpDEVsUKuznof(strArr.length);
                if (iDVTNwpDEVsUKuznof < 16) {
                    iDVTNwpDEVsUKuznof = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iDVTNwpDEVsUKuznof);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new r5XEUfod5GSCCwq6c(2, linkedHashMap);
            case 1:
                if (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(context, (String) obj) == 0) {
                    return new r5XEUfod5GSCCwq6c(2, Boolean.TRUE);
                }
                return null;
            default:
                return super.D5P1xCAyuvgF(context, obj);
        }
    }

    @Override // v.s.okc5AGRjqrud84oM6d
    public final Intent ibVTtJUNfrGYbW(Object obj) {
        switch (this.D5P1xCAyuvgF) {
            case 0:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
            case 1:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
            default:
                return (Intent) obj;
        }
    }

    @Override // v.s.okc5AGRjqrud84oM6d
    public final Object wotphlvK9sPbXJ(Intent intent, int i) {
        switch (this.D5P1xCAyuvgF) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayListQfTrc75xwRVMl85vh = VnDsNIgXNCQywv8lGh.qfTrc75xwRVMl85vh(stringArrayExtra);
                        Iterator it = arrayListQfTrc75xwRVMl85vh.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(arrayListQfTrc75xwRVMl85vh), D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new yI1KTRoNlsjx(it.next(), it2.next()));
                        }
                        return oRoeOWAwLibMBxZYyTh.K7eEOBPYP9VIoHWTe(arrayList2);
                    }
                }
                return jB7suWpUqheaHlr52SG.w9sT1Swbhx3hs;
            case 1:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z = false;
                if (intArrayExtra2 != null) {
                    for (int i3 : intArrayExtra2) {
                        if (i3 == 0) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                return new k84rwRrqzhrNQ1CdNQ9(intent, i);
        }
    }
}

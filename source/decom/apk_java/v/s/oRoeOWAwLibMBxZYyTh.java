package v.s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class oRoeOWAwLibMBxZYyTh extends RIZfHbqXpth8r2yN4 {
    public static int DVTNwpDEVsUKuznof(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map K7eEOBPYP9VIoHWTe(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return jB7suWpUqheaHlr52SG.w9sT1Swbhx3hs;
        }
        int i = 0;
        if (size == 1) {
            yI1KTRoNlsjx yi1ktronlsjx = (yI1KTRoNlsjx) arrayList.get(0);
            return Collections.singletonMap(yi1ktronlsjx.w9sT1Swbhx3hs, yi1ktronlsjx.vekpFI4d1Nc4fakF);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(DVTNwpDEVsUKuznof(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            yI1KTRoNlsjx yi1ktronlsjx2 = (yI1KTRoNlsjx) obj;
            linkedHashMap.put(yi1ktronlsjx2.w9sT1Swbhx3hs, yi1ktronlsjx2.vekpFI4d1Nc4fakF);
        }
        return linkedHashMap;
    }

    public static Map l1V0lQr6TbwNKqHfXNbb(yI1KTRoNlsjx... yi1ktronlsjxArr) {
        if (yi1ktronlsjxArr.length <= 0) {
            return jB7suWpUqheaHlr52SG.w9sT1Swbhx3hs;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(DVTNwpDEVsUKuznof(yi1ktronlsjxArr.length));
        for (yI1KTRoNlsjx yi1ktronlsjx : yi1ktronlsjxArr) {
            linkedHashMap.put(yi1ktronlsjx.w9sT1Swbhx3hs, yi1ktronlsjx.vekpFI4d1Nc4fakF);
        }
        return linkedHashMap;
    }

    private static /* synthetic */ void zawubea() {
    }
}

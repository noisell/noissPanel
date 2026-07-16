package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import v.s.MnLRqMow83uotly4qYT;
import v.s.fmRvx7qJQwJVK;
import v.s.r5XEUfod5GSCCwq6c;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class OverwritingInputMerger extends fmRvx7qJQwJVK {
    @Override // v.s.fmRvx7qJQwJVK
    public final MnLRqMow83uotly4qYT dDIMxZXP1V8HdM(ArrayList arrayList) throws Throwable {
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = new r5XEUfod5GSCCwq6c(5);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            linkedHashMap.putAll(Collections.unmodifiableMap(((MnLRqMow83uotly4qYT) obj).dDIMxZXP1V8HdM));
        }
        r5xeufod5gsccwq6c.dTS0S7eC32ubQH54j36(linkedHashMap);
        MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT = new MnLRqMow83uotly4qYT((HashMap) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF);
        MnLRqMow83uotly4qYT.w9sT1Swbhx3hs(mnLRqMow83uotly4qYT);
        return mnLRqMow83uotly4qYT;
    }
}

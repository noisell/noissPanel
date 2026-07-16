package v.s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class V6MzUQ0ByrLAmz0N extends gKEaGqCPNWjAXw {
    public static List A1BaTVAMeIXMnh(aFzDD3O0j1AOZBM7 afzdd3o0j1aozbm7) {
        Iterator it = afzdd3o0j1aozbm7.iterator();
        if (!it.hasNext()) {
            return qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private static /* synthetic */ void rqxt() {
    }
}

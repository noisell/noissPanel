package v.s;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class n8nqApvKDYz7s8llJ2jf {
    public static final CopyOnWriteArraySet dDIMxZXP1V8HdM = new CopyOnWriteArraySet();
    public static final Map w9sT1Swbhx3hs;

    static {
        Map mapSingletonMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = sp6apkX00TawY02qGY6r.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(sp6apkX00TawY02qGY6r.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(yg3wKheju8eW4e6qsE.class.getName(), "okhttp.Http2");
        linkedHashMap.put(Cid8LKolL4e2FdtXe.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size == 0) {
            mapSingletonMap = jB7suWpUqheaHlr52SG.w9sT1Swbhx3hs;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(linkedHashMap);
        } else {
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        w9sT1Swbhx3hs = mapSingletonMap;
    }
}

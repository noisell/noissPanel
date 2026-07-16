package v.s;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class JIlQIGti1DoC {
    public final String dDIMxZXP1V8HdM;
    public final r5XEUfod5GSCCwq6c w9sT1Swbhx3hs;

    public JIlQIGti1DoC(Set set, r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c) {
        this.dDIMxZXP1V8HdM = w9sT1Swbhx3hs(set);
        this.w9sT1Swbhx3hs = r5xeufod5gsccwq6c;
    }

    private static /* synthetic */ void aaylw() {
    }

    public static String w9sT1Swbhx3hs(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A8Ma74sVrwIpGnRFB9 a8Ma74sVrwIpGnRFB9 = (A8Ma74sVrwIpGnRFB9) it.next();
            sb.append(a8Ma74sVrwIpGnRFB9.dDIMxZXP1V8HdM);
            sb.append('/');
            sb.append(a8Ma74sVrwIpGnRFB9.w9sT1Swbhx3hs);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [char, int] */
    public final String dDIMxZXP1V8HdM() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.dDIMxZXP1V8HdM;
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = this.w9sT1Swbhx3hs;
        synchronized (((HashSet) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append((char) (79 - 47));
        synchronized (((HashSet) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF);
        }
        sb.append(w9sT1Swbhx3hs(setUnmodifiableSet2));
        return sb.toString();
    }
}

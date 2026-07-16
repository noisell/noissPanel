package v.s;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class VkZdYZ8plDAnnSJM {
    public final enW4UFmBttog4rg5RB dDIMxZXP1V8HdM;
    public long w9sT1Swbhx3hs = 262144;

    public VkZdYZ8plDAnnSJM(enW4UFmBttog4rg5RB enw4ufmbttog4rg5rb) {
        this.dDIMxZXP1V8HdM = enw4ufmbttog4rg5rb;
    }

    private static /* synthetic */ void lvnp() {
    }

    public final SzicGcOQovJ1JhxwfLo8 dDIMxZXP1V8HdM() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strGIIiyi2ddlMDR0 = this.dDIMxZXP1V8HdM.gIIiyi2ddlMDR0(this.w9sT1Swbhx3hs);
            this.w9sT1Swbhx3hs -= (long) strGIIiyi2ddlMDR0.length();
            if (strGIIiyi2ddlMDR0.length() == 0) {
                return new SzicGcOQovJ1JhxwfLo8((String[]) arrayList.toArray(new String[0]));
            }
            int iJW3Lh9hxwLsO2ArTlH = KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(strGIIiyi2ddlMDR0, ':', 1, 4);
            if (iJW3Lh9hxwLsO2ArTlH != -1) {
                String strSubstring = strGIIiyi2ddlMDR0.substring(0, iJW3Lh9hxwLsO2ArTlH);
                String strSubstring2 = strGIIiyi2ddlMDR0.substring(iJW3Lh9hxwLsO2ArTlH + 1);
                arrayList.add(strSubstring);
                arrayList.add(KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(strSubstring2).toString());
            } else if (strGIIiyi2ddlMDR0.charAt(0) == ':') {
                String strSubstring3 = strGIIiyi2ddlMDR0.substring(1);
                arrayList.add("");
                arrayList.add(KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(strSubstring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(strGIIiyi2ddlMDR0).toString());
            }
        }
    }
}

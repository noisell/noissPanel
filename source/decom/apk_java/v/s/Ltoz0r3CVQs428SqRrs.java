package v.s;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Ltoz0r3CVQs428SqRrs {
    public boolean JXn4Qf7zpnLjP5;
    public boolean dDIMxZXP1V8HdM = true;
    public String[] vekpFI4d1Nc4fakF;
    public String[] w9sT1Swbhx3hs;

    private static /* synthetic */ void cddoe() {
    }

    public final void Ee8d2j4S9Vm5yGuR(H0Eb9R69rKME... h0Eb9R69rKMEArr) {
        if (!this.dDIMxZXP1V8HdM) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(h0Eb9R69rKMEArr.length);
        for (H0Eb9R69rKME h0Eb9R69rKME : h0Eb9R69rKMEArr) {
            arrayList.add(h0Eb9R69rKME.w9sT1Swbhx3hs);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        JXn4Qf7zpnLjP5((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void JXn4Qf7zpnLjP5(String... strArr) {
        if (!this.dDIMxZXP1V8HdM) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.vekpFI4d1Nc4fakF = (String[]) strArr.clone();
    }

    public final OSOlo3oGIKrMzEnWP dDIMxZXP1V8HdM() {
        return new OSOlo3oGIKrMzEnWP(this.dDIMxZXP1V8HdM, this.JXn4Qf7zpnLjP5, this.w9sT1Swbhx3hs, this.vekpFI4d1Nc4fakF);
    }

    public final void vekpFI4d1Nc4fakF(qG9NzchKqUM6... qg9nzchkqum6Arr) {
        if (!this.dDIMxZXP1V8HdM) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(qg9nzchkqum6Arr.length);
        for (qG9NzchKqUM6 qg9nzchkqum6 : qg9nzchkqum6Arr) {
            arrayList.add(qg9nzchkqum6.dDIMxZXP1V8HdM);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        w9sT1Swbhx3hs((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void w9sT1Swbhx3hs(String... strArr) {
        if (!this.dDIMxZXP1V8HdM) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.w9sT1Swbhx3hs = (String[]) strArr.clone();
    }
}

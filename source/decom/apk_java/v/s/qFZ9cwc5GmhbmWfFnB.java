package v.s;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class qFZ9cwc5GmhbmWfFnB {
    public static final /* synthetic */ int wotphlvK9sPbXJ = 0;
    public final boolean D5P1xCAyuvgF;
    public final boolean Ee8d2j4S9Vm5yGuR;
    public final int JXn4Qf7zpnLjP5;
    public final int b1EoSIRjJHO5;
    public final boolean dDIMxZXP1V8HdM;
    public String gIIiyi2ddlMDR0;
    public final boolean gmNWMfvn6zlEj;
    public final boolean hjneShqpF9Tis4;
    public final boolean ibVTtJUNfrGYbW;
    public final int pyu8ovAipBTLYAiKab;
    public final int vekpFI4d1Nc4fakF;
    public final boolean w9sT1Swbhx3hs;
    public final boolean xDyLpEZyrcKVe0;

    static {
        TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
    }

    public qFZ9cwc5GmhbmWfFnB(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.dDIMxZXP1V8HdM = z;
        this.w9sT1Swbhx3hs = z2;
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = i2;
        this.Ee8d2j4S9Vm5yGuR = z3;
        this.xDyLpEZyrcKVe0 = z4;
        this.ibVTtJUNfrGYbW = z5;
        this.b1EoSIRjJHO5 = i3;
        this.pyu8ovAipBTLYAiKab = i4;
        this.D5P1xCAyuvgF = z6;
        this.hjneShqpF9Tis4 = z7;
        this.gmNWMfvn6zlEj = z8;
        this.gIIiyi2ddlMDR0 = str;
    }

    public final String toString() {
        String str = this.gIIiyi2ddlMDR0;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.dDIMxZXP1V8HdM) {
            sb.append("no-cache, ");
        }
        if (this.w9sT1Swbhx3hs) {
            sb.append("no-store, ");
        }
        int i = this.vekpFI4d1Nc4fakF;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.JXn4Qf7zpnLjP5;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.Ee8d2j4S9Vm5yGuR) {
            sb.append("private, ");
        }
        if (this.xDyLpEZyrcKVe0) {
            sb.append("public, ");
        }
        if (this.ibVTtJUNfrGYbW) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.b1EoSIRjJHO5;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.pyu8ovAipBTLYAiKab;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.D5P1xCAyuvgF) {
            sb.append("only-if-cached, ");
        }
        if (this.hjneShqpF9Tis4) {
            sb.append("no-transform, ");
        }
        if (this.gmNWMfvn6zlEj) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        this.gIIiyi2ddlMDR0 = string;
        return string;
    }
}

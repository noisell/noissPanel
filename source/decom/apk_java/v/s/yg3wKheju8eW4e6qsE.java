package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class yg3wKheju8eW4e6qsE {
    public static final String[] JXn4Qf7zpnLjP5;
    public static final XslKUngIJyofTLpQ5 dDIMxZXP1V8HdM;
    public static final String[] vekpFI4d1Nc4fakF;
    public static final String[] w9sT1Swbhx3hs;

    static {
        XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5 = new XslKUngIJyofTLpQ5("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM));
        xslKUngIJyofTLpQ5.JXn4Qf7zpnLjP5 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        dDIMxZXP1V8HdM = xslKUngIJyofTLpQ5;
        w9sT1Swbhx3hs = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        vekpFI4d1Nc4fakF = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = yrMnf4fyLGfIJbMg8IbG.b1EoSIRjJHO5("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        JXn4Qf7zpnLjP5 = strArr;
        String[] strArr2 = vekpFI4d1Nc4fakF;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = vekpFI4d1Nc4fakF;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(sb, strArr3[i4], "|PADDED");
        }
        int length = vekpFI4d1Nc4fakF.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = vekpFI4d1Nc4fakF;
            if (strArr4[i7] == null) {
                strArr4[i7] = JXn4Qf7zpnLjP5[i7];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    public static String dDIMxZXP1V8HdM(boolean z, int i, int i2, int i3, int i4) {
        String strMSGkxvPxRYNqC;
        String[] strArr = w9sT1Swbhx3hs;
        String strB1EoSIRjJHO5 = i3 < strArr.length ? strArr[i3] : yrMnf4fyLGfIJbMg8IbG.b1EoSIRjJHO5("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            strMSGkxvPxRYNqC = "";
        } else {
            int i5 = (-42) + 44;
            String[] strArr2 = JXn4Qf7zpnLjP5;
            if (i3 == i5 || i3 == 64 - 61) {
                strMSGkxvPxRYNqC = strArr2[i4];
            } else if (i3 == 4 || i3 == 6) {
                strMSGkxvPxRYNqC = i4 == 1 ? "ACK" : strArr2[i4];
            } else if (i3 == 7 || i3 == (-17) + 25) {
                strMSGkxvPxRYNqC = strArr2[i4];
            } else {
                String[] strArr3 = vekpFI4d1Nc4fakF;
                String str = i4 < strArr3.length ? strArr3[i4] : strArr2[i4];
                if (i3 != 5 || (i4 & 4) == 0) {
                    strMSGkxvPxRYNqC = (i3 != 0 || (i4 & 32) == 0) ? str : BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC(str, "PRIORITY", "COMPRESSED");
                } else {
                    strMSGkxvPxRYNqC = BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return yrMnf4fyLGfIJbMg8IbG.b1EoSIRjJHO5("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strB1EoSIRjJHO5, strMSGkxvPxRYNqC);
    }
}

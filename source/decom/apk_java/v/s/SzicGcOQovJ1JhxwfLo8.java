package v.s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class SzicGcOQovJ1JhxwfLo8 implements Iterable, buUjKwCmuWSvVXs {
    public final String[] w9sT1Swbhx3hs;

    public SzicGcOQovJ1JhxwfLo8(String[] strArr) {
        this.w9sT1Swbhx3hs = strArr;
    }

    public final String JXn4Qf7zpnLjP5(int i) {
        return this.w9sT1Swbhx3hs[(i * 2) + 1];
    }

    public final String dDIMxZXP1V8HdM(String str) {
        String[] strArr = this.w9sT1Swbhx3hs;
        int length = strArr.length - 2;
        int iEe8d2j4S9Vm5yGuR = y6jRGLEWNMir.Ee8d2j4S9Vm5yGuR(length, 0, -2);
        if (iEe8d2j4S9Vm5yGuR > length) {
            return null;
        }
        while (!BS2kx9eAoOyDiNGAFlFk.A1BaTVAMeIXMnh(str, strArr[length])) {
            if (length == iEe8d2j4S9Vm5yGuR) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SzicGcOQovJ1JhxwfLo8) {
            return Arrays.equals(this.w9sT1Swbhx3hs, ((SzicGcOQovJ1JhxwfLo8) obj).w9sT1Swbhx3hs);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.w9sT1Swbhx3hs);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        yI1KTRoNlsjx[] yi1ktronlsjxArr = new yI1KTRoNlsjx[size];
        for (int i = 0; i < size; i++) {
            yi1ktronlsjxArr[i] = new yI1KTRoNlsjx(w9sT1Swbhx3hs(i), JXn4Qf7zpnLjP5(i));
        }
        return new nQilHWaqS401ZtR(1, yi1ktronlsjxArr);
    }

    public final int size() {
        return this.w9sT1Swbhx3hs.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strW9sT1Swbhx3hs = w9sT1Swbhx3hs(i);
            String strJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5(i);
            sb.append(strW9sT1Swbhx3hs);
            sb.append(": ");
            if (yrMnf4fyLGfIJbMg8IbG.nQilHWaqS401ZtR(strW9sT1Swbhx3hs)) {
                strJXn4Qf7zpnLjP5 = "██";
            }
            sb.append(strJXn4Qf7zpnLjP5);
            sb.append("\n");
        }
        return sb.toString();
    }

    public final r5XEUfod5GSCCwq6c vekpFI4d1Nc4fakF() {
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = new r5XEUfod5GSCCwq6c(54 - 43);
        ((ArrayList) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).addAll(Arrays.asList(this.w9sT1Swbhx3hs));
        return r5xeufod5gsccwq6c;
    }

    public final String w9sT1Swbhx3hs(int i) {
        return this.w9sT1Swbhx3hs[i * 2];
    }
}

package v.s;

import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class o5RY9tI0EI5XHVPD extends Writer {
    public final StringBuilder w9sT1Swbhx3hs = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dDIMxZXP1V8HdM();
    }

    public final void dDIMxZXP1V8HdM() {
        StringBuilder sb = this.w9sT1Swbhx3hs;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        dDIMxZXP1V8HdM();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                dDIMxZXP1V8HdM();
            } else {
                this.w9sT1Swbhx3hs.append(c);
            }
        }
    }
}

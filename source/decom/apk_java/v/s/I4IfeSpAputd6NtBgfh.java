package v.s;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class I4IfeSpAputd6NtBgfh extends OutputStream {
    public long w9sT1Swbhx3hs;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.w9sT1Swbhx3hs++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.w9sT1Swbhx3hs += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.w9sT1Swbhx3hs += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

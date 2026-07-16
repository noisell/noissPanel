package v.s;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class PPVKHKekPtxKcnappF implements Closeable {
    public final Object Ee8d2j4S9Vm5yGuR;
    public final LTdvNeHFqTsIb9 JXn4Qf7zpnLjP5;
    public final boolean vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;
    public final Closeable xDyLpEZyrcKVe0;

    public PPVKHKekPtxKcnappF(int i, boolean z) {
        this.w9sT1Swbhx3hs = i;
        switch (i) {
            case 1:
                this.vekpFI4d1Nc4fakF = z;
                LTdvNeHFqTsIb9 lTdvNeHFqTsIb9 = new LTdvNeHFqTsIb9();
                this.JXn4Qf7zpnLjP5 = lTdvNeHFqTsIb9;
                Inflater inflater = new Inflater(true);
                this.Ee8d2j4S9Vm5yGuR = inflater;
                this.xDyLpEZyrcKVe0 = new pZpQ49r581UQ(new ZHKD3ddbUALiCxl(lTdvNeHFqTsIb9), inflater);
                break;
            default:
                this.vekpFI4d1Nc4fakF = z;
                LTdvNeHFqTsIb9 lTdvNeHFqTsIb10 = new LTdvNeHFqTsIb9();
                this.JXn4Qf7zpnLjP5 = lTdvNeHFqTsIb10;
                Deflater deflater = new Deflater(-1, true);
                this.Ee8d2j4S9Vm5yGuR = deflater;
                this.xDyLpEZyrcKVe0 = new lsjwLzoU12hrEGbpVyI(lTdvNeHFqTsIb10, deflater);
                break;
        }
    }

    private static /* synthetic */ void gtlkkbyjzh() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                ((lsjwLzoU12hrEGbpVyI) this.xDyLpEZyrcKVe0).close();
                break;
            default:
                ((pZpQ49r581UQ) this.xDyLpEZyrcKVe0).close();
                break;
        }
    }
}

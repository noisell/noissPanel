package v.s;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class nun0xIAdZq1q8DxhG5c {
    public final long JXn4Qf7zpnLjP5;
    public final int dDIMxZXP1V8HdM;
    public final long vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public nun0xIAdZq1q8DxhG5c(int i, int i2, long j, long j2) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = i2;
        this.vekpFI4d1Nc4fakF = j;
        this.JXn4Qf7zpnLjP5 = j2;
    }

    public static nun0xIAdZq1q8DxhG5c dDIMxZXP1V8HdM(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            nun0xIAdZq1q8DxhG5c nun0xiadzq1q8dxhg5c = new nun0xIAdZq1q8DxhG5c(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return nun0xiadzq1q8dxhg5c;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private static /* synthetic */ void mbbsbiu() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof nun0xIAdZq1q8DxhG5c)) {
            nun0xIAdZq1q8DxhG5c nun0xiadzq1q8dxhg5c = (nun0xIAdZq1q8DxhG5c) obj;
            if (this.w9sT1Swbhx3hs == nun0xiadzq1q8dxhg5c.w9sT1Swbhx3hs && this.vekpFI4d1Nc4fakF == nun0xiadzq1q8dxhg5c.vekpFI4d1Nc4fakF && this.dDIMxZXP1V8HdM == nun0xiadzq1q8dxhg5c.dDIMxZXP1V8HdM && this.JXn4Qf7zpnLjP5 == nun0xiadzq1q8dxhg5c.JXn4Qf7zpnLjP5) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.w9sT1Swbhx3hs), Long.valueOf(this.vekpFI4d1Nc4fakF), Integer.valueOf(this.dDIMxZXP1V8HdM), Long.valueOf(this.JXn4Qf7zpnLjP5));
    }

    public final void w9sT1Swbhx3hs(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.dDIMxZXP1V8HdM);
            dataOutputStream.writeInt(this.w9sT1Swbhx3hs);
            dataOutputStream.writeLong(this.vekpFI4d1Nc4fakF);
            dataOutputStream.writeLong(this.JXn4Qf7zpnLjP5);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

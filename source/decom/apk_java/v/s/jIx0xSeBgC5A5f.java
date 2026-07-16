package v.s;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class jIx0xSeBgC5A5f implements Runnable {
    public final /* synthetic */ fuhSwJR8Sgz92H vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ jIx0xSeBgC5A5f(fuhSwJR8Sgz92H fuhswjr8sgz92h, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = fuhswjr8sgz92h;
    }

    private static /* synthetic */ void xbovujugv() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                break;
            case 1:
                fuhSwJR8Sgz92H fuhswjr8sgz92h = this.vekpFI4d1Nc4fakF;
                synchronized (fuhswjr8sgz92h) {
                    if (fuhswjr8sgz92h.dDIMxZXP1V8HdM == 1) {
                        fuhswjr8sgz92h.dDIMxZXP1V8HdM("Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                this.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM("Service disconnected");
                return;
        }
        while (true) {
            fuhSwJR8Sgz92H fuhswjr8sgz92h2 = this.vekpFI4d1Nc4fakF;
            synchronized (fuhswjr8sgz92h2) {
                try {
                    if (fuhswjr8sgz92h2.dDIMxZXP1V8HdM != 2) {
                        return;
                    }
                    if (fuhswjr8sgz92h2.JXn4Qf7zpnLjP5.isEmpty()) {
                        fuhswjr8sgz92h2.vekpFI4d1Nc4fakF();
                        return;
                    }
                    wx1uy9kWo2J3 wx1uy9kwo2j3 = (wx1uy9kWo2J3) fuhswjr8sgz92h2.JXn4Qf7zpnLjP5.poll();
                    fuhswjr8sgz92h2.Ee8d2j4S9Vm5yGuR.put(wx1uy9kwo2j3.dDIMxZXP1V8HdM, wx1uy9kwo2j3);
                    fuhswjr8sgz92h2.xDyLpEZyrcKVe0.w9sT1Swbhx3hs.schedule(new UubaJZRp66jTeLre(17, fuhswjr8sgz92h2, wx1uy9kwo2j3, false), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(wx1uy9kwo2j3));
                    }
                    NeMF2Rxt7VnmPi5V neMF2Rxt7VnmPi5V = fuhswjr8sgz92h2.xDyLpEZyrcKVe0;
                    Messenger messenger = fuhswjr8sgz92h2.w9sT1Swbhx3hs;
                    int i = wx1uy9kwo2j3.vekpFI4d1Nc4fakF;
                    Context context = neMF2Rxt7VnmPi5V.dDIMxZXP1V8HdM;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = wx1uy9kwo2j3.dDIMxZXP1V8HdM;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", wx1uy9kwo2j3.dDIMxZXP1V8HdM());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", wx1uy9kwo2j3.JXn4Qf7zpnLjP5);
                    messageObtain.setData(bundle);
                    try {
                        IXBvAqS2fpdIRK iXBvAqS2fpdIRK = fuhswjr8sgz92h2.vekpFI4d1Nc4fakF;
                        Messenger messenger2 = (Messenger) iXBvAqS2fpdIRK.w9sT1Swbhx3hs;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            D3FfxRNDtw22r d3FfxRNDtw22r = (D3FfxRNDtw22r) iXBvAqS2fpdIRK.vekpFI4d1Nc4fakF;
                            if (d3FfxRNDtw22r == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = d3FfxRNDtw22r.w9sT1Swbhx3hs;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        fuhswjr8sgz92h2.dDIMxZXP1V8HdM(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

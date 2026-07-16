package v.s;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class exQloPNkvIFRvh implements Runnable {
    public final /* synthetic */ VdAulbq7zlVjr545h JXn4Qf7zpnLjP5;
    public volatile AtomicInteger vekpFI4d1Nc4fakF = new AtomicInteger(0);
    public final icsq4nzWNlK1KIU2Hp w9sT1Swbhx3hs;

    public exQloPNkvIFRvh(VdAulbq7zlVjr545h vdAulbq7zlVjr545h, icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hp) {
        this.JXn4Qf7zpnLjP5 = vdAulbq7zlVjr545h;
        this.w9sT1Swbhx3hs = icsq4nzwnlk1kiu2hp;
    }

    private static /* synthetic */ void legzamp() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        sp6apkX00TawY02qGY6r sp6apkx00tawy02qgy6r;
        String strConcat = "OkHttp ".concat(((xc6AKez33c65zO) this.JXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).xDyLpEZyrcKVe0());
        VdAulbq7zlVjr545h vdAulbq7zlVjr545h = this.JXn4Qf7zpnLjP5;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            vdAulbq7zlVjr545h.Ee8d2j4S9Vm5yGuR.pyu8ovAipBTLYAiKab();
            int i = 0;
            try {
                try {
                    int i2 = (-94) + 95;
                    try {
                        this.w9sT1Swbhx3hs.Ee8d2j4S9Vm5yGuR(vdAulbq7zlVjr545h.xDyLpEZyrcKVe0());
                        sp6apkx00tawy02qgy6r = vdAulbq7zlVjr545h.w9sT1Swbhx3hs;
                    } catch (IOException e) {
                        e = e;
                        i = i2;
                        if (i != 0) {
                            QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
                            QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS2 = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
                            String str = "Callback failure for " + VdAulbq7zlVjr545h.dDIMxZXP1V8HdM(vdAulbq7zlVjr545h);
                            qnMItFgHCjZ1bOS2.getClass();
                            QnMItFgHCjZ1bOS.pyu8ovAipBTLYAiKab(str, 4, e);
                        } else {
                            ((J1m0XraSkScfWFMIlTC) this.w9sT1Swbhx3hs.w9sT1Swbhx3hs).vekpFI4d1Nc4fakF(e, null);
                        }
                        sp6apkx00tawy02qgy6r = vdAulbq7zlVjr545h.w9sT1Swbhx3hs;
                    } catch (Throwable th) {
                        th = th;
                        i = i2;
                        vdAulbq7zlVjr545h.JXn4Qf7zpnLjP5();
                        if (i == 0) {
                            IOException iOException = new IOException("canceled due to " + th);
                            RIZfHbqXpth8r2yN4.dDIMxZXP1V8HdM(iOException, th);
                            ((J1m0XraSkScfWFMIlTC) this.w9sT1Swbhx3hs.w9sT1Swbhx3hs).vekpFI4d1Nc4fakF(iOException, null);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    vdAulbq7zlVjr545h.w9sT1Swbhx3hs.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            sp6apkx00tawy02qgy6r.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(this);
            threadCurrentThread.setName(name);
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}

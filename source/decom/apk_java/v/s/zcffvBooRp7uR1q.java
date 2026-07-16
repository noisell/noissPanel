package v.s;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class zcffvBooRp7uR1q extends XsD7TIOExRJcOn4m implements mGuhJf2Mcqg8m {
    public final zcffvBooRp7uR1q Ee8d2j4S9Vm5yGuR;
    public final boolean JXn4Qf7zpnLjP5;
    private volatile zcffvBooRp7uR1q _immediate;
    public final Handler vekpFI4d1Nc4fakF;

    public zcffvBooRp7uR1q(Handler handler, boolean z) {
        this.vekpFI4d1Nc4fakF = handler;
        this.JXn4Qf7zpnLjP5 = z;
        this._immediate = z ? this : null;
        zcffvBooRp7uR1q zcffvboorp7ur1q = this._immediate;
        if (zcffvboorp7ur1q == null) {
            zcffvboorp7ur1q = new zcffvBooRp7uR1q(handler, true);
            this._immediate = zcffvboorp7ur1q;
        }
        this.Ee8d2j4S9Vm5yGuR = zcffvboorp7ur1q;
    }

    @Override // v.s.XsD7TIOExRJcOn4m
    public final boolean O2DHNSIGZlgPja7eqLgn() {
        return (this.JXn4Qf7zpnLjP5 && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(Looper.myLooper(), this.vekpFI4d1Nc4fakF.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zcffvBooRp7uR1q) && ((zcffvBooRp7uR1q) obj).vekpFI4d1Nc4fakF == this.vekpFI4d1Nc4fakF;
    }

    public final int hashCode() {
        return System.identityHashCode(this.vekpFI4d1Nc4fakF);
    }

    @Override // v.s.mGuhJf2Mcqg8m
    public final void hjneShqpF9Tis4(long j, hD886kxBkce8U hd886kxbkce8u) {
        UubaJZRp66jTeLre uubaJZRp66jTeLre = new UubaJZRp66jTeLre(1, hd886kxbkce8u, this, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.vekpFI4d1Nc4fakF.postDelayed(uubaJZRp66jTeLre, j)) {
            hd886kxbkce8u.H9XlUr4OeMJFiXK(new tqMsvBGMHi2d1wCf3x(this, 2, uubaJZRp66jTeLre));
        } else {
            xfn2GJwmGqs7kWW(hd886kxbkce8u.xDyLpEZyrcKVe0, uubaJZRp66jTeLre);
        }
    }

    @Override // v.s.XsD7TIOExRJcOn4m
    public final String toString() {
        zcffvBooRp7uR1q zcffvboorp7ur1q;
        String str;
        AqltFduMByzMV4g aqltFduMByzMV4g = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
        zcffvBooRp7uR1q zcffvboorp7ur1q2 = lApLnElOE7s0Fsy.dDIMxZXP1V8HdM;
        if (this == zcffvboorp7ur1q2) {
            str = "Dispatchers.Main";
        } else {
            try {
                zcffvboorp7ur1q = zcffvboorp7ur1q2.Ee8d2j4S9Vm5yGuR;
            } catch (UnsupportedOperationException unused) {
                zcffvboorp7ur1q = null;
            }
            str = this == zcffvboorp7ur1q ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.vekpFI4d1Nc4fakF.toString();
        return this.JXn4Qf7zpnLjP5 ? Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(string, ".immediate") : string;
    }

    @Override // v.s.XsD7TIOExRJcOn4m
    public final void vIJudZvPyTuNp(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Runnable runnable) {
        if (this.vekpFI4d1Nc4fakF.post(runnable)) {
            return;
        }
        xfn2GJwmGqs7kWW(cptq2xmcb5jsaehn, runnable);
    }

    public final void xfn2GJwmGqs7kWW(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        WGrwEyVqR28VYxamRhIg wGrwEyVqR28VYxamRhIg = (WGrwEyVqR28VYxamRhIg) cptq2xmcb5jsaehn.D5P1xCAyuvgF(fadfsJa4iEdiwEC4Xm8.b1EoSIRjJHO5);
        if (wGrwEyVqR28VYxamRhIg != null) {
            wGrwEyVqR28VYxamRhIg.vekpFI4d1Nc4fakF(cancellationException);
        }
        umMdYoePNXvWWPn.w9sT1Swbhx3hs.vIJudZvPyTuNp(cptq2xmcb5jsaehn, runnable);
    }
}

package androidx.work;

import android.content.Context;
import v.s.Af6wX3D8R2iFhqxr;
import v.s.AqltFduMByzMV4g;
import v.s.NTq6GnI9WZIP8Nuz;
import v.s.OFMrQsTe5s1KYV0lq;
import v.s.Qa4pJoqqkp7u;
import v.s.R1oztwybM9zU2mqV;
import v.s.dEuDk0RLJ79RBD8fz4WE;
import v.s.eoUwMTDTg3dRNUqWJq3;
import v.s.eyavN4VgkDpngkAKt;
import v.s.f58wUe2vbJhag6PETTG;
import v.s.hzCVl0f866ksvpzUUql;
import v.s.jb8et6SZeK5TWMrJFxDX;
import v.s.umMdYoePNXvWWPn;
import v.s.y6jRGLEWNMir;
import v.s.z17cwwEfkgV0Mm5Z;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class CoroutineWorker extends Qa4pJoqqkp7u {
    public final z17cwwEfkgV0Mm5Z Ee8d2j4S9Vm5yGuR;
    public final AqltFduMByzMV4g ibVTtJUNfrGYbW;
    public final Af6wX3D8R2iFhqxr xDyLpEZyrcKVe0;

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.Ee8d2j4S9Vm5yGuR = new z17cwwEfkgV0Mm5Z();
        Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr = new Af6wX3D8R2iFhqxr();
        this.xDyLpEZyrcKVe0 = af6wX3D8R2iFhqxr;
        af6wX3D8R2iFhqxr.dDIMxZXP1V8HdM(new hzCVl0f866ksvpzUUql(8, this), (NTq6GnI9WZIP8Nuz) workerParameters.Ee8d2j4S9Vm5yGuR.dDIMxZXP1V8HdM);
        this.ibVTtJUNfrGYbW = umMdYoePNXvWWPn.dDIMxZXP1V8HdM;
    }

    private static /* synthetic */ void zsbahyuhj() {
    }

    @Override // v.s.Qa4pJoqqkp7u
    public final Af6wX3D8R2iFhqxr JXn4Qf7zpnLjP5() {
        AqltFduMByzMV4g aqltFduMByzMV4g = this.ibVTtJUNfrGYbW;
        aqltFduMByzMV4g.getClass();
        y6jRGLEWNMir.b1EoSIRjJHO5(jb8et6SZeK5TWMrJFxDX.dDIMxZXP1V8HdM(OFMrQsTe5s1KYV0lq.MLSIo1htfMPWeB8V876L(aqltFduMByzMV4g, this.Ee8d2j4S9Vm5yGuR)), null, new eyavN4VgkDpngkAKt(this, null, 1), 3);
        return this.xDyLpEZyrcKVe0;
    }

    @Override // v.s.Qa4pJoqqkp7u
    public final R1oztwybM9zU2mqV dDIMxZXP1V8HdM() {
        z17cwwEfkgV0Mm5Z z17cwwefkgv0mm5z = new z17cwwEfkgV0Mm5Z();
        AqltFduMByzMV4g aqltFduMByzMV4g = this.ibVTtJUNfrGYbW;
        aqltFduMByzMV4g.getClass();
        f58wUe2vbJhag6PETTG f58wue2vbjhag6pettgDDIMxZXP1V8HdM = jb8et6SZeK5TWMrJFxDX.dDIMxZXP1V8HdM(OFMrQsTe5s1KYV0lq.MLSIo1htfMPWeB8V876L(aqltFduMByzMV4g, z17cwwefkgv0mm5z));
        dEuDk0RLJ79RBD8fz4WE deudk0rlj79rbd8fz4we = new dEuDk0RLJ79RBD8fz4WE(z17cwwefkgv0mm5z);
        y6jRGLEWNMir.b1EoSIRjJHO5(f58wue2vbjhag6pettgDDIMxZXP1V8HdM, null, new eoUwMTDTg3dRNUqWJq3(deudk0rlj79rbd8fz4we, this, null, 2), 3);
        return deudk0rlj79rbd8fz4we;
    }

    @Override // v.s.Qa4pJoqqkp7u
    public final void vekpFI4d1Nc4fakF() {
        this.xDyLpEZyrcKVe0.cancel(false);
    }

    public abstract Object xDyLpEZyrcKVe0();
}

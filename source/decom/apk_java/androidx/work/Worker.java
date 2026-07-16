package androidx.work;

import android.content.Context;
import v.s.Af6wX3D8R2iFhqxr;
import v.s.MdvPnR06eW9Un0O;
import v.s.Qa4pJoqqkp7u;
import v.s.R1oztwybM9zU2mqV;
import v.s.UubaJZRp66jTeLre;
import v.s.YqOiSVb2wSv9Lq63qb;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class Worker extends Qa4pJoqqkp7u {
    public Af6wX3D8R2iFhqxr Ee8d2j4S9Vm5yGuR;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // v.s.Qa4pJoqqkp7u
    public final Af6wX3D8R2iFhqxr JXn4Qf7zpnLjP5() {
        this.Ee8d2j4S9Vm5yGuR = new Af6wX3D8R2iFhqxr();
        this.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5.execute(new YqOiSVb2wSv9Lq63qb(10, this));
        return this.Ee8d2j4S9Vm5yGuR;
    }

    @Override // v.s.Qa4pJoqqkp7u
    public final R1oztwybM9zU2mqV dDIMxZXP1V8HdM() {
        Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr = new Af6wX3D8R2iFhqxr();
        this.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5.execute(new UubaJZRp66jTeLre(this, 9, af6wX3D8R2iFhqxr));
        return af6wX3D8R2iFhqxr;
    }

    public abstract MdvPnR06eW9Un0O xDyLpEZyrcKVe0();
}

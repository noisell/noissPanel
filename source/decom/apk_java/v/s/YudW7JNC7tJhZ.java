package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class YudW7JNC7tJhZ extends Ndz86LBW9Rzz {
    private volatile boolean threadLocalIsSet;
    public final ThreadLocal xDyLpEZyrcKVe0;

    /* JADX WARN: Illegal instructions before constructor call */
    public YudW7JNC7tJhZ(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        xTp7AWKejEh5 xtp7awkejeh5 = xTp7AWKejEh5.w9sT1Swbhx3hs;
        super(cptq2xmcb5jsaehn.D5P1xCAyuvgF(xtp7awkejeh5) == null ? cptq2xmcb5jsaehn.EWUjsTERgdPbSw3NNlN(xtp7awkejeh5) : cptq2xmcb5jsaehn, cWIOrUfHtKyaxQib0W);
        this.xDyLpEZyrcKVe0 = new ThreadLocal();
        if (cWIOrUfHtKyaxQib0W.vekpFI4d1Nc4fakF.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF) instanceof XsD7TIOExRJcOn4m) {
            return;
        }
        Object objTne6mXOUFKdd = SbxdZ6Kq2uhHQ5RPRqm.tne6mXOUFKdd(cptq2xmcb5jsaehn, null);
        SbxdZ6Kq2uhHQ5RPRqm.vIJudZvPyTuNp(cptq2xmcb5jsaehn, objTne6mXOUFKdd);
        JW3Lh9hxwLsO2ArTlH(cptq2xmcb5jsaehn, objTne6mXOUFKdd);
    }

    private static /* synthetic */ void vivaco() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean GiffeZJ1rbwyx() {
        int i = (-44) + 45;
        int i2 = (this.threadLocalIsSet && this.xDyLpEZyrcKVe0.get() == null) ? i : 0;
        this.xDyLpEZyrcKVe0.remove();
        return i2 ^ i;
    }

    public final void JW3Lh9hxwLsO2ArTlH(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Object obj) {
        this.threadLocalIsSet = true;
        this.xDyLpEZyrcKVe0.set(new yI1KTRoNlsjx(cptq2xmcb5jsaehn, obj));
    }

    @Override // v.s.Ndz86LBW9Rzz, v.s.LPqJFMbrw2n1o
    public final void wotphlvK9sPbXJ(Object obj) {
        if (this.threadLocalIsSet) {
            yI1KTRoNlsjx yi1ktronlsjx = (yI1KTRoNlsjx) this.xDyLpEZyrcKVe0.get();
            if (yi1ktronlsjx != null) {
                SbxdZ6Kq2uhHQ5RPRqm.vIJudZvPyTuNp((cpTq2XMCb5JSaEhn) yi1ktronlsjx.w9sT1Swbhx3hs, yi1ktronlsjx.vekpFI4d1Nc4fakF);
            }
            this.xDyLpEZyrcKVe0.remove();
        }
        Object objO2DHNSIGZlgPja7eqLgn = FZ1sl4mHq4J0hOEYC.O2DHNSIGZlgPja7eqLgn(obj);
        b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q = this.Ee8d2j4S9Vm5yGuR;
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehnXDyLpEZyrcKVe0 = b9xroaxfr1fmoo2q.xDyLpEZyrcKVe0();
        Object objTne6mXOUFKdd = SbxdZ6Kq2uhHQ5RPRqm.tne6mXOUFKdd(cptq2xmcb5jsaehnXDyLpEZyrcKVe0, null);
        YudW7JNC7tJhZ yudW7JNC7tJhZIUQk66nAiXgO35 = objTne6mXOUFKdd != SbxdZ6Kq2uhHQ5RPRqm.vekpFI4d1Nc4fakF ? OFtLBiBbrrTHWu.iUQk66nAiXgO35(b9xroaxfr1fmoo2q, cptq2xmcb5jsaehnXDyLpEZyrcKVe0, objTne6mXOUFKdd) : null;
        try {
            this.Ee8d2j4S9Vm5yGuR.ibVTtJUNfrGYbW(objO2DHNSIGZlgPja7eqLgn);
        } finally {
            if (yudW7JNC7tJhZIUQk66nAiXgO35 == null || yudW7JNC7tJhZIUQk66nAiXgO35.GiffeZJ1rbwyx()) {
                SbxdZ6Kq2uhHQ5RPRqm.vIJudZvPyTuNp(cptq2xmcb5jsaehnXDyLpEZyrcKVe0, objTne6mXOUFKdd);
            }
        }
    }
}

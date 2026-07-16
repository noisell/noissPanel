package v.s;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class oT0hSL7wye6TP1X12yCL extends iCNHb4Pr9dcL1 implements Executor {
    public static final XsD7TIOExRJcOn4m JXn4Qf7zpnLjP5;
    public static final oT0hSL7wye6TP1X12yCL vekpFI4d1Nc4fakF = new oT0hSL7wye6TP1X12yCL();

    static {
        XsD7TIOExRJcOn4m acfqraetrlmsdbxz = VcXtsPqXIQefFtYUZ.vekpFI4d1Nc4fakF;
        int i = RN3oZ7h5zHy79TdFsDfo.dDIMxZXP1V8HdM;
        if (64 >= i) {
            i = 64;
        }
        int iYTljMGnIibTRdOpSh4 = OFMrQsTe5s1KYV0lq.yTljMGnIibTRdOpSh4("kotlinx.coroutines.io.parallelism", i, 12);
        if (iYTljMGnIibTRdOpSh4 < 1) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("Expected positive parallelism level, but got ", iYTljMGnIibTRdOpSh4).toString());
        }
        if (iYTljMGnIibTRdOpSh4 < PdgYASR7b2Di.JXn4Qf7zpnLjP5) {
            if (iYTljMGnIibTRdOpSh4 < 1) {
                throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("Expected positive parallelism level, but got ", iYTljMGnIibTRdOpSh4).toString());
            }
            acfqraetrlmsdbxz = new aCFQrAetrLmSDBXZ(iYTljMGnIibTRdOpSh4);
        }
        JXn4Qf7zpnLjP5 = acfqraetrlmsdbxz;
    }

    private static /* synthetic */ void nqbmbbmwtu() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        vIJudZvPyTuNp(sNACkioAJERo.w9sT1Swbhx3hs, runnable);
    }

    @Override // v.s.XsD7TIOExRJcOn4m
    public final void rCHnHJBAlOpNI5(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Runnable runnable) {
        JXn4Qf7zpnLjP5.rCHnHJBAlOpNI5(cptq2xmcb5jsaehn, runnable);
    }

    @Override // v.s.XsD7TIOExRJcOn4m
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // v.s.XsD7TIOExRJcOn4m
    public final void vIJudZvPyTuNp(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Runnable runnable) {
        JXn4Qf7zpnLjP5.vIJudZvPyTuNp(cptq2xmcb5jsaehn, runnable);
    }
}

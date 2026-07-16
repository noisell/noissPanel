package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class JYn3foLRPO8BbEAlsg6f extends XsD7TIOExRJcOn4m {
    public qnm6iqPQy0KTns5Pe Ee8d2j4S9Vm5yGuR;
    public boolean JXn4Qf7zpnLjP5;
    public long vekpFI4d1Nc4fakF;

    private static /* synthetic */ void gwkhrtpi() {
    }

    public final void ECwLkmPW1UKz7J6E(boolean z) {
        this.vekpFI4d1Nc4fakF = (z ? 4294967296L : 1L) + this.vekpFI4d1Nc4fakF;
        if (z) {
            return;
        }
        this.JXn4Qf7zpnLjP5 = true;
    }

    public final boolean XuO9PPFo607ssKwZjNW() {
        qnm6iqPQy0KTns5Pe qnm6iqpqy0ktns5pe = this.Ee8d2j4S9Vm5yGuR;
        if (qnm6iqpqy0ktns5pe == null) {
            return false;
        }
        KGpgQH6viQ5JszZ kGpgQH6viQ5JszZ = (KGpgQH6viQ5JszZ) (qnm6iqpqy0ktns5pe.isEmpty() ? null : qnm6iqpqy0ktns5pe.removeFirst());
        if (kGpgQH6viQ5JszZ == null) {
            return false;
        }
        kGpgQH6viQ5JszZ.run();
        return true;
    }

    public abstract Thread fivkjwgu2UdAtiY();

    public void hV4VTKNUdeHN(long j, TzeEusHMi207TE tzeEusHMi207TE) {
        TPn79U74HIyAMBnIr.pyu8ovAipBTLYAiKab.qfTrc75xwRVMl85vh(j, tzeEusHMi207TE);
    }

    public abstract long iUQk66nAiXgO35();

    public abstract void shutdown();

    public final void tne6mXOUFKdd(KGpgQH6viQ5JszZ kGpgQH6viQ5JszZ) {
        qnm6iqPQy0KTns5Pe qnm6iqpqy0ktns5pe = this.Ee8d2j4S9Vm5yGuR;
        if (qnm6iqpqy0ktns5pe == null) {
            qnm6iqpqy0ktns5pe = new qnm6iqPQy0KTns5Pe();
            this.Ee8d2j4S9Vm5yGuR = qnm6iqpqy0ktns5pe;
        }
        qnm6iqpqy0ktns5pe.addLast(kGpgQH6viQ5JszZ);
    }

    public final void xfn2GJwmGqs7kWW(boolean z) {
        long j = this.vekpFI4d1Nc4fakF - (z ? 4294967296L : 1L);
        this.vekpFI4d1Nc4fakF = j;
        if (j <= 0 && this.JXn4Qf7zpnLjP5) {
            shutdown();
        }
    }
}

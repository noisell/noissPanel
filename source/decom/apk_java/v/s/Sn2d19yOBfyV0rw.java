package v.s;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Sn2d19yOBfyV0rw extends O162WzpEtUgucWBV implements Map {
    public KiJnEjpAshEhOuno pyu8ovAipBTLYAiKab;

    private static /* synthetic */ void pnpkquaa() {
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.pyu8ovAipBTLYAiKab == null) {
            this.pyu8ovAipBTLYAiKab = new KiJnEjpAshEhOuno(0, this);
        }
        KiJnEjpAshEhOuno kiJnEjpAshEhOuno = this.pyu8ovAipBTLYAiKab;
        if (((qVploWEHLHHn3N23EK) kiJnEjpAshEhOuno.dDIMxZXP1V8HdM) == null) {
            kiJnEjpAshEhOuno.dDIMxZXP1V8HdM = new qVploWEHLHHn3N23EK(kiJnEjpAshEhOuno, 0);
        }
        return (qVploWEHLHHn3N23EK) kiJnEjpAshEhOuno.dDIMxZXP1V8HdM;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.pyu8ovAipBTLYAiKab == null) {
            this.pyu8ovAipBTLYAiKab = new KiJnEjpAshEhOuno(0, this);
        }
        KiJnEjpAshEhOuno kiJnEjpAshEhOuno = this.pyu8ovAipBTLYAiKab;
        if (((qVploWEHLHHn3N23EK) kiJnEjpAshEhOuno.w9sT1Swbhx3hs) == null) {
            kiJnEjpAshEhOuno.w9sT1Swbhx3hs = new qVploWEHLHHn3N23EK(kiJnEjpAshEhOuno, 1);
        }
        return (qVploWEHLHHn3N23EK) kiJnEjpAshEhOuno.w9sT1Swbhx3hs;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.JXn4Qf7zpnLjP5;
        int i = this.JXn4Qf7zpnLjP5;
        int[] iArr = this.w9sT1Swbhx3hs;
        if (iArr.length < size) {
            Object[] objArr = this.vekpFI4d1Nc4fakF;
            dDIMxZXP1V8HdM(size);
            if (this.JXn4Qf7zpnLjP5 > 0) {
                System.arraycopy(iArr, 0, this.w9sT1Swbhx3hs, 0, i);
                System.arraycopy(objArr, 0, this.vekpFI4d1Nc4fakF, 0, i << 1);
            }
            O162WzpEtUgucWBV.w9sT1Swbhx3hs(iArr, objArr, i);
        }
        if (this.JXn4Qf7zpnLjP5 != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.pyu8ovAipBTLYAiKab == null) {
            this.pyu8ovAipBTLYAiKab = new KiJnEjpAshEhOuno(0, this);
        }
        KiJnEjpAshEhOuno kiJnEjpAshEhOuno = this.pyu8ovAipBTLYAiKab;
        if (((PMsMcTnvHIztNmoglJr) kiJnEjpAshEhOuno.vekpFI4d1Nc4fakF) == null) {
            kiJnEjpAshEhOuno.vekpFI4d1Nc4fakF = new PMsMcTnvHIztNmoglJr(kiJnEjpAshEhOuno);
        }
        return (PMsMcTnvHIztNmoglJr) kiJnEjpAshEhOuno.vekpFI4d1Nc4fakF;
    }
}

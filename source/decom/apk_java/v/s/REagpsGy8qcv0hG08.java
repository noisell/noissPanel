package v.s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class REagpsGy8qcv0hG08 extends GRPcLaQWtuGXi1HP7 {
    public static final AtomicReferenceFieldUpdater dDIMxZXP1V8HdM = AtomicReferenceFieldUpdater.newUpdater(REagpsGy8qcv0hG08.class, Object.class, "_consensus");
    private volatile Object _consensus = gA5gCwTK0qjTIn.dDIMxZXP1V8HdM;

    @Override // v.s.GRPcLaQWtuGXi1HP7
    public final Object dDIMxZXP1V8HdM(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dDIMxZXP1V8HdM;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = gA5gCwTK0qjTIn.dDIMxZXP1V8HdM;
        if (obj2 == o0rn3ekjbj6kkwok) {
            o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwokVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == o0rn3ekjbj6kkwok) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, o0rn3ekjbj6kkwok, o0rn3ekjbj6kkwokVekpFI4d1Nc4fakF)) {
                    if (atomicReferenceFieldUpdater.get(this) != o0rn3ekjbj6kkwok) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = o0rn3ekjbj6kkwokVekpFI4d1Nc4fakF;
            }
        }
        w9sT1Swbhx3hs(obj, obj2);
        return obj2;
    }

    public abstract o0rN3ekjBJ6kKwok vekpFI4d1Nc4fakF(Object obj);

    public abstract void w9sT1Swbhx3hs(Object obj, Object obj2);
}

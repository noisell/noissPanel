package v.s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class lTvXDdEqiCIXojiLB extends Xmmn1A4TQOiVOB implements ZZ4JSe5sYVMN33b7 {
    public static final AtomicReferenceFieldUpdater Ee8d2j4S9Vm5yGuR = AtomicReferenceFieldUpdater.newUpdater(lTvXDdEqiCIXojiLB.class, Object.class, "owner");
    private volatile Object owner = RIZfHbqXpth8r2yN4.w9sT1Swbhx3hs;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(gA5gCwTK0qjTIn.pyu8ovAipBTLYAiKab(this));
        sb.append("[isLocked=");
        sb.append(Math.max(Xmmn1A4TQOiVOB.JXn4Qf7zpnLjP5.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(Ee8d2j4S9Vm5yGuR.get(this));
        sb.append(']');
        return sb.toString();
    }
}

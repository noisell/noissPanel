package v.s;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class J4oFIJEn5DDil2 extends endHZiILsQwz {
    public final AtomicReferenceArray ibVTtJUNfrGYbW;
    public final HT6Px2xDdrmDEbykyYy xDyLpEZyrcKVe0;

    public J4oFIJEn5DDil2(long j, J4oFIJEn5DDil2 j4oFIJEn5DDil2, HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy, int i) {
        super(j, j4oFIJEn5DDil2, i);
        this.xDyLpEZyrcKVe0 = hT6Px2xDdrmDEbykyYy;
        this.ibVTtJUNfrGYbW = new AtomicReferenceArray(LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs * 2);
    }

    public final boolean D5P1xCAyuvgF(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.ibVTtJUNfrGYbW;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final void gIIiyi2ddlMDR0(int i, Object obj) {
        this.ibVTtJUNfrGYbW.lazySet(i * 2, obj);
    }

    public final void gmNWMfvn6zlEj(int i, boolean z) {
        if (z) {
            this.xDyLpEZyrcKVe0.fivkjwgu2UdAtiY((this.JXn4Qf7zpnLjP5 * ((long) LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs)) + ((long) i));
        }
        b1EoSIRjJHO5();
    }

    public final Object hjneShqpF9Tis4(int i) {
        return this.ibVTtJUNfrGYbW.get((i * 2) + 1);
    }

    @Override // v.s.endHZiILsQwz
    public final void ibVTtJUNfrGYbW(int i, cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn) {
        HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy;
        int i2 = LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.ibVTtJUNfrGYbW.get(i * 2);
        while (true) {
            Object objHjneShqpF9Tis4 = hjneShqpF9Tis4(i);
            boolean z2 = objHjneShqpF9Tis4 instanceof S1QQVRz2bJQ7;
            hT6Px2xDdrmDEbykyYy = this.xDyLpEZyrcKVe0;
            if (z2 || (objHjneShqpF9Tis4 instanceof OGXArWikeWfH)) {
                if (D5P1xCAyuvgF(objHjneShqpF9Tis4, i, z ? LYgmvfM6ccmccA0DV.D5P1xCAyuvgF : LYgmvfM6ccmccA0DV.hjneShqpF9Tis4)) {
                    gIIiyi2ddlMDR0(i, null);
                    gmNWMfvn6zlEj(i, !z);
                    if (z) {
                        hT6Px2xDdrmDEbykyYy.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objHjneShqpF9Tis4 == LYgmvfM6ccmccA0DV.D5P1xCAyuvgF || objHjneShqpF9Tis4 == LYgmvfM6ccmccA0DV.hjneShqpF9Tis4) {
                    break;
                }
                if (objHjneShqpF9Tis4 != LYgmvfM6ccmccA0DV.ibVTtJUNfrGYbW && objHjneShqpF9Tis4 != LYgmvfM6ccmccA0DV.xDyLpEZyrcKVe0) {
                    if (objHjneShqpF9Tis4 == LYgmvfM6ccmccA0DV.pyu8ovAipBTLYAiKab || objHjneShqpF9Tis4 == LYgmvfM6ccmccA0DV.JXn4Qf7zpnLjP5 || objHjneShqpF9Tis4 == LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objHjneShqpF9Tis4).toString());
                }
            }
        }
        gIIiyi2ddlMDR0(i, null);
        if (z) {
            hT6Px2xDdrmDEbykyYy.getClass();
        }
    }

    public final void wotphlvK9sPbXJ(int i, Object obj) {
        this.ibVTtJUNfrGYbW.set((i * 2) + 1, obj);
    }

    @Override // v.s.endHZiILsQwz
    public final int xDyLpEZyrcKVe0() {
        return LYgmvfM6ccmccA0DV.w9sT1Swbhx3hs;
    }
}

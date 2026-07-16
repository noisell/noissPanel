package v.s;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class IcZQaQ1dQIeHVmGNCLL6 extends JYn3foLRPO8BbEAlsg6f implements mGuhJf2Mcqg8m {
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;
    public static final AtomicReferenceFieldUpdater xDyLpEZyrcKVe0 = AtomicReferenceFieldUpdater.newUpdater(IcZQaQ1dQIeHVmGNCLL6.class, Object.class, "_queue");
    public static final AtomicReferenceFieldUpdater ibVTtJUNfrGYbW = AtomicReferenceFieldUpdater.newUpdater(IcZQaQ1dQIeHVmGNCLL6.class, Object.class, "_delayed");
    public static final AtomicIntegerFieldUpdater b1EoSIRjJHO5 = AtomicIntegerFieldUpdater.newUpdater(IcZQaQ1dQIeHVmGNCLL6.class, "_isCompleted");

    private static /* synthetic */ void rgcmfaojj() {
    }

    public final boolean A1BaTVAMeIXMnh(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = xDyLpEZyrcKVe0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (b1EoSIRjJHO5.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof SuHLYifsJeVfKaZh9R)) {
                if (obj == OFMrQsTe5s1KYV0lq.vekpFI4d1Nc4fakF) {
                    return false;
                }
                SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9R = new SuHLYifsJeVfKaZh9R((-77) + 85, true);
                suHLYifsJeVfKaZh9R.dDIMxZXP1V8HdM((Runnable) obj);
                suHLYifsJeVfKaZh9R.dDIMxZXP1V8HdM(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, suHLYifsJeVfKaZh9R)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9R2 = (SuHLYifsJeVfKaZh9R) obj;
            int iDDIMxZXP1V8HdM = suHLYifsJeVfKaZh9R2.dDIMxZXP1V8HdM(runnable);
            if (iDDIMxZXP1V8HdM == 0) {
                return true;
            }
            if (iDDIMxZXP1V8HdM == 1) {
                SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF = suHLYifsJeVfKaZh9R2.vekpFI4d1Nc4fakF();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iDDIMxZXP1V8HdM == 2) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:22:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    public final boolean euF5Udt5Rqv3Qmea() {
        Object obj;
        long j;
        qnm6iqPQy0KTns5Pe qnm6iqpqy0ktns5pe = this.Ee8d2j4S9Vm5yGuR;
        if (qnm6iqpqy0ktns5pe != null ? qnm6iqpqy0ktns5pe.isEmpty() : true) {
            f13op62NCrgMb8IPpQhI f13op62ncrgmb8ippqhi = (f13op62NCrgMb8IPpQhI) ibVTtJUNfrGYbW.get(this);
            if (f13op62ncrgmb8ippqhi == null) {
                obj = xDyLpEZyrcKVe0.get(this);
                if (obj != null) {
                    if (obj instanceof SuHLYifsJeVfKaZh9R) {
                        j = SuHLYifsJeVfKaZh9R.xDyLpEZyrcKVe0.get((SuHLYifsJeVfKaZh9R) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> (129 - 99)))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == OFMrQsTe5s1KYV0lq.vekpFI4d1Nc4fakF) {
                    }
                }
                return true;
            }
            if (Q2lEaKSVZGE9bu0igCo.w9sT1Swbhx3hs.get(f13op62ncrgmb8ippqhi) == 0) {
                obj = xDyLpEZyrcKVe0.get(this);
                if (obj != null) {
                    if (obj instanceof SuHLYifsJeVfKaZh9R) {
                        j = SuHLYifsJeVfKaZh9R.xDyLpEZyrcKVe0.get((SuHLYifsJeVfKaZh9R) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> (129 - 99)))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == OFMrQsTe5s1KYV0lq.vekpFI4d1Nc4fakF) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // v.s.mGuhJf2Mcqg8m
    public final void hjneShqpF9Tis4(long j, hD886kxBkce8U hd886kxbkce8u) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            CSRsULpNTLZDl cSRsULpNTLZDl = new CSRsULpNTLZDl(this, j2 + jNanoTime, hd886kxbkce8u);
            qfTrc75xwRVMl85vh(jNanoTime, cSRsULpNTLZDl);
            hd886kxbkce8u.H9XlUr4OeMJFiXK(new LR2N3RA8S6gSP2jwUGa(1, cSRsULpNTLZDl));
        }
    }

    @Override // v.s.JYn3foLRPO8BbEAlsg6f
    public final long iUQk66nAiXgO35() {
        Runnable runnable;
        TzeEusHMi207TE tzeEusHMi207TE;
        TzeEusHMi207TE tzeEusHMi207TEW9sT1Swbhx3hs;
        if (!XuO9PPFo607ssKwZjNW()) {
            f13op62NCrgMb8IPpQhI f13op62ncrgmb8ippqhi = (f13op62NCrgMb8IPpQhI) ibVTtJUNfrGYbW.get(this);
            if (f13op62ncrgmb8ippqhi != null && Q2lEaKSVZGE9bu0igCo.w9sT1Swbhx3hs.get(f13op62ncrgmb8ippqhi) != 0) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (f13op62ncrgmb8ippqhi) {
                        try {
                            TzeEusHMi207TE[] tzeEusHMi207TEArr = f13op62ncrgmb8ippqhi.dDIMxZXP1V8HdM;
                            TzeEusHMi207TE tzeEusHMi207TE2 = tzeEusHMi207TEArr != null ? tzeEusHMi207TEArr[0] : null;
                            if (tzeEusHMi207TE2 == null) {
                                tzeEusHMi207TEW9sT1Swbhx3hs = null;
                            } else {
                                tzeEusHMi207TEW9sT1Swbhx3hs = ((jNanoTime - tzeEusHMi207TE2.w9sT1Swbhx3hs) > 0L ? 1 : ((jNanoTime - tzeEusHMi207TE2.w9sT1Swbhx3hs) == 0L ? 0 : -1)) >= 0 ? A1BaTVAMeIXMnh(tzeEusHMi207TE2) : false ? f13op62ncrgmb8ippqhi.w9sT1Swbhx3hs(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (tzeEusHMi207TEW9sT1Swbhx3hs != null);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = xDyLpEZyrcKVe0;
            loop1: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof SuHLYifsJeVfKaZh9R) {
                        SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9R = (SuHLYifsJeVfKaZh9R) obj;
                        Object objJXn4Qf7zpnLjP5 = suHLYifsJeVfKaZh9R.JXn4Qf7zpnLjP5();
                        if (objJXn4Qf7zpnLjP5 != SuHLYifsJeVfKaZh9R.ibVTtJUNfrGYbW) {
                            runnable = (Runnable) objJXn4Qf7zpnLjP5;
                            break;
                        }
                        SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF = suHLYifsJeVfKaZh9R.vekpFI4d1Nc4fakF();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, suHLYifsJeVfKaZh9RVekpFI4d1Nc4fakF) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != OFMrQsTe5s1KYV0lq.vekpFI4d1Nc4fakF) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            qnm6iqPQy0KTns5Pe qnm6iqpqy0ktns5pe = this.Ee8d2j4S9Vm5yGuR;
            if (((qnm6iqpqy0ktns5pe == null || qnm6iqpqy0ktns5pe.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = xDyLpEZyrcKVe0.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof SuHLYifsJeVfKaZh9R) {
                        long j = SuHLYifsJeVfKaZh9R.xDyLpEZyrcKVe0.get((SuHLYifsJeVfKaZh9R) obj2);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                        }
                    } else if (obj2 == OFMrQsTe5s1KYV0lq.vekpFI4d1Nc4fakF) {
                        return Long.MAX_VALUE;
                    }
                }
                f13op62NCrgMb8IPpQhI f13op62ncrgmb8ippqhi2 = (f13op62NCrgMb8IPpQhI) ibVTtJUNfrGYbW.get(this);
                if (f13op62ncrgmb8ippqhi2 != null) {
                    synchronized (f13op62ncrgmb8ippqhi2) {
                        TzeEusHMi207TE[] tzeEusHMi207TEArr2 = f13op62ncrgmb8ippqhi2.dDIMxZXP1V8HdM;
                        tzeEusHMi207TE = tzeEusHMi207TEArr2 != null ? tzeEusHMi207TEArr2[0] : null;
                    }
                    if (tzeEusHMi207TE != null) {
                        long jNanoTime2 = tzeEusHMi207TE.w9sT1Swbhx3hs - System.nanoTime();
                        if (jNanoTime2 >= 0) {
                            return jNanoTime2;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void k84rwRrqzhrNQ1CdNQ9(Runnable runnable) {
        if (!A1BaTVAMeIXMnh(runnable)) {
            TPn79U74HIyAMBnIr.pyu8ovAipBTLYAiKab.k84rwRrqzhrNQ1CdNQ9(runnable);
            return;
        }
        Thread threadFivkjwgu2UdAtiY = fivkjwgu2UdAtiY();
        if (Thread.currentThread() != threadFivkjwgu2UdAtiY) {
            LockSupport.unpark(threadFivkjwgu2UdAtiY);
        }
    }

    public final void qfTrc75xwRVMl85vh(long j, TzeEusHMi207TE tzeEusHMi207TE) {
        int iDDIMxZXP1V8HdM;
        Thread threadFivkjwgu2UdAtiY;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ibVTtJUNfrGYbW;
        TzeEusHMi207TE tzeEusHMi207TE2 = null;
        if (b1EoSIRjJHO5.get(this) != 0) {
            iDDIMxZXP1V8HdM = 1;
        } else {
            f13op62NCrgMb8IPpQhI f13op62ncrgmb8ippqhi = (f13op62NCrgMb8IPpQhI) atomicReferenceFieldUpdater.get(this);
            if (f13op62ncrgmb8ippqhi == null) {
                f13op62NCrgMb8IPpQhI f13op62ncrgmb8ippqhi2 = new f13op62NCrgMb8IPpQhI();
                f13op62ncrgmb8ippqhi2.vekpFI4d1Nc4fakF = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, f13op62ncrgmb8ippqhi2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                f13op62ncrgmb8ippqhi = (f13op62NCrgMb8IPpQhI) atomicReferenceFieldUpdater.get(this);
            }
            iDDIMxZXP1V8HdM = tzeEusHMi207TE.dDIMxZXP1V8HdM(j, f13op62ncrgmb8ippqhi, this);
        }
        if (iDDIMxZXP1V8HdM != 0) {
            if (iDDIMxZXP1V8HdM == 1) {
                hV4VTKNUdeHN(j, tzeEusHMi207TE);
                return;
            } else {
                if (iDDIMxZXP1V8HdM != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        f13op62NCrgMb8IPpQhI f13op62ncrgmb8ippqhi3 = (f13op62NCrgMb8IPpQhI) atomicReferenceFieldUpdater.get(this);
        if (f13op62ncrgmb8ippqhi3 != null) {
            synchronized (f13op62ncrgmb8ippqhi3) {
                TzeEusHMi207TE[] tzeEusHMi207TEArr = f13op62ncrgmb8ippqhi3.dDIMxZXP1V8HdM;
                tzeEusHMi207TE2 = tzeEusHMi207TEArr != null ? tzeEusHMi207TEArr[0] : null;
            }
        }
        if (tzeEusHMi207TE2 != tzeEusHMi207TE || Thread.currentThread() == (threadFivkjwgu2UdAtiY = fivkjwgu2UdAtiY())) {
            return;
        }
        LockSupport.unpark(threadFivkjwgu2UdAtiY);
    }

    @Override // v.s.JYn3foLRPO8BbEAlsg6f
    public void shutdown() {
        TzeEusHMi207TE tzeEusHMi207TEW9sT1Swbhx3hs;
        tlG9soiU5ACqtsQ6.dDIMxZXP1V8HdM.set(null);
        b1EoSIRjJHO5.set(this, 1);
        o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = OFMrQsTe5s1KYV0lq.vekpFI4d1Nc4fakF;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = xDyLpEZyrcKVe0;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, o0rn3ekjbj6kkwok)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof SuHLYifsJeVfKaZh9R) {
                ((SuHLYifsJeVfKaZh9R) obj).w9sT1Swbhx3hs();
                break;
            } else {
                if (obj == o0rn3ekjbj6kkwok) {
                    break;
                }
                SuHLYifsJeVfKaZh9R suHLYifsJeVfKaZh9R = new SuHLYifsJeVfKaZh9R(8, true);
                suHLYifsJeVfKaZh9R.dDIMxZXP1V8HdM((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, suHLYifsJeVfKaZh9R)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (iUQk66nAiXgO35() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            f13op62NCrgMb8IPpQhI f13op62ncrgmb8ippqhi = (f13op62NCrgMb8IPpQhI) ibVTtJUNfrGYbW.get(this);
            if (f13op62ncrgmb8ippqhi == null) {
                return;
            }
            synchronized (f13op62ncrgmb8ippqhi) {
                tzeEusHMi207TEW9sT1Swbhx3hs = Q2lEaKSVZGE9bu0igCo.w9sT1Swbhx3hs.get(f13op62ncrgmb8ippqhi) > 0 ? f13op62ncrgmb8ippqhi.w9sT1Swbhx3hs(0) : null;
            }
            if (tzeEusHMi207TEW9sT1Swbhx3hs == null) {
                return;
            } else {
                hV4VTKNUdeHN(jNanoTime, tzeEusHMi207TEW9sT1Swbhx3hs);
            }
        }
    }

    @Override // v.s.XsD7TIOExRJcOn4m
    public final void vIJudZvPyTuNp(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Runnable runnable) {
        k84rwRrqzhrNQ1CdNQ9(runnable);
    }
}

package v.s;

import androidx.work.impl.WorkDatabase;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class HjYi3nnbLmeB1CrY5tes {
    public Object dDIMxZXP1V8HdM;
    public Object w9sT1Swbhx3hs = new AtomicBoolean(false);
    public Object vekpFI4d1Nc4fakF = new lyzhjBmnW0B6JDw(new dgYqeynPOIkCjV1UTWhk(5, this));

    public HjYi3nnbLmeB1CrY5tes(WorkDatabase workDatabase) {
        this.dDIMxZXP1V8HdM = workDatabase;
    }

    public static boolean gmNWMfvn6zlEj(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public abstract Object D5P1xCAyuvgF(int i, Object obj);

    public abstract int Ee8d2j4S9Vm5yGuR();

    public abstract Map JXn4Qf7zpnLjP5();

    public abstract void b1EoSIRjJHO5(Object obj, Object obj2);

    public IvGcaSCdlPOakpJ6v dDIMxZXP1V8HdM() {
        WorkDatabase workDatabase = (WorkDatabase) this.dDIMxZXP1V8HdM;
        workDatabase.dDIMxZXP1V8HdM();
        if (((AtomicBoolean) this.w9sT1Swbhx3hs).compareAndSet(false, true)) {
            return (IvGcaSCdlPOakpJ6v) ((lyzhjBmnW0B6JDw) this.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM();
        }
        String strHjneShqpF9Tis4 = hjneShqpF9Tis4();
        workDatabase.dDIMxZXP1V8HdM();
        workDatabase.w9sT1Swbhx3hs();
        z4xRvJ1RJf5JDR z4xrvj1rjf5jdr = workDatabase.vekpFI4d1Nc4fakF;
        if (z4xrvj1rjf5jdr == null) {
            z4xrvj1rjf5jdr = null;
        }
        return z4xrvj1rjf5jdr.l1V0lQr6TbwNKqHfXNbb().D5P1xCAyuvgF(strHjneShqpF9Tis4);
    }

    public void gIIiyi2ddlMDR0(IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6v) {
        if (ivGcaSCdlPOakpJ6v == ((IvGcaSCdlPOakpJ6v) ((lyzhjBmnW0B6JDw) this.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM())) {
            ((AtomicBoolean) this.w9sT1Swbhx3hs).set(false);
        }
    }

    public abstract String hjneShqpF9Tis4();

    public abstract int ibVTtJUNfrGYbW(Object obj);

    public abstract void pyu8ovAipBTLYAiKab(int i);

    public abstract Object vekpFI4d1Nc4fakF(int i, int i2);

    public abstract void w9sT1Swbhx3hs();

    public Object[] wotphlvK9sPbXJ(Object[] objArr, int i) {
        int iEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR();
        if (objArr.length < iEe8d2j4S9Vm5yGuR) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iEe8d2j4S9Vm5yGuR);
        }
        for (int i2 = 0; i2 < iEe8d2j4S9Vm5yGuR; i2++) {
            objArr[i2] = vekpFI4d1Nc4fakF(i2, i);
        }
        if (objArr.length > iEe8d2j4S9Vm5yGuR) {
            objArr[iEe8d2j4S9Vm5yGuR] = null;
        }
        return objArr;
    }

    public abstract int xDyLpEZyrcKVe0(Object obj);
}

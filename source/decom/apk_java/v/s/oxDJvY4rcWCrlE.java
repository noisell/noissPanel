package v.s;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class oxDJvY4rcWCrlE implements Iterable {
    public S4NwUM5fV12C6gDO vekpFI4d1Nc4fakF;
    public S4NwUM5fV12C6gDO w9sT1Swbhx3hs;
    public final WeakHashMap JXn4Qf7zpnLjP5 = new WeakHashMap();
    public int Ee8d2j4S9Vm5yGuR = 0;

    public S4NwUM5fV12C6gDO dDIMxZXP1V8HdM(Object obj) {
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO = this.w9sT1Swbhx3hs;
        while (s4NwUM5fV12C6gDO != null && !s4NwUM5fV12C6gDO.w9sT1Swbhx3hs.equals(obj)) {
            s4NwUM5fV12C6gDO = s4NwUM5fV12C6gDO.JXn4Qf7zpnLjP5;
        }
        return s4NwUM5fV12C6gDO;
    }

    public final boolean equals(Object obj) {
        YsldWmoYltIxr5OO5ErE ysldWmoYltIxr5OO5ErE;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oxDJvY4rcWCrlE)) {
            return false;
        }
        oxDJvY4rcWCrlE oxdjvy4rcwcrle = (oxDJvY4rcWCrlE) obj;
        if (this.Ee8d2j4S9Vm5yGuR != oxdjvy4rcwcrle.Ee8d2j4S9Vm5yGuR) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = oxdjvy4rcwcrle.iterator();
        while (true) {
            ysldWmoYltIxr5OO5ErE = (YsldWmoYltIxr5OO5ErE) it;
            if (!ysldWmoYltIxr5OO5ErE.hasNext()) {
                break;
            }
            YsldWmoYltIxr5OO5ErE ysldWmoYltIxr5OO5ErE2 = (YsldWmoYltIxr5OO5ErE) it2;
            if (!ysldWmoYltIxr5OO5ErE2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) ysldWmoYltIxr5OO5ErE.next();
            Object next = ysldWmoYltIxr5OO5ErE2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (ysldWmoYltIxr5OO5ErE.hasNext() || ((YsldWmoYltIxr5OO5ErE) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            YsldWmoYltIxr5OO5ErE ysldWmoYltIxr5OO5ErE = (YsldWmoYltIxr5OO5ErE) it;
            if (!ysldWmoYltIxr5OO5ErE.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) ysldWmoYltIxr5OO5ErE.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        YsldWmoYltIxr5OO5ErE ysldWmoYltIxr5OO5ErE = new YsldWmoYltIxr5OO5ErE(this.w9sT1Swbhx3hs, this.vekpFI4d1Nc4fakF, 0);
        this.JXn4Qf7zpnLjP5.put(ysldWmoYltIxr5OO5ErE, Boolean.FALSE);
        return ysldWmoYltIxr5OO5ErE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            YsldWmoYltIxr5OO5ErE ysldWmoYltIxr5OO5ErE = (YsldWmoYltIxr5OO5ErE) it;
            if (!ysldWmoYltIxr5OO5ErE.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) ysldWmoYltIxr5OO5ErE.next()).toString());
            if (ysldWmoYltIxr5OO5ErE.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public Object w9sT1Swbhx3hs(Object obj) {
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDODDIMxZXP1V8HdM = dDIMxZXP1V8HdM(obj);
        if (s4NwUM5fV12C6gDODDIMxZXP1V8HdM == null) {
            return null;
        }
        this.Ee8d2j4S9Vm5yGuR--;
        WeakHashMap weakHashMap = this.JXn4Qf7zpnLjP5;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((rIdlHTr6qdca) it.next()).dDIMxZXP1V8HdM(s4NwUM5fV12C6gDODDIMxZXP1V8HdM);
            }
        }
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO = s4NwUM5fV12C6gDODDIMxZXP1V8HdM.Ee8d2j4S9Vm5yGuR;
        if (s4NwUM5fV12C6gDO != null) {
            s4NwUM5fV12C6gDO.JXn4Qf7zpnLjP5 = s4NwUM5fV12C6gDODDIMxZXP1V8HdM.JXn4Qf7zpnLjP5;
        } else {
            this.w9sT1Swbhx3hs = s4NwUM5fV12C6gDODDIMxZXP1V8HdM.JXn4Qf7zpnLjP5;
        }
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO2 = s4NwUM5fV12C6gDODDIMxZXP1V8HdM.JXn4Qf7zpnLjP5;
        if (s4NwUM5fV12C6gDO2 != null) {
            s4NwUM5fV12C6gDO2.Ee8d2j4S9Vm5yGuR = s4NwUM5fV12C6gDO;
        } else {
            this.vekpFI4d1Nc4fakF = s4NwUM5fV12C6gDO;
        }
        s4NwUM5fV12C6gDODDIMxZXP1V8HdM.JXn4Qf7zpnLjP5 = null;
        s4NwUM5fV12C6gDODDIMxZXP1V8HdM.Ee8d2j4S9Vm5yGuR = null;
        return s4NwUM5fV12C6gDODDIMxZXP1V8HdM.vekpFI4d1Nc4fakF;
    }
}

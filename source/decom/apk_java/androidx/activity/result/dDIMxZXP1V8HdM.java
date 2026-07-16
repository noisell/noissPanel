package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import v.s.A1BaTVAMeIXMnh;
import v.s.Jf9nGec8iqajtj;
import v.s.MSGkxvPxRYNqC;
import v.s.OGI3jG3mkhPSTcSz;
import v.s.Xdb7JFhCToIIjDFJDI;
import v.s.eTeIZwLyooQrZ0ICI9i;
import v.s.k84rwRrqzhrNQ1CdNQ9;
import v.s.lK1IHVVetx4U;
import v.s.lMJPWn8FzeWU82pNUhWl;
import v.s.okc5AGRjqrud84oM6d;
import v.s.p9Dc9HHikKZdWDIj;
import v.s.qfTrc75xwRVMl85vh;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class dDIMxZXP1V8HdM {
    public final HashMap dDIMxZXP1V8HdM = new HashMap();
    public final HashMap w9sT1Swbhx3hs = new HashMap();
    public final HashMap vekpFI4d1Nc4fakF = new HashMap();
    public ArrayList JXn4Qf7zpnLjP5 = new ArrayList();
    public final transient HashMap Ee8d2j4S9Vm5yGuR = new HashMap();
    public final HashMap xDyLpEZyrcKVe0 = new HashMap();
    public final Bundle ibVTtJUNfrGYbW = new Bundle();

    public final boolean dDIMxZXP1V8HdM(int i, int i2, Intent intent) {
        String str = (String) this.dDIMxZXP1V8HdM.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        qfTrc75xwRVMl85vh qftrc75xwrvml85vh = (qfTrc75xwRVMl85vh) this.Ee8d2j4S9Vm5yGuR.get(str);
        if (qftrc75xwrvml85vh != null) {
            A1BaTVAMeIXMnh a1BaTVAMeIXMnh = qftrc75xwrvml85vh.dDIMxZXP1V8HdM;
            if (this.JXn4Qf7zpnLjP5.contains(str)) {
                a1BaTVAMeIXMnh.dDIMxZXP1V8HdM(qftrc75xwrvml85vh.w9sT1Swbhx3hs.wotphlvK9sPbXJ(intent, i2));
                this.JXn4Qf7zpnLjP5.remove(str);
                return true;
            }
        }
        this.xDyLpEZyrcKVe0.remove(str);
        this.ibVTtJUNfrGYbW.putParcelable(str, new k84rwRrqzhrNQ1CdNQ9(intent, i2));
        return true;
    }

    public final eTeIZwLyooQrZ0ICI9i vekpFI4d1Nc4fakF(final String str, ComponentActivity componentActivity, final okc5AGRjqrud84oM6d okc5agrjqrud84om6d, final A1BaTVAMeIXMnh a1BaTVAMeIXMnh) {
        int i;
        HashMap map;
        p9Dc9HHikKZdWDIj p9dc9hhikkzdwdij = componentActivity.JXn4Qf7zpnLjP5;
        if (p9dc9hhikkzdwdij.vekpFI4d1Nc4fakF.compareTo(lK1IHVVetx4U.Ee8d2j4S9Vm5yGuR) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + componentActivity + " is attempting to register while current state is " + p9dc9hhikkzdwdij.vekpFI4d1Nc4fakF + ". LifecycleOwners must call register before they are STARTED.");
        }
        HashMap map2 = this.w9sT1Swbhx3hs;
        if (((Integer) map2.get(str)) == null) {
            int iB1EoSIRjJHO5 = lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs.b1EoSIRjJHO5(2147418112);
            while (true) {
                i = iB1EoSIRjJHO5 + 65536;
                Integer numValueOf = Integer.valueOf(i);
                map = this.dDIMxZXP1V8HdM;
                if (!map.containsKey(numValueOf)) {
                    break;
                }
                iB1EoSIRjJHO5 = lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs.b1EoSIRjJHO5(2147418112);
            }
            map.put(Integer.valueOf(i), str);
            map2.put(str, Integer.valueOf(i));
        }
        HashMap map3 = this.vekpFI4d1Nc4fakF;
        MSGkxvPxRYNqC mSGkxvPxRYNqC = (MSGkxvPxRYNqC) map3.get(str);
        if (mSGkxvPxRYNqC == null) {
            mSGkxvPxRYNqC = new MSGkxvPxRYNqC(p9dc9hhikkzdwdij);
        }
        OGI3jG3mkhPSTcSz oGI3jG3mkhPSTcSz = new OGI3jG3mkhPSTcSz() { // from class: androidx.activity.result.ActivityResultRegistry$1
            private static /* synthetic */ void ksfrefqrbp() {
            }

            @Override // v.s.OGI3jG3mkhPSTcSz
            public final void dDIMxZXP1V8HdM(Xdb7JFhCToIIjDFJDI xdb7JFhCToIIjDFJDI, Jf9nGec8iqajtj jf9nGec8iqajtj) {
                Integer num;
                boolean zEquals = Jf9nGec8iqajtj.ON_START.equals(jf9nGec8iqajtj);
                String str2 = str;
                dDIMxZXP1V8HdM ddimxzxp1v8hdm = this.Ee8d2j4S9Vm5yGuR;
                if (zEquals) {
                    HashMap map4 = ddimxzxp1v8hdm.Ee8d2j4S9Vm5yGuR;
                    Bundle bundle = ddimxzxp1v8hdm.ibVTtJUNfrGYbW;
                    HashMap map5 = ddimxzxp1v8hdm.xDyLpEZyrcKVe0;
                    A1BaTVAMeIXMnh a1BaTVAMeIXMnh2 = a1BaTVAMeIXMnh;
                    okc5AGRjqrud84oM6d okc5agrjqrud84om6d2 = okc5agrjqrud84om6d;
                    map4.put(str2, new qfTrc75xwRVMl85vh(a1BaTVAMeIXMnh2, okc5agrjqrud84om6d2));
                    if (map5.containsKey(str2)) {
                        Object obj = map5.get(str2);
                        map5.remove(str2);
                        a1BaTVAMeIXMnh2.dDIMxZXP1V8HdM(obj);
                    }
                    k84rwRrqzhrNQ1CdNQ9 k84rwrrqzhrnq1cdnq9 = (k84rwRrqzhrNQ1CdNQ9) bundle.getParcelable(str2);
                    if (k84rwrrqzhrnq1cdnq9 != null) {
                        bundle.remove(str2);
                        a1BaTVAMeIXMnh2.dDIMxZXP1V8HdM(okc5agrjqrud84om6d2.wotphlvK9sPbXJ(k84rwrrqzhrnq1cdnq9.vekpFI4d1Nc4fakF, k84rwrrqzhrnq1cdnq9.w9sT1Swbhx3hs));
                        return;
                    }
                    return;
                }
                if (Jf9nGec8iqajtj.ON_STOP.equals(jf9nGec8iqajtj)) {
                    ddimxzxp1v8hdm.Ee8d2j4S9Vm5yGuR.remove(str2);
                    return;
                }
                if (Jf9nGec8iqajtj.ON_DESTROY.equals(jf9nGec8iqajtj)) {
                    HashMap map6 = ddimxzxp1v8hdm.vekpFI4d1Nc4fakF;
                    Bundle bundle2 = ddimxzxp1v8hdm.ibVTtJUNfrGYbW;
                    HashMap map7 = ddimxzxp1v8hdm.xDyLpEZyrcKVe0;
                    if (!ddimxzxp1v8hdm.JXn4Qf7zpnLjP5.contains(str2) && (num = (Integer) ddimxzxp1v8hdm.w9sT1Swbhx3hs.remove(str2)) != null) {
                        ddimxzxp1v8hdm.dDIMxZXP1V8HdM.remove(num);
                    }
                    ddimxzxp1v8hdm.Ee8d2j4S9Vm5yGuR.remove(str2);
                    if (map7.containsKey(str2)) {
                        Objects.toString(map7.get(str2));
                        map7.remove(str2);
                    }
                    if (bundle2.containsKey(str2)) {
                        Objects.toString(bundle2.getParcelable(str2));
                        bundle2.remove(str2);
                    }
                    MSGkxvPxRYNqC mSGkxvPxRYNqC2 = (MSGkxvPxRYNqC) map6.get(str2);
                    if (mSGkxvPxRYNqC2 != null) {
                        ArrayList arrayList = mSGkxvPxRYNqC2.w9sT1Swbhx3hs;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            mSGkxvPxRYNqC2.dDIMxZXP1V8HdM.xDyLpEZyrcKVe0((OGI3jG3mkhPSTcSz) obj2);
                        }
                        arrayList.clear();
                        map6.remove(str2);
                    }
                }
            }
        };
        mSGkxvPxRYNqC.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM(oGI3jG3mkhPSTcSz);
        mSGkxvPxRYNqC.w9sT1Swbhx3hs.add(oGI3jG3mkhPSTcSz);
        map3.put(str, mSGkxvPxRYNqC);
        return new eTeIZwLyooQrZ0ICI9i(this, str, okc5agrjqrud84om6d);
    }

    public abstract void w9sT1Swbhx3hs(int i, okc5AGRjqrud84oM6d okc5agrjqrud84om6d, Object obj);
}

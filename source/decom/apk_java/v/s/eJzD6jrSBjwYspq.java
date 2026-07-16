package v.s;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class eJzD6jrSBjwYspq implements Irpcf8dxYWkn3XNhG, VjoqvUCgHSpPnaGc {
    public final int D5P1xCAyuvgF;
    public final K5l5kmuyJzrgUX Ee8d2j4S9Vm5yGuR;
    public boolean hjneShqpF9Tis4;
    public final IXBvAqS2fpdIRK ibVTtJUNfrGYbW;
    public final /* synthetic */ DBz5KzDJzqYVg1s wotphlvK9sPbXJ;
    public final uW0IRoPBZMj2QmBkkp xDyLpEZyrcKVe0;
    public final LinkedList JXn4Qf7zpnLjP5 = new LinkedList();
    public final HashSet b1EoSIRjJHO5 = new HashSet();
    public final HashMap pyu8ovAipBTLYAiKab = new HashMap();
    public final ArrayList gmNWMfvn6zlEj = new ArrayList();
    public nyZDwrpXoi7nqMd gIIiyi2ddlMDR0 = null;

    public eJzD6jrSBjwYspq(DBz5KzDJzqYVg1s dBz5KzDJzqYVg1s, ny2QaoAAyfdnXseU2mn ny2qaoaayfdnxseu2mn) {
        this.wotphlvK9sPbXJ = dBz5KzDJzqYVg1s;
        Looper looper = dBz5KzDJzqYVg1s.gIIiyi2ddlMDR0.getLooper();
        Context context = ny2qaoaayfdnxseu2mn.dDIMxZXP1V8HdM;
        UWYuX9UTvV9YpFO4TOW uWYuX9UTvV9YpFO4TOW = new UWYuX9UTvV9YpFO4TOW();
        Set set = Collections.EMPTY_SET;
        if (((EngrEbdti60lW) uWYuX9UTvV9YpFO4TOW.w9sT1Swbhx3hs) == null) {
            uWYuX9UTvV9YpFO4TOW.w9sT1Swbhx3hs = new EngrEbdti60lW(0);
        }
        ((EngrEbdti60lW) uWYuX9UTvV9YpFO4TOW.w9sT1Swbhx3hs).addAll(set);
        uWYuX9UTvV9YpFO4TOW.JXn4Qf7zpnLjP5 = context.getClass().getName();
        uWYuX9UTvV9YpFO4TOW.vekpFI4d1Nc4fakF = context.getPackageName();
        eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i = new eTeIZwLyooQrZ0ICI9i((Set) uWYuX9UTvV9YpFO4TOW.w9sT1Swbhx3hs, (String) uWYuX9UTvV9YpFO4TOW.vekpFI4d1Nc4fakF, (String) uWYuX9UTvV9YpFO4TOW.JXn4Qf7zpnLjP5);
        q2cpFJJZo2i97uMpROz q2cpfjjzo2i97umproz = (q2cpFJJZo2i97uMpROz) ny2qaoaayfdnxseu2mn.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs;
        SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(q2cpfjjzo2i97umproz);
        Context context2 = ny2qaoaayfdnxseu2mn.dDIMxZXP1V8HdM;
        m4D1Mt1iPzE1q0xxRP m4d1mt1ipze1q0xxrp = ny2qaoaayfdnxseu2mn.JXn4Qf7zpnLjP5;
        q2cpfjjzo2i97umproz.getClass();
        erZKFX6OwHmny8Sd6 erzkfx6owhmny8sd6 = new erZKFX6OwHmny8Sd6(context2, looper, eteizwlyooqrz0ici9i, m4d1mt1ipze1q0xxrp, this, this);
        String str = ny2qaoaayfdnxseu2mn.w9sT1Swbhx3hs;
        if (str != null) {
            erzkfx6owhmny8sd6.MLSIo1htfMPWeB8V876L = str;
        }
        this.Ee8d2j4S9Vm5yGuR = erzkfx6owhmny8sd6;
        this.xDyLpEZyrcKVe0 = ny2qaoaayfdnxseu2mn.Ee8d2j4S9Vm5yGuR;
        this.ibVTtJUNfrGYbW = new IXBvAqS2fpdIRK();
        this.D5P1xCAyuvgF = ny2qaoaayfdnxseu2mn.xDyLpEZyrcKVe0;
    }

    public final void D5P1xCAyuvgF() {
        DBz5KzDJzqYVg1s dBz5KzDJzqYVg1s = this.wotphlvK9sPbXJ;
        iFLJbvrqroccc6 ifljbvrqroccc6 = dBz5KzDJzqYVg1s.gIIiyi2ddlMDR0;
        uW0IRoPBZMj2QmBkkp uw0iropbzmj2qmbkkp = this.xDyLpEZyrcKVe0;
        ifljbvrqroccc6.removeMessages(12, uw0iropbzmj2qmbkkp);
        ifljbvrqroccc6.sendMessageDelayed(ifljbvrqroccc6.obtainMessage(12, uw0iropbzmj2qmbkkp), dBz5KzDJzqYVg1s.dDIMxZXP1V8HdM);
    }

    public final void Ee8d2j4S9Vm5yGuR(Status status) {
        SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0);
        xDyLpEZyrcKVe0(status, null, false);
    }

    public final void JXn4Qf7zpnLjP5(nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd) {
        HashSet hashSet = this.b1EoSIRjJHO5;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(nyzdwrpxoi7nqmd, nyZDwrpXoi7nqMd.xDyLpEZyrcKVe0)) {
                this.Ee8d2j4S9Vm5yGuR.D5P1xCAyuvgF();
            }
            throw null;
        }
    }

    public final void Qrz92kRPw4GcghAc(nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd, RuntimeException runtimeException) {
        SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0);
        SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0);
        this.gIIiyi2ddlMDR0 = null;
        ((SparseIntArray) this.wotphlvK9sPbXJ.ibVTtJUNfrGYbW.w9sT1Swbhx3hs).clear();
        JXn4Qf7zpnLjP5(nyzdwrpxoi7nqmd);
        if ((this.Ee8d2j4S9Vm5yGuR instanceof erZKFX6OwHmny8Sd6) && nyzdwrpxoi7nqmd.vekpFI4d1Nc4fakF != 24) {
            DBz5KzDJzqYVg1s dBz5KzDJzqYVg1s = this.wotphlvK9sPbXJ;
            dBz5KzDJzqYVg1s.w9sT1Swbhx3hs = true;
            iFLJbvrqroccc6 ifljbvrqroccc6 = dBz5KzDJzqYVg1s.gIIiyi2ddlMDR0;
            ifljbvrqroccc6.sendMessageDelayed(ifljbvrqroccc6.obtainMessage(74 - 55), 300000L);
        }
        if (nyzdwrpxoi7nqmd.vekpFI4d1Nc4fakF == 4) {
            Ee8d2j4S9Vm5yGuR(DBz5KzDJzqYVg1s.nQilHWaqS401ZtR);
            return;
        }
        if (this.JXn4Qf7zpnLjP5.isEmpty()) {
            this.gIIiyi2ddlMDR0 = nyzdwrpxoi7nqmd;
            return;
        }
        if (runtimeException != null) {
            SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0);
            xDyLpEZyrcKVe0(null, runtimeException, false);
            return;
        }
        if (!this.wotphlvK9sPbXJ.wotphlvK9sPbXJ) {
            Ee8d2j4S9Vm5yGuR(DBz5KzDJzqYVg1s.w9sT1Swbhx3hs(this.xDyLpEZyrcKVe0, nyzdwrpxoi7nqmd));
            return;
        }
        xDyLpEZyrcKVe0(DBz5KzDJzqYVg1s.w9sT1Swbhx3hs(this.xDyLpEZyrcKVe0, nyzdwrpxoi7nqmd), null, true);
        if (this.JXn4Qf7zpnLjP5.isEmpty() || gmNWMfvn6zlEj(nyzdwrpxoi7nqmd) || this.wotphlvK9sPbXJ.dDIMxZXP1V8HdM(nyzdwrpxoi7nqmd, this.D5P1xCAyuvgF)) {
            return;
        }
        if (nyzdwrpxoi7nqmd.vekpFI4d1Nc4fakF == 18) {
            this.hjneShqpF9Tis4 = true;
        }
        if (!this.hjneShqpF9Tis4) {
            Ee8d2j4S9Vm5yGuR(DBz5KzDJzqYVg1s.w9sT1Swbhx3hs(this.xDyLpEZyrcKVe0, nyzdwrpxoi7nqmd));
        } else {
            iFLJbvrqroccc6 ifljbvrqroccc7 = this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0;
            ifljbvrqroccc7.sendMessageDelayed(Message.obtain(ifljbvrqroccc7, 9, this.xDyLpEZyrcKVe0), 5000L);
        }
    }

    public final void b1EoSIRjJHO5() {
        DBz5KzDJzqYVg1s dBz5KzDJzqYVg1s = this.wotphlvK9sPbXJ;
        SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(dBz5KzDJzqYVg1s.gIIiyi2ddlMDR0);
        this.gIIiyi2ddlMDR0 = null;
        JXn4Qf7zpnLjP5(nyZDwrpXoi7nqMd.xDyLpEZyrcKVe0);
        iFLJbvrqroccc6 ifljbvrqroccc6 = dBz5KzDJzqYVg1s.gIIiyi2ddlMDR0;
        if (this.hjneShqpF9Tis4) {
            uW0IRoPBZMj2QmBkkp uw0iropbzmj2qmbkkp = this.xDyLpEZyrcKVe0;
            ifljbvrqroccc6.removeMessages(11, uw0iropbzmj2qmbkkp);
            ifljbvrqroccc6.removeMessages(9, uw0iropbzmj2qmbkkp);
            this.hjneShqpF9Tis4 = false;
        }
        Iterator it = this.pyu8ovAipBTLYAiKab.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        ibVTtJUNfrGYbW();
        D5P1xCAyuvgF();
    }

    @Override // v.s.VjoqvUCgHSpPnaGc
    public final void dDIMxZXP1V8HdM(nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd) {
        Qrz92kRPw4GcghAc(nyzdwrpxoi7nqmd, null);
    }

    public final void gIIiyi2ddlMDR0() {
        DBz5KzDJzqYVg1s dBz5KzDJzqYVg1s = this.wotphlvK9sPbXJ;
        SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(dBz5KzDJzqYVg1s.gIIiyi2ddlMDR0);
        K5l5kmuyJzrgUX k5l5kmuyJzrgUX = this.Ee8d2j4S9Vm5yGuR;
        if (k5l5kmuyJzrgUX.dDIMxZXP1V8HdM() || k5l5kmuyJzrgUX.b1EoSIRjJHO5()) {
            return;
        }
        try {
            Hnsrhf2jJV8dCt hnsrhf2jJV8dCt = dBz5KzDJzqYVg1s.ibVTtJUNfrGYbW;
            Context context = dBz5KzDJzqYVg1s.Ee8d2j4S9Vm5yGuR;
            SparseIntArray sparseIntArray = (SparseIntArray) hnsrhf2jJV8dCt.w9sT1Swbhx3hs;
            SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(context);
            int iIbVTtJUNfrGYbW = k5l5kmuyJzrgUX.ibVTtJUNfrGYbW();
            int iW9sT1Swbhx3hs = ((SparseIntArray) hnsrhf2jJV8dCt.w9sT1Swbhx3hs).get(iIbVTtJUNfrGYbW, -1);
            if (iW9sT1Swbhx3hs == -1) {
                iW9sT1Swbhx3hs = 0;
                int i = 0;
                while (true) {
                    if (i >= sparseIntArray.size()) {
                        iW9sT1Swbhx3hs = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iIbVTtJUNfrGYbW && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (iW9sT1Swbhx3hs == -1) {
                    iW9sT1Swbhx3hs = ((a4Aq5QBZFai3VwgjU) hnsrhf2jJV8dCt.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs(context, iIbVTtJUNfrGYbW);
                }
                sparseIntArray.put(iIbVTtJUNfrGYbW, iW9sT1Swbhx3hs);
            }
            if (iW9sT1Swbhx3hs != 0) {
                nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd = new nyZDwrpXoi7nqMd(iW9sT1Swbhx3hs, null);
                new StringBuilder(k5l5kmuyJzrgUX.getClass().getName().length() + 35 + nyzdwrpxoi7nqmd.toString().length());
                Qrz92kRPw4GcghAc(nyzdwrpxoi7nqmd, null);
                return;
            }
            MyXXPLJTIAlf1q myXXPLJTIAlf1q = new MyXXPLJTIAlf1q(dBz5KzDJzqYVg1s, k5l5kmuyJzrgUX, this.xDyLpEZyrcKVe0);
            if (k5l5kmuyJzrgUX.gIIiyi2ddlMDR0()) {
                SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(null);
                throw null;
            }
            try {
                k5l5kmuyJzrgUX.Ee8d2j4S9Vm5yGuR(myXXPLJTIAlf1q);
            } catch (SecurityException e) {
                Qrz92kRPw4GcghAc(new nyZDwrpXoi7nqMd(10), e);
            }
        } catch (IllegalStateException e2) {
            Qrz92kRPw4GcghAc(new nyZDwrpXoi7nqMd(10), e2);
        }
    }

    public final boolean gmNWMfvn6zlEj(nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd) {
        synchronized (DBz5KzDJzqYVg1s.J0zjQ7CAgohuxU20eCW6) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public final boolean hjneShqpF9Tis4(IAoJ6MjurI42ZsE iAoJ6MjurI42ZsE) {
        ZOu84RhGdb62AhIs zOu84RhGdb62AhIs;
        ?? r1 = 69 - 68;
        if (iAoJ6MjurI42ZsE == null) {
            IXBvAqS2fpdIRK iXBvAqS2fpdIRK = this.ibVTtJUNfrGYbW;
            K5l5kmuyJzrgUX k5l5kmuyJzrgUX = this.Ee8d2j4S9Vm5yGuR;
            iAoJ6MjurI42ZsE.xDyLpEZyrcKVe0(iXBvAqS2fpdIRK, k5l5kmuyJzrgUX.gIIiyi2ddlMDR0());
            try {
                iAoJ6MjurI42ZsE.Ee8d2j4S9Vm5yGuR(this);
                return r1;
            } catch (DeadObjectException unused) {
                w9sT1Swbhx3hs(r1);
                k5l5kmuyJzrgUX.xDyLpEZyrcKVe0("DeadObjectException thrown while running ApiCallRunner.");
                return r1;
            }
        }
        ZOu84RhGdb62AhIs[] zOu84RhGdb62AhIsArrW9sT1Swbhx3hs = iAoJ6MjurI42ZsE.w9sT1Swbhx3hs(this);
        if (zOu84RhGdb62AhIsArrW9sT1Swbhx3hs == null || zOu84RhGdb62AhIsArrW9sT1Swbhx3hs.length == 0) {
            zOu84RhGdb62AhIs = null;
            break;
        }
        ZOu84RhGdb62AhIs[] zOu84RhGdb62AhIsArrPyu8ovAipBTLYAiKab = this.Ee8d2j4S9Vm5yGuR.pyu8ovAipBTLYAiKab();
        if (zOu84RhGdb62AhIsArrPyu8ovAipBTLYAiKab == null) {
            zOu84RhGdb62AhIsArrPyu8ovAipBTLYAiKab = new ZOu84RhGdb62AhIs[0];
        }
        int length = zOu84RhGdb62AhIsArrPyu8ovAipBTLYAiKab.length;
        Sn2d19yOBfyV0rw sn2d19yOBfyV0rw = new Sn2d19yOBfyV0rw();
        if (length == 0) {
            sn2d19yOBfyV0rw.w9sT1Swbhx3hs = FZ1sl4mHq4J0hOEYC.dDIMxZXP1V8HdM;
            sn2d19yOBfyV0rw.vekpFI4d1Nc4fakF = FZ1sl4mHq4J0hOEYC.w9sT1Swbhx3hs;
        } else {
            sn2d19yOBfyV0rw.dDIMxZXP1V8HdM(length);
        }
        sn2d19yOBfyV0rw.JXn4Qf7zpnLjP5 = 0;
        for (ZOu84RhGdb62AhIs zOu84RhGdb62AhIs2 : zOu84RhGdb62AhIsArrPyu8ovAipBTLYAiKab) {
            sn2d19yOBfyV0rw.put(zOu84RhGdb62AhIs2.w9sT1Swbhx3hs, Long.valueOf(zOu84RhGdb62AhIs2.dDIMxZXP1V8HdM()));
        }
        int length2 = zOu84RhGdb62AhIsArrW9sT1Swbhx3hs.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                zOu84RhGdb62AhIs = null;
                break;
            }
            zOu84RhGdb62AhIs = zOu84RhGdb62AhIsArrW9sT1Swbhx3hs[i];
            Long l = (Long) sn2d19yOBfyV0rw.get(zOu84RhGdb62AhIs.w9sT1Swbhx3hs);
            if (l == null || l.longValue() < zOu84RhGdb62AhIs.dDIMxZXP1V8HdM()) {
                break;
            }
            i++;
        }
        if (zOu84RhGdb62AhIs == null) {
            IXBvAqS2fpdIRK iXBvAqS2fpdIRK2 = this.ibVTtJUNfrGYbW;
            K5l5kmuyJzrgUX k5l5kmuyJzrgUX2 = this.Ee8d2j4S9Vm5yGuR;
            iAoJ6MjurI42ZsE.xDyLpEZyrcKVe0(iXBvAqS2fpdIRK2, k5l5kmuyJzrgUX2.gIIiyi2ddlMDR0());
            try {
                iAoJ6MjurI42ZsE.Ee8d2j4S9Vm5yGuR(this);
                return r1;
            } catch (DeadObjectException unused2) {
                w9sT1Swbhx3hs(r1);
                k5l5kmuyJzrgUX2.xDyLpEZyrcKVe0("DeadObjectException thrown while running ApiCallRunner.");
                return r1;
            }
        }
        new StringBuilder(this.Ee8d2j4S9Vm5yGuR.getClass().getName().length() + 77 + String.valueOf(zOu84RhGdb62AhIs.w9sT1Swbhx3hs).length());
        if (!this.wotphlvK9sPbXJ.wotphlvK9sPbXJ || !iAoJ6MjurI42ZsE.dDIMxZXP1V8HdM(this)) {
            iAoJ6MjurI42ZsE.JXn4Qf7zpnLjP5(new zRCKG8cSSr4p(zOu84RhGdb62AhIs));
            return r1;
        }
        obPVwzN78doH4L0 obpvwzn78doh4l0 = new obPVwzN78doH4L0(this.xDyLpEZyrcKVe0, zOu84RhGdb62AhIs);
        int iIndexOf = this.gmNWMfvn6zlEj.indexOf(obpvwzn78doh4l0);
        if (iIndexOf >= 0) {
            obPVwzN78doH4L0 obpvwzn78doh4l1 = (obPVwzN78doH4L0) this.gmNWMfvn6zlEj.get(iIndexOf);
            this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0.removeMessages(15, obpvwzn78doh4l1);
            iFLJbvrqroccc6 ifljbvrqroccc6 = this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0;
            ifljbvrqroccc6.sendMessageDelayed(Message.obtain(ifljbvrqroccc6, 15, obpvwzn78doh4l1), 5000L);
        } else {
            this.gmNWMfvn6zlEj.add(obpvwzn78doh4l0);
            iFLJbvrqroccc6 ifljbvrqroccc7 = this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0;
            ifljbvrqroccc7.sendMessageDelayed(Message.obtain(ifljbvrqroccc7, 15, obpvwzn78doh4l0), 5000L);
            iFLJbvrqroccc6 ifljbvrqroccc8 = this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0;
            ifljbvrqroccc8.sendMessageDelayed(Message.obtain(ifljbvrqroccc8, 16, obpvwzn78doh4l0), 120000L);
            nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd = new nyZDwrpXoi7nqMd(2, null);
            if (!gmNWMfvn6zlEj(nyzdwrpxoi7nqmd)) {
                this.wotphlvK9sPbXJ.dDIMxZXP1V8HdM(nyzdwrpxoi7nqmd, this.D5P1xCAyuvgF);
            }
        }
        return false;
    }

    public final void ibVTtJUNfrGYbW() {
        LinkedList linkedList = this.JXn4Qf7zpnLjP5;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            IAoJ6MjurI42ZsE iAoJ6MjurI42ZsE = (IAoJ6MjurI42ZsE) arrayList.get(i);
            if (!this.Ee8d2j4S9Vm5yGuR.dDIMxZXP1V8HdM()) {
                return;
            }
            if (hjneShqpF9Tis4(iAoJ6MjurI42ZsE)) {
                linkedList.remove(iAoJ6MjurI42ZsE);
            }
        }
    }

    public final void nQilHWaqS401ZtR() {
        SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0);
        Status status = DBz5KzDJzqYVg1s.Qrz92kRPw4GcghAc;
        Ee8d2j4S9Vm5yGuR(status);
        this.ibVTtJUNfrGYbW.vekpFI4d1Nc4fakF(false, status);
        for (BVKxo8N5giWR2 bVKxo8N5giWR2 : (BVKxo8N5giWR2[]) this.pyu8ovAipBTLYAiKab.keySet().toArray(new BVKxo8N5giWR2[0])) {
            wotphlvK9sPbXJ(new eJ9sZWlEXcxX3ubkM(new al3CoDKXO0nvx()));
        }
        JXn4Qf7zpnLjP5(new nyZDwrpXoi7nqMd(4));
        K5l5kmuyJzrgUX k5l5kmuyJzrgUX = this.Ee8d2j4S9Vm5yGuR;
        if (k5l5kmuyJzrgUX.dDIMxZXP1V8HdM()) {
            k5l5kmuyJzrgUX.w9sT1Swbhx3hs(new r5XEUfod5GSCCwq6c(24, this));
        }
    }

    public final void pyu8ovAipBTLYAiKab(int i) {
        DBz5KzDJzqYVg1s dBz5KzDJzqYVg1s = this.wotphlvK9sPbXJ;
        iFLJbvrqroccc6 ifljbvrqroccc6 = dBz5KzDJzqYVg1s.gIIiyi2ddlMDR0;
        SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(dBz5KzDJzqYVg1s.gIIiyi2ddlMDR0);
        this.gIIiyi2ddlMDR0 = null;
        this.hjneShqpF9Tis4 = true;
        String strHjneShqpF9Tis4 = this.Ee8d2j4S9Vm5yGuR.hjneShqpF9Tis4();
        IXBvAqS2fpdIRK iXBvAqS2fpdIRK = this.ibVTtJUNfrGYbW;
        iXBvAqS2fpdIRK.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strHjneShqpF9Tis4 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strHjneShqpF9Tis4);
        }
        iXBvAqS2fpdIRK.vekpFI4d1Nc4fakF(true, new Status(sb.toString(), 63 - 43));
        uW0IRoPBZMj2QmBkkp uw0iropbzmj2qmbkkp = this.xDyLpEZyrcKVe0;
        ifljbvrqroccc6.sendMessageDelayed(Message.obtain(ifljbvrqroccc6, 9, uw0iropbzmj2qmbkkp), 5000L);
        ifljbvrqroccc6.sendMessageDelayed(Message.obtain(ifljbvrqroccc6, 11, uw0iropbzmj2qmbkkp), 120000L);
        ((SparseIntArray) dBz5KzDJzqYVg1s.ibVTtJUNfrGYbW.w9sT1Swbhx3hs).clear();
        Iterator it = this.pyu8ovAipBTLYAiKab.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // v.s.Irpcf8dxYWkn3XNhG
    public final void vekpFI4d1Nc4fakF() {
        Looper looperMyLooper = Looper.myLooper();
        iFLJbvrqroccc6 ifljbvrqroccc6 = this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0;
        if (looperMyLooper == ifljbvrqroccc6.getLooper()) {
            b1EoSIRjJHO5();
        } else {
            ifljbvrqroccc6.post(new YqOiSVb2wSv9Lq63qb(12, this));
        }
    }

    @Override // v.s.Irpcf8dxYWkn3XNhG
    public final void w9sT1Swbhx3hs(int i) {
        Looper looperMyLooper = Looper.myLooper();
        iFLJbvrqroccc6 ifljbvrqroccc6 = this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0;
        if (looperMyLooper == ifljbvrqroccc6.getLooper()) {
            pyu8ovAipBTLYAiKab(i);
        } else {
            ifljbvrqroccc6.post(new cc1Kpxq5ItylWb495tu(this, i, 1));
        }
    }

    public final void wotphlvK9sPbXJ(IAoJ6MjurI42ZsE iAoJ6MjurI42ZsE) {
        SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0);
        boolean zDDIMxZXP1V8HdM = this.Ee8d2j4S9Vm5yGuR.dDIMxZXP1V8HdM();
        LinkedList linkedList = this.JXn4Qf7zpnLjP5;
        if (zDDIMxZXP1V8HdM) {
            if (hjneShqpF9Tis4(iAoJ6MjurI42ZsE)) {
                D5P1xCAyuvgF();
                return;
            } else {
                linkedList.add(iAoJ6MjurI42ZsE);
                return;
            }
        }
        linkedList.add(iAoJ6MjurI42ZsE);
        nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd = this.gIIiyi2ddlMDR0;
        if (nyzdwrpxoi7nqmd == null || nyzdwrpxoi7nqmd.vekpFI4d1Nc4fakF == 0 || nyzdwrpxoi7nqmd.JXn4Qf7zpnLjP5 == null) {
            gIIiyi2ddlMDR0();
        } else {
            Qrz92kRPw4GcghAc(nyzdwrpxoi7nqmd, null);
        }
    }

    public final void xDyLpEZyrcKVe0(Status status, Exception exc, boolean z) {
        SbxdZ6Kq2uhHQ5RPRqm.JXn4Qf7zpnLjP5(this.wotphlvK9sPbXJ.gIIiyi2ddlMDR0);
        int i = (-31) + 32;
        int i2 = status != null ? 0 : i;
        if (exc != null) {
            i = 0;
        }
        if (i2 == i) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.JXn4Qf7zpnLjP5.iterator();
        while (it.hasNext()) {
            IAoJ6MjurI42ZsE iAoJ6MjurI42ZsE = (IAoJ6MjurI42ZsE) it.next();
            if (!z || iAoJ6MjurI42ZsE.dDIMxZXP1V8HdM == 2) {
                if (status != null) {
                    iAoJ6MjurI42ZsE.vekpFI4d1Nc4fakF(status);
                } else {
                    iAoJ6MjurI42ZsE.JXn4Qf7zpnLjP5(exc);
                }
                it.remove();
            }
        }
    }
}

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import v.s.C37DGECHfvLDfGxxgQ9I;
import v.s.CXBnffhfeleWi;
import v.s.Es1n423DpwihY8I;
import v.s.Irpcf8dxYWkn3XNhG;
import v.s.K5l5kmuyJzrgUX;
import v.s.MPPGXLipja3aW;
import v.s.MyXXPLJTIAlf1q;
import v.s.SbxdZ6Kq2uhHQ5RPRqm;
import v.s.VjoqvUCgHSpPnaGc;
import v.s.VlWj8OWl0tBj2oBSb3;
import v.s.W8OnGfuXen8U;
import v.s.WO16ah7oTpx6o3e3a;
import v.s.YqOiSVb2wSv9Lq63qb;
import v.s.ZOu84RhGdb62AhIs;
import v.s.a4Aq5QBZFai3VwgjU;
import v.s.ae3ufUFlmQpITaPpj;
import v.s.eIfkxafADHUOlFqb;
import v.s.eJzD6jrSBjwYspq;
import v.s.eO2DRBl0g10gsbN7WKX;
import v.s.eTeIZwLyooQrZ0ICI9i;
import v.s.id5aTbnJ2wwrZgf8;
import v.s.m9U1Y5V2QncYDRyonv;
import v.s.nyZDwrpXoi7nqMd;
import v.s.qO0mf7kdV0mG092z;
import v.s.r5XEUfod5GSCCwq6c;
import v.s.tx2mRXNGxbMRUeJLCkv;
import v.s.x3KUHp0bS6JZ7;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class dDIMxZXP1V8HdM implements K5l5kmuyJzrgUX {
    public static final ZOu84RhGdb62AhIs[] dTS0S7eC32ubQH54j36 = new ZOu84RhGdb62AhIs[0];
    public IInterface D5P1xCAyuvgF;
    public volatile x3KUHp0bS6JZ7 DVTNwpDEVsUKuznof;
    public final ae3ufUFlmQpITaPpj Ee8d2j4S9Vm5yGuR;
    public boolean H9XlUr4OeMJFiXK;
    public final String J0zjQ7CAgohuxU20eCW6;
    public final MPPGXLipja3aW JXn4Qf7zpnLjP5;
    public final Set K7eEOBPYP9VIoHWTe;
    public volatile String MLSIo1htfMPWeB8V876L;
    public final r5XEUfod5GSCCwq6c Qrz92kRPw4GcghAc;
    public nyZDwrpXoi7nqMd XiR1pIn5878vVWd;
    public m9U1Y5V2QncYDRyonv b1EoSIRjJHO5;
    public volatile String dDIMxZXP1V8HdM;
    public int gIIiyi2ddlMDR0;
    public C37DGECHfvLDfGxxgQ9I gmNWMfvn6zlEj;
    public final ArrayList hjneShqpF9Tis4;
    public final Object ibVTtJUNfrGYbW;
    public final AtomicInteger l1V0lQr6TbwNKqHfXNbb;
    public final int nQilHWaqS401ZtR;
    public MyXXPLJTIAlf1q pyu8ovAipBTLYAiKab;
    public final Context vekpFI4d1Nc4fakF;
    public WO16ah7oTpx6o3e3a w9sT1Swbhx3hs;
    public final r5XEUfod5GSCCwq6c wotphlvK9sPbXJ;
    public final Object xDyLpEZyrcKVe0;

    public dDIMxZXP1V8HdM(Context context, Looper looper, int i, eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i, Irpcf8dxYWkn3XNhG irpcf8dxYWkn3XNhG, VjoqvUCgHSpPnaGc vjoqvUCgHSpPnaGc) {
        synchronized (MPPGXLipja3aW.ibVTtJUNfrGYbW) {
            try {
                if (MPPGXLipja3aW.b1EoSIRjJHO5 == null) {
                    MPPGXLipja3aW.b1EoSIRjJHO5 = new MPPGXLipja3aW(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        MPPGXLipja3aW mPPGXLipja3aW = MPPGXLipja3aW.b1EoSIRjJHO5;
        Object obj = a4Aq5QBZFai3VwgjU.w9sT1Swbhx3hs;
        SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(irpcf8dxYWkn3XNhG);
        SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(vjoqvUCgHSpPnaGc);
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = new r5XEUfod5GSCCwq6c(25, irpcf8dxYWkn3XNhG);
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c2 = new r5XEUfod5GSCCwq6c(26, vjoqvUCgHSpPnaGc);
        String str = (String) eteizwlyooqrz0ici9i.vekpFI4d1Nc4fakF;
        this.dDIMxZXP1V8HdM = null;
        this.xDyLpEZyrcKVe0 = new Object();
        this.ibVTtJUNfrGYbW = new Object();
        this.hjneShqpF9Tis4 = new ArrayList();
        this.gIIiyi2ddlMDR0 = 1;
        this.XiR1pIn5878vVWd = null;
        this.H9XlUr4OeMJFiXK = false;
        this.DVTNwpDEVsUKuznof = null;
        this.l1V0lQr6TbwNKqHfXNbb = new AtomicInteger(0);
        SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(context, "Context must not be null");
        this.vekpFI4d1Nc4fakF = context;
        SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(looper, "Looper must not be null");
        SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(mPPGXLipja3aW, "Supervisor must not be null");
        this.JXn4Qf7zpnLjP5 = mPPGXLipja3aW;
        this.Ee8d2j4S9Vm5yGuR = new ae3ufUFlmQpITaPpj(this, looper);
        this.nQilHWaqS401ZtR = i;
        this.wotphlvK9sPbXJ = r5xeufod5gsccwq6c;
        this.Qrz92kRPw4GcghAc = r5xeufod5gsccwq6c2;
        this.J0zjQ7CAgohuxU20eCW6 = str;
        Set set = (Set) eteizwlyooqrz0ici9i.w9sT1Swbhx3hs;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.K7eEOBPYP9VIoHWTe = set;
    }

    public static /* bridge */ /* synthetic */ boolean DVTNwpDEVsUKuznof(dDIMxZXP1V8HdM ddimxzxp1v8hdm, int i, int i2, IInterface iInterface) {
        synchronized (ddimxzxp1v8hdm.xDyLpEZyrcKVe0) {
            try {
                if (ddimxzxp1v8hdm.gIIiyi2ddlMDR0 != i) {
                    return false;
                }
                ddimxzxp1v8hdm.l1V0lQr6TbwNKqHfXNbb(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v.s.K5l5kmuyJzrgUX
    public final void D5P1xCAyuvgF() {
        if (!dDIMxZXP1V8HdM() || this.w9sT1Swbhx3hs == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // v.s.K5l5kmuyJzrgUX
    public final void Ee8d2j4S9Vm5yGuR(MyXXPLJTIAlf1q myXXPLJTIAlf1q) {
        this.pyu8ovAipBTLYAiKab = myXXPLJTIAlf1q;
        l1V0lQr6TbwNKqHfXNbb(2, null);
    }

    public abstract boolean H9XlUr4OeMJFiXK();

    public abstract Bundle J0zjQ7CAgohuxU20eCW6();

    @Override // v.s.K5l5kmuyJzrgUX
    public final void JXn4Qf7zpnLjP5(W8OnGfuXen8U w8OnGfuXen8U, Set set) {
        Bundle bundleJ0zjQ7CAgohuxU20eCW6 = J0zjQ7CAgohuxU20eCW6();
        int i = this.nQilHWaqS401ZtR;
        String str = this.MLSIo1htfMPWeB8V876L;
        int i2 = eIfkxafADHUOlFqb.dDIMxZXP1V8HdM;
        Scope[] scopeArr = tx2mRXNGxbMRUeJLCkv.nQilHWaqS401ZtR;
        Bundle bundle = new Bundle();
        ZOu84RhGdb62AhIs[] zOu84RhGdb62AhIsArr = tx2mRXNGxbMRUeJLCkv.J0zjQ7CAgohuxU20eCW6;
        tx2mRXNGxbMRUeJLCkv tx2mrxngxbmruejlckv = new tx2mRXNGxbMRUeJLCkv(105 - 99, i, i2, null, null, scopeArr, bundle, null, zOu84RhGdb62AhIsArr, zOu84RhGdb62AhIsArr, true, 0, false, str);
        tx2mrxngxbmruejlckv.Ee8d2j4S9Vm5yGuR = this.vekpFI4d1Nc4fakF.getPackageName();
        tx2mrxngxbmruejlckv.b1EoSIRjJHO5 = bundleJ0zjQ7CAgohuxU20eCW6;
        if (set != null) {
            tx2mrxngxbmruejlckv.ibVTtJUNfrGYbW = (Scope[]) set.toArray(new Scope[0]);
        }
        if (gIIiyi2ddlMDR0()) {
            tx2mrxngxbmruejlckv.pyu8ovAipBTLYAiKab = new Account("<<default account>>", "com.google");
            if (w8OnGfuXen8U != null) {
                tx2mrxngxbmruejlckv.xDyLpEZyrcKVe0 = ((CXBnffhfeleWi) w8OnGfuXen8U).JXn4Qf7zpnLjP5;
            }
        }
        tx2mrxngxbmruejlckv.D5P1xCAyuvgF = dTS0S7eC32ubQH54j36;
        tx2mrxngxbmruejlckv.hjneShqpF9Tis4 = nQilHWaqS401ZtR();
        try {
            try {
                synchronized (this.ibVTtJUNfrGYbW) {
                    try {
                        m9U1Y5V2QncYDRyonv m9u1y5v2qncydryonv = this.b1EoSIRjJHO5;
                        if (m9u1y5v2qncydryonv != null) {
                            m9u1y5v2qncydryonv.dDIMxZXP1V8HdM(new qO0mf7kdV0mG092z(this, this.l1V0lQr6TbwNKqHfXNbb.get()), tx2mrxngxbmruejlckv);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                int i3 = this.l1V0lQr6TbwNKqHfXNbb.get();
                ae3ufUFlmQpITaPpj ae3ufuflmqpitappj = this.Ee8d2j4S9Vm5yGuR;
                ae3ufuflmqpitappj.sendMessage(ae3ufuflmqpitappj.obtainMessage(1, i3, -1, new id5aTbnJ2wwrZgf8(this, 8, null, null)));
            }
        } catch (DeadObjectException unused2) {
            ae3ufUFlmQpITaPpj ae3ufuflmqpitappj2 = this.Ee8d2j4S9Vm5yGuR;
            ae3ufuflmqpitappj2.sendMessage(ae3ufuflmqpitappj2.obtainMessage(6, this.l1V0lQr6TbwNKqHfXNbb.get(), 3));
        } catch (SecurityException e) {
            throw e;
        }
    }

    public abstract String MLSIo1htfMPWeB8V876L();

    public abstract IInterface Qrz92kRPw4GcghAc(IBinder iBinder);

    public abstract String XiR1pIn5878vVWd();

    @Override // v.s.K5l5kmuyJzrgUX
    public final boolean b1EoSIRjJHO5() {
        boolean z;
        synchronized (this.xDyLpEZyrcKVe0) {
            int i = this.gIIiyi2ddlMDR0;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override // v.s.K5l5kmuyJzrgUX
    public final boolean dDIMxZXP1V8HdM() {
        boolean z;
        synchronized (this.xDyLpEZyrcKVe0) {
            z = this.gIIiyi2ddlMDR0 == 4;
        }
        return z;
    }

    @Override // v.s.K5l5kmuyJzrgUX
    public boolean gIIiyi2ddlMDR0() {
        return false;
    }

    @Override // v.s.K5l5kmuyJzrgUX
    public final void gmNWMfvn6zlEj() {
        this.l1V0lQr6TbwNKqHfXNbb.incrementAndGet();
        synchronized (this.hjneShqpF9Tis4) {
            try {
                int size = this.hjneShqpF9Tis4.size();
                for (int i = 0; i < size; i++) {
                    Es1n423DpwihY8I es1n423DpwihY8I = (Es1n423DpwihY8I) this.hjneShqpF9Tis4.get(i);
                    synchronized (es1n423DpwihY8I) {
                        es1n423DpwihY8I.dDIMxZXP1V8HdM = null;
                    }
                }
                this.hjneShqpF9Tis4.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.ibVTtJUNfrGYbW) {
            this.b1EoSIRjJHO5 = null;
        }
        l1V0lQr6TbwNKqHfXNbb(1, null);
    }

    @Override // v.s.K5l5kmuyJzrgUX
    public final String hjneShqpF9Tis4() {
        return this.dDIMxZXP1V8HdM;
    }

    public final void l1V0lQr6TbwNKqHfXNbb(int i, IInterface iInterface) {
        WO16ah7oTpx6o3e3a wO16ah7oTpx6o3e3a;
        if ((i == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.xDyLpEZyrcKVe0) {
            try {
                this.gIIiyi2ddlMDR0 = i;
                this.D5P1xCAyuvgF = iInterface;
                if (i == 1) {
                    C37DGECHfvLDfGxxgQ9I c37DGECHfvLDfGxxgQ9I = this.gmNWMfvn6zlEj;
                    if (c37DGECHfvLDfGxxgQ9I != null) {
                        MPPGXLipja3aW mPPGXLipja3aW = this.JXn4Qf7zpnLjP5;
                        String str = this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM;
                        SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(str);
                        this.w9sT1Swbhx3hs.getClass();
                        if (this.J0zjQ7CAgohuxU20eCW6 == null) {
                            this.vekpFI4d1Nc4fakF.getClass();
                        }
                        mPPGXLipja3aW.dDIMxZXP1V8HdM(str, c37DGECHfvLDfGxxgQ9I, this.w9sT1Swbhx3hs.w9sT1Swbhx3hs);
                        this.gmNWMfvn6zlEj = null;
                    }
                } else if (i == 2 || i == 3) {
                    C37DGECHfvLDfGxxgQ9I c37DGECHfvLDfGxxgQ9I2 = this.gmNWMfvn6zlEj;
                    if (c37DGECHfvLDfGxxgQ9I2 != null && (wO16ah7oTpx6o3e3a = this.w9sT1Swbhx3hs) != null) {
                        String str2 = wO16ah7oTpx6o3e3a.dDIMxZXP1V8HdM;
                        MPPGXLipja3aW mPPGXLipja3aW2 = this.JXn4Qf7zpnLjP5;
                        SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(str2);
                        this.w9sT1Swbhx3hs.getClass();
                        if (this.J0zjQ7CAgohuxU20eCW6 == null) {
                            this.vekpFI4d1Nc4fakF.getClass();
                        }
                        mPPGXLipja3aW2.dDIMxZXP1V8HdM(str2, c37DGECHfvLDfGxxgQ9I2, this.w9sT1Swbhx3hs.w9sT1Swbhx3hs);
                        this.l1V0lQr6TbwNKqHfXNbb.incrementAndGet();
                    }
                    C37DGECHfvLDfGxxgQ9I c37DGECHfvLDfGxxgQ9I3 = new C37DGECHfvLDfGxxgQ9I(this, this.l1V0lQr6TbwNKqHfXNbb.get());
                    this.gmNWMfvn6zlEj = c37DGECHfvLDfGxxgQ9I3;
                    String strXiR1pIn5878vVWd = XiR1pIn5878vVWd();
                    boolean zH9XlUr4OeMJFiXK = H9XlUr4OeMJFiXK();
                    this.w9sT1Swbhx3hs = new WO16ah7oTpx6o3e3a(strXiR1pIn5878vVWd, zH9XlUr4OeMJFiXK);
                    if (zH9XlUr4OeMJFiXK && ibVTtJUNfrGYbW() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM)));
                    }
                    MPPGXLipja3aW mPPGXLipja3aW3 = this.JXn4Qf7zpnLjP5;
                    String str3 = this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM;
                    SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(str3);
                    this.w9sT1Swbhx3hs.getClass();
                    String name = this.J0zjQ7CAgohuxU20eCW6;
                    if (name == null) {
                        name = this.vekpFI4d1Nc4fakF.getClass().getName();
                    }
                    if (!mPPGXLipja3aW3.w9sT1Swbhx3hs(new VlWj8OWl0tBj2oBSb3(str3, this.w9sT1Swbhx3hs.w9sT1Swbhx3hs), c37DGECHfvLDfGxxgQ9I3, name)) {
                        String str4 = this.w9sT1Swbhx3hs.dDIMxZXP1V8HdM;
                        int i2 = this.l1V0lQr6TbwNKqHfXNbb.get();
                        ae3ufUFlmQpITaPpj ae3ufuflmqpitappj = this.Ee8d2j4S9Vm5yGuR;
                        ae3ufuflmqpitappj.sendMessage(ae3ufuflmqpitappj.obtainMessage(7, i2, -1, new eO2DRBl0g10gsbN7WKX(this, 16)));
                    }
                } else if (i == 4) {
                    SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ZOu84RhGdb62AhIs[] nQilHWaqS401ZtR();

    @Override // v.s.K5l5kmuyJzrgUX
    public final ZOu84RhGdb62AhIs[] pyu8ovAipBTLYAiKab() {
        x3KUHp0bS6JZ7 x3kuhp0bs6jz7 = this.DVTNwpDEVsUKuznof;
        if (x3kuhp0bs6jz7 == null) {
            return null;
        }
        return x3kuhp0bs6jz7.vekpFI4d1Nc4fakF;
    }

    @Override // v.s.K5l5kmuyJzrgUX
    public final Set vekpFI4d1Nc4fakF() {
        return gIIiyi2ddlMDR0() ? this.K7eEOBPYP9VIoHWTe : Collections.EMPTY_SET;
    }

    @Override // v.s.K5l5kmuyJzrgUX
    public final void w9sT1Swbhx3hs(r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c) {
        ((eJzD6jrSBjwYspq) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).wotphlvK9sPbXJ.gIIiyi2ddlMDR0.post(new YqOiSVb2wSv9Lq63qb((-37) + 50, r5xeufod5gsccwq6c));
    }

    @Override // v.s.K5l5kmuyJzrgUX
    public final void xDyLpEZyrcKVe0(String str) {
        this.dDIMxZXP1V8HdM = str;
        gmNWMfvn6zlEj();
    }
}

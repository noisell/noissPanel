package v.s;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class tx2mRXNGxbMRUeJLCkv extends xfn2GJwmGqs7kWW {
    public ZOu84RhGdb62AhIs[] D5P1xCAyuvgF;
    public String Ee8d2j4S9Vm5yGuR;
    public final int JXn4Qf7zpnLjP5;
    public final String Qrz92kRPw4GcghAc;
    public Bundle b1EoSIRjJHO5;
    public final int gIIiyi2ddlMDR0;
    public final boolean gmNWMfvn6zlEj;
    public ZOu84RhGdb62AhIs[] hjneShqpF9Tis4;
    public Scope[] ibVTtJUNfrGYbW;
    public Account pyu8ovAipBTLYAiKab;
    public final int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;
    public final boolean wotphlvK9sPbXJ;
    public IBinder xDyLpEZyrcKVe0;
    public static final Parcelable.Creator<tx2mRXNGxbMRUeJLCkv> CREATOR = new hV4VTKNUdeHN(18);
    public static final Scope[] nQilHWaqS401ZtR = new Scope[0];
    public static final ZOu84RhGdb62AhIs[] J0zjQ7CAgohuxU20eCW6 = new ZOu84RhGdb62AhIs[0];

    public tx2mRXNGxbMRUeJLCkv(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, ZOu84RhGdb62AhIs[] zOu84RhGdb62AhIsArr, ZOu84RhGdb62AhIs[] zOu84RhGdb62AhIsArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? nQilHWaqS401ZtR : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        ZOu84RhGdb62AhIs[] zOu84RhGdb62AhIsArr3 = J0zjQ7CAgohuxU20eCW6;
        zOu84RhGdb62AhIsArr = zOu84RhGdb62AhIsArr == null ? zOu84RhGdb62AhIsArr3 : zOu84RhGdb62AhIsArr;
        zOu84RhGdb62AhIsArr2 = zOu84RhGdb62AhIsArr2 == null ? zOu84RhGdb62AhIsArr3 : zOu84RhGdb62AhIsArr2;
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = i2;
        this.JXn4Qf7zpnLjP5 = i3;
        if ("com.google.android.gms".equals(str)) {
            this.Ee8d2j4S9Vm5yGuR = "com.google.android.gms";
        } else {
            this.Ee8d2j4S9Vm5yGuR = str;
        }
        if (i < 2) {
            Account accountDDIMxZXP1V8HdM = null;
            if (iBinder != null) {
                int i5 = tne6mXOUFKdd.Ee8d2j4S9Vm5yGuR;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                W8OnGfuXen8U cXBnffhfeleWi = iInterfaceQueryLocalInterface instanceof W8OnGfuXen8U ? (W8OnGfuXen8U) iInterfaceQueryLocalInterface : new CXBnffhfeleWi(iBinder);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    accountDDIMxZXP1V8HdM = ((CXBnffhfeleWi) cXBnffhfeleWi).dDIMxZXP1V8HdM();
                } catch (RemoteException unused) {
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            this.pyu8ovAipBTLYAiKab = accountDDIMxZXP1V8HdM;
        } else {
            this.xDyLpEZyrcKVe0 = iBinder;
            this.pyu8ovAipBTLYAiKab = account;
        }
        this.ibVTtJUNfrGYbW = scopeArr;
        this.b1EoSIRjJHO5 = bundle;
        this.D5P1xCAyuvgF = zOu84RhGdb62AhIsArr;
        this.hjneShqpF9Tis4 = zOu84RhGdb62AhIsArr2;
        this.gmNWMfvn6zlEj = z;
        this.gIIiyi2ddlMDR0 = i4;
        this.wotphlvK9sPbXJ = z2;
        this.Qrz92kRPw4GcghAc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        hV4VTKNUdeHN.dDIMxZXP1V8HdM(this, parcel, i);
    }
}

package v.s;

import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.Parcel;
import androidx.activity.ComponentActivity;
import androidx.savedstate.Recreator;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class RpiSWFqg6frykGldgWGU {
    public boolean dDIMxZXP1V8HdM;
    public Object vekpFI4d1Nc4fakF;
    public final Object w9sT1Swbhx3hs;

    public RpiSWFqg6frykGldgWGU() {
        this.w9sT1Swbhx3hs = new Object();
    }

    private static /* synthetic */ void woxceapm() {
    }

    public void JXn4Qf7zpnLjP5(DfUmSWZwfhCUz dfUmSWZwfhCUz) {
        mGaPxoF31EmsFEK2oD mgapxof31emsfek2od;
        synchronized (this.w9sT1Swbhx3hs) {
            if (((ArrayDeque) this.vekpFI4d1Nc4fakF) != null && !this.dDIMxZXP1V8HdM) {
                this.dDIMxZXP1V8HdM = true;
                while (true) {
                    synchronized (this.w9sT1Swbhx3hs) {
                        try {
                            mgapxof31emsfek2od = (mGaPxoF31EmsFEK2oD) ((ArrayDeque) this.vekpFI4d1Nc4fakF).poll();
                            if (mgapxof31emsfek2od == null) {
                                this.dDIMxZXP1V8HdM = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    mgapxof31emsfek2od.w9sT1Swbhx3hs(dfUmSWZwfhCUz);
                }
            }
        }
    }

    public void dDIMxZXP1V8HdM(K5l5kmuyJzrgUX k5l5kmuyJzrgUX, al3CoDKXO0nvx al3codkxo0nvx) {
        IInterface iInterface;
        N3OQwXegjg1zeRF n3OQwXegjg1zeRF = (N3OQwXegjg1zeRF) ((r5XEUfod5GSCCwq6c) ((r5XEUfod5GSCCwq6c) this.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF;
        erZKFX6OwHmny8Sd6 erzkfx6owhmny8sd6 = (erZKFX6OwHmny8Sd6) k5l5kmuyJzrgUX;
        synchronized (erzkfx6owhmny8sd6.xDyLpEZyrcKVe0) {
            if (erzkfx6owhmny8sd6.gIIiyi2ddlMDR0 == 5) {
                throw new DeadObjectException();
            }
            if (!erzkfx6owhmny8sd6.dDIMxZXP1V8HdM()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = erzkfx6owhmny8sd6.D5P1xCAyuvgF;
            SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(iInterface, "Client is connected but service is null");
        }
        TWNI5JFAawh52MYAtBI7 tWNI5JFAawh52MYAtBI7 = (TWNI5JFAawh52MYAtBI7) iInterface;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(tWNI5JFAawh52MYAtBI7.Ee8d2j4S9Vm5yGuR);
        int i = pQKK1gEgDA9b1W.dDIMxZXP1V8HdM;
        int i2 = (-25) + 26;
        if (n3OQwXegjg1zeRF == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(i2);
            n3OQwXegjg1zeRF.writeToParcel(parcelObtain, 0);
        }
        try {
            tWNI5JFAawh52MYAtBI7.JXn4Qf7zpnLjP5.transact(i2, parcelObtain, null, i2);
            parcelObtain.recycle();
            al3codkxo0nvx.dDIMxZXP1V8HdM(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public void vekpFI4d1Nc4fakF(mGaPxoF31EmsFEK2oD mgapxof31emsfek2od) {
        synchronized (this.w9sT1Swbhx3hs) {
            try {
                if (((ArrayDeque) this.vekpFI4d1Nc4fakF) == null) {
                    this.vekpFI4d1Nc4fakF = new ArrayDeque();
                }
                ((ArrayDeque) this.vekpFI4d1Nc4fakF).add(mgapxof31emsfek2od);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w9sT1Swbhx3hs() {
        ComponentActivity componentActivity = (ComponentActivity) this.w9sT1Swbhx3hs;
        p9Dc9HHikKZdWDIj p9dc9hhikkzdwdij = componentActivity.JXn4Qf7zpnLjP5;
        if (p9dc9hhikkzdwdij.vekpFI4d1Nc4fakF != lK1IHVVetx4U.vekpFI4d1Nc4fakF) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        p9dc9hhikkzdwdij.dDIMxZXP1V8HdM(new Recreator(componentActivity));
        final Nb7UID66gn18B nb7UID66gn18B = (Nb7UID66gn18B) this.vekpFI4d1Nc4fakF;
        if (nb7UID66gn18B.w9sT1Swbhx3hs) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        p9dc9hhikkzdwdij.dDIMxZXP1V8HdM(new OGI3jG3mkhPSTcSz() { // from class: v.s.TgEoTLaiYxs1
            private static /* synthetic */ void gytmbdkes() {
            }

            @Override // v.s.OGI3jG3mkhPSTcSz
            public final void dDIMxZXP1V8HdM(Xdb7JFhCToIIjDFJDI xdb7JFhCToIIjDFJDI, Jf9nGec8iqajtj jf9nGec8iqajtj) {
                Jf9nGec8iqajtj jf9nGec8iqajtj2 = Jf9nGec8iqajtj.ON_START;
                Nb7UID66gn18B nb7UID66gn18B2 = nb7UID66gn18B;
                if (jf9nGec8iqajtj == jf9nGec8iqajtj2) {
                    nb7UID66gn18B2.xDyLpEZyrcKVe0 = true;
                } else if (jf9nGec8iqajtj == Jf9nGec8iqajtj.ON_STOP) {
                    nb7UID66gn18B2.xDyLpEZyrcKVe0 = false;
                }
            }
        });
        nb7UID66gn18B.w9sT1Swbhx3hs = true;
        this.dDIMxZXP1V8HdM = true;
    }

    public RpiSWFqg6frykGldgWGU(r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c, ZOu84RhGdb62AhIs[] zOu84RhGdb62AhIsArr, boolean z) {
        this.vekpFI4d1Nc4fakF = r5xeufod5gsccwq6c;
        this.w9sT1Swbhx3hs = zOu84RhGdb62AhIsArr;
        boolean z2 = false;
        if (zOu84RhGdb62AhIsArr != null && z) {
            z2 = true;
        }
        this.dDIMxZXP1V8HdM = z2;
    }

    public RpiSWFqg6frykGldgWGU(ComponentActivity componentActivity) {
        this.w9sT1Swbhx3hs = componentActivity;
        this.vekpFI4d1Nc4fakF = new Nb7UID66gn18B();
    }

    public RpiSWFqg6frykGldgWGU(hdTfMdJZjw4WRaUiIL8 hdtfmdjzjw4wrauiil8) {
        this.w9sT1Swbhx3hs = new Object();
        this.vekpFI4d1Nc4fakF = new ArrayList();
    }
}

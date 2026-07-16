package v.s;

import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class hqXdb5QpExRzJuC6iUi extends GYkdAGGWWPCn2kb8Q implements Rer5a68cz8F5jVaTlTlc {
    public final int Ee8d2j4S9Vm5yGuR;

    public hqXdb5QpExRzJuC6iUi(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.Ee8d2j4S9Vm5yGuR = Arrays.hashCode(bArr);
    }

    public static byte[] Ee8d2j4S9Vm5yGuR(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    private static /* synthetic */ void mxmiktrle() {
    }

    @Override // v.s.GYkdAGGWWPCn2kb8Q
    public final boolean JXn4Qf7zpnLjP5(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.Ee8d2j4S9Vm5yGuR);
            return true;
        }
        TnXwHib9BYoBE tnXwHib9BYoBE = new TnXwHib9BYoBE(xDyLpEZyrcKVe0());
        parcel2.writeNoException();
        int i2 = wuBAPrVsWrOr6aKUnfP.dDIMxZXP1V8HdM;
        parcel2.writeStrongBinder(tnXwHib9BYoBE);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Rer5a68cz8F5jVaTlTlc)) {
            return false;
        }
        try {
            Rer5a68cz8F5jVaTlTlc rer5a68cz8F5jVaTlTlc = (Rer5a68cz8F5jVaTlTlc) obj;
            if (((hqXdb5QpExRzJuC6iUi) rer5a68cz8F5jVaTlTlc).Ee8d2j4S9Vm5yGuR != this.Ee8d2j4S9Vm5yGuR) {
                return false;
            }
            return Arrays.equals(xDyLpEZyrcKVe0(), (byte[]) new TnXwHib9BYoBE(((hqXdb5QpExRzJuC6iUi) rer5a68cz8F5jVaTlTlc).xDyLpEZyrcKVe0()).Ee8d2j4S9Vm5yGuR);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.Ee8d2j4S9Vm5yGuR;
    }

    public abstract byte[] xDyLpEZyrcKVe0();
}

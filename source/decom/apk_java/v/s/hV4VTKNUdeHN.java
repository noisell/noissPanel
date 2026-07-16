package v.s;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class hV4VTKNUdeHN implements Parcelable.Creator {
    public final /* synthetic */ int dDIMxZXP1V8HdM;

    public /* synthetic */ hV4VTKNUdeHN(int i) {
        this.dDIMxZXP1V8HdM = i;
    }

    public static void dDIMxZXP1V8HdM(tx2mRXNGxbMRUeJLCkv tx2mrxngxbmruejlckv, Parcel parcel, int i) {
        int iMLSIo1htfMPWeB8V876L = RIZfHbqXpth8r2yN4.MLSIo1htfMPWeB8V876L(parcel, 20330 - 37);
        int i2 = tx2mrxngxbmruejlckv.w9sT1Swbhx3hs;
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = tx2mrxngxbmruejlckv.vekpFI4d1Nc4fakF;
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = tx2mrxngxbmruejlckv.JXn4Qf7zpnLjP5;
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 3, 4);
        parcel.writeInt(i4);
        RIZfHbqXpth8r2yN4.nQilHWaqS401ZtR(parcel, 4, tx2mrxngxbmruejlckv.Ee8d2j4S9Vm5yGuR);
        IBinder iBinder = tx2mrxngxbmruejlckv.xDyLpEZyrcKVe0;
        if (iBinder != null) {
            int iMLSIo1htfMPWeB8V876L2 = RIZfHbqXpth8r2yN4.MLSIo1htfMPWeB8V876L(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            RIZfHbqXpth8r2yN4.XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L2);
        }
        RIZfHbqXpth8r2yN4.J0zjQ7CAgohuxU20eCW6(parcel, 6, tx2mrxngxbmruejlckv.ibVTtJUNfrGYbW, i);
        RIZfHbqXpth8r2yN4.wotphlvK9sPbXJ(parcel, 7, tx2mrxngxbmruejlckv.b1EoSIRjJHO5);
        RIZfHbqXpth8r2yN4.Qrz92kRPw4GcghAc(parcel, 8, tx2mrxngxbmruejlckv.pyu8ovAipBTLYAiKab, i);
        RIZfHbqXpth8r2yN4.J0zjQ7CAgohuxU20eCW6(parcel, 10, tx2mrxngxbmruejlckv.D5P1xCAyuvgF, i);
        RIZfHbqXpth8r2yN4.J0zjQ7CAgohuxU20eCW6(parcel, 11, tx2mrxngxbmruejlckv.hjneShqpF9Tis4, i);
        boolean z = tx2mrxngxbmruejlckv.gmNWMfvn6zlEj;
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = tx2mrxngxbmruejlckv.gIIiyi2ddlMDR0;
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 85 - 72, 4);
        parcel.writeInt(i5);
        boolean z2 = tx2mrxngxbmruejlckv.wotphlvK9sPbXJ;
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        RIZfHbqXpth8r2yN4.nQilHWaqS401ZtR(parcel, 15, tx2mrxngxbmruejlckv.Qrz92kRPw4GcghAc);
        RIZfHbqXpth8r2yN4.XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                return new k84rwRrqzhrNQ1CdNQ9(parcel);
            case 1:
                return new zanAuj2ot0jORaEjW(parcel);
            case 2:
                iy6XJYBMukwASsw iy6xjybmukwassw = new iy6XJYBMukwASsw();
                iy6xjybmukwassw.Ee8d2j4S9Vm5yGuR = -1;
                iy6xjybmukwassw.w9sT1Swbhx3hs = (RaNTLh2L5X1WKOT[]) parcel.createTypedArray(RaNTLh2L5X1WKOT.CREATOR);
                iy6xjybmukwassw.vekpFI4d1Nc4fakF = parcel.createIntArray();
                iy6xjybmukwassw.JXn4Qf7zpnLjP5 = (zanAuj2ot0jORaEjW[]) parcel.createTypedArray(zanAuj2ot0jORaEjW.CREATOR);
                iy6xjybmukwassw.Ee8d2j4S9Vm5yGuR = parcel.readInt();
                iy6xjybmukwassw.xDyLpEZyrcKVe0 = parcel.readInt();
                return iy6xjybmukwassw;
            case 3:
                return new RaNTLh2L5X1WKOT(parcel);
            case 4:
                return new nzWPpxYjW7WqeEd(parcel);
            case 5:
                return new ParcelImpl(parcel);
            case 6:
                int iFivkjwgu2UdAtiY = FZ1sl4mHq4J0hOEYC.fivkjwgu2UdAtiY(parcel);
                Bundle bundleD5P1xCAyuvgF = null;
                while (parcel.dataPosition() < iFivkjwgu2UdAtiY) {
                    int i = parcel.readInt();
                    if (((char) i) != 2) {
                        FZ1sl4mHq4J0hOEYC.xfn2GJwmGqs7kWW(parcel, i);
                    } else {
                        bundleD5P1xCAyuvgF = FZ1sl4mHq4J0hOEYC.D5P1xCAyuvgF(parcel, i);
                    }
                }
                FZ1sl4mHq4J0hOEYC.nQilHWaqS401ZtR(parcel, iFivkjwgu2UdAtiY);
                return new D3nkzQlSKjHnRbwlOY(bundleD5P1xCAyuvgF);
            case 7:
                int iFivkjwgu2UdAtiY2 = FZ1sl4mHq4J0hOEYC.fivkjwgu2UdAtiY(parcel);
                int iVIJudZvPyTuNp = 0;
                while (true) {
                    ArrayList arrayListCreateTypedArrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iFivkjwgu2UdAtiY2) {
                            FZ1sl4mHq4J0hOEYC.nQilHWaqS401ZtR(parcel, iFivkjwgu2UdAtiY2);
                            return new N3OQwXegjg1zeRF(iVIJudZvPyTuNp, arrayListCreateTypedArrayList);
                        }
                        int i2 = parcel.readInt();
                        char c = (char) i2;
                        if (c == 1) {
                            iVIJudZvPyTuNp = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i2);
                        } else if (c != 2) {
                            FZ1sl4mHq4J0hOEYC.xfn2GJwmGqs7kWW(parcel, i2);
                        } else {
                            Parcelable.Creator<w9v51G65RB8JcT> creator = w9v51G65RB8JcT.CREATOR;
                            int iRCHnHJBAlOpNI5 = FZ1sl4mHq4J0hOEYC.rCHnHJBAlOpNI5(parcel, i2);
                            int iDataPosition = parcel.dataPosition();
                            if (iRCHnHJBAlOpNI5 == 0) {
                            }
                            arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(iDataPosition + iRCHnHJBAlOpNI5);
                        }
                        break;
                    }
                }
                break;
            case 8:
                int iFivkjwgu2UdAtiY3 = FZ1sl4mHq4J0hOEYC.fivkjwgu2UdAtiY(parcel);
                int iVIJudZvPyTuNp2 = 0;
                int iVIJudZvPyTuNp3 = 0;
                int iVIJudZvPyTuNp4 = 0;
                int iVIJudZvPyTuNp5 = 0;
                long j = 0;
                long j2 = 0;
                String strGmNWMfvn6zlEj = null;
                String strGmNWMfvn6zlEj2 = null;
                int iVIJudZvPyTuNp6 = -1;
                while (parcel.dataPosition() < iFivkjwgu2UdAtiY3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            iVIJudZvPyTuNp2 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i3);
                            break;
                        case 2:
                            iVIJudZvPyTuNp3 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i3);
                            break;
                        case 3:
                            iVIJudZvPyTuNp4 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i3);
                            break;
                        case 4:
                            FZ1sl4mHq4J0hOEYC.ECwLkmPW1UKz7J6E(parcel, i3, 8);
                            j = parcel.readLong();
                            break;
                        case 5:
                            FZ1sl4mHq4J0hOEYC.ECwLkmPW1UKz7J6E(parcel, i3, 8);
                            j2 = parcel.readLong();
                            break;
                        case 6:
                            strGmNWMfvn6zlEj = FZ1sl4mHq4J0hOEYC.gmNWMfvn6zlEj(parcel, i3);
                            break;
                        case 7:
                            strGmNWMfvn6zlEj2 = FZ1sl4mHq4J0hOEYC.gmNWMfvn6zlEj(parcel, i3);
                            break;
                        case '\b':
                            iVIJudZvPyTuNp5 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i3);
                            break;
                        case '\t':
                            iVIJudZvPyTuNp6 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i3);
                            break;
                        default:
                            FZ1sl4mHq4J0hOEYC.xfn2GJwmGqs7kWW(parcel, i3);
                            break;
                    }
                }
                FZ1sl4mHq4J0hOEYC.nQilHWaqS401ZtR(parcel, iFivkjwgu2UdAtiY3);
                return new w9v51G65RB8JcT(iVIJudZvPyTuNp2, iVIJudZvPyTuNp3, iVIJudZvPyTuNp4, j, j2, strGmNWMfvn6zlEj, strGmNWMfvn6zlEj2, iVIJudZvPyTuNp5, iVIJudZvPyTuNp6);
            case 9:
                int iFivkjwgu2UdAtiY4 = FZ1sl4mHq4J0hOEYC.fivkjwgu2UdAtiY(parcel);
                int iVIJudZvPyTuNp7 = 0;
                String strGmNWMfvn6zlEj3 = null;
                while (parcel.dataPosition() < iFivkjwgu2UdAtiY4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        iVIJudZvPyTuNp7 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i4);
                    } else if (c2 != 2) {
                        FZ1sl4mHq4J0hOEYC.xfn2GJwmGqs7kWW(parcel, i4);
                    } else {
                        strGmNWMfvn6zlEj3 = FZ1sl4mHq4J0hOEYC.gmNWMfvn6zlEj(parcel, i4);
                    }
                }
                FZ1sl4mHq4J0hOEYC.nQilHWaqS401ZtR(parcel, iFivkjwgu2UdAtiY4);
                return new Scope(strGmNWMfvn6zlEj3, iVIJudZvPyTuNp7);
            case 10:
                int iFivkjwgu2UdAtiY5 = FZ1sl4mHq4J0hOEYC.fivkjwgu2UdAtiY(parcel);
                int iVIJudZvPyTuNp8 = 0;
                boolean zYTljMGnIibTRdOpSh4 = false;
                boolean zYTljMGnIibTRdOpSh5 = false;
                int iVIJudZvPyTuNp9 = 0;
                int iVIJudZvPyTuNp10 = 0;
                while (parcel.dataPosition() < iFivkjwgu2UdAtiY5) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        iVIJudZvPyTuNp8 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i5);
                    } else if (c3 == 2) {
                        zYTljMGnIibTRdOpSh4 = FZ1sl4mHq4J0hOEYC.yTljMGnIibTRdOpSh4(parcel, i5);
                    } else if (c3 == 3) {
                        zYTljMGnIibTRdOpSh5 = FZ1sl4mHq4J0hOEYC.yTljMGnIibTRdOpSh4(parcel, i5);
                    } else if (c3 == (-84) + 88) {
                        iVIJudZvPyTuNp9 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i5);
                    } else if (c3 != 46 - 41) {
                        FZ1sl4mHq4J0hOEYC.xfn2GJwmGqs7kWW(parcel, i5);
                    } else {
                        iVIJudZvPyTuNp10 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i5);
                    }
                }
                FZ1sl4mHq4J0hOEYC.nQilHWaqS401ZtR(parcel, iFivkjwgu2UdAtiY5);
                return new dNxaWFwJquYPxV(iVIJudZvPyTuNp8, zYTljMGnIibTRdOpSh4, zYTljMGnIibTRdOpSh5, iVIJudZvPyTuNp9, iVIJudZvPyTuNp10);
            case 11:
                int iFivkjwgu2UdAtiY6 = FZ1sl4mHq4J0hOEYC.fivkjwgu2UdAtiY(parcel);
                int iVIJudZvPyTuNp11 = 0;
                PendingIntent pendingIntent = null;
                String strGmNWMfvn6zlEj4 = null;
                int iVIJudZvPyTuNp12 = 0;
                while (parcel.dataPosition() < iFivkjwgu2UdAtiY6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        iVIJudZvPyTuNp11 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i6);
                    } else if (c4 == 2) {
                        iVIJudZvPyTuNp12 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i6);
                    } else if (c4 == 3) {
                        pendingIntent = (PendingIntent) FZ1sl4mHq4J0hOEYC.hjneShqpF9Tis4(parcel, i6, PendingIntent.CREATOR);
                    } else if (c4 != 4) {
                        FZ1sl4mHq4J0hOEYC.xfn2GJwmGqs7kWW(parcel, i6);
                    } else {
                        strGmNWMfvn6zlEj4 = FZ1sl4mHq4J0hOEYC.gmNWMfvn6zlEj(parcel, i6);
                    }
                }
                FZ1sl4mHq4J0hOEYC.nQilHWaqS401ZtR(parcel, iFivkjwgu2UdAtiY6);
                return new nyZDwrpXoi7nqMd(iVIJudZvPyTuNp11, iVIJudZvPyTuNp12, pendingIntent, strGmNWMfvn6zlEj4);
            case 12:
                int iFivkjwgu2UdAtiY7 = FZ1sl4mHq4J0hOEYC.fivkjwgu2UdAtiY(parcel);
                int iVIJudZvPyTuNp13 = 0;
                int iVIJudZvPyTuNp14 = 0;
                String strGmNWMfvn6zlEj5 = null;
                PendingIntent pendingIntent2 = null;
                nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd = null;
                while (parcel.dataPosition() < iFivkjwgu2UdAtiY7) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        iVIJudZvPyTuNp14 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i7);
                    } else if (c5 == 2) {
                        strGmNWMfvn6zlEj5 = FZ1sl4mHq4J0hOEYC.gmNWMfvn6zlEj(parcel, i7);
                    } else if (c5 == 3) {
                        pendingIntent2 = (PendingIntent) FZ1sl4mHq4J0hOEYC.hjneShqpF9Tis4(parcel, i7, PendingIntent.CREATOR);
                    } else if (c5 == 4) {
                        nyzdwrpxoi7nqmd = (nyZDwrpXoi7nqMd) FZ1sl4mHq4J0hOEYC.hjneShqpF9Tis4(parcel, i7, nyZDwrpXoi7nqMd.CREATOR);
                    } else if (c5 != 1000) {
                        FZ1sl4mHq4J0hOEYC.xfn2GJwmGqs7kWW(parcel, i7);
                    } else {
                        iVIJudZvPyTuNp13 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i7);
                    }
                }
                FZ1sl4mHq4J0hOEYC.nQilHWaqS401ZtR(parcel, iFivkjwgu2UdAtiY7);
                return new Status(iVIJudZvPyTuNp13, iVIJudZvPyTuNp14, strGmNWMfvn6zlEj5, pendingIntent2, nyzdwrpxoi7nqmd);
            case 13:
                int iFivkjwgu2UdAtiY8 = FZ1sl4mHq4J0hOEYC.fivkjwgu2UdAtiY(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iFivkjwgu2UdAtiY8) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 39 - 38) {
                        FZ1sl4mHq4J0hOEYC.xfn2GJwmGqs7kWW(parcel, i8);
                    } else {
                        intent = (Intent) FZ1sl4mHq4J0hOEYC.hjneShqpF9Tis4(parcel, i8, Intent.CREATOR);
                    }
                }
                FZ1sl4mHq4J0hOEYC.nQilHWaqS401ZtR(parcel, iFivkjwgu2UdAtiY8);
                return new nEBfUTMY8S8i6NO(intent);
            case 14:
                int iFivkjwgu2UdAtiY9 = FZ1sl4mHq4J0hOEYC.fivkjwgu2UdAtiY(parcel);
                String strGmNWMfvn6zlEj6 = null;
                int iVIJudZvPyTuNp15 = 0;
                long j3 = -1;
                while (parcel.dataPosition() < iFivkjwgu2UdAtiY9) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        strGmNWMfvn6zlEj6 = FZ1sl4mHq4J0hOEYC.gmNWMfvn6zlEj(parcel, i9);
                    } else if (c6 == 2) {
                        iVIJudZvPyTuNp15 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i9);
                    } else if (c6 != 3) {
                        FZ1sl4mHq4J0hOEYC.xfn2GJwmGqs7kWW(parcel, i9);
                    } else {
                        FZ1sl4mHq4J0hOEYC.ECwLkmPW1UKz7J6E(parcel, i9, 8);
                        j3 = parcel.readLong();
                    }
                }
                FZ1sl4mHq4J0hOEYC.nQilHWaqS401ZtR(parcel, iFivkjwgu2UdAtiY9);
                return new ZOu84RhGdb62AhIs(iVIJudZvPyTuNp15, j3, strGmNWMfvn6zlEj6);
            case 15:
                return new D3FfxRNDtw22r(parcel.readStrongBinder());
            case 16:
                int iFivkjwgu2UdAtiY10 = FZ1sl4mHq4J0hOEYC.fivkjwgu2UdAtiY(parcel);
                Bundle bundleD5P1xCAyuvgF2 = null;
                M4lemeLkQY8LkWIp m4lemeLkQY8LkWIp = null;
                int iVIJudZvPyTuNp16 = 0;
                ZOu84RhGdb62AhIs[] zOu84RhGdb62AhIsArr = null;
                while (parcel.dataPosition() < iFivkjwgu2UdAtiY10) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        bundleD5P1xCAyuvgF2 = FZ1sl4mHq4J0hOEYC.D5P1xCAyuvgF(parcel, i10);
                    } else if (c7 == (-27) + 29) {
                        zOu84RhGdb62AhIsArr = (ZOu84RhGdb62AhIs[]) FZ1sl4mHq4J0hOEYC.gIIiyi2ddlMDR0(parcel, i10, ZOu84RhGdb62AhIs.CREATOR);
                    } else if (c7 == 3) {
                        iVIJudZvPyTuNp16 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i10);
                    } else if (c7 != (-4) + 8) {
                        FZ1sl4mHq4J0hOEYC.xfn2GJwmGqs7kWW(parcel, i10);
                    } else {
                        m4lemeLkQY8LkWIp = (M4lemeLkQY8LkWIp) FZ1sl4mHq4J0hOEYC.hjneShqpF9Tis4(parcel, i10, M4lemeLkQY8LkWIp.CREATOR);
                    }
                }
                FZ1sl4mHq4J0hOEYC.nQilHWaqS401ZtR(parcel, iFivkjwgu2UdAtiY10);
                x3KUHp0bS6JZ7 x3kuhp0bs6jz7 = new x3KUHp0bS6JZ7();
                x3kuhp0bs6jz7.w9sT1Swbhx3hs = bundleD5P1xCAyuvgF2;
                x3kuhp0bs6jz7.vekpFI4d1Nc4fakF = zOu84RhGdb62AhIsArr;
                x3kuhp0bs6jz7.JXn4Qf7zpnLjP5 = iVIJudZvPyTuNp16;
                x3kuhp0bs6jz7.Ee8d2j4S9Vm5yGuR = m4lemeLkQY8LkWIp;
                return x3kuhp0bs6jz7;
            case 17:
                int iFivkjwgu2UdAtiY11 = FZ1sl4mHq4J0hOEYC.fivkjwgu2UdAtiY(parcel);
                dNxaWFwJquYPxV dnxawfwjquypxv = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zYTljMGnIibTRdOpSh6 = false;
                boolean zYTljMGnIibTRdOpSh7 = false;
                int iVIJudZvPyTuNp17 = 0;
                while (parcel.dataPosition() < iFivkjwgu2UdAtiY11) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            dnxawfwjquypxv = (dNxaWFwJquYPxV) FZ1sl4mHq4J0hOEYC.hjneShqpF9Tis4(parcel, i11, dNxaWFwJquYPxV.CREATOR);
                            break;
                        case 2:
                            zYTljMGnIibTRdOpSh6 = FZ1sl4mHq4J0hOEYC.yTljMGnIibTRdOpSh4(parcel, i11);
                            break;
                        case 3:
                            zYTljMGnIibTRdOpSh7 = FZ1sl4mHq4J0hOEYC.yTljMGnIibTRdOpSh4(parcel, i11);
                            break;
                        case 4:
                            int iRCHnHJBAlOpNI6 = FZ1sl4mHq4J0hOEYC.rCHnHJBAlOpNI5(parcel, i11);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iRCHnHJBAlOpNI6 != 0) {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iRCHnHJBAlOpNI6);
                            } else {
                                iArrCreateIntArray = null;
                            }
                            break;
                        case 5:
                            iVIJudZvPyTuNp17 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i11);
                            break;
                        case 6:
                            int iRCHnHJBAlOpNI7 = FZ1sl4mHq4J0hOEYC.rCHnHJBAlOpNI5(parcel, i11);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iRCHnHJBAlOpNI7 != 0) {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition3 + iRCHnHJBAlOpNI7);
                            } else {
                                iArrCreateIntArray2 = null;
                            }
                            break;
                        default:
                            FZ1sl4mHq4J0hOEYC.xfn2GJwmGqs7kWW(parcel, i11);
                            break;
                    }
                }
                FZ1sl4mHq4J0hOEYC.nQilHWaqS401ZtR(parcel, iFivkjwgu2UdAtiY11);
                return new M4lemeLkQY8LkWIp(dnxawfwjquypxv, zYTljMGnIibTRdOpSh6, zYTljMGnIibTRdOpSh7, iArrCreateIntArray, iVIJudZvPyTuNp17, iArrCreateIntArray2);
            default:
                int iFivkjwgu2UdAtiY12 = FZ1sl4mHq4J0hOEYC.fivkjwgu2UdAtiY(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = tx2mRXNGxbMRUeJLCkv.nQilHWaqS401ZtR;
                ZOu84RhGdb62AhIs[] zOu84RhGdb62AhIsArr2 = tx2mRXNGxbMRUeJLCkv.J0zjQ7CAgohuxU20eCW6;
                ZOu84RhGdb62AhIs[] zOu84RhGdb62AhIsArr3 = zOu84RhGdb62AhIsArr2;
                int iVIJudZvPyTuNp18 = 0;
                int iVIJudZvPyTuNp19 = 0;
                int iVIJudZvPyTuNp20 = 0;
                boolean zYTljMGnIibTRdOpSh8 = false;
                int iVIJudZvPyTuNp21 = 0;
                boolean zYTljMGnIibTRdOpSh9 = false;
                String strGmNWMfvn6zlEj7 = null;
                IBinder iBinder = null;
                Account account = null;
                String strGmNWMfvn6zlEj8 = null;
                while (parcel.dataPosition() < iFivkjwgu2UdAtiY12) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iVIJudZvPyTuNp18 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i12);
                            break;
                        case 2:
                            iVIJudZvPyTuNp19 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i12);
                            break;
                        case 3:
                            iVIJudZvPyTuNp20 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i12);
                            break;
                        case 4:
                            strGmNWMfvn6zlEj7 = FZ1sl4mHq4J0hOEYC.gmNWMfvn6zlEj(parcel, i12);
                            break;
                        case 5:
                            int iRCHnHJBAlOpNI8 = FZ1sl4mHq4J0hOEYC.rCHnHJBAlOpNI5(parcel, i12);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iRCHnHJBAlOpNI8 != 0) {
                                IBinder strongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(iDataPosition4 + iRCHnHJBAlOpNI8);
                                iBinder = strongBinder;
                            } else {
                                iBinder = null;
                            }
                            break;
                        case 6:
                            scopeArr = (Scope[]) FZ1sl4mHq4J0hOEYC.gIIiyi2ddlMDR0(parcel, i12, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = FZ1sl4mHq4J0hOEYC.D5P1xCAyuvgF(parcel, i12);
                            break;
                        case '\b':
                            account = (Account) FZ1sl4mHq4J0hOEYC.hjneShqpF9Tis4(parcel, i12, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            FZ1sl4mHq4J0hOEYC.xfn2GJwmGqs7kWW(parcel, i12);
                            break;
                        case '\n':
                            zOu84RhGdb62AhIsArr2 = (ZOu84RhGdb62AhIs[]) FZ1sl4mHq4J0hOEYC.gIIiyi2ddlMDR0(parcel, i12, ZOu84RhGdb62AhIs.CREATOR);
                            break;
                        case 11:
                            zOu84RhGdb62AhIsArr3 = (ZOu84RhGdb62AhIs[]) FZ1sl4mHq4J0hOEYC.gIIiyi2ddlMDR0(parcel, i12, ZOu84RhGdb62AhIs.CREATOR);
                            break;
                        case '\f':
                            zYTljMGnIibTRdOpSh8 = FZ1sl4mHq4J0hOEYC.yTljMGnIibTRdOpSh4(parcel, i12);
                            break;
                        case '\r':
                            iVIJudZvPyTuNp21 = FZ1sl4mHq4J0hOEYC.vIJudZvPyTuNp(parcel, i12);
                            break;
                        case 14:
                            zYTljMGnIibTRdOpSh9 = FZ1sl4mHq4J0hOEYC.yTljMGnIibTRdOpSh4(parcel, i12);
                            break;
                        case 15:
                            strGmNWMfvn6zlEj8 = FZ1sl4mHq4J0hOEYC.gmNWMfvn6zlEj(parcel, i12);
                            break;
                    }
                }
                FZ1sl4mHq4J0hOEYC.nQilHWaqS401ZtR(parcel, iFivkjwgu2UdAtiY12);
                return new tx2mRXNGxbMRUeJLCkv(iVIJudZvPyTuNp18, iVIJudZvPyTuNp19, iVIJudZvPyTuNp20, strGmNWMfvn6zlEj7, iBinder, scopeArr, bundle, account, zOu84RhGdb62AhIsArr2, zOu84RhGdb62AhIsArr3, zYTljMGnIibTRdOpSh8, iVIJudZvPyTuNp21, zYTljMGnIibTRdOpSh9, strGmNWMfvn6zlEj8);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                return new k84rwRrqzhrNQ1CdNQ9[i];
            case 1:
                return new zanAuj2ot0jORaEjW[i];
            case 2:
                return new iy6XJYBMukwASsw[i];
            case 3:
                return new RaNTLh2L5X1WKOT[i];
            case 4:
                return new nzWPpxYjW7WqeEd[i];
            case 5:
                return new ParcelImpl[i];
            case 6:
                return new D3nkzQlSKjHnRbwlOY[i];
            case 7:
                return new N3OQwXegjg1zeRF[i];
            case 8:
                return new w9v51G65RB8JcT[i];
            case 9:
                return new Scope[i];
            case 10:
                return new dNxaWFwJquYPxV[i];
            case 11:
                return new nyZDwrpXoi7nqMd[i];
            case 12:
                return new Status[i];
            case 13:
                return new nEBfUTMY8S8i6NO[i];
            case 14:
                return new ZOu84RhGdb62AhIs[i];
            case 15:
                return new D3FfxRNDtw22r[i];
            case 16:
                return new x3KUHp0bS6JZ7[i];
            case 17:
                return new M4lemeLkQY8LkWIp[i];
            default:
                return new tx2mRXNGxbMRUeJLCkv[i];
        }
    }
}

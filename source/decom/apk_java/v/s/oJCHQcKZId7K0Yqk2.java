package v.s;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class oJCHQcKZId7K0Yqk2 extends HpS8WYFILXNWmicJ1zE implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean GiffeZJ1rbwyx;
    public boolean JW3Lh9hxwLsO2ArTlH;
    public int MSGkxvPxRYNqC;
    public AlertDialog UoxIZOBVZaubOFdPNaXK;
    public int VEkRsTDS6a9oHWI;
    public Dialog YIgR6F2ZXmLx2ul;
    public Dialog Yrf7mWjzxCbCCUcSPwXl;
    public boolean bbLLF31we2Iu;
    public int dQC4QhgRN3MSEAP3HW0;
    public boolean is7XW2V21HfKv7MihWy;
    public boolean jdOQeRk37T35X5xKW1P;
    public DialogInterface.OnCancelListener t9CXKrwDxrnFA6g23hZU;

    private static /* synthetic */ void xcamohf() {
    }

    @Override // v.s.HpS8WYFILXNWmicJ1zE
    public final void D5P1xCAyuvgF(Bundle bundle) {
        this.xfn2GJwmGqs7kWW = true;
        DVTNwpDEVsUKuznof(bundle);
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = this.XiR1pIn5878vVWd;
        if (y376iwm9dqvh0jucohx != null && y376iwm9dqvh0jucohx.H9XlUr4OeMJFiXK < 1) {
            y376iwm9dqvh0jucohx.EWUjsTERgdPbSw3NNlN = false;
            y376iwm9dqvh0jucohx.yTljMGnIibTRdOpSh4 = false;
            y376iwm9dqvh0jucohx.n8nqApvKDYz7s8llJ2jf(1);
        }
        this.is7XW2V21HfKv7MihWy = this.dTS0S7eC32ubQH54j36 == 0;
        if (bundle != null) {
            this.MSGkxvPxRYNqC = bundle.getInt("android:style", 0);
            this.VEkRsTDS6a9oHWI = bundle.getInt("android:theme", 0);
            this.jdOQeRk37T35X5xKW1P = bundle.getBoolean("android:cancelable", true);
            this.is7XW2V21HfKv7MihWy = bundle.getBoolean("android:showsDialog", this.is7XW2V21HfKv7MihWy);
            this.dQC4QhgRN3MSEAP3HW0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // v.s.HpS8WYFILXNWmicJ1zE
    public final void Qrz92kRPw4GcghAc() {
        this.xfn2GJwmGqs7kWW = true;
        Dialog dialog = this.YIgR6F2ZXmLx2ul;
        if (dialog != null) {
            this.GiffeZJ1rbwyx = false;
            dialog.show();
        }
    }

    @Override // v.s.HpS8WYFILXNWmicJ1zE
    public final LayoutInflater gIIiyi2ddlMDR0(Bundle bundle) {
        if (!this.is7XW2V21HfKv7MihWy) {
            return super.gIIiyi2ddlMDR0(bundle);
        }
        Dialog dialog = this.Yrf7mWjzxCbCCUcSPwXl;
        if (dialog == null) {
            this.is7XW2V21HfKv7MihWy = false;
            if (this.UoxIZOBVZaubOFdPNaXK == null) {
                P3NzOtJRLIgJpXupQRO6 p3NzOtJRLIgJpXupQRO6 = this.MLSIo1htfMPWeB8V876L;
                FragmentActivity fragmentActivity = p3NzOtJRLIgJpXupQRO6 == null ? null : p3NzOtJRLIgJpXupQRO6.xDyLpEZyrcKVe0;
                SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(fragmentActivity);
                this.UoxIZOBVZaubOFdPNaXK = new AlertDialog.Builder(fragmentActivity).create();
            }
            dialog = this.UoxIZOBVZaubOFdPNaXK;
        }
        this.YIgR6F2ZXmLx2ul = dialog;
        if (dialog == null) {
            return (LayoutInflater) this.MLSIo1htfMPWeB8V876L.xDyLpEZyrcKVe0.getSystemService("layout_inflater");
        }
        int i = this.MSGkxvPxRYNqC;
        if (i == 1 || i == 64 - 62) {
            dialog.requestWindowFeature(1);
        } else if (i == 3) {
            dialog.getWindow().addFlags(24);
            dialog.requestWindowFeature(1);
        }
        return (LayoutInflater) this.YIgR6F2ZXmLx2ul.getContext().getSystemService("layout_inflater");
    }

    @Override // v.s.HpS8WYFILXNWmicJ1zE
    public final void gmNWMfvn6zlEj() {
        this.xfn2GJwmGqs7kWW = true;
        if (this.bbLLF31we2Iu || this.JW3Lh9hxwLsO2ArTlH) {
            return;
        }
        this.JW3Lh9hxwLsO2ArTlH = true;
    }

    @Override // v.s.HpS8WYFILXNWmicJ1zE
    public final void hjneShqpF9Tis4() {
        this.xfn2GJwmGqs7kWW = true;
        Dialog dialog = this.YIgR6F2ZXmLx2ul;
        if (dialog != null) {
            this.GiffeZJ1rbwyx = true;
            dialog.dismiss();
            this.YIgR6F2ZXmLx2ul = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @Override // v.s.HpS8WYFILXNWmicJ1zE
    public final void ibVTtJUNfrGYbW(Bundle bundle) {
        Bundle bundle2;
        this.xfn2GJwmGqs7kWW = (-52) + 53;
        if (this.is7XW2V21HfKv7MihWy) {
            P3NzOtJRLIgJpXupQRO6 p3NzOtJRLIgJpXupQRO6 = this.MLSIo1htfMPWeB8V876L;
            FragmentActivity fragmentActivity = p3NzOtJRLIgJpXupQRO6 == null ? null : p3NzOtJRLIgJpXupQRO6.Ee8d2j4S9Vm5yGuR;
            if (fragmentActivity != null) {
                this.YIgR6F2ZXmLx2ul.setOwnerActivity(fragmentActivity);
            }
            this.YIgR6F2ZXmLx2ul.setCancelable(this.jdOQeRk37T35X5xKW1P);
            this.YIgR6F2ZXmLx2ul.setOnCancelListener(this);
            this.YIgR6F2ZXmLx2ul.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.YIgR6F2ZXmLx2ul.onRestoreInstanceState(bundle2);
        }
    }

    @Override // v.s.HpS8WYFILXNWmicJ1zE
    public final void nQilHWaqS401ZtR() {
        this.xfn2GJwmGqs7kWW = true;
        Dialog dialog = this.YIgR6F2ZXmLx2ul;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.t9CXKrwDxrnFA6g23hZU;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.GiffeZJ1rbwyx || this.JW3Lh9hxwLsO2ArTlH) {
            return;
        }
        this.JW3Lh9hxwLsO2ArTlH = true;
        this.bbLLF31we2Iu = false;
        Dialog dialog = this.YIgR6F2ZXmLx2ul;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.GiffeZJ1rbwyx = true;
        int i = this.dQC4QhgRN3MSEAP3HW0;
        if (i < 0) {
            y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = this.J0zjQ7CAgohuxU20eCW6;
            y376iwm9dqvh0jucohx.getClass();
            s6GzzATP8xbv7YKDDrkn s6gzzatp8xbv7ykddrkn = new s6GzzATP8xbv7YKDDrkn(y376iwm9dqvh0jucohx);
            s6gzzatp8xbv7ykddrkn.w9sT1Swbhx3hs(new bDLizfK87pPvhTehh1Z(3, this));
            s6gzzatp8xbv7ykddrkn.JXn4Qf7zpnLjP5(true);
            return;
        }
        y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx2 = this.J0zjQ7CAgohuxU20eCW6;
        y376iwm9dqvh0jucohx2.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("Bad id: ", i));
        }
        y376iwm9dqvh0jucohx2.Q7qC5ia93qGCjkBXCF0A(new MMyGdEuexBXhBHlDNPdd(y376iwm9dqvh0jucohx2, i), false);
        this.dQC4QhgRN3MSEAP3HW0 = -1;
    }

    @Override // v.s.HpS8WYFILXNWmicJ1zE
    public final void pyu8ovAipBTLYAiKab(Context context) {
        super.pyu8ovAipBTLYAiKab(context);
        if (this.bbLLF31we2Iu) {
            return;
        }
        this.JW3Lh9hxwLsO2ArTlH = false;
    }

    @Override // v.s.HpS8WYFILXNWmicJ1zE
    public final void wotphlvK9sPbXJ(Bundle bundle) {
        Bundle bundleOnSaveInstanceState;
        Dialog dialog = this.YIgR6F2ZXmLx2ul;
        if (dialog != null && (bundleOnSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.MSGkxvPxRYNqC;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.VEkRsTDS6a9oHWI;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.jdOQeRk37T35X5xKW1P;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.is7XW2V21HfKv7MihWy;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.dQC4QhgRN3MSEAP3HW0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }
}

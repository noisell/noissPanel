package v.s;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class a4Aq5QBZFai3VwgjU extends eIfkxafADHUOlFqb {
    public static final Object w9sT1Swbhx3hs = new Object();
    public static final a4Aq5QBZFai3VwgjU vekpFI4d1Nc4fakF = new a4Aq5QBZFai3VwgjU();

    public static void Ee8d2j4S9Vm5yGuR(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                y376IWm9dQvh0JucoHX y376iwm9dqvh0jucohx = ((P3NzOtJRLIgJpXupQRO6) ((FragmentActivity) activity).vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).b1EoSIRjJHO5;
                oJCHQcKZId7K0Yqk2 ojchqckzid7k0yqk2 = new oJCHQcKZId7K0Yqk2();
                ojchqckzid7k0yqk2.MSGkxvPxRYNqC = 0;
                ojchqckzid7k0yqk2.VEkRsTDS6a9oHWI = 0;
                ojchqckzid7k0yqk2.jdOQeRk37T35X5xKW1P = true;
                ojchqckzid7k0yqk2.is7XW2V21HfKv7MihWy = true;
                ojchqckzid7k0yqk2.dQC4QhgRN3MSEAP3HW0 = -1;
                SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                ojchqckzid7k0yqk2.Yrf7mWjzxCbCCUcSPwXl = alertDialog;
                if (onCancelListener != null) {
                    ojchqckzid7k0yqk2.t9CXKrwDxrnFA6g23hZU = onCancelListener;
                }
                ojchqckzid7k0yqk2.JW3Lh9hxwLsO2ArTlH = false;
                ojchqckzid7k0yqk2.bbLLF31we2Iu = true;
                y376iwm9dqvh0jucohx.getClass();
                s6GzzATP8xbv7YKDDrkn s6gzzatp8xbv7ykddrkn = new s6GzzATP8xbv7YKDDrkn(y376iwm9dqvh0jucohx);
                int modifiers = oJCHQcKZId7K0Yqk2.class.getModifiers();
                if (oJCHQcKZId7K0Yqk2.class.isAnonymousClass() || !Modifier.isPublic(modifiers) || (oJCHQcKZId7K0Yqk2.class.isMemberClass() && !Modifier.isStatic(modifiers))) {
                    throw new IllegalStateException("Fragment " + oJCHQcKZId7K0Yqk2.class.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
                }
                ojchqckzid7k0yqk2.J0zjQ7CAgohuxU20eCW6 = s6gzzatp8xbv7ykddrkn.dDIMxZXP1V8HdM;
                String str2 = ojchqckzid7k0yqk2.EWUjsTERgdPbSw3NNlN;
                if (str2 == null || str.equals(str2)) {
                    ojchqckzid7k0yqk2.EWUjsTERgdPbSw3NNlN = str;
                    s6gzzatp8xbv7ykddrkn.w9sT1Swbhx3hs(new bDLizfK87pPvhTehh1Z(1, ojchqckzid7k0yqk2));
                    s6gzzatp8xbv7ykddrkn.JXn4Qf7zpnLjP5(false);
                    return;
                } else {
                    throw new IllegalStateException("Can't change tag of fragment " + ojchqckzid7k0yqk2 + ": was " + ojchqckzid7k0yqk2.EWUjsTERgdPbSw3NNlN + " now " + str);
                }
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        WwSWNyqqftA9x wwSWNyqqftA9x = new WwSWNyqqftA9x();
        SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        wwSWNyqqftA9x.dDIMxZXP1V8HdM = alertDialog;
        if (onCancelListener != null) {
            wwSWNyqqftA9x.w9sT1Swbhx3hs = onCancelListener;
        }
        wwSWNyqqftA9x.show(fragmentManager, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    public static AlertDialog JXn4Qf7zpnLjP5(Activity activity, int i, ba5LgYA0ZZp7Iw23X7v ba5lgya0zzp7iw23x7v, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        ?? r4 = 46 - 45;
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, r4);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, (-23) + 28) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(yxHahRRBtYSFIdIyJfsV.w9sT1Swbhx3hs(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == r4) {
            string = resources.getString(2131427341);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(2131427338);
        } else {
            string = resources.getString(2131427348);
        }
        if (string != null) {
            builder.setPositiveButton(string, ba5lgya0zzp7iw23x7v);
        }
        String strVekpFI4d1Nc4fakF = yxHahRRBtYSFIdIyJfsV.vekpFI4d1Nc4fakF(activity, i);
        if (strVekpFI4d1Nc4fakF != null) {
            builder.setTitle(strVekpFI4d1Nc4fakF);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public final void ibVTtJUNfrGYbW(Activity activity, je0sQalrykIjkQwyhopU je0sqalrykijkqwyhopu, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5(activity, i, new ba5LgYA0ZZp7Iw23X7v(super.dDIMxZXP1V8HdM(i, activity, "d"), je0sqalrykijkqwyhopu, 1), onCancelListener);
        if (alertDialogJXn4Qf7zpnLjP5 == null) {
            return;
        }
        Ee8d2j4S9Vm5yGuR(activity, alertDialogJXn4Qf7zpnLjP5, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void vekpFI4d1Nc4fakF(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5(googleApiActivity, i, new ba5LgYA0ZZp7Iw23X7v(super.dDIMxZXP1V8HdM(i, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogJXn4Qf7zpnLjP5 == null) {
            return;
        }
        Ee8d2j4S9Vm5yGuR(googleApiActivity, alertDialogJXn4Qf7zpnLjP5, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public final void xDyLpEZyrcKVe0(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        ?? r1 = (-28) + 29;
        if (i == 18) {
            new LyQ9jCxWXI3tk(this, context).sendEmptyMessageDelayed(r1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strEe8d2j4S9Vm5yGuR = i == 6 ? yxHahRRBtYSFIdIyJfsV.Ee8d2j4S9Vm5yGuR(context, "common_google_play_services_resolution_required_title") : yxHahRRBtYSFIdIyJfsV.vekpFI4d1Nc4fakF(context, i);
        if (strEe8d2j4S9Vm5yGuR == null) {
            strEe8d2j4S9Vm5yGuR = context.getResources().getString(2131427345);
        }
        String strJXn4Qf7zpnLjP5 = (i == 6 || i == 19) ? yxHahRRBtYSFIdIyJfsV.JXn4Qf7zpnLjP5(context, "common_google_play_services_resolution_required_text", yxHahRRBtYSFIdIyJfsV.dDIMxZXP1V8HdM(context)) : yxHahRRBtYSFIdIyJfsV.w9sT1Swbhx3hs(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = new s4Xe0OepSKbHpb3Nsd(context, null);
        s4xe0oepskbhpb3nsd.Qrz92kRPw4GcghAc = r1;
        s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(16, r1);
        s4xe0oepskbhpb3nsd.Ee8d2j4S9Vm5yGuR = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(strEe8d2j4S9Vm5yGuR);
        ERzPBbsYGxZZQro2NYPo eRzPBbsYGxZZQro2NYPo = new ERzPBbsYGxZZQro2NYPo();
        eRzPBbsYGxZZQro2NYPo.w9sT1Swbhx3hs = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(strJXn4Qf7zpnLjP5);
        s4xe0oepskbhpb3nsd.Ee8d2j4S9Vm5yGuR(eRzPBbsYGxZZQro2NYPo);
        PackageManager packageManager = context.getPackageManager();
        if (okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0 == null) {
            okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0.booleanValue()) {
            s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.icon = context.getApplicationInfo().icon;
            s4xe0oepskbhpb3nsd.hjneShqpF9Tis4 = 2;
            if (okc5AGRjqrud84oM6d.gIIiyi2ddlMDR0(context)) {
                s4xe0oepskbhpb3nsd.w9sT1Swbhx3hs.add(new qv12hI85Nak4fBgJL(resources.getString(2131427353), pendingIntent));
            } else {
                s4xe0oepskbhpb3nsd.ibVTtJUNfrGYbW = pendingIntent;
            }
        } else {
            s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.icon = R.drawable.stat_sys_warning;
            s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.tickerText = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(resources.getString(2131427345));
            s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.when = System.currentTimeMillis();
            s4xe0oepskbhpb3nsd.ibVTtJUNfrGYbW = pendingIntent;
            s4xe0oepskbhpb3nsd.xDyLpEZyrcKVe0 = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(strJXn4Qf7zpnLjP5);
        }
        synchronized (w9sT1Swbhx3hs) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(2131427344);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        s4xe0oepskbhpb3nsd.H9XlUr4OeMJFiXK = "com.google.android.gms.availability";
        Notification notificationDDIMxZXP1V8HdM = s4xe0oepskbhpb3nsd.dDIMxZXP1V8HdM();
        if (i == r1 || i == 2 || i == 3) {
            WUKu8Lj5A4IfwZ.dDIMxZXP1V8HdM.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationDDIMxZXP1V8HdM);
    }
}

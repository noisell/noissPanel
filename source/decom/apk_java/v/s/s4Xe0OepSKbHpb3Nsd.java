package v.s;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class s4Xe0OepSKbHpb3Nsd {
    public int D5P1xCAyuvgF;
    public long DVTNwpDEVsUKuznof;
    public final ArrayList EWUjsTERgdPbSw3NNlN;
    public CharSequence Ee8d2j4S9Vm5yGuR;
    public String H9XlUr4OeMJFiXK;
    public Bundle J0zjQ7CAgohuxU20eCW6;
    public final Notification K7eEOBPYP9VIoHWTe;
    public PendingIntent b1EoSIRjJHO5;
    public final Context dDIMxZXP1V8HdM;
    public boolean dTS0S7eC32ubQH54j36;
    public nbpujQcKWlhZ gIIiyi2ddlMDR0;
    public int hjneShqpF9Tis4;
    public PendingIntent ibVTtJUNfrGYbW;
    public final boolean l1V0lQr6TbwNKqHfXNbb;
    public String nQilHWaqS401ZtR;
    public IconCompat pyu8ovAipBTLYAiKab;
    public CharSequence wotphlvK9sPbXJ;
    public CharSequence xDyLpEZyrcKVe0;
    public final ArrayList w9sT1Swbhx3hs = new ArrayList();
    public final ArrayList vekpFI4d1Nc4fakF = new ArrayList();
    public final ArrayList JXn4Qf7zpnLjP5 = new ArrayList();
    public boolean gmNWMfvn6zlEj = true;
    public boolean Qrz92kRPw4GcghAc = false;
    public int MLSIo1htfMPWeB8V876L = 0;
    public int XiR1pIn5878vVWd = 0;

    public s4Xe0OepSKbHpb3Nsd(Context context, String str) {
        Notification notification = new Notification();
        this.K7eEOBPYP9VIoHWTe = notification;
        this.dDIMxZXP1V8HdM = context;
        this.H9XlUr4OeMJFiXK = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.hjneShqpF9Tis4 = 0;
        this.EWUjsTERgdPbSw3NNlN = new ArrayList();
        this.l1V0lQr6TbwNKqHfXNbb = true;
    }

    private static /* synthetic */ void owekqnrjd() {
    }

    public static CharSequence w9sT1Swbhx3hs(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void Ee8d2j4S9Vm5yGuR(nbpujQcKWlhZ nbpujqckwlhz) {
        if (this.gIIiyi2ddlMDR0 != nbpujqckwlhz) {
            this.gIIiyi2ddlMDR0 = nbpujqckwlhz;
            if (((s4Xe0OepSKbHpb3Nsd) nbpujqckwlhz.dDIMxZXP1V8HdM) != this) {
                nbpujqckwlhz.dDIMxZXP1V8HdM = this;
                Ee8d2j4S9Vm5yGuR(nbpujqckwlhz);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    public final void JXn4Qf7zpnLjP5(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            ?? r2 = (-34) + 35;
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.dDIMxZXP1V8HdM.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(2130968582);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(2130968581);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max((int) r2, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max((int) r2, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), r2);
                }
            }
            PorterDuff.Mode mode = IconCompat.hjneShqpF9Tis4;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(r2);
            iconCompat2.w9sT1Swbhx3hs = bitmap;
            iconCompat = iconCompat2;
        }
        this.pyu8ovAipBTLYAiKab = iconCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.net.Uri, java.lang.CharSequence, long[]] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final Notification dDIMxZXP1V8HdM() {
        ?? r9;
        Bundle bundle;
        int i;
        ArrayList arrayList;
        int i2;
        mYrXZiFjFW2Xg myrxzifjfw2xg = new mYrXZiFjFW2Xg();
        new ArrayList();
        myrxzifjfw2xg.Ee8d2j4S9Vm5yGuR = new Bundle();
        myrxzifjfw2xg.JXn4Qf7zpnLjP5 = this;
        Context context = this.dDIMxZXP1V8HdM;
        myrxzifjfw2xg.w9sT1Swbhx3hs = context;
        Notification.Builder builderDDIMxZXP1V8HdM = ZyodgGeQJbvJ7ZIt1Xh.dDIMxZXP1V8HdM(context, this.H9XlUr4OeMJFiXK);
        myrxzifjfw2xg.vekpFI4d1Nc4fakF = builderDDIMxZXP1V8HdM;
        Notification notification = this.K7eEOBPYP9VIoHWTe;
        Context context2 = null;
        builderDDIMxZXP1V8HdM.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.Ee8d2j4S9Vm5yGuR).setContentText(this.xDyLpEZyrcKVe0).setContentInfo(null).setContentIntent(this.ibVTtJUNfrGYbW).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(this.b1EoSIRjJHO5, (notification.flags & 128) != 0).setNumber(this.D5P1xCAyuvgF).setProgress(0, 0, false);
        IconCompat iconCompat = this.pyu8ovAipBTLYAiKab;
        nM2DcAOLC8BKUucj.w9sT1Swbhx3hs(builderDDIMxZXP1V8HdM, iconCompat == null ? null : WnmhoEFZo5Hp9n.vekpFI4d1Nc4fakF(iconCompat, context));
        wTP8OqPr8hMBOSY.w9sT1Swbhx3hs(wTP8OqPr8hMBOSY.JXn4Qf7zpnLjP5(wTP8OqPr8hMBOSY.vekpFI4d1Nc4fakF(builderDDIMxZXP1V8HdM, this.wotphlvK9sPbXJ), false), this.hjneShqpF9Tis4);
        ArrayList arrayList2 = this.w9sT1Swbhx3hs;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            qv12hI85Nak4fBgJL qv12hi85nak4fbgjl = (qv12hI85Nak4fBgJL) obj;
            if (qv12hi85nak4fbgjl.w9sT1Swbhx3hs == null && (i2 = qv12hi85nak4fbgjl.Ee8d2j4S9Vm5yGuR) != 0) {
                qv12hi85nak4fbgjl.w9sT1Swbhx3hs = IconCompat.dDIMxZXP1V8HdM(i2);
            }
            IconCompat iconCompat2 = qv12hi85nak4fbgjl.w9sT1Swbhx3hs;
            boolean z = qv12hi85nak4fbgjl.vekpFI4d1Nc4fakF;
            Bundle bundle2 = qv12hi85nak4fbgjl.dDIMxZXP1V8HdM;
            Notification.Action.Builder builderDDIMxZXP1V8HdM2 = nM2DcAOLC8BKUucj.dDIMxZXP1V8HdM(iconCompat2 != null ? WnmhoEFZo5Hp9n.vekpFI4d1Nc4fakF(iconCompat2, context2) : context2, qv12hi85nak4fbgjl.xDyLpEZyrcKVe0, qv12hi85nak4fbgjl.ibVTtJUNfrGYbW);
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z);
            int i4 = Build.VERSION.SDK_INT;
            fygzs9Xbznwd7MTSSTr4.dDIMxZXP1V8HdM(builderDDIMxZXP1V8HdM2, z);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i4 >= 28) {
                QJIA6OEw5efUJtD2.w9sT1Swbhx3hs(builderDDIMxZXP1V8HdM2, 0);
            }
            if (i4 >= 29) {
                DM3sbdgbq5NNiMqCK.vekpFI4d1Nc4fakF(builderDDIMxZXP1V8HdM2, false);
            }
            if (i4 >= 31) {
                alcZJudjiE01FHKS.dDIMxZXP1V8HdM(builderDDIMxZXP1V8HdM2, false);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", qv12hi85nak4fbgjl.JXn4Qf7zpnLjP5);
            buyCRLDWjRI2eS7SV.w9sT1Swbhx3hs(builderDDIMxZXP1V8HdM2, bundle3);
            buyCRLDWjRI2eS7SV.dDIMxZXP1V8HdM((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, buyCRLDWjRI2eS7SV.JXn4Qf7zpnLjP5(builderDDIMxZXP1V8HdM2));
            context2 = null;
        }
        Bundle bundle4 = this.J0zjQ7CAgohuxU20eCW6;
        if (bundle4 != null) {
            ((Bundle) myrxzifjfw2xg.Ee8d2j4S9Vm5yGuR).putAll(bundle4);
        }
        int i5 = Build.VERSION.SDK_INT;
        ZXhIzHBKTRBU.dDIMxZXP1V8HdM((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, this.gmNWMfvn6zlEj);
        buyCRLDWjRI2eS7SV.pyu8ovAipBTLYAiKab((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, this.Qrz92kRPw4GcghAc);
        buyCRLDWjRI2eS7SV.ibVTtJUNfrGYbW((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, null);
        buyCRLDWjRI2eS7SV.D5P1xCAyuvgF((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, null);
        buyCRLDWjRI2eS7SV.b1EoSIRjJHO5((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, false);
        dokDau91egnH.w9sT1Swbhx3hs((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, this.nQilHWaqS401ZtR);
        dokDau91egnH.vekpFI4d1Nc4fakF((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, this.MLSIo1htfMPWeB8V876L);
        dokDau91egnH.xDyLpEZyrcKVe0((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, this.XiR1pIn5878vVWd);
        dokDau91egnH.JXn4Qf7zpnLjP5((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, null);
        dokDau91egnH.Ee8d2j4S9Vm5yGuR((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = this.EWUjsTERgdPbSw3NNlN;
        ArrayList arrayList4 = this.vekpFI4d1Nc4fakF;
        if (i5 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    EngrEbdti60lW engrEbdti60lW = new EngrEbdti60lW(arrayList3.size() + arrayList.size());
                    engrEbdti60lW.addAll(arrayList);
                    engrEbdti60lW.addAll(arrayList3);
                    arrayList3 = new ArrayList(engrEbdti60lW);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList3.get(i6);
                i6++;
                dokDau91egnH.dDIMxZXP1V8HdM((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, (String) obj2);
            }
        }
        ArrayList arrayList5 = this.JXn4Qf7zpnLjP5;
        if (arrayList5.size() > 0) {
            if (this.J0zjQ7CAgohuxU20eCW6 == null) {
                this.J0zjQ7CAgohuxU20eCW6 = new Bundle();
            }
            Bundle bundle5 = this.J0zjQ7CAgohuxU20eCW6.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i7 = 0;
            while (i7 < arrayList5.size()) {
                String string = Integer.toString(i7);
                qv12hI85Nak4fBgJL qv12hi85nak4fbgjl2 = (qv12hI85Nak4fBgJL) arrayList5.get(i7);
                Bundle bundle8 = new Bundle();
                if (qv12hi85nak4fbgjl2.w9sT1Swbhx3hs == null && (i = qv12hi85nak4fbgjl2.Ee8d2j4S9Vm5yGuR) != 0) {
                    qv12hi85nak4fbgjl2.w9sT1Swbhx3hs = IconCompat.dDIMxZXP1V8HdM(i);
                }
                IconCompat iconCompat3 = qv12hi85nak4fbgjl2.w9sT1Swbhx3hs;
                Bundle bundle9 = qv12hi85nak4fbgjl2.dDIMxZXP1V8HdM;
                ArrayList arrayList6 = arrayList5;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.w9sT1Swbhx3hs() : 0);
                bundle8.putCharSequence("title", qv12hi85nak4fbgjl2.xDyLpEZyrcKVe0);
                bundle8.putParcelable("actionIntent", qv12hi85nak4fbgjl2.ibVTtJUNfrGYbW);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", qv12hi85nak4fbgjl2.vekpFI4d1Nc4fakF);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", qv12hi85nak4fbgjl2.JXn4Qf7zpnLjP5);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i7++;
                arrayList5 = arrayList6;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.J0zjQ7CAgohuxU20eCW6 == null) {
                this.J0zjQ7CAgohuxU20eCW6 = new Bundle();
            }
            this.J0zjQ7CAgohuxU20eCW6.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) myrxzifjfw2xg.Ee8d2j4S9Vm5yGuR).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i8 = Build.VERSION.SDK_INT;
        yPvikdcxpdFPvNeRU.dDIMxZXP1V8HdM((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, this.J0zjQ7CAgohuxU20eCW6);
        fygzs9Xbznwd7MTSSTr4.Ee8d2j4S9Vm5yGuR((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, null);
        ZyodgGeQJbvJ7ZIt1Xh.w9sT1Swbhx3hs((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, 0);
        ZyodgGeQJbvJ7ZIt1Xh.Ee8d2j4S9Vm5yGuR((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, null);
        ZyodgGeQJbvJ7ZIt1Xh.xDyLpEZyrcKVe0((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, null);
        ZyodgGeQJbvJ7ZIt1Xh.ibVTtJUNfrGYbW((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, this.DVTNwpDEVsUKuznof);
        ZyodgGeQJbvJ7ZIt1Xh.JXn4Qf7zpnLjP5((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, 0);
        if (!TextUtils.isEmpty(this.H9XlUr4OeMJFiXK)) {
            ((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i8 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i8 >= 29) {
            DM3sbdgbq5NNiMqCK.dDIMxZXP1V8HdM((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, this.l1V0lQr6TbwNKqHfXNbb);
            r9 = 0;
            DM3sbdgbq5NNiMqCK.w9sT1Swbhx3hs((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, null);
        } else {
            r9 = 0;
        }
        if (this.dTS0S7eC32ubQH54j36) {
            ((s4Xe0OepSKbHpb3Nsd) myrxzifjfw2xg.JXn4Qf7zpnLjP5).getClass();
            ((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF).setVibrate(r9);
            ((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF).setSound(r9);
            int i9 = notification.defaults & (-4);
            notification.defaults = i9;
            ((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF).setDefaults(i9);
            ((s4Xe0OepSKbHpb3Nsd) myrxzifjfw2xg.JXn4Qf7zpnLjP5).getClass();
            if (TextUtils.isEmpty(r9)) {
                buyCRLDWjRI2eS7SV.ibVTtJUNfrGYbW((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, "silent");
            }
            ZyodgGeQJbvJ7ZIt1Xh.JXn4Qf7zpnLjP5((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF, 1);
        }
        s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = (s4Xe0OepSKbHpb3Nsd) myrxzifjfw2xg.JXn4Qf7zpnLjP5;
        nbpujQcKWlhZ nbpujqckwlhz = s4xe0oepskbhpb3nsd.gIIiyi2ddlMDR0;
        if (nbpujqckwlhz != null) {
            nbpujqckwlhz.dDIMxZXP1V8HdM(myrxzifjfw2xg);
        }
        Notification notificationDDIMxZXP1V8HdM = wTP8OqPr8hMBOSY.dDIMxZXP1V8HdM((Notification.Builder) myrxzifjfw2xg.vekpFI4d1Nc4fakF);
        if (nbpujqckwlhz != null) {
            s4xe0oepskbhpb3nsd.gIIiyi2ddlMDR0.getClass();
        }
        if (nbpujqckwlhz != null && (bundle = notificationDDIMxZXP1V8HdM.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", nbpujqckwlhz.w9sT1Swbhx3hs());
        }
        return notificationDDIMxZXP1V8HdM;
    }

    public final void vekpFI4d1Nc4fakF(int i, boolean z) {
        Notification notification = this.K7eEOBPYP9VIoHWTe;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }
}

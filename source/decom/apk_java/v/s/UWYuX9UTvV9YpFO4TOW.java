package v.s;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UWYuX9UTvV9YpFO4TOW implements pARxL2hv3Xoc, hYMmDgRUK0a6MaJzT {
    public Object JXn4Qf7zpnLjP5;
    public Object vekpFI4d1Nc4fakF;
    public Object w9sT1Swbhx3hs;

    public /* synthetic */ UWYuX9UTvV9YpFO4TOW(Object obj, Object obj2, Object obj3) {
        this.w9sT1Swbhx3hs = obj;
        this.vekpFI4d1Nc4fakF = obj2;
        this.JXn4Qf7zpnLjP5 = obj3;
    }

    private static /* synthetic */ void napt() {
    }

    public void Ee8d2j4S9Vm5yGuR(x88LUeZhTf5gc x88luezhtf5gc) {
        UeVBYgBvSKYfVuXLhMs ueVBYgBvSKYfVuXLhMs = new UeVBYgBvSKYfVuXLhMs(18);
        j378CNXHLyDTS1wSJ j378cnxhlydts1wsj = (j378CNXHLyDTS1wSJ) this.JXn4Qf7zpnLjP5;
        oO26y14q3Pwf oo26y14q3pwf = (oO26y14q3Pwf) this.w9sT1Swbhx3hs;
        DixbgjZDrgKGsYk0Hj dixbgjZDrgKGsYk0Hj = (DixbgjZDrgKGsYk0Hj) this.vekpFI4d1Nc4fakF;
        bepyb17lqmd1a4tQ bepyb17lqmd1a4tq = j378cnxhlydts1wsj.vekpFI4d1Nc4fakF;
        UWYuX9UTvV9YpFO4TOW uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM = oO26y14q3Pwf.dDIMxZXP1V8HdM();
        uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.ibVTtJUNfrGYbW(oo26y14q3pwf.dDIMxZXP1V8HdM);
        uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5 = LB7U1qakabytBm.w9sT1Swbhx3hs;
        uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF = oo26y14q3pwf.w9sT1Swbhx3hs;
        oO26y14q3Pwf oo26y14q3pwfDDIMxZXP1V8HdM = uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
        xXexZC0ehrqHnWzLCz xxexzc0ehrqhnwzlcz = new xXexZC0ehrqHnWzLCz();
        xxexzc0ehrqhnwzlcz.xDyLpEZyrcKVe0 = new HashMap();
        xxexzc0ehrqhnwzlcz.JXn4Qf7zpnLjP5 = Long.valueOf(j378cnxhlydts1wsj.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5());
        xxexzc0ehrqhnwzlcz.Ee8d2j4S9Vm5yGuR = Long.valueOf(j378cnxhlydts1wsj.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5());
        xxexzc0ehrqhnwzlcz.dDIMxZXP1V8HdM = "FCM_CLIENT_EVENT_LOGGING";
        YqGxPPaYwAVe9 yqGxPPaYwAVe9 = x88luezhtf5gc.dDIMxZXP1V8HdM;
        eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i = lXe7JZs69eVwu9NQQcXS.dDIMxZXP1V8HdM;
        eteizwlyooqrz0ici9i.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            eteizwlyooqrz0ici9i.w9sT1Swbhx3hs(yqGxPPaYwAVe9, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        xxexzc0ehrqhnwzlcz.vekpFI4d1Nc4fakF = new lIOSSTYOutyFnDV8Yx(dixbgjZDrgKGsYk0Hj, byteArrayOutputStream.toByteArray());
        xxexzc0ehrqhnwzlcz.w9sT1Swbhx3hs = null;
        UBF3HNWZ5b6WVJP1 uBF3HNWZ5b6WVJP1 = (UBF3HNWZ5b6WVJP1) bepyb17lqmd1a4tq;
        uBF3HNWZ5b6WVJP1.w9sT1Swbhx3hs.execute(new BTOcbbE0oRvXzVh9(uBF3HNWZ5b6WVJP1, oo26y14q3pwfDDIMxZXP1V8HdM, ueVBYgBvSKYfVuXLhMs, xxexzc0ehrqhnwzlcz.w9sT1Swbhx3hs()));
    }

    public void JXn4Qf7zpnLjP5(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DAn74tFa5nnfA dAn74tFa5nnfA = new DAn74tFa5nnfA((String) it.next(), str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.w9sT1Swbhx3hs;
            workDatabase_Impl.w9sT1Swbhx3hs();
            workDatabase_Impl.vekpFI4d1Nc4fakF();
            try {
                ((LeKZUBhDBK6LgUr) this.vekpFI4d1Nc4fakF).nQilHWaqS401ZtR(dAn74tFa5nnfA);
                workDatabase_Impl.wotphlvK9sPbXJ();
                workDatabase_Impl.D5P1xCAyuvgF();
            } catch (Throwable th) {
                workDatabase_Impl.D5P1xCAyuvgF();
                throw th;
            }
        }
    }

    public oO26y14q3Pwf dDIMxZXP1V8HdM() {
        String strConcat = ((String) this.w9sT1Swbhx3hs) == null ? " backendName" : "";
        if (((LB7U1qakabytBm) this.JXn4Qf7zpnLjP5) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new oO26y14q3Pwf((String) this.w9sT1Swbhx3hs, (byte[]) this.vekpFI4d1Nc4fakF, (LB7U1qakabytBm) this.JXn4Qf7zpnLjP5);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // v.s.RZKLDkRu6ZWDxTDL71X
    public Object get() {
        return new eTeIZwLyooQrZ0ICI9i((Context) ((RZKLDkRu6ZWDxTDL71X) this.w9sT1Swbhx3hs).get(), (qAHCZrfOx8WOS) ((RZKLDkRu6ZWDxTDL71X) this.vekpFI4d1Nc4fakF).get(), (GYJ3wxVSK6wC) ((W6dfON4KdcdxlH) this.JXn4Qf7zpnLjP5).get());
    }

    public void ibVTtJUNfrGYbW(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.w9sT1Swbhx3hs = str;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0374  */
    /* JADX WARN: Code duplicated, block: B:239:0x036b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v81, types: [int] */
    public boolean vekpFI4d1Nc4fakF() {
        Xx9LmS8BCwiTgmI xx9LmS8BCwiTgmI;
        Bundle bundle;
        int identifier;
        Uri defaultUri;
        Intent launchIntentForPackage;
        int i;
        PendingIntent activity;
        Integer numValueOf;
        Long lValueOf;
        IconCompat iconCompat;
        boolean z;
        int i2;
        int i3 = 1;
        if (((r5XEUfod5GSCCwq6c) this.JXn4Qf7zpnLjP5).pyu8ovAipBTLYAiKab("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.vekpFI4d1Nc4fakF;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strJ0zjQ7CAgohuxU20eCW6 = ((r5XEUfod5GSCCwq6c) this.JXn4Qf7zpnLjP5).J0zjQ7CAgohuxU20eCW6("gcm.n.image");
        if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW6)) {
            xx9LmS8BCwiTgmI = null;
        } else {
            try {
                xx9LmS8BCwiTgmI = new Xx9LmS8BCwiTgmI(new URL(strJ0zjQ7CAgohuxU20eCW6));
            } catch (MalformedURLException unused) {
                xx9LmS8BCwiTgmI = null;
            }
        }
        if (xx9LmS8BCwiTgmI != null) {
            ExecutorService executorService = (ExecutorService) this.w9sT1Swbhx3hs;
            al3CoDKXO0nvx al3codkxo0nvx = new al3CoDKXO0nvx();
            xx9LmS8BCwiTgmI.vekpFI4d1Nc4fakF = executorService.submit(new A68NpXPqwTFos99nt(xx9LmS8BCwiTgmI, 12, al3codkxo0nvx));
            xx9LmS8BCwiTgmI.JXn4Qf7zpnLjP5 = al3codkxo0nvx.dDIMxZXP1V8HdM;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.vekpFI4d1Nc4fakF;
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = (r5XEUfod5GSCCwq6c) this.JXn4Qf7zpnLjP5;
        AtomicInteger atomicInteger = jtR3xUGSDibSVuT.dDIMxZXP1V8HdM;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 39 + 89);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
        }
        Bundle bundle2 = bundle;
        String strJ0zjQ7CAgohuxU20eCW7 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.android_channel_id");
        try {
            if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                strJ0zjQ7CAgohuxU20eCW7 = null;
            } else {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW7) || notificationManager.getNotificationChannel(strJ0zjQ7CAgohuxU20eCW7) == null) {
                    strJ0zjQ7CAgohuxU20eCW7 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW7) || notificationManager.getNotificationChannel(strJ0zjQ7CAgohuxU20eCW7) == null) {
                        strJ0zjQ7CAgohuxU20eCW7 = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            int identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", identifier2 == 0 ? "Misc" : firebaseMessagingService2.getString(identifier2), 3));
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        AtomicInteger atomicInteger2 = jtR3xUGSDibSVuT.dDIMxZXP1V8HdM;
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = new s4Xe0OepSKbHpb3Nsd(firebaseMessagingService2, strJ0zjQ7CAgohuxU20eCW7);
        String strNQilHWaqS401ZtR = r5xeufod5gsccwq6c.nQilHWaqS401ZtR(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strNQilHWaqS401ZtR)) {
            s4xe0oepskbhpb3nsd.Ee8d2j4S9Vm5yGuR = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(strNQilHWaqS401ZtR);
        }
        String strNQilHWaqS401ZtR2 = r5xeufod5gsccwq6c.nQilHWaqS401ZtR(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strNQilHWaqS401ZtR2)) {
            s4xe0oepskbhpb3nsd.xDyLpEZyrcKVe0 = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(strNQilHWaqS401ZtR2);
            ERzPBbsYGxZZQro2NYPo eRzPBbsYGxZZQro2NYPo = new ERzPBbsYGxZZQro2NYPo();
            eRzPBbsYGxZZQro2NYPo.w9sT1Swbhx3hs = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(strNQilHWaqS401ZtR2);
            s4xe0oepskbhpb3nsd.Ee8d2j4S9Vm5yGuR(eRzPBbsYGxZZQro2NYPo);
        }
        String strJ0zjQ7CAgohuxU20eCW8 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.icon");
        if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW8) || (((identifier = resources.getIdentifier(strJ0zjQ7CAgohuxU20eCW8, "drawable", packageName)) == 0 || !jtR3xUGSDibSVuT.dDIMxZXP1V8HdM(resources, identifier)) && ((identifier = resources.getIdentifier(strJ0zjQ7CAgohuxU20eCW8, "mipmap", packageName)) == 0 || !jtR3xUGSDibSVuT.dDIMxZXP1V8HdM(resources, identifier)))) {
            identifier = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier == 0 || !jtR3xUGSDibSVuT.dDIMxZXP1V8HdM(resources, identifier)) {
                try {
                    identifier = packageManager.getApplicationInfo(packageName, 0).icon;
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.toString();
                }
            }
            if (identifier == 0 || !jtR3xUGSDibSVuT.dDIMxZXP1V8HdM(resources, identifier)) {
                identifier = 17301651;
            }
        }
        s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.icon = identifier;
        String strJ0zjQ7CAgohuxU20eCW9 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.sound2");
        if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW9)) {
            strJ0zjQ7CAgohuxU20eCW9 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW9)) {
            defaultUri = null;
        } else if ("default".equals(strJ0zjQ7CAgohuxU20eCW9) || resources.getIdentifier(strJ0zjQ7CAgohuxU20eCW9, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strJ0zjQ7CAgohuxU20eCW9);
        }
        int i4 = (-37) + 41;
        if (defaultUri != null) {
            Notification notification = s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe;
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = LnmYSevapKSvWoWEyyz.dDIMxZXP1V8HdM(LnmYSevapKSvWoWEyyz.Ee8d2j4S9Vm5yGuR(LnmYSevapKSvWoWEyyz.vekpFI4d1Nc4fakF(LnmYSevapKSvWoWEyyz.w9sT1Swbhx3hs(), i4), 5));
        }
        String strJ0zjQ7CAgohuxU20eCW10 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.click_action");
        if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW10)) {
            String strJ0zjQ7CAgohuxU20eCW11 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.link_android");
            if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW11)) {
                strJ0zjQ7CAgohuxU20eCW11 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW11) ? Uri.parse(strJ0zjQ7CAgohuxU20eCW11) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
            }
        } else {
            launchIntentForPackage = new Intent(strJ0zjQ7CAgohuxU20eCW10);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        if (launchIntentForPackage == null) {
            i = 1;
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = (Bundle) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                int i5 = i3;
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
                i3 = i5;
            }
            i = i3;
            launchIntentForPackage.putExtras(bundle4);
            if (r5xeufod5gsccwq6c.pyu8ovAipBTLYAiKab("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", r5xeufod5gsccwq6c.K7eEOBPYP9VIoHWTe());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        s4xe0oepskbhpb3nsd.ibVTtJUNfrGYbW = activity;
        PendingIntent broadcast = !r5xeufod5gsccwq6c.pyu8ovAipBTLYAiKab("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(r5xeufod5gsccwq6c.K7eEOBPYP9VIoHWTe())), 1140850688);
        if (broadcast != null) {
            s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.deleteIntent = broadcast;
        }
        String strJ0zjQ7CAgohuxU20eCW12 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.color");
        if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW12)) {
            i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i2 != 0) {
                numValueOf = Integer.valueOf(pdkUd1clESu8HSQO.dDIMxZXP1V8HdM(firebaseMessagingService2, i2));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strJ0zjQ7CAgohuxU20eCW12));
            } catch (IllegalArgumentException unused3) {
                i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i2 != 0) {
                    try {
                        numValueOf = Integer.valueOf(pdkUd1clESu8HSQO.dDIMxZXP1V8HdM(firebaseMessagingService2, i2));
                    } catch (Resources.NotFoundException unused4) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            s4xe0oepskbhpb3nsd.MLSIo1htfMPWeB8V876L = numValueOf.intValue();
        }
        s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(16, !r5xeufod5gsccwq6c.pyu8ovAipBTLYAiKab("gcm.n.sticky"));
        s4xe0oepskbhpb3nsd.Qrz92kRPw4GcghAc = r5xeufod5gsccwq6c.pyu8ovAipBTLYAiKab("gcm.n.local_only");
        String strJ0zjQ7CAgohuxU20eCW13 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.ticker");
        if (strJ0zjQ7CAgohuxU20eCW13 != null) {
            s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.tickerText = s4Xe0OepSKbHpb3Nsd.w9sT1Swbhx3hs(strJ0zjQ7CAgohuxU20eCW13);
        }
        Integer numHjneShqpF9Tis4 = r5xeufod5gsccwq6c.hjneShqpF9Tis4("gcm.n.notification_priority");
        if (numHjneShqpF9Tis4 == null || numHjneShqpF9Tis4.intValue() < -2 || numHjneShqpF9Tis4.intValue() > 2) {
            numHjneShqpF9Tis4 = null;
        }
        if (numHjneShqpF9Tis4 != null) {
            s4xe0oepskbhpb3nsd.hjneShqpF9Tis4 = numHjneShqpF9Tis4.intValue();
        }
        Integer numHjneShqpF9Tis5 = r5xeufod5gsccwq6c.hjneShqpF9Tis4("gcm.n.visibility");
        if (numHjneShqpF9Tis5 == null || numHjneShqpF9Tis5.intValue() < -1 || numHjneShqpF9Tis5.intValue() > i) {
            numHjneShqpF9Tis5 = null;
        }
        if (numHjneShqpF9Tis5 != null) {
            s4xe0oepskbhpb3nsd.XiR1pIn5878vVWd = numHjneShqpF9Tis5.intValue();
        }
        Integer numHjneShqpF9Tis6 = r5xeufod5gsccwq6c.hjneShqpF9Tis4("gcm.n.notification_count");
        if (numHjneShqpF9Tis6 == null || numHjneShqpF9Tis6.intValue() < 0) {
            numHjneShqpF9Tis6 = null;
        }
        if (numHjneShqpF9Tis6 != null) {
            s4xe0oepskbhpb3nsd.D5P1xCAyuvgF = numHjneShqpF9Tis6.intValue();
        }
        String strJ0zjQ7CAgohuxU20eCW14 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.event_time");
        if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW14)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strJ0zjQ7CAgohuxU20eCW14));
            } catch (NumberFormatException unused5) {
                r5XEUfod5GSCCwq6c.O2DHNSIGZlgPja7eqLgn("gcm.n.event_time");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            s4xe0oepskbhpb3nsd.gmNWMfvn6zlEj = true;
            s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.when = lValueOf.longValue();
        }
        long[] jArrMLSIo1htfMPWeB8V876L = r5xeufod5gsccwq6c.MLSIo1htfMPWeB8V876L();
        if (jArrMLSIo1htfMPWeB8V876L != null) {
            s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.vibrate = jArrMLSIo1htfMPWeB8V876L;
        }
        int[] iArrGIIiyi2ddlMDR0 = r5xeufod5gsccwq6c.gIIiyi2ddlMDR0();
        if (iArrGIIiyi2ddlMDR0 != null) {
            int i6 = iArrGIIiyi2ddlMDR0[0];
            int i7 = iArrGIIiyi2ddlMDR0[1];
            int i8 = iArrGIIiyi2ddlMDR0[2];
            Notification notification2 = s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe;
            notification2.ledARGB = i6;
            notification2.ledOnMS = i7;
            notification2.ledOffMS = i8;
            notification2.flags = ((i7 == 0 || i8 == 0) ? 0 : 1) | ((-2) & notification2.flags);
        }
        boolean zPyu8ovAipBTLYAiKab = r5xeufod5gsccwq6c.pyu8ovAipBTLYAiKab("gcm.n.default_sound");
        ?? r0 = zPyu8ovAipBTLYAiKab;
        if (r5xeufod5gsccwq6c.pyu8ovAipBTLYAiKab("gcm.n.default_vibrate_timings")) {
            r0 = (zPyu8ovAipBTLYAiKab ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (r5xeufod5gsccwq6c.pyu8ovAipBTLYAiKab("gcm.n.default_light_settings")) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        Notification notification3 = s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe;
        notification3.defaults = r1;
        if ((r1 & 4) != 0) {
            notification3.flags |= 1;
        }
        String strJ0zjQ7CAgohuxU20eCW15 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.tag");
        if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW15)) {
            strJ0zjQ7CAgohuxU20eCW15 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str2 = strJ0zjQ7CAgohuxU20eCW15;
        if (xx9LmS8BCwiTgmI != null) {
            try {
                SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = xx9LmS8BCwiTgmI.JXn4Qf7zpnLjP5;
                SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(sQzPENpgvzKX9IlD);
                Bitmap bitmap = (Bitmap) SbxdZ6Kq2uhHQ5RPRqm.w9sT1Swbhx3hs(sQzPENpgvzKX9IlD, 5L, TimeUnit.SECONDS);
                s4xe0oepskbhpb3nsd.JXn4Qf7zpnLjP5(bitmap);
                fOe3Rh6Om05mNe foe3rh6om05mne = new fOe3Rh6Om05mNe();
                if (bitmap == null) {
                    iconCompat = null;
                    z = true;
                } else {
                    z = true;
                    iconCompat = new IconCompat(1);
                    iconCompat.w9sT1Swbhx3hs = bitmap;
                }
                foe3rh6om05mne.w9sT1Swbhx3hs = iconCompat;
                foe3rh6om05mne.vekpFI4d1Nc4fakF = null;
                foe3rh6om05mne.JXn4Qf7zpnLjP5 = z;
                s4xe0oepskbhpb3nsd.Ee8d2j4S9Vm5yGuR(foe3rh6om05mne);
            } catch (InterruptedException unused6) {
                xx9LmS8BCwiTgmI.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e3) {
                Objects.toString(e3.getCause());
            } catch (TimeoutException unused7) {
                xx9LmS8BCwiTgmI.close();
            }
        }
        ((NotificationManager) ((FirebaseMessagingService) this.vekpFI4d1Nc4fakF).getSystemService("notification")).notify(str2, 0, s4xe0oepskbhpb3nsd.dDIMxZXP1V8HdM());
        return true;
    }

    public ArrayList w9sT1Swbhx3hs(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.w9sT1Swbhx3hs;
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.xDyLpEZyrcKVe0(1);
        } else {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str, 1);
        }
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            ArrayList arrayList = new ArrayList(cursorGmNWMfvn6zlEj.getCount());
            while (cursorGmNWMfvn6zlEj.moveToNext()) {
                arrayList.add(cursorGmNWMfvn6zlEj.isNull(0) ? null : cursorGmNWMfvn6zlEj.getString(0));
            }
            return arrayList;
        } finally {
            cursorGmNWMfvn6zlEj.close();
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
        }
    }

    @Override // v.s.hYMmDgRUK0a6MaJzT
    public void xDyLpEZyrcKVe0(DfUmSWZwfhCUz dfUmSWZwfhCUz) {
        OfLkl9rR9exIS ofLkl9rR9exIS = (OfLkl9rR9exIS) this.w9sT1Swbhx3hs;
        String str = (String) this.vekpFI4d1Nc4fakF;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.JXn4Qf7zpnLjP5;
        synchronized (ofLkl9rR9exIS.dDIMxZXP1V8HdM) {
            ofLkl9rR9exIS.dDIMxZXP1V8HdM.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}

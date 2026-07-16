package v.s;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class dfwkxUDiclPw1BowH4 {
    public static final Object D5P1xCAyuvgF = new Object();
    public static final Sn2d19yOBfyV0rw hjneShqpF9Tis4 = new Sn2d19yOBfyV0rw();
    public final NYXyLhuO3qlh84AKe52 JXn4Qf7zpnLjP5;
    public final zzxeBctTPcbuazkjVgh b1EoSIRjJHO5;
    public final Context dDIMxZXP1V8HdM;
    public final jbtbKB2tTtjICZw ibVTtJUNfrGYbW;
    public final VTs3SU2MiIMPb2VCqAuc vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;
    public final AtomicBoolean Ee8d2j4S9Vm5yGuR = new AtomicBoolean(false);
    public final AtomicBoolean xDyLpEZyrcKVe0 = new AtomicBoolean();
    public final CopyOnWriteArrayList pyu8ovAipBTLYAiKab = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    public dfwkxUDiclPw1BowH4(Context context, String str, VTs3SU2MiIMPb2VCqAuc vTs3SU2MiIMPb2VCqAuc) {
        ?? arrayList;
        int i = 0;
        new CopyOnWriteArrayList();
        this.dDIMxZXP1V8HdM = context;
        SbxdZ6Kq2uhHQ5RPRqm.Ee8d2j4S9Vm5yGuR(str);
        this.w9sT1Swbhx3hs = str;
        this.vekpFI4d1Nc4fakF = vTs3SU2MiIMPb2VCqAuc;
        hsuD9tQdOSW5 hsud9tqdosw5 = xXFHbPZem5bDa9S.dDIMxZXP1V8HdM;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Objects.toString(ComponentDiscoveryService.class);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new nel1EgalTqotjtE0sp3(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        GtJy9UfhXUvQf2HR gtJy9UfhXUvQf2HR = GtJy9UfhXUvQf2HR.w9sT1Swbhx3hs;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new nel1EgalTqotjtE0sp3(i2, new FirebaseCommonRegistrar()));
        arrayList3.add(new nel1EgalTqotjtE0sp3(i2, new ExecutorsRegistrar()));
        arrayList4.add(FVxyDmZ6Vklq5C.w9sT1Swbhx3hs(context, Context.class, new Class[0]));
        arrayList4.add(FVxyDmZ6Vklq5C.w9sT1Swbhx3hs(this, dfwkxUDiclPw1BowH4.class, new Class[0]));
        arrayList4.add(FVxyDmZ6Vklq5C.w9sT1Swbhx3hs(vTs3SU2MiIMPb2VCqAuc, VTs3SU2MiIMPb2VCqAuc.class, new Class[0]));
        fadfsJa4iEdiwEC4Xm8 fadfsja4iediwec4xm8 = new fadfsJa4iEdiwEC4Xm8(11);
        if (TcylCvHPQabyEWdUAO.dDIMxZXP1V8HdM(context) && xXFHbPZem5bDa9S.w9sT1Swbhx3hs.get()) {
            arrayList4.add(FVxyDmZ6Vklq5C.w9sT1Swbhx3hs(hsud9tqdosw5, hsuD9tQdOSW5.class, new Class[0]));
        }
        GtJy9UfhXUvQf2HR gtJy9UfhXUvQf2HR2 = GtJy9UfhXUvQf2HR.w9sT1Swbhx3hs;
        NYXyLhuO3qlh84AKe52 nYXyLhuO3qlh84AKe52 = new NYXyLhuO3qlh84AKe52();
        nYXyLhuO3qlh84AKe52.w9sT1Swbhx3hs = new HashMap();
        nYXyLhuO3qlh84AKe52.vekpFI4d1Nc4fakF = new HashMap();
        nYXyLhuO3qlh84AKe52.JXn4Qf7zpnLjP5 = new HashMap();
        nYXyLhuO3qlh84AKe52.Ee8d2j4S9Vm5yGuR = new HashSet();
        nYXyLhuO3qlh84AKe52.ibVTtJUNfrGYbW = new AtomicReference();
        KkDKQuF0Y4jTwIefNU kkDKQuF0Y4jTwIefNU = new KkDKQuF0Y4jTwIefNU();
        nYXyLhuO3qlh84AKe52.xDyLpEZyrcKVe0 = kkDKQuF0Y4jTwIefNU;
        nYXyLhuO3qlh84AKe52.b1EoSIRjJHO5 = fadfsja4iediwec4xm8;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(FVxyDmZ6Vklq5C.w9sT1Swbhx3hs(kkDKQuF0Y4jTwIefNU, KkDKQuF0Y4jTwIefNU.class, RqLIwoK3mjYHtQ7Aj.class, yYsb265FRg8Jt.class));
        arrayList5.add(FVxyDmZ6Vklq5C.w9sT1Swbhx3hs(nYXyLhuO3qlh84AKe52, NYXyLhuO3qlh84AKe52.class, new Class[0]));
        int size = arrayList4.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList4.get(i3);
            i3++;
            FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C = (FVxyDmZ6Vklq5C) obj;
            if (fVxyDmZ6Vklq5C != null) {
                arrayList5.add(fVxyDmZ6Vklq5C);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            arrayList6.add(obj2);
        }
        ArrayList arrayList7 = new ArrayList();
        synchronized (nYXyLhuO3qlh84AKe52) {
            Iterator it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((zzxeBctTPcbuazkjVgh) it2.next()).get();
                    if (componentRegistrar != null) {
                        arrayList5.addAll(((fadfsJa4iEdiwEC4Xm8) nYXyLhuO3qlh84AKe52.b1EoSIRjJHO5).b1EoSIRjJHO5(componentRegistrar));
                        it2.remove();
                    }
                } catch (sDgcDBza3rQMfgE4gHaI unused2) {
                    it2.remove();
                }
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                for (Object obj3 : ((FVxyDmZ6Vklq5C) it3.next()).w9sT1Swbhx3hs.toArray()) {
                    if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (((HashSet) nYXyLhuO3qlh84AKe52.Ee8d2j4S9Vm5yGuR).contains(obj3.toString())) {
                            it3.remove();
                            break;
                        }
                        ((HashSet) nYXyLhuO3qlh84AKe52.Ee8d2j4S9Vm5yGuR).add(obj3.toString());
                    }
                }
            }
            if (((HashMap) nYXyLhuO3qlh84AKe52.w9sT1Swbhx3hs).isEmpty()) {
                FZ1sl4mHq4J0hOEYC.wotphlvK9sPbXJ(arrayList5);
            } else {
                ArrayList arrayList8 = new ArrayList(((HashMap) nYXyLhuO3qlh84AKe52.w9sT1Swbhx3hs).keySet());
                arrayList8.addAll(arrayList5);
                FZ1sl4mHq4J0hOEYC.wotphlvK9sPbXJ(arrayList8);
            }
            int size3 = arrayList5.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList5.get(i5);
                i5++;
                FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C2 = (FVxyDmZ6Vklq5C) obj4;
                ((HashMap) nYXyLhuO3qlh84AKe52.w9sT1Swbhx3hs).put(fVxyDmZ6Vklq5C2, new jbtbKB2tTtjICZw(new LJ724HHGeqKLPqZG(nYXyLhuO3qlh84AKe52, i, fVxyDmZ6Vklq5C2)));
            }
            arrayList7.addAll(nYXyLhuO3qlh84AKe52.pyu8ovAipBTLYAiKab(arrayList5));
            arrayList7.addAll(nYXyLhuO3qlh84AKe52.D5P1xCAyuvgF());
            nYXyLhuO3qlh84AKe52.b1EoSIRjJHO5();
        }
        int size4 = arrayList7.size();
        while (i < size4) {
            Object obj5 = arrayList7.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) nYXyLhuO3qlh84AKe52.ibVTtJUNfrGYbW).get();
        if (bool != null) {
            nYXyLhuO3qlh84AKe52.ibVTtJUNfrGYbW((HashMap) nYXyLhuO3qlh84AKe52.w9sT1Swbhx3hs, bool.booleanValue());
        }
        this.JXn4Qf7zpnLjP5 = nYXyLhuO3qlh84AKe52;
        Trace.endSection();
        this.ibVTtJUNfrGYbW = new jbtbKB2tTtjICZw(new LJ724HHGeqKLPqZG(this, 2, context));
        this.b1EoSIRjJHO5 = nYXyLhuO3qlh84AKe52.JXn4Qf7zpnLjP5(TT2KHOpLgEiQtjhkGm.class);
        tPpWTwe5gflwjPMaBs tppwtwe5gflwjpmabs = new tPpWTwe5gflwjPMaBs(this);
        dDIMxZXP1V8HdM();
        if (this.Ee8d2j4S9Vm5yGuR.get()) {
            q4Slktv7UWOUPeddxQd.Ee8d2j4S9Vm5yGuR.dDIMxZXP1V8HdM.get();
        }
        this.pyu8ovAipBTLYAiKab.add(tppwtwe5gflwjpmabs);
        Trace.endSection();
    }

    public static dfwkxUDiclPw1BowH4 Ee8d2j4S9Vm5yGuR(Application application, VTs3SU2MiIMPb2VCqAuc vTs3SU2MiIMPb2VCqAuc) {
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4;
        AtomicReference atomicReference = aDVMGd8elswZl.dDIMxZXP1V8HdM;
        if (application.getApplicationContext() instanceof Application) {
            Application application2 = (Application) application.getApplicationContext();
            AtomicReference atomicReference2 = aDVMGd8elswZl.dDIMxZXP1V8HdM;
            if (atomicReference2.get() == null) {
                aDVMGd8elswZl advmgd8elswzl = new aDVMGd8elswZl();
                do {
                    if (atomicReference2.compareAndSet(null, advmgd8elswzl)) {
                        q4Slktv7UWOUPeddxQd.dDIMxZXP1V8HdM(application2);
                        q4Slktv7UWOUPeddxQd q4slktv7uwoupeddxqd = q4Slktv7UWOUPeddxQd.Ee8d2j4S9Vm5yGuR;
                        q4slktv7uwoupeddxqd.getClass();
                        synchronized (q4slktv7uwoupeddxqd) {
                            q4slktv7uwoupeddxqd.vekpFI4d1Nc4fakF.add(advmgd8elswzl);
                        }
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        Context applicationContext = application.getApplicationContext();
        Application applicationContext2 = application;
        if (applicationContext != null) {
            applicationContext2 = application.getApplicationContext();
        }
        synchronized (D5P1xCAyuvgF) {
            Sn2d19yOBfyV0rw sn2d19yOBfyV0rw = hjneShqpF9Tis4;
            String str = "FirebaseApp name [DEFAULT] already exists!";
            if (sn2d19yOBfyV0rw.containsKey("[DEFAULT]")) {
                throw new IllegalStateException(String.valueOf(str));
            }
            SbxdZ6Kq2uhHQ5RPRqm.b1EoSIRjJHO5(applicationContext2, "Application context cannot be null.");
            dfwkxudiclpw1bowh4 = new dfwkxUDiclPw1BowH4(applicationContext2, "[DEFAULT]", vTs3SU2MiIMPb2VCqAuc);
            sn2d19yOBfyV0rw.put("[DEFAULT]", dfwkxudiclpw1bowh4);
        }
        dfwkxudiclpw1bowh4.JXn4Qf7zpnLjP5();
        return dfwkxudiclpw1bowh4;
    }

    private static /* synthetic */ void jycj() {
    }

    public static dfwkxUDiclPw1BowH4 w9sT1Swbhx3hs() {
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4;
        synchronized (D5P1xCAyuvgF) {
            try {
                dfwkxudiclpw1bowh4 = (dfwkxUDiclPw1BowH4) hjneShqpF9Tis4.get("[DEFAULT]");
                if (dfwkxudiclpw1bowh4 == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + FZ1sl4mHq4J0hOEYC.MLSIo1htfMPWeB8V876L() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((TT2KHOpLgEiQtjhkGm) dfwkxudiclpw1bowh4.b1EoSIRjJHO5.get()).w9sT1Swbhx3hs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return dfwkxudiclpw1bowh4;
    }

    public final void JXn4Qf7zpnLjP5() {
        HashMap map;
        if (!TcylCvHPQabyEWdUAO.dDIMxZXP1V8HdM(this.dDIMxZXP1V8HdM)) {
            dDIMxZXP1V8HdM();
            Context context = this.dDIMxZXP1V8HdM;
            AtomicReference atomicReference = O0fufoPIziZB7.w9sT1Swbhx3hs;
            if (atomicReference.get() == null) {
                O0fufoPIziZB7 o0fufoPIziZB7 = new O0fufoPIziZB7(context);
                while (!atomicReference.compareAndSet(null, o0fufoPIziZB7)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(o0fufoPIziZB7, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        dDIMxZXP1V8HdM();
        NYXyLhuO3qlh84AKe52 nYXyLhuO3qlh84AKe52 = this.JXn4Qf7zpnLjP5;
        dDIMxZXP1V8HdM();
        boolean zEquals = "[DEFAULT]".equals(this.w9sT1Swbhx3hs);
        AtomicReference atomicReference2 = (AtomicReference) nYXyLhuO3qlh84AKe52.ibVTtJUNfrGYbW;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((TT2KHOpLgEiQtjhkGm) this.b1EoSIRjJHO5.get()).w9sT1Swbhx3hs();
            }
        }
        synchronized (nYXyLhuO3qlh84AKe52) {
            map = new HashMap((HashMap) nYXyLhuO3qlh84AKe52.w9sT1Swbhx3hs);
        }
        nYXyLhuO3qlh84AKe52.ibVTtJUNfrGYbW(map, zEquals);
        ((TT2KHOpLgEiQtjhkGm) this.b1EoSIRjJHO5.get()).w9sT1Swbhx3hs();
    }

    public final void dDIMxZXP1V8HdM() {
        if (this.xDyLpEZyrcKVe0.get()) {
            throw new IllegalStateException("FirebaseApp was deleted");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dfwkxUDiclPw1BowH4)) {
            return false;
        }
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = (dfwkxUDiclPw1BowH4) obj;
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        return this.w9sT1Swbhx3hs.equals(dfwkxudiclpw1bowh4.w9sT1Swbhx3hs);
    }

    public final int hashCode() {
        return this.w9sT1Swbhx3hs.hashCode();
    }

    public final String toString() {
        IXBvAqS2fpdIRK iXBvAqS2fpdIRK = new IXBvAqS2fpdIRK(this);
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(this.w9sT1Swbhx3hs, "name");
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(this.vekpFI4d1Nc4fakF, "options");
        return iXBvAqS2fpdIRK.toString();
    }

    public final String vekpFI4d1Nc4fakF() {
        StringBuilder sb = new StringBuilder();
        dDIMxZXP1V8HdM();
        byte[] bytes = this.w9sT1Swbhx3hs.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        dDIMxZXP1V8HdM();
        byte[] bytes2 = this.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }
}

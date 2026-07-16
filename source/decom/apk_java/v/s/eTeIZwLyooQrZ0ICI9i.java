package v.s;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.Adler32;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class eTeIZwLyooQrZ0ICI9i implements pARxL2hv3Xoc {
    public Object JXn4Qf7zpnLjP5;
    public final Object vekpFI4d1Nc4fakF;
    public final Object w9sT1Swbhx3hs;

    public /* synthetic */ eTeIZwLyooQrZ0ICI9i(Object obj, Object obj2, Object obj3) {
        this.w9sT1Swbhx3hs = obj;
        this.vekpFI4d1Nc4fakF = obj2;
        this.JXn4Qf7zpnLjP5 = obj3;
    }

    public void Ee8d2j4S9Vm5yGuR(oO26y14q3Pwf oo26y14q3pwf, int i, boolean z) {
        GYJ3wxVSK6wC gYJ3wxVSK6wC = (GYJ3wxVSK6wC) this.JXn4Qf7zpnLjP5;
        Context context = (Context) this.w9sT1Swbhx3hs;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = oo26y14q3pwf.dDIMxZXP1V8HdM;
        String str2 = oo26y14q3pwf.dDIMxZXP1V8HdM;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(74 - 70);
        LB7U1qakabytBm lB7U1qakabytBm = oo26y14q3pwf.vekpFI4d1Nc4fakF;
        adler32.update(byteBufferAllocate.putInt(oAbr1ycaDgFnfg.dDIMxZXP1V8HdM(lB7U1qakabytBm)).array());
        byte[] bArr = oo26y14q3pwf.w9sT1Swbhx3hs;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    jb8et6SZeK5TWMrJFxDX.Ee8d2j4S9Vm5yGuR("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oo26y14q3pwf);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((c0GsmbUiugE231HPbX) ((qAHCZrfOx8WOS) this.vekpFI4d1Nc4fakF)).dDIMxZXP1V8HdM().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(oAbr1ycaDgFnfg.dDIMxZXP1V8HdM(lB7U1qakabytBm))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(gYJ3wxVSK6wC.dDIMxZXP1V8HdM(lB7U1qakabytBm, jLongValue, i));
            Set set = ((oHwsq5s6lj9C1) gYJ3wxVSK6wC.w9sT1Swbhx3hs.get(lB7U1qakabytBm)).vekpFI4d1Nc4fakF;
            if (set.contains(W14DdGhrJlsYoApqU.w9sT1Swbhx3hs)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(W14DdGhrJlsYoApqU.JXn4Qf7zpnLjP5)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(W14DdGhrJlsYoApqU.vekpFI4d1Nc4fakF)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", oAbr1ycaDgFnfg.dDIMxZXP1V8HdM(lB7U1qakabytBm));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {oo26y14q3pwf, Integer.valueOf(value), Long.valueOf(gYJ3wxVSK6wC.dDIMxZXP1V8HdM(lB7U1qakabytBm, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), (-6) + 9)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void JXn4Qf7zpnLjP5(Jf9nGec8iqajtj jf9nGec8iqajtj) {
        sMa77hcbriw3etJOBFZ sma77hcbriw3etjobfz = (sMa77hcbriw3etJOBFZ) this.JXn4Qf7zpnLjP5;
        if (sma77hcbriw3etjobfz != null) {
            sma77hcbriw3etjobfz.run();
        }
        sMa77hcbriw3etJOBFZ sma77hcbriw3etjobfz2 = new sMa77hcbriw3etJOBFZ((p9Dc9HHikKZdWDIj) this.w9sT1Swbhx3hs, jf9nGec8iqajtj);
        this.JXn4Qf7zpnLjP5 = sma77hcbriw3etjobfz2;
        ((Handler) this.vekpFI4d1Nc4fakF).postAtFrontOfQueue(sma77hcbriw3etjobfz2);
    }

    public void dDIMxZXP1V8HdM(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.w9sT1Swbhx3hs;
        workDatabase_Impl.w9sT1Swbhx3hs();
        wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = (wrjXKFWxtWGPk22) this.vekpFI4d1Nc4fakF;
        IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
        if (str == null) {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.xDyLpEZyrcKVe0(1);
        } else {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L(str, 1);
        }
        workDatabase_Impl.vekpFI4d1Nc4fakF();
        try {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
            workDatabase_Impl.wotphlvK9sPbXJ();
        } finally {
            workDatabase_Impl.D5P1xCAyuvgF();
            wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
        }
    }

    @Override // v.s.RZKLDkRu6ZWDxTDL71X
    public Object get() {
        return new j378CNXHLyDTS1wSJ(new fEyMFFyOOvHURJ7To6L(18), new fadfsJa4iEdiwEC4Xm8(17), (bepyb17lqmd1a4tQ) ((iniVyKd0OGb2raI4) this.w9sT1Swbhx3hs).get(), (LutdQZ2I9fVx) ((NYXyLhuO3qlh84AKe52) this.vekpFI4d1Nc4fakF).get(), (fUH025aw0Rgl) ((mYrXZiFjFW2Xg) this.JXn4Qf7zpnLjP5).get());
    }

    public void vekpFI4d1Nc4fakF(Object obj) throws Exception {
        okc5AGRjqrud84oM6d okc5agrjqrud84om6d = (okc5AGRjqrud84oM6d) this.vekpFI4d1Nc4fakF;
        androidx.activity.result.dDIMxZXP1V8HdM ddimxzxp1v8hdm = (androidx.activity.result.dDIMxZXP1V8HdM) this.JXn4Qf7zpnLjP5;
        HashMap map = ddimxzxp1v8hdm.w9sT1Swbhx3hs;
        String str = (String) this.w9sT1Swbhx3hs;
        Integer num = (Integer) map.get(str);
        if (num != null) {
            ddimxzxp1v8hdm.JXn4Qf7zpnLjP5.add(str);
            try {
                ddimxzxp1v8hdm.w9sT1Swbhx3hs(num.intValue(), okc5agrjqrud84om6d, obj);
                return;
            } catch (Exception e) {
                ddimxzxp1v8hdm.JXn4Qf7zpnLjP5.remove(str);
                throw e;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + okc5agrjqrud84om6d + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    public void w9sT1Swbhx3hs(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.w9sT1Swbhx3hs;
        xC3irfQAa9Bx xc3irfqaa9bx = new xC3irfQAa9Bx(byteArrayOutputStream, map, (HashMap) this.vekpFI4d1Nc4fakF, (qlHclLGph5RUFd) this.JXn4Qf7zpnLjP5);
        qlHclLGph5RUFd qlhcllgph5rufd = (qlHclLGph5RUFd) map.get(obj.getClass());
        if (qlhcllgph5rufd != null) {
            qlhcllgph5rufd.dDIMxZXP1V8HdM(obj, xc3irfqaa9bx);
        } else {
            throw new O4K5KpahtuR0("No encoder for " + obj.getClass());
        }
    }

    public eTeIZwLyooQrZ0ICI9i(Set set, String str, String str2) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        Map map = Collections.EMPTY_MAP;
        this.vekpFI4d1Nc4fakF = str2;
        this.JXn4Qf7zpnLjP5 = F8N3DDsEXcPY.dDIMxZXP1V8HdM;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.w9sT1Swbhx3hs = Collections.unmodifiableSet(hashSet);
    }

    public eTeIZwLyooQrZ0ICI9i(LifecycleService lifecycleService) {
        this.w9sT1Swbhx3hs = new p9Dc9HHikKZdWDIj(lifecycleService);
        this.vekpFI4d1Nc4fakF = new Handler();
    }

    public eTeIZwLyooQrZ0ICI9i(WorkDatabase_Impl workDatabase_Impl) {
        this.w9sT1Swbhx3hs = workDatabase_Impl;
        new LeKZUBhDBK6LgUr(workDatabase_Impl, 4);
        this.vekpFI4d1Nc4fakF = new wrjXKFWxtWGPk22(workDatabase_Impl, 2);
        this.JXn4Qf7zpnLjP5 = new wrjXKFWxtWGPk22(workDatabase_Impl, 3);
    }

    public eTeIZwLyooQrZ0ICI9i(androidx.activity.result.dDIMxZXP1V8HdM ddimxzxp1v8hdm, String str, okc5AGRjqrud84oM6d okc5agrjqrud84om6d) {
        this.JXn4Qf7zpnLjP5 = ddimxzxp1v8hdm;
        this.w9sT1Swbhx3hs = str;
        this.vekpFI4d1Nc4fakF = okc5agrjqrud84om6d;
    }
}

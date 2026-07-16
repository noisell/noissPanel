package v.s;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.os.AsyncTask;
import androidx.core.app.JobIntentService;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class D3AgmEkYZcQmLD extends AsyncTask {
    public final /* synthetic */ JobIntentService dDIMxZXP1V8HdM;

    public D3AgmEkYZcQmLD(JobIntentService jobIntentService) {
        this.dDIMxZXP1V8HdM = jobIntentService;
    }

    private static /* synthetic */ void nccrgurw() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:18:0x004c, B:20:0x0056, B:23:0x0061), top: B:32:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        IXBvAqS2fpdIRK iXBvAqS2fpdIRK;
        JobParameters jobParameters;
        while (true) {
            JobIntentService jobIntentService = this.dDIMxZXP1V8HdM;
            jobIntentService.dDIMxZXP1V8HdM.getClass();
            aU71xeS1mg88JgBsKh au71xes1mg88jgbskh = jobIntentService.dDIMxZXP1V8HdM;
            synchronized (au71xes1mg88jgbskh.w9sT1Swbhx3hs) {
                try {
                    JobParameters jobParameters2 = au71xes1mg88jgbskh.vekpFI4d1Nc4fakF;
                    if (jobParameters2 != null) {
                        JobWorkItem jobWorkItemDequeueWork = jobParameters2.dequeueWork();
                        if (jobWorkItemDequeueWork != null) {
                            jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(au71xes1mg88jgbskh.dDIMxZXP1V8HdM.getClassLoader());
                            iXBvAqS2fpdIRK = new IXBvAqS2fpdIRK(au71xes1mg88jgbskh, jobWorkItemDequeueWork);
                        }
                        if (iXBvAqS2fpdIRK != null) {
                            return null;
                        }
                        JobIntentService jobIntentService2 = this.dDIMxZXP1V8HdM;
                        ((JobWorkItem) iXBvAqS2fpdIRK.w9sT1Swbhx3hs).getIntent();
                        jobIntentService2.dDIMxZXP1V8HdM();
                        synchronized (((aU71xeS1mg88JgBsKh) iXBvAqS2fpdIRK.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs) {
                            try {
                                jobParameters = ((aU71xeS1mg88JgBsKh) iXBvAqS2fpdIRK.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF;
                                if (jobParameters != null) {
                                    jobParameters.completeWork((JobWorkItem) iXBvAqS2fpdIRK.w9sT1Swbhx3hs);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            iXBvAqS2fpdIRK = null;
            if (iXBvAqS2fpdIRK != null) {
                return null;
            }
            JobIntentService jobIntentService3 = this.dDIMxZXP1V8HdM;
            ((JobWorkItem) iXBvAqS2fpdIRK.w9sT1Swbhx3hs).getIntent();
            jobIntentService3.dDIMxZXP1V8HdM();
            synchronized (((aU71xeS1mg88JgBsKh) iXBvAqS2fpdIRK.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs) {
                jobParameters = ((aU71xeS1mg88JgBsKh) iXBvAqS2fpdIRK.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF;
                if (jobParameters != null) {
                    jobParameters.completeWork((JobWorkItem) iXBvAqS2fpdIRK.w9sT1Swbhx3hs);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.dDIMxZXP1V8HdM.getClass();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.dDIMxZXP1V8HdM.getClass();
    }
}
